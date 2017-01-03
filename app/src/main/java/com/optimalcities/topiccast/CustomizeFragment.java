package com.optimalcities.topiccast;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by obelix on 23/09/2015.
 */
public class CustomizeFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {


    private RecyclerView mRecyclerView;

    FloatingActionButton getquery;


    private Spinner toolbar_spinner;

    private ArrayList<JSONObject> variableGroup_list = new ArrayList<>();

    private VariableGroupAdapter variableGroupAdapter;

    private Activity activity;

    private View v;

    private Toolbar toolbar;

    private String base_url = "https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=";
    private String keywords = "";


    @Override
    public void onAttach(Activity activity) {
        //if (DEBUG) Log.i(TAG, "onAttach(Activity)");
        super.onAttach(activity);
        this.activity = activity;
    }

    // TODO: Rename and change types and number of parameters
    public static CustomizeFragment newInstance() {
        CustomizeFragment fragment = new CustomizeFragment();

        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //if (DEBUG) Log.i(TAG, "onCreate(Bundle)");
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
    }

    /**
     * Note that this method is <em>not</em> called when the Fragment is being
     * retained across Activity instances. It will, however, be called when its
     * parent Activity is being destroyed for good (such as when the user clicks
     * the back button, etc.).
     */
    @Override
    public void onDestroy() {
        //if (DEBUG) Log.i(TAG, "onDestroy()");
        super.onDestroy();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       v  = inflater.inflate(R.layout.customize_fragment, container, false);


       /* Toolbar mToolbar = (Toolbar) v.findViewById(R.id.main_toolbar);

        //mToolbar.setNavigationOnClickListener(this);
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        //((AppCompatActivity) getActivity()).getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_content_clear));

        //((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mToolbar.setTitle(R.string.ready_questions);*/
        setHasOptionsMenu(true);
        toolbar  = (Toolbar)getActivity().findViewById(R.id.main_toolbar);

        getquery = (FloatingActionButton)v.findViewById(R.id.fab);

        getquery.setOnClickListener(this);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("VariableGroupValue", "");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //getActivity().invalidateOptionsMenu();

        //variableGroup_list.add(jsonObject);

        //Constants.toolbar_spinner.setVisibility(View.VISIBLE);
        Constants.toolbar_spinner = (Spinner)v.findViewById(R.id.variable_spinner);
        Constants.toolbar_spinner.setOnItemSelectedListener(this);
        createGroupList();

        variableGroupAdapter = new VariableGroupAdapter(getActivity(), R.layout.row,variableGroup_list);

        Constants.toolbar_spinner.setAdapter(variableGroupAdapter);

        //toolbar.addView(Constants.toolbar_spinner);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mRecyclerView.setBackgroundColor(Color.WHITE);
        mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity()));


        return v;
    }


    private void showHint()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

// 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage("Select Category from the drop down. It should show sub topics, with various values as buttons." +
                "Tap on a Button to select it. Tap multiple buttons to add them as filters. To query, tap on search button on bottom right")
                .setTitle("How to");

        builder.setInverseBackgroundForced(true);
// 3. Get the AlertDialog from create()
        AlertDialog dialog = builder.create();


        dialog.show();
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_explore, menu);

        /*MenuItem menuItem = menu.add(Menu.NONE, 0, Menu.NONE, "custom");


        menuItem.setActionView(R.layout.menu_layout);
        menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        menuItem.*/

        /*if(tab_count == 0)
            Constants.toolbar_spinner.setVisibility(View.GONE);
        else
            Constants.toolbar_spinner.setVisibility(View.VISIBLE);*/



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_info) {

            showHint();
            //Toast.makeText(getActivity(),"Clicked",Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        //if (DEBUG) Log.i(TAG, "onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        //if (DEBUG) Log.i(TAG, "onPause()");
        super.onPause();

        //toolbar.removeView(Constants.toolbar_spinner);
    }

    @Override
    public void onStop() {
        //if (DEBUG) Log.i(TAG, "onStop()");
        super.onStop();
    }
    private void createGroupList()
    {
        try {
            JSONObject jsonObject = new JSONObject(Constants.variablesGroups.trim());

            JSONArray variableGroups = jsonObject.getJSONArray("VariableGroups");

            Log.d("EXPLORE", jsonObject.toString());

            for(int i=0;i < variableGroups.length();i++)
            {
                variableGroup_list.add(variableGroups.getJSONObject(i));

            }

            //Toast.makeText(this, "" + variableGroups.length(), Toast.LENGTH_LONG).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i > 0)
        {
            ArrayList<JSONObject> variable_values_list = new ArrayList<>();

            if(adapterView.getId() == R.id.variable_spinner)
            {
// Initialize recycler view

//                Toast.makeText(getActivity(), adapterView.getId() + ":" + R.id.variable_spinner + ":" + view.getId(), Toast.LENGTH_LONG).show();

                JSONObject variable_selected = variableGroup_list.get(i);

                try {
                    Log.d("VariableLabel",variable_selected.toString());

                    int number_selected = Integer.parseInt(variable_selected.getString("VariableGroupId"));
                    if(!keywords.equals(""))
                        keywords += "+";
                    keywords += variable_selected.getString("VariableGroupValue");
                    String variables_value = ""+Constants.variables_group.get(number_selected);

                    Log.d("TAGGGER",""+variables_value);
                    JSONObject variableObject = new JSONObject(variables_value);
                    JSONArray variablesArray = variableObject.getJSONArray("Variables");

                    for(int counter = 0; counter < variablesArray.length(); counter++)
                    {
                        JSONObject uk_data_variable = variablesArray.getJSONObject(
                                counter
                        );
                        //keywords=uk_data_variable.getString("VariableLabel");
                        variable_values_list.add(uk_data_variable);
                    }

                    VariablesAdapter adapter = new VariablesAdapter(getActivity(), variable_values_list);
                    mRecyclerView.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    private String addFilters()
    {
        Set filterKeys = Constants.onClicked.keySet();

        Iterator filterIter = filterKeys.iterator();
        String filter = "";
        while (filterIter.hasNext())
        {
            Button filterButton = (Button)Constants.onClicked.get(filterIter.next());


            String view_tag = (String)filterButton.getTag();

            StringTokenizer button_tag_token = new StringTokenizer(view_tag,":");
            int counter = 0;

            Log.d("VIEWTAG", ""+ view_tag);
            while(button_tag_token.hasMoreTokens())
            {
                String current_token = button_tag_token.nextToken();

                if(counter == 2)
                {
                    filter+=current_token+":";

                    //Constants.onClicked.put(position_list, view);

                    //Log.d("UKDATASYNC", ""+ view_tag);
                }
                else  if(counter == 3)
                {
                    filter+=current_token;

                    //Constants.onClicked.put(position_list, view);

                    //Log.d("UKDATASYNC", ""+ view_tag);
                }


                counter++;

            }

            if(filterIter.hasNext())
                filter+="|";

        }

        return filter;
    }
    @Override
    public void onClick(View view) {

            if(view.getId() == R.id.fab)
            {
                String url_string = base_url+addFilters();

                Constants.onClicked = new HashMap();

                Constants.guardian = new ArrayList();

                Constants.guardian = new ArrayList();
                UKDataAsyncTask ukDataAsyncTask = new UKDataAsyncTask(getActivity());

                ukDataAsyncTask.execute(url_string,getKeywords());
            }

    }

    private String getKeywords()
    {
        String tags = keywords;
        String final_keys = "";
        StringTokenizer strk = new StringTokenizer(tags," ");
        int counter = 0;
        while(strk.hasMoreTokens())
        {
            String text = strk.nextToken();

            if(!(text.contains("and")
                    || text.contains("if")
                    || text.contains("but")
                    || text.contains("or")
                    || text.contains("to")
                    || text.contains("with")))
            {
                final_keys+=text;
                if(strk.hasMoreTokens())
                {
                    final_keys+=",";
                }
            }
            counter++;

        }


        return final_keys+",europe,"+"2007,"+"2011";

    }
}
