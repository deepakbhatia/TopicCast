package com.optimalcities.topiccast;

/**
 * Created by obelix on 23/08/2015.
 */
public class UKDataQuery {


    private String startYear;
    private String endYear;
    private String variableID;
    private String filter;

    public UKDataQuery()
    {

    }
    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getVariableID() {
        return variableID;
    }

    public void setVariableID(String variableID) {
        this.variableID = variableID;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
