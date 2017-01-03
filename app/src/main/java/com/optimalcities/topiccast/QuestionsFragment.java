package com.optimalcities.topiccast;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.wefika.flowlayout.FlowLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by obelix on 22/09/2015.
 */
public class QuestionsFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {


    private RecyclerView mRecyclerView;

    private FlowLayout flowLayout;

    private Spinner toolbar_spinner;

    private ArrayList<ReadyQueries
            > queries_list = new ArrayList<>();

    private VariableGroupAdapter variableGroupAdapter;


    private Activity activity;

    private ListView questionsList;

    private QuestionsAdapter questionsAdapter;

    Toolbar toolbar;

    @Override
    public void onAttach(Activity activity) {
        //if (DEBUG) Log.i(TAG, "onAttach(Activity)");
        super.onAttach(activity);
        this.activity = activity;
    }

    // TODO: Rename and change types and number of parameters
    public static QuestionsFragment newInstance() {
        QuestionsFragment fragment = new QuestionsFragment();

        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.explore_fragment,container,false);

        toolbar  = (Toolbar)getActivity().findViewById(R.id.main_toolbar);



        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("VariableGroupValue","");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //flowLayout = (FlowLayout)v.findViewById(R.id.flow);

        questionsList= ( ListView )v.findViewById( R.id.list );  // List defined in XML ( See Below )

        questionsList.setOnItemClickListener(this);
        //getActivity().invalidateOptionsMenu();

        //Spinner spinner = (Spinner) toolbar.findViewWithTag("spinner_toolbar");
        //toolbar.removeView(spinner);
        //getCurrentFragment();
        //Constants.toolbar_spinner.setVisibility(View.GONE);

        //toolbar_spinner = (Spinner)v.findViewById(R.id.spinner_nav);

        //toolbar_spinner.setOnItemSelectedListener(this);
        createGroupList();

        //variableGroupAdapter = new VariableGroupAdapter(this, R.layout.row,variableGroup_list);

        //toolbar_spinner.setAdapter(variableGroupAdapter);



        return v;
    }

    private void createGroupList()
    {
        try {
            Constants.addQueries();

            /**************** Create Custom Adapter *********/
            questionsAdapter=new QuestionsAdapter( getActivity(), Constants.queries,getResources() );
            questionsList.setBackgroundColor(Color.WHITE);
            questionsList.setDivider(getResources().getDrawable(R.drawable.line_divider));
            questionsList.setAdapter(questionsAdapter);
            //questionsList.setOnItemSelectedListener(this);

            Log.d("EXPLORE","");



            /*for(int i=0;i < Constants.queries.size();i++)
            {
                Button questions = new Button(getActivity());
                questions.setBackgroundResource(R.drawable.button_background);

                FlowLayout.LayoutParams params = new FlowLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT, FlowLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(5,5,5,5);
                questions.setTextSize(TypedValue.COMPLEX_UNIT_PX, 16);
                questions.setLayoutParams(params);
                ReadyQueries readyQueries = (ReadyQueries)Constants.queries.get(i);
                questions.setText(readyQueries.getQuery_type() );
                questions.setId(readyQueries.getQuery_type().hashCode());
                flowLayout.addView(questions);

            }*/

            //Toast.makeText(this, "" + variableGroups.length(), Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onResume() {
        //if (DEBUG) Log.i(TAG, "onResume()");
        super.onResume();
        //Constants.toolbar_spinner.setVisibility(View.INVISIBLE);

       // if(Constants.toolbar_spinner!=null)
        //toolbar.removeView(Constants.toolbar_spinner);
    }

    @Override
    public void onPause() {
        //if (DEBUG) Log.i(TAG, "onPause()");
        super.onPause();


    }

    @Override
    public void onStop() {
        //if (DEBUG) Log.i(TAG, "onStop()");
        super.onStop();
    }
    @Override
    public void onClick(View view) {
        //Toast.makeText(getActivity(),"onclick:"+view.getId(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(getActivity(),"onitem:"+i,Toast.LENGTH_LONG).show();

        ReadyQueries readyQueries = (ReadyQueries)Constants.queries.get(i);

        String query = readyQueries.getQuery();

        String keyword = readyQueries.getQuery_keyword();

        Constants.guardian = new ArrayList();

        Constants.guardian = new ArrayList();

        UKDataAsyncTask ukDataAsyncTask = new UKDataAsyncTask(getActivity());

        ukDataAsyncTask.execute(query, getKeywords(keyword));
    }
    private String getKeywords(String keywords)
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


        return final_keys+","+"europe";

    }
}
