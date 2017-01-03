package com.optimalcities.topiccast;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by obelix on 13/09/2015.
 */
public class NYArticleTask extends AsyncTask {

    private Context mContext;
    private String API_KEY="d33c68e3191df52bcf3628c897b728c1:8:72314832";
    private String base_article_search_url = "http://api.nytimes.com/svc/search/v2/articlesearch.json?"+"api-key="+API_KEY+"&q=";

    public  NYArticleTask()
    {

    }

    public NYArticleTask(Context context)
    {
        this.mContext = context;
    }
    @Override
    protected Object doInBackground(Object[] objects) {


        String search_term = (String)objects[0];

         String article_search_url = base_article_search_url + search_term;

        InputStream inputStream = null;
        String result = "";
        try {

            URL url = new URL(article_search_url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();


            // receive response as inputStream
            inputStream = urlConnection.getInputStream();

            // convert inputstream to string
            if(inputStream != null)
            {
                result = convertInputStreamToString(inputStream);

                JSONObject results = new JSONObject(result);

                JSONObject results_response = results.getJSONObject("response");
                JSONArray result_docs = results_response.getJSONArray("docs");

                for(int i=0;i<result_docs.length();i++)
                {
                    JSONObject resultObject = result_docs.getJSONObject(i);

                    String web_url = resultObject.getString("web_url");

                    String snippet = resultObject.getString("snippet");

                    String lead_paragraph = resultObject.getString("lead_paragraph");

                    JSONObject headline_object = resultObject.getJSONObject("headline");

                    String headline  = headline_object.getString("main");

                    publishProgress(i);

                }


            }
            else
                result = "Did not work!";

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
        }

        return result;

    }

     protected void onProgressUpdate(Integer... progress) {
        //setProgressPercent(progress[0]);
    }

    protected void onPostExecute(Object result) {
        //showDialog("Downloaded " + result + " bytes");
    }

    // convert inputstream to String
    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }
}
