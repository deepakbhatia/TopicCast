package com.optimalcities.topiccast;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by obelix on 25/08/2015.
 */
public class TopicViewHolder extends RecyclerView.ViewHolder {

    public TextView title;

    public TextView description;

    private CardView topicCardView;

    public TopicViewHolder(View itemView, List<Topics> topicItemList) {
        super(itemView);

        topicCardView = (CardView)itemView.findViewById(R.id.card_view);

        title = (TextView) itemView.findViewById(R.id.title);

        title.setText(""+((Topics)topicItemList.get(0)).getArticle_links().get(0));


        //topicCardView.addView(title);

        //title.setText(""+((Topics)topicItemList.get(0)).getArticle_links().get(1));

        // We set listeners to the whole item view, but we could also
        // specify listeners for the title or the icon.
        //itemView.setOnClickListener(this);
       // itemView.setOnLongClickListener(this);
    }



}
