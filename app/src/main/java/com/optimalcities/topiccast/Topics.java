package com.optimalcities.topiccast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by obelix on 20/08/2015.
 */
public class Topics {



    private HashMap topic_data;
    private ArrayList<String> article_links;

    public Topics()
    {

    }

    public HashMap getTopic_data() {
        return topic_data;
    }

    public void setTopic_data(HashMap topic_data) {
        this.topic_data = topic_data;
    }

    public ArrayList<String> getArticle_links() {
        return article_links;
    }

    public void setArticle_links(ArrayList<String> article_links) {
        this.article_links = article_links;
    }
}
