package com.optimalcities.topiccast;

import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by obelix on 21/08/2015.
 */
public class ArticlePostWebViewClient extends WebViewClient {


    private Activity activity = null;

    //private UrlCache urlCache = null;

    public ArticlePostWebViewClient(Activity activity) {
        this.activity = activity;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        return false;
    }
}
