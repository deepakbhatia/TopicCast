package com.optimalcities.topiccast;

/**
 * Created by obelix on 28/09/2015.
 */

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class CountryResultActivity extends AppCompatActivity implements  View.OnClickListener,
        CountryResultAdapter.ItemSelection
{


    private RecyclerView mRecyclerView;
    private ArrayList countryResultlist;
    private CountryResultAdapter countryResultAdapter;
    private Toolbar mToolbar;
            Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_results);

        mButton = (Button)findViewById(R.id.suggested_articles);

        mButton.setVisibility(View.INVISIBLE);

        mButton.setOnClickListener(this);



        countryResultlist = new ArrayList();

        Intent intent = getIntent();

        String page_result = intent.getStringExtra("results");

        String keywords = intent.getStringExtra("keywords");

        //NYArticleTask nyArticleTask = new NYArticleTask();
        //nyArticleTask.execute(keywords);




        try {
            JSONObject result_object = new JSONObject(page_result);

            JSONArray values = result_object.getJSONArray("results");

            for (int i = 0; i < values.length(); i++) {
                countryResultlist.add(values.getJSONObject(i));
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }


        mToolbar = (Toolbar) findViewById(R.id.country_results_toolbar);

        mToolbar.setNavigationOnClickListener(this);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        //((AppCompatActivity) getActivity()).getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_content_clear));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mToolbar.setTitle(R.string.ready_questions);

        mRecyclerView = (RecyclerView) findViewById(R.id.country_results_recycler_view);

        countryResultAdapter = new CountryResultAdapter(this, countryResultlist, keywords);
        //questionsList.setBackgroundColor(Color.WHITE);
        //mRecyclerView.setDivider(getResources().getDrawable(R.drawable.line_divider));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(countryResultAdapter);

        TextView emptyView = (TextView) findViewById(R.id.empty_view);

        if (countryResultlist.size() == 0) {
            mRecyclerView.setVisibility(View.GONE);
            emptyView.setVisibility(View.VISIBLE);
            mButton.setEnabled(false);
            mButton.setVisibility(View.INVISIBLE);
        }
        else {
            GuardianContentTask guardianContentTask = new GuardianContentTask();
            guardianContentTask.execute(keywords);
            mRecyclerView.setVisibility(View.VISIBLE);
            emptyView.setVisibility(View.GONE);
            mButton.setEnabled(true);



        }
        //mRecyclerView.addOnItemTouchListener(this);
        //mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));

        //mRecyclerView.setItemAnimator(new Defa());


    }


    @Override
    public void onClick(View view) {
            Intent intent = new Intent(this, TopicDetailActivity.class);

            startActivity(intent);
    }

    @Override
    public void itemSelected(JSONObject jsonObject, String keywords, String countryName) {

        Constants.guardian = new ArrayList();
        keywords+=","+countryName;
        GuardianContentTask guardianContentTask = new GuardianContentTask(true);
        guardianContentTask.execute(keywords);

    }


    class GuardianContentTask extends AsyncTask<Object, Integer, Object> {

        private Context mContext;
        private String API_KEY="kak5tj558gc8geb9sbp522eu";
        boolean openArticle = false;

        //http://content.guardianapis.com/search?from-date=2007-09-01&to-date=2011-01-01&show-fields=trailText&page=415&q=air%20pollution%20europe&api-key=kak5tj558gc8geb9sbp522eu
        private String fields = "&show-fields=trailText";
        public  GuardianContentTask()
        {

        }
        public  GuardianContentTask(boolean openArticle)
        {
                if(openArticle)
                    this.openArticle = true;
        }


        @Override
        protected Object doInBackground(Object[] objects) {

             String base_article_search_url ="http://content.guardianapis.com/search?api-key="+API_KEY+"&section=news"+"&order-by=relevance&q=";

            InputStream inputStream = null;
            String result = "";

            String article_url = base_article_search_url+objects[0]+fields;

            Log.d("TAGSSERCH", ""+objects[0]);
            try {

                URL url = new URL(article_url);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();


                // receive response as inputStream
                inputStream = urlConnection.getInputStream();

                // convert inputstream to string
                if(inputStream != null)
                {
                    result = convertInputStreamToString(inputStream);

                    JSONObject results = new JSONObject(result);

                    Log.d("ARTICLES",results.toString());
                    JSONObject results_response = results.getJSONObject("response");

                    String currentPage = results_response.getString("currentPage");

                    String pages = results_response.getString("pages");


                    JSONArray result_docs = results_response.getJSONArray("results");

                    for(int i=0;i<result_docs.length();i++)
                    {
                        JSONObject resultObject = result_docs.getJSONObject(i);

                        String article_id = resultObject.getString("id");

                        String web_url = resultObject.getString("webUrl");

                        JSONObject fieldsObject = resultObject.getJSONObject("fields");
                        String trailText = fieldsObject.getString("trailText");

                        String headline = resultObject.getString("webTitle");
                        publishProgress(i);

                        Articles articles = new Articles();
                        articles.setSnippet(Html.fromHtml(trailText).toString());

                        articles.setWeb_url(Html.fromHtml(web_url).toString());

                        articles.setArticle_id(article_id);
                        articles.setHeadline(Html.fromHtml(headline).toString());
                        articles.setSource("The Guardian");
                        Constants.guardian.add(articles);
                    }

                }
                else
                    result = "Did not work!";

            } catch (Exception e) {
                Log.d("InputStream", e.getLocalizedMessage());
            }



            return null;
        }

        protected void onProgressUpdate(Integer... progress) {
            //setProgressPercent(progress[0]);
        }

        protected void onPostExecute(Object object) {
            //showDialog("Downloaded " + result + " bytes");
            if(openArticle)
            {
               openArticles();
            }
            mButton.setVisibility(View.VISIBLE);

        }

        // convert inputstream to String
        private  String convertInputStreamToString(InputStream inputStream) throws IOException {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
            String line = "";
            String result = "";
            while((line = bufferedReader.readLine()) != null)
                result += line;

            inputStream.close();
            return result;

        }
    }

    public void openArticles()
    {
        Intent intent = new Intent(this, TopicDetailActivity.class);

        startActivity(intent);
    }
}