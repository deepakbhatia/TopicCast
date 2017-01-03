package com.optimalcities.topiccast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wefika.flowlayout.FlowLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by obelix on 26/09/2015.
 */
public class VariablesAdapter extends RecyclerView.Adapter<VariableViewHolder> implements View.OnClickListener {
    private List<JSONObject> topicItemList;
    private Context mContext;

    public VariablesAdapter(Context context, List<JSONObject> topicItemList) {
        this.topicItemList = topicItemList;
        this.mContext = context;

    }


    @Override
    public VariableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.curomize_row, null);

        VariableViewHolder viewHolder = new VariableViewHolder(mContext,view, topicItemList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VariableViewHolder holder, int position) {

        JSONObject feedItem = topicItemList.get(position);

        addCustomRequest(position,feedItem,holder);



    }



    /*




    JSONArray uk_data_variables_values = uk_data_variable.getJSONArray("Categories");

                        for(int variable_values_counter =0;variable_values_counter < uk_data_variables_values.length(); variable_values_counter++)
                        {
                            .add(uk_data_variables_values.getJSONObject(variable_values_counter));
                        }
     */
    private void addCustomRequest(int position, JSONObject feedItem, VariableViewHolder holder)
    {
        //for (int j = 0; j < topicItemList.size(); j++) {
        holder.flowLayout.removeAllViews();

            try {


                //JSONObject feedItem = ((JSONObject)topicItemList.get(j));

                holder.title.setText(feedItem.getString("VariableLabel"));
                Button selected_button = null;

                JSONArray uk_data_variables_values = null;

                uk_data_variables_values = feedItem.getJSONArray("Categories");

                //Log.d("TAGGER",uk_data_variables_values.toString());
                for(int variable_values_counter =0;variable_values_counter < uk_data_variables_values.length(); variable_values_counter++) {

                    if (variable_values_counter == 0
                            || variable_values_counter == uk_data_variables_values.length() - 1
                            || variable_values_counter == uk_data_variables_values.length() / 2) {
                        JSONObject variable_ = uk_data_variables_values.getJSONObject(variable_values_counter);
                        Button btnTag = new Button(mContext);
                        btnTag.setBackgroundResource(R.drawable.button_state);
                        btnTag.setTextColor(mContext.getResources().getColor(R.color.primaryText));
                        FlowLayout.LayoutParams params = new FlowLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT, FlowLayout.LayoutParams.WRAP_CONTENT);
                        //params.setLayoutDirection(LayoutDirection.);
                        params.gravity= Gravity.CENTER;
                        params.setMargins(5, 5, 5, 5);
                        btnTag.setLayoutParams(params);
                        String button_label = null;
                        button_label = variable_.getString("CategoryLabel");

                        btnTag.setText(button_label);

                        String button_tag =  position+":"+"variable_button"+":"+variable_.getString("VariableId") + ":" + variable_.getString("CategoryValue");


                        if(Constants.onClicked.containsKey(button_tag))
                        {
                            Button setbutton  = (Button)Constants.onClicked.get(button_tag);
                            String current_tag = (String)setbutton.getTag();

                            if(current_tag.equals(button_tag))
                            {
                                Log.d("ONCLICKED_TAG --- ", "" + position + ":" + current_tag);

                                btnTag.setSelected(true);
                                btnTag.setPressed(true);

                                selected_button = btnTag;
                                //btnTag.setBackgroundResource(R.drawable.button_state);

                                //btnTag.selec
                            }
                        }
                        btnTag.setTag(button_tag);
                        btnTag.setId((variable_.getString("VariableId") + ":" + variable_.getString("CategoryValue")).hashCode());

                        btnTag.setOnClickListener(this);
                        btnTag.setBackground(mContext.getResources().getDrawable(R.drawable.button_state));
                        holder.flowLayout.addView(btnTag);
                        //Snackbar.make(, "FAB Clicked", Snackbar.LENGTH_SHORT).show();

                        //.add(uk_data_variables_values.getJSONObject(variable_values_counter));
                    }

                }
                if(selected_button!=null)
                changeButtonState(false, selected_button);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        //}
    }

    @Override
    public int getItemCount() {
        return (null != topicItemList ? topicItemList.size() : 0);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    public void changeButtonState(boolean state, View view)
    {
        ViewGroup row = (ViewGroup) view.getParent();
        for (int itemPos = 0; itemPos < row.getChildCount(); itemPos++) {
            View viewChild = row.getChildAt(itemPos);
            if (viewChild instanceof Button) {
                Button variableButton = (Button) viewChild;
                if(!(variableButton.getId() == view.getId()))
                {
                    variableButton.setEnabled(state);
                    variableButton.setClickable(state);
                    Log.d("disabled", "");
                }




                //variableButton.setVisibility(View.INVISIBLE);

                //Found it!
                //break;
            }
        }
    }
    @Override
    public void onClick(View view) {

        String view_tag = (String)view.getTag();

        int position_list = -1;
        if(Constants.onClicked.containsKey(view_tag))
        {

            view.setSelected(false);
            view.setPressed(false);

            Constants.onClicked.remove(view_tag);

            changeButtonState(true,view);
        }
        else if(view_tag.contains("variable_button"))
        {
            view.setSelected(true);
            StringTokenizer button_tag_token = new StringTokenizer(view_tag,":");
            int counter = 0;
            while(button_tag_token.hasMoreTokens())
            {
                String current_token = button_tag_token.nextToken();
                if(counter == 0)
                {
                    position_list = Integer.parseInt(current_token);

                    Constants.onClicked.put(view_tag, view);

                    Log.d("ONCLICKED_TAG",""+position_list+":"+view_tag);
                }

                counter++;

            }

            changeButtonState(false,view);
        }

    }
}