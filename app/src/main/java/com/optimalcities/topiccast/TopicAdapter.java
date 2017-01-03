package com.optimalcities.topiccast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by obelix on 21/08/2015.
 */
/*
public class TopicAdapter extends RecyclerView.Adapter<TopicViewHolder>{
    private List<Topics> topicItemList;
    private Context mContext;

    public TopicAdapter(Context context, List<Topics> topicItemList) {
        this.topicItemList = topicItemList;
        this.mContext = context;
    }


    @Override
    public TopicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_topic, null);

        TopicViewHolder viewHolder = new TopicViewHolder(view, topicItemList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TopicViewHolder holder, int position) {

        Topics feedItem = topicItemList.get(position);

       */
/* //Download image using picasso library
        Picasso.with(mContext).load(feedItem.getThumbnail())
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(customViewHolder.imageView);
*//*

        //Setting text view title
       // holder.topics.setText(Html.fromHtml(feedItem.getArticle_links().get(0)));



        holder.setClickListener(new TopicViewHolder.ClickListener() {
            @Override
            public void onClick(View v, int pos, boolean isLongClick) {
                if (isLongClick) {


                    // View v at position pos is long-clicked.
                } else {


                    Toast.makeText(mContext,""+v.getId(),Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext,ArticlePost.class);
                    mContext.startActivity(intent);
                    // View v at position pos is clicked.
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return (null != topicItemList ? topicItemList.size() : 0);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static interface OnItemClickListener {
        public void onItemClick(Entity entity);
    }
}*/

public class TopicAdapter extends BaseAdapter {

    private LayoutInflater mLayoutInflater;
    private List mData;

    private Context mContext;

    public TopicAdapter(Context context, List data){
        mData = data;
        mLayoutInflater = LayoutInflater.from(context);

        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mData == null ? 0: mData.size();
    }

    @Override
    public Topics getItem(int position) {
        return (Topics)mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        //This is bad, do not do this at home
        View vi = view;             //trying to reuse a recycled view
        TopicViewHolder holder = null;

        if (vi == null) {
            //The view is not a recycled one: we have to inflate
            vi = mLayoutInflater.inflate(R.layout.each_topic, parent, false);
            holder = new TopicViewHolder(vi,mData);

            //holder.title = (TextView) vi.findViewById(R.id.title);
            //holder.tvDescription = (TextView) vi.findViewById(R.id.textView_item_description);
            vi.setTag(holder);
        } else {
            // View recycled !
            // no need to inflate
            // no need to findViews by id
            holder = (TopicViewHolder) vi.getTag();
        }

        Topics item = getItem(position);

        holder.title.setText(item.getArticle_links().get(0));
        //holder.tvDescription.setText(item.getDescription());

        return vi;
    }
}
