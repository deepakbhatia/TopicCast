package com.optimalcities.topiccast;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by obelix on 23/08/2015.
 */
public class UKDataAsyncTask extends AsyncTask<String, Void, String> {
    //TextView t;
    String result = "fail";
    String url_string=null;

    HashMap<String,String> countryValues;
    HashMap<String, HashMap> results_year;
    JSONObject country_results;
    Activity activity;
    JSONArray countryResults;
    JSONObject country_Results;

    String keywords = null;
    public interface CallbackReciever {
        public void receiveData(Object result);

    }

    public UKDataAsyncTask(Activity activity)
    {
        this.activity = activity;
        countryResults = new JSONArray();
        country_Results = new JSONObject();
    }
    @Override
    protected String doInBackground(String... params) {
        // TODO Auto-generated method stub
        countryValues = new HashMap<>();
        results_year = new HashMap<>();

        url_string = params[0];

        keywords = params[1];

        //Log.d("addFilters",url_string);
        country_results = new JSONObject();
        return GetSomething(url_string);
    }


    final String GetSomething(String url)
    {
        //String url = "http://www.elvenware.com/cgi-bin/LatLongReadData.py";
        BufferedReader inStream = null;
        try {
            URL http_url = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) http_url.openConnection();

            JSONObject countryObject = new JSONObject(Constants.countryObject);

            JSONArray countryArray = countryObject.getJSONArray("Categories");

            // receive response as inputStream
            InputStream inputStream = urlConnection.getInputStream();


            result =convertInputStreamToString(inputStream);

            //Log.d("TIMeSERIES",result);
            ArrayList frequencyvalues = new ArrayList();

            JSONObject resultobject = new JSONObject(result);

            JSONArray timeseries = resultobject.getJSONArray("TimeSeries");

            for(int i=0;i<timeseries.length();i++)
            {
                JSONObject timeseries_data = timeseries.getJSONObject(i);

                Constants.query_response.put(url_string,timeseries_data);

                String dataset_id = timeseries_data.getString("DatasetId");

                String year = timeseries_data.getString("Year");

                String value  = ""+timeseries_data.getInt("Value");

                String frequency = timeseries_data.getString("WeightedFrequency");


                //Log.d("country_Results_Q", ""+timeseries.length());


                if(year.trim().equals("2007"))
                {
                    HashMap results = new HashMap();
                    double sum_year = 0;
                    if(results_year.containsKey(year.trim()))
                    {
                        results = results_year.get(year.trim());
                        sum_year  = Double.parseDouble(String.valueOf(results.get("finalValue")));
                    }
                    results.put(value.trim(), frequency.trim());

                    //Log.d("country_Results_S", year + ":" + value + ":" + frequency);

                    sum_year+= Double.parseDouble(frequency);
                    results.put("finalValue",sum_year);
                    results_year.put(year.trim(),results);
                } else if(year.trim().equals("2011"))
                {
                    HashMap results = new HashMap();
                    double sum_year = 0;
                    if(results_year.containsKey(year.trim()))
                    {
                        results = results_year.get(year.trim());

                        sum_year  = Double.parseDouble(String.valueOf(results.get("finalValue")));

                    }
                    results.put(value.trim(), frequency.trim());

                    //Log.d("country_Results_S", year + ":" + value + ":" + frequency);

                    sum_year+= Double.parseDouble(frequency);
                    results.put("finalValue",sum_year);
                    results_year.put(year.trim(),results);

                }

            }

            JSONArray list_countries = new JSONArray();

            Set keys = results_year.keySet();

            Iterator iterator = keys.iterator();

            while (iterator.hasNext())
            {
                countryResults = new JSONArray();
                String year = (String)iterator.next();
                HashMap countryValues = results_year.get(year);

                double total_val = Double.parseDouble("" + countryValues.get("finalValue"));
                Set countryIds = countryValues.keySet();

                Iterator countryIter = countryIds.iterator();

                while(countryIter.hasNext())
                {

                    String countryCode = (String)countryIter.next();

                    for(int j=0; j < countryArray.length();j++)
                    {
                        JSONObject individual_country = countryArray.getJSONObject(j);

                        if(individual_country.getString("CategoryValue").trim().equals(countryCode))
                        {
                            //Log.d("country_Results_S", "1");


                            //individual_country.getString("CategorLabel");

                            double country_freq = Double.parseDouble(""+countryValues.get(countryCode));
                            //Log.d("country_Results_S", countryCode+":"+year+":"+country_freq);

                            double country_percent = (country_freq/total_val)*100;
                            //Log.d("country_Results_S", "3");

                            JSONObject country_result_object = new JSONObject();
                            //Log.d("country_Results_S", "4");

                            country_result_object.put(countryCode, round(country_percent,3));
                            //Log.d("country_Results_S", "5");

                            list_countries.put(country_result_object);
                            //Log.d("country_Results_S", "6");

                            countryResults.put(country_result_object);
                            //Log.d("country_Results_S", "1");

                        }
                    }

                }
                country_Results.put(year,countryResults);



            }


            //country_results.put("countryResultList",list_countries);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {



            return resultByCountry(country_Results).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    private JSONObject resultByCountry(JSONObject countryObjects) {

        HashMap<String, JSONObject> countryres = new HashMap<String, JSONObject>();
        try {
            //Log.d("YEAR",countryObjects.toString());

            if(countryObjects.has("2007"))
            {
                JSONArray results_2007 = countryObjects.getJSONArray("2007");

                for(int i=0; i < results_2007.length(); i++)
                {
                    JSONObject country_result = results_2007.getJSONObject(i);

                    Iterator countrycodes = country_result.keys();

                    while(countrycodes.hasNext())
                    {
                        String countryCodes = (String)countrycodes.next();


                        JSONObject countryObject = new JSONObject();
                        countryObject.put("countryCode",countryCodes);
                        //Log.d("country_Results_S", countryCodes + ":" + "2007" + ":" + country_result.getString(countryCodes));

                        countryObject.put("2007",country_result.getString(countryCodes));
                        countryres.put(countryCodes,countryObject);
                    }


                }
            }
            if(countryObjects.has("2011"))
            {
                JSONArray results_2011 = countryObjects.getJSONArray("2011");


                for(int i=0; i < results_2011.length(); i++)
                {
                    JSONObject country_result = results_2011.getJSONObject(i);

                    Iterator countrycodes = country_result.keys();

                    while(countrycodes.hasNext())
                    {
                        String countryCodes = (String)countrycodes.next();


                        JSONObject countryObject = new JSONObject();


                        if (countryres.containsKey(countryCodes))
                        {
                            countryObject = (JSONObject)countryres.get(countryCodes);
                        }
                        else
                            countryObject.put("countryCode",countryCodes);
                        //Log.d("country_Results_S", countryCodes + ":" + "2011" + ":" + country_result.getString(countryCodes));

                        countryObject.put("2011",country_result.getString(countryCodes));

                        countryres.put(countryCodes,countryObject);
                    }


                }

            }

            Set keys = countryres.keySet();

            Iterator iterator = keys.iterator();

            JSONObject resultObject = new JSONObject();

            JSONArray resultArray = new JSONArray();

            while (iterator.hasNext()) {

                resultArray.put(countryres.get(iterator.next()));
            }


                resultObject.put("results",resultArray);


            return resultObject;

        }
        catch (Exception ex)
        {

        }

        return null;

    }

    protected void onPostExecute(String page)
    {

        //Toast.makeText(activity,"RESULT:"+page,Toast.LENGTH_LONG).show();


        //Log.d("RESULT",page);

        Intent intent = new Intent(activity, CountryResultActivity.class);

        intent.putExtra("results",page);
        intent.putExtra("keywords",keywords);
        activity.startActivity(intent);

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




