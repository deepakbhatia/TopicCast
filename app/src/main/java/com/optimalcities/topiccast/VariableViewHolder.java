package com.optimalcities.topiccast;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.wefika.flowlayout.FlowLayout;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by obelix on 26/09/2015.
 */
public class VariableViewHolder extends RecyclerView.ViewHolder {

    public TextView title;

    public TextView description;

    private CardView topicCardView;

    public FlowLayout flowLayout;

    private Context context;


    public VariableViewHolder(Context mContext, View itemView, List<JSONObject> topicItemList) {
        super(itemView);

        context = mContext;
        //topicCardView = (CardView)itemView.findViewById(R.id.card_view);

        title = (TextView) itemView.findViewById(R.id.title_variable);
        flowLayout = (FlowLayout) itemView.findViewById(R.id.flow);



    }



}
