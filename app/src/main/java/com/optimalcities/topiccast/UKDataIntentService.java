package com.optimalcities.topiccast;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class UKDataIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this

    public UKDataIntentService() {
        super("UKDataIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();

            String url_string = intent.getStringExtra("url");

            //BufferedReader inStream = null;
            try {
                URL http_url = new URL(url_string);
                HttpURLConnection urlConnection = (HttpURLConnection) http_url.openConnection();


                // receive response as inputStream
                InputStream inStream = urlConnection.getInputStream();


                StringBuffer buffer = new StringBuffer("");
                String line = "";
                String NL = System.getProperty("line.separator");
                if(inStream!=null) {
                    inStream.close();

                    String result = buffer.toString();


                    Intent localIntent =
                            new Intent(Constants.UK_DATA_BROADCAST_ACTION)
                                    // Puts the status into the Intent
                                    .putExtra(Constants.UK_DATA_BROADCAST_ACTION_RESULT, result);
                    // Broadcasts the Intent to receivers in this app.
                    LocalBroadcastManager.getInstance(this).sendBroadcast(localIntent);
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
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
