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
 * Created by obelix on 21/09/2015.
 */
public class GuardianContentTask extends AsyncTask<Object, Integer, Object>  {

    private Context mContext;

    //http://content.guardianapis.com/search?from-date=2007-09-01&to-date=2011-01-01&show-fields=trailText&page=415&q=air%20pollution%20europe&api-key=kak5tj558gc8geb9sbp522eu
    private String base_article_search_url ="http://content.guardianapis.com/search?api-key="+Constants.API_KEY+"&order-by=relevance&q=";
    public  GuardianContentTask()
    {

    }


    @Override
    protected Object doInBackground(Object[] objects) {
        InputStream inputStream = null;
        String result = "";

        String article_url = base_article_search_url+objects[0];
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


                JSONObject results_response = results.getJSONObject("response");

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
                    publishProgress(i);

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

    protected void onPostExecute(Long result) {
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
