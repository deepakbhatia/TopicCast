package com.optimalcities.topiccast;

/**
 * Created by obelix on 21/08/2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.webkit.WebView;

import com.firebase.client.Firebase;

public class ArticlePost extends ActionBarActivity {

    private WebView article_post_view;

    private ArticlePostWebViewClient articlePostWebViewClient;

    private ArticlePostChromeClient articlePostChromeClient;

    private String loading_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        //this.getWindow().requestFeature(Window.FEATURE_PROGRESS);

        /*getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

       /* int mUIFlag = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
*/
        //getWindow().getDecorView().setSystemUiVisibility(mUIFlag);

        Intent intent = getIntent();

        loading_url = intent.getStringExtra("url");

        setContentView(R.layout.article_view);


        setSupportActionBar((Toolbar) findViewById(R.id.main_toolbar));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.mipmap.ic_launcher));

       /* final Firebase ref = new Firebase("https://eulifeapp.firebaseio.com/");
         //Query qref = ref.child("Variables").orderByChild("Question").equalTo("Country");
        ref.child("Variables").child("Categories").orderByChild("CategoryLabel").equalTo("Austria").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                // do some stuff once
                //snapshot.child("Categories").getValue().
                //Toast.makeText(getApplicationContext(), snapshot.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
         });*/

        article_post_view = (WebView)findViewById(R.id.article_webview);

        articlePostWebViewClient = new ArticlePostWebViewClient(this);
        article_post_view.setWebViewClient(articlePostWebViewClient);

        articlePostChromeClient = new ArticlePostChromeClient(this);
        /* WebChromeClient must be set BEFORE calling loadUrl! */
        article_post_view.setWebChromeClient(articlePostChromeClient);

        article_post_view.getSettings().setJavaScriptEnabled(true);

        article_post_view.loadUrl(loading_url);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.article_post_view.canGoBack()) {
            this.article_post_view.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


}
