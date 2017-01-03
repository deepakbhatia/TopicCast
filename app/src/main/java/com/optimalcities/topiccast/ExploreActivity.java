package com.optimalcities.topiccast;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.Locale;

public class ExploreActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    ViewGroup viewlist;

    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    final static int Numboftabs = 2;
    CharSequence Titles[]={"Home","Events"};
    int tab_count = 0;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

         Constants.addVariables();

         Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
         setSupportActionBar(toolbar);



         mViewPager = (ViewPager) findViewById(R.id.queries_pager);
         //setupViewPager(viewPager);
         TabLayout tabLayout = (TabLayout) findViewById(R.id.queries_tabs);

         mSectionsPagerAdapter =  new SectionsPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);

         // Assigning ViewPager View and setting the adapter
         mViewPager.setAdapter(mSectionsPagerAdapter);
         //getSupportActionBar().setNavigationMode(ActioBa.NAVIGATION_MODE_TABS);
         tabLayout.setupWithViewPager(mViewPager);

         tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.accent));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {

    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
        int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created

        public SectionsPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
            super(fm);

            this.Titles = mTitles;
            this.NumbOfTabs = mNumbOfTabsumb;

        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
           /* if(position == 0) // if the position is 0 we are returning the First tab
            {
                DrivePublicab drivePublicab = new DrivePublicab();
                return drivePublicab;
            }*/

            if(position == 0) // if the position is 0 we are returning the First tab
            {
                //Constants.toolbar_spinner.setVisibility(View.GONE);
                tab_count = 0;
                QuestionsFragment questionsFragment = QuestionsFragment.newInstance();
                return questionsFragment;
            }
            else if(position == 1) // if the position is 0 we are returning the First tab
            {
                tab_count = 1;
                CustomizeFragment customizeFragment = CustomizeFragment.newInstance();
                return customizeFragment;
            }
            return null;

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return NumbOfTabs;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.ready_questions).toUpperCase(l);
                case 1:
                    return getString(R.string.customize_questions).toUpperCase(l);

            }
            return null;
        }
    }
}
