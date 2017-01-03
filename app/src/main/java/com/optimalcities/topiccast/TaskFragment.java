package com.optimalcities.topiccast;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

;


/**
 * TaskFragment manages a single background task and retains itself across
 * configuration changes.
 */
public class TaskFragment extends Fragment {
    private static final String TAG = TaskFragment.class.getSimpleName();
    private static final boolean DEBUG = true; // Set this to false to disable logs.
    private NYArticleTask mTask_ny;
    private GuardianContentTask mTask_gu;
    private boolean mRunning_GU = false;

    /**
     * Callback interface through which the fragment can report the task's
     * progress and results back to the Activity.
     */
     interface TaskCallbacks {
        void onPreExecute();
        void onProgressUpdate(int percent);
        void onCancelled();
        void onPostExecute();
    }

    private TaskCallbacks mCallbacks_NY;
    private TaskCallbacks mCallbacks_GU;

    private boolean mRunning_NY = false;

    /**
     * Hold a reference to the parent Activity so we can report the task's current
     * progress and results. The Android framework will pass us a reference to the
     * newly created Activity after each configuration change.
     */
    @Override
    public void onAttach(Activity activity) {
        //if (DEBUG) Log.i(TAG, "onAttach(Activity)");
        super.onAttach(activity);
        /*if (!(activity instanceof TaskCallbacks)) {
            throw new IllegalStateException("Activity must implement the TaskCallbacks interface.");
        }
*/
        // Hold a reference to the parent Activity so we can report back the task's
        // current progress and results.
        mCallbacks_NY = (TaskCallbacks) activity;
        mCallbacks_GU = (TaskCallbacks) activity;

    }

    /**
     * This method is called once when the Fragment is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (DEBUG) Log.i(TAG, "onCreate(Bundle)");
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    /**
     * Note that this method is <em>not</em> called when the Fragment is being
     * retained across Activity instances. It will, however, be called when its
     * parent Activity is being destroyed for good (such as when the user clicks
     * the back button, etc.).
     */
    @Override
    public void onDestroy() {
        if (DEBUG) Log.i(TAG, "onDestroy()");
        super.onDestroy();
        cancel();
    }

    /*****************************/
    /***** TASK FRAGMENT API *****/
    /*****************************/

    /**
     * Start the background task.
     */
    public void start() {
        if (!mRunning_NY) {
            mTask_ny = new NYArticleTask();

            mTask_ny.execute();

            mRunning_NY = true;
        }

        if(!mRunning_GU)
        {
            mTask_gu = new GuardianContentTask();
            mTask_gu.execute();
            mRunning_GU = true;

        }
    }

    /**
     * Cancel the background task.
     */
    public void cancel() {

        if (!mRunning_NY) {
            mTask_ny.cancel(false);
            mTask_ny = null;

            mRunning_NY = false;
        }

        if(!mRunning_GU)
        {mTask_gu.cancel(false);
            mTask_gu = null;
            mRunning_GU = false;

        }
    }

    /**
     * Returns the current state of the background task.
     */
    public boolean isRunning_NY() {
        return mRunning_NY;
    }

    public boolean isRunning_GU() {
        return mRunning_GU;
    }



    /**
     * Created by obelix on 13/09/2015.
     */
    public class NYArticleTask extends AsyncTask<Object, Integer, Object> {

        private Context mContext;
        private String API_KEY="d33c68e3191df52bcf3628c897b728c1:8:72314832";
        private String article_search_url = "http://api.nytimes.com/svc/search/v2/articlesearch.json?"+"&begin_date=20070101"+"&end_date=20150901&"+"api-key="+API_KEY;

        public  NYArticleTask()
        {

        }

        public NYArticleTask(Context context)
        {
            this.mContext = context;
        }

        @Override
        protected void onPreExecute() {
            // Proxy the call to the Activity.
            mCallbacks_NY.onPreExecute();
            mRunning_NY = true;
        }
        @Override
        protected Object doInBackground(Object[] objects) {


            String search_term = (String)objects[0];

            //String article_search_url = objects[0]+"api-key="+API_KEY;

            InputStream inputStream = null;
            String result = "";
            try {

                URL url = new URL(article_search_url);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();


                // receive response as inputStream
                inputStream = urlConnection.getInputStream();

                // create HttpClient

                // convert inputstream to string
                if(inputStream != null)
                {
                    result = convertInputStreamToString(inputStream);

                    //JSONObject results = new JSONObject(result);

                    JSONObject results_response = new JSONObject(result);
                    JSONArray result_docs = results_response.getJSONArray("docs");

                    for(int i=0;i<result_docs.length();i++)
                    {
                        JSONObject resultObject = result_docs.getJSONObject(i);

                        String article_id = resultObject.getString("_id");

                        String web_url = resultObject.getString("web_url");

                        String snippet = resultObject.getString("snippet");

                        String lead_paragraph = resultObject.getString("lead_paragraph");

                        JSONObject headline_object = resultObject.getJSONObject("headline");

                        String headline  = headline_object.getString("main");

                        Articles articles = new Articles();
                        articles.setArticle_id(article_id);
                        articles.setHeadline(headline);
                        articles.setSource("NYTIMES");
                        articles.setLead_paragraph(lead_paragraph);
                        articles.setWeb_url(web_url);
                        articles.setSnippet(snippet);
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
        @Override
        public void onProgressUpdate(Integer... percent) {
            //setProgressPercent(progress[0]);
        }
        @Override
        protected void onPostExecute(Object result) {
            //showDialog("Downloaded " + result + " bytes");

            mCallbacks_NY.onPostExecute();
            mRunning_NY = false;
        }


        @Override
        protected void onCancelled() {
            // Proxy the call to the Activity.
            mCallbacks_NY.onCancelled();
            mRunning_NY = false;
        }

    }

    /**
     * Created by obelix on 21/09/2015.
     */
    public class GuardianContentTask extends AsyncTask<Object, Integer, Object>  {

        private Context mContext;
        private String API_KEY="kak5tj558gc8geb9sbp522eu";

        //http://content.guardianapis.com/search?from-date=2007-09-01&to-date=2011-01-01&show-fields=trailText&page=415&q=air%20pollution%20europe&api-key=kak5tj558gc8geb9sbp522eu
        private String base_article_search_url ="http://content.guardianapis.com/search?api-key="+API_KEY+"&order-by=relevance&q=";
        public  GuardianContentTask()
        {

        }

        @Override
        protected void onPreExecute() {
            // Proxy the call to the Activity.
            mCallbacks_GU.onPreExecute();
            mRunning_GU = true;
        }
        @Override
        protected Object doInBackground(Object[] objects) {
            InputStream inputStream = null;
            String result = "";

            String url = base_article_search_url+objects[0];
            try {

                URL article_url = new URL(url);
                HttpURLConnection urlConnection = (HttpURLConnection) article_url.openConnection();


                // receive response as inputStream
                inputStream = urlConnection.getInputStream();
                // convert inputstream to string
                if(inputStream != null)
                {
                    result = convertInputStreamToString(inputStream);

                    JSONObject results = new JSONObject(result);


                    JSONObject results_response = new JSONObject("response");

                    String currentPage = results_response.getString("currentPage");

                    String pages = results_response.getString("pages");


                    JSONArray result_docs = results_response.getJSONArray("results");

                    for(int i=0;i<result_docs.length();i++)
                    {
                        JSONObject resultObject = result_docs.getJSONObject(i);

                        String article_id = resultObject.getString("id");

                        String web_url = resultObject.getString("webUrl");

                        String trailText = resultObject.getString("trailText");

                        String headline = resultObject.getString("webTitle");

                        Articles articles = new Articles();
                        articles.setArticle_id(article_id);
                        articles.setHeadline(headline);
                        articles.setSource("GUARDIAN");
                        articles.setLead_paragraph(trailText);
                        articles.setWeb_url(web_url);
                        articles.setSnippet(trailText);

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
            mCallbacks_GU.onPostExecute();
            mRunning_GU = false;
        }


        @Override
        protected void onCancelled() {
            // Proxy the call to the Activity.
            mCallbacks_GU.onCancelled();
            mRunning_GU = false;
        }


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










    /************************/
    /***** LOGS & STUFF *****/
    /************************/

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        if (DEBUG) Log.i(TAG, "onActivityCreated(Bundle)");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        if (DEBUG) Log.i(TAG, "onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        if (DEBUG) Log.i(TAG, "onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        if (DEBUG) Log.i(TAG, "onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        if (DEBUG) Log.i(TAG, "onStop()");
        super.onStop();
    }

}