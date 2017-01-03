package com.optimalcities.topiccast;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by obelix on 29/09/2015.
 */
public class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public  TextView article_headline;
    public  TextView article_snippet;
    public  TextView article_source;

    public CardView topicCardView;

    private Context context;


    public ArticleViewHolder(Context mContext, View itemView, List<Articles> topicItemList) {
        super(itemView);

        context = mContext;

        topicCardView = (CardView)itemView.findViewById(R.id.card_view);

        article_headline = (TextView) itemView.findViewById(R.id.article_headline);
        article_snippet = (TextView) itemView.findViewById(R.id.article_snippet);
        article_source = (TextView) itemView.findViewById(R.id.article_source);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


    }
}

