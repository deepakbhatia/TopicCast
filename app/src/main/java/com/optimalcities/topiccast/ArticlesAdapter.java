package com.optimalcities.topiccast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by obelix on 29/09/2015.
 */
public class ArticlesAdapter extends RecyclerView.Adapter<ArticleViewHolder> implements View.OnClickListener {

    interface ItemSelection
    {
        void itemSelected(Articles articles);
    }
    private List<Articles> topicItemList;
    private Context mContext;
    private int view_id;
    ArticleViewHolder viewHolder;

    String keywords;

    ItemSelection itemSelection;

    public ArticlesAdapter(Context context, List<Articles> topicItemList) {
        this.topicItemList = topicItemList;
        this.mContext = context;

        itemSelection = (ItemSelection)context;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_row, null);

        view_id = view.getId();
        viewHolder = new ArticleViewHolder(mContext,view, topicItemList);
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
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Articles articles = topicItemList.get(position);

            holder.topicCardView.setTag(position);
            holder.article_headline.setText(articles.getHeadline());
            holder.article_snippet.setText(articles.getSnippet());
            holder.article_source.setText(articles.getSource());
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
            Articles article = topicItemList.get(Integer.parseInt(""+view.getTag()));


            itemSelection.itemSelected(article);
            //Toast.makeText(mContext, "Click:" + view.getTag()+":"+article.getHeadline(), Toast.LENGTH_LONG).show();

        }
    }



}

