package com.optimalcities.topiccast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by obelix on 28/09/2015.
 */
public class CountryResultAdapter extends RecyclerView.Adapter<CountryResultViewHolder> implements View.OnClickListener {

    interface ItemSelection
    {
        void itemSelected(JSONObject jsonObject, String keywords, String countryName);
    }
    private List<JSONObject> topicItemList;
    private Context mContext;
    private int view_id;
    CountryResultViewHolder viewHolder;

    String keywords;

    ItemSelection itemSelection;

    public CountryResultAdapter(Context context, List<JSONObject> topicItemList, String keywords) {
        this.topicItemList = topicItemList;
        this.mContext = context;
        this.keywords = keywords;

        itemSelection = (ItemSelection)context;
    }

    @Override
    public CountryResultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.results_row, null);

        view_id = view.getId();
        viewHolder = new CountryResultViewHolder(mContext,view, topicItemList);
        viewHolder.topicCardView.setOnClickListener(this);

        //view.setOnClickListener(this);
        return viewHolder;
    }

    private String getCountryName(String id)
    {
        String countryName = null;

        try {
            JSONObject countryObjects = new JSONObject(Constants.countryObject);

            JSONArray countryArray = countryObjects.getJSONArray("Categories");

            for(int i=0; i < countryArray.length(); i++)
            {
                JSONObject countryValue = countryArray.getJSONObject(i);

                String country_id = countryValue.getString("CategoryValue");

                if(country_id.trim().equals(id))
                {
                    return countryValue.getString("CategoryLabel");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return countryName;
    }
    @Override
    public void onBindViewHolder(CountryResultViewHolder holder, int position) {
        JSONObject feedItem = topicItemList.get(position);

        Log.d("ADAPTER",feedItem.toString());
        try {
            holder.topicCardView.setTag(position);
            holder.country_name.setText(getCountryName(feedItem.getString("countryCode")));
            if(feedItem.has("2007"))
            holder.country_result_year_1.setText(feedItem.getString("2007")+"%");
            if(feedItem.has("2011"))
            holder.country_result_year_2.setText(feedItem.getString("2011")+"%");
        } catch (JSONException e) {
            e.printStackTrace();
        }




    }


    @Override
    public int getItemCount() {
        return (null != topicItemList ? topicItemList.size() : 0);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public void onClick(View view) {


        if(view.getId() == viewHolder.topicCardView.getId())
        {
            JSONObject feedItem = topicItemList.get(Integer.parseInt(""+view.getTag()));


            try {
                itemSelection.itemSelected(feedItem,keywords,getCountryName(feedItem.getString("countryCode")));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            //Toast.makeText(mContext, "Click:" + view.getTag(),Toast.LENGTH_LONG).show();

        }
    }



}
