package com.optimalcities.topiccast;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by obelix on 28/09/2015.
 */
public class CountryResultViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public CardView topicCardView;
    public TextView country_name;

    public TextView country_result_year_1;

    public TextView country_result_year_2;

    private Context context;


    public CountryResultViewHolder(Context mContext, View itemView, List<JSONObject> topicItemList) {
        super(itemView);

        context = mContext;
        
        topicCardView = (CardView)itemView.findViewById(R.id.card_view);

        country_name = (TextView) itemView.findViewById(R.id.country_name);
        country_result_year_1 = (TextView) itemView.findViewById(R.id.country_year_value_1);
        country_result_year_2 = (TextView) itemView.findViewById(R.id.country_year_value_2);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


    }
}