package com.optimalcities.topiccast;

/**
 * Created by obelix on 23/08/2015.
 */
public class UKDataCategories {

    private String categoryID;
    private String categoryLabel;
    private String categoryValue;
    private String variableID;

    public UKDataCategories()
    {

    }
    public String getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getVariableID() {
        return variableID;
    }

    public void setVariableID(String variableID) {
        this.variableID = variableID;
    }
}
