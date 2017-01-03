package com.optimalcities.topiccast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by obelix on 20/09/2015.
 */
public class VariableGroupAdapter extends ArrayAdapter {

    private Context mContext;
    private ArrayList<JSONObject> variableGroups;
    public VariableGroupAdapter(Context context, int textViewResourceId,
                           ArrayList objects) {
        super(context, textViewResourceId, objects);
        // TODO Auto-generated constructor stub
        mContext =context;

        variableGroups = objects;
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        // TODO Auto-generated method stub
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        //return super.getView(position, convertView, parent);

        LayoutInflater inflater=(LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );;
        View row=inflater.inflate(R.layout.row, parent, false);
        TextView label=(TextView)row.findViewById(R.id.element);
        try {
            label.setText(variableGroups.get(position).getString("VariableGroupValue"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

       /* ImageView icon=(ImageView)row.findViewById(R.id.icon);

        if (DayOfWeek[position]=="Sunday"){
            icon.setImageResource(R.drawable.icon);
        }
        else{
            icon.setImageResource(R.drawable.icongray);
        }*/

        return row;
    }
}