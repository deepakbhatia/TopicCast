package com.optimalcities.topiccast;

/**
 * Created by obelix on 21/08/2015.
 */


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class TopicDetailActivity extends ActionBarActivity implements
        LoaderManager.LoaderCallbacks<Cursor>,
        ArticlesAdapter.ItemSelection{
    private static final String TAG = "TopicDetailActivity";

    private SlidingUpPanelLayout mLayout;


    private RecyclerView mRecyclerView;
    private ArticlesAdapter articlesAdapter;
    private UkDataIntentReceiver mDownloadStateReceiver;
    private Intent mServiceIntent;

    private String dataUrl = "https://api.ukdataservice.ac.uk/V1/datasets/EQLS/topics/17/variables?user_key=97e27e89f4c710ed8b1f257241214c4f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_view);

        Constants.guardian.addAll(Constants.nytimes);

        mRecyclerView = (RecyclerView) findViewById(R.id.articles_recycler_view);

        Log.d("ARTICLE_LENGTH", ""+Constants.guardian.size());
        articlesAdapter = new ArticlesAdapter(this, Constants.guardian);
        //questionsList.setBackgroundColor(Color.WHITE);
        //mRecyclerView.setDivider(getResources().getDrawable(R.drawable.line_divider));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(articlesAdapter);

        TextView emptyView = (TextView) findViewById(R.id.empty_view);

        if (Constants.guardian.size() == 0) {
            mRecyclerView.setVisibility(View.GONE);
            emptyView.setVisibility(View.VISIBLE);
        }
        else {
            mRecyclerView.setVisibility(View.VISIBLE);
            emptyView.setVisibility(View.GONE);

        }
/*getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
               WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/


/*int mUIFlag = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        getWindow().getDecorView().setSystemUiVisibility(mUIFlag);
*/


        setSupportActionBar((Toolbar) findViewById(R.id.main_toolbar));

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public void onStart()
    {
        super.onStart();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }

    public String getCountry(int country_id)
    {
        String countryName = null;

        Firebase ref = new Firebase("https://eulifeapp.firebaseio.com/Variables/Categories");
        ref.addChildEventListener(new ChildEventListener() {
            // Retrieve new posts as they are added to the database
            @Override
            public void onChildAdded(DataSnapshot snapshot, String previousChildKey) {
                //BlogPost newPost = snapshot.getValue(BlogPost.class);
                Log.d(TAG,snapshot.toString());
               // System.out.println("Author: " + newPost.getAuthor());
               // System.out.println("Title: " + newPost.getTitle());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
            //... ChildEventListener also defines onChildChanged, onChildRemoved,
            //    onChildMoved and onCanceled, covered in later sections.
        });


        return countryName;
    }

    @Override
    public void itemSelected(Articles article) {
        Intent intent = new Intent(this,ArticlePost.class);

        intent.putExtra("url", article.getWeb_url());

        startActivity(intent);

    }
}


