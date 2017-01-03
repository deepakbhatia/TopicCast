package com.optimalcities.topiccast;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by obelix on 21/08/2015.
 */
public class ArticlePostChromeClient extends WebChromeClient {


    private Activity app_context;
    public ArticlePostChromeClient(Activity context)
    {
           app_context = context;
    }

    @Override
    public void onProgressChanged(WebView view, int progress)
    {
        app_context.setTitle("Loading...");
        app_context.setProgress(progress * 100);

        app_context.setProgressBarVisibility(true);

        if(progress == 100)
            app_context.setTitle(R.string.app_name);
    }

    @Override
    public boolean onJsAlert(WebView view, String url, String message, final android.webkit.JsResult result) {
        new AlertDialog.Builder(app_context)
                .setTitle("javaScript dialog")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok,
                        new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                result.confirm();
                            }
                        })
                .setCancelable(false)
                .create()
                .show();

        return true;
    }
}
