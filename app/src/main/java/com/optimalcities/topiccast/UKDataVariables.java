package com.optimalcities.topiccast;

import java.util.ArrayList;

/**
 * Created by obelix on 23/08/2015.
 */
public class UKDataVariables {

    private String variableId;
    private String variableName;
    private String variableLabel;
    private String question;
    private String variableType;
    private boolean isMeanAllowed;
    private ArrayList<UKDataCategories> categories;
    private String dataset_ID;


    public UKDataVariables()
    {

    }

    public String getVariableId() {
        return variableId;
    }

    public void setVariableId(String variableId) {
        this.variableId = variableId;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableLabel() {
        return variableLabel;
    }

    public void setVariableLabel(String variableLabel) {
        this.variableLabel = variableLabel;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public boolean isMeanAllowed() {
        return isMeanAllowed;
    }

    public void setIsMeanAllowed(boolean isMeanAllowed) {
        this.isMeanAllowed = isMeanAllowed;
    }

    public ArrayList<UKDataCategories> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<UKDataCategories> categories) {
        this.categories = categories;
    }
}
/*

{
      "VariableId": 170,
      "VariableName": "Y11_Q11",
      "VariableLabel": "Working hours fit with family/social commitments?",
      "Question": "Do your working hours fit in with your family or social commitments outside work?",
      "VariableType": "categorical",
      "IsMeanAllowed": true,
      "DatasetId": 2,
      "VariableGroup": {
        "VariableGroupId": 17,
        "VariableGroupValue": "Employment and Work-Life Balance"
      },
      "Topic": {
        "TopicId": 17,
        "TopicValue": "Employment and labour – General"
      },
      "Categories": [
        {
          "CategoryId": 778,
          "CategoryLabel": "Very well",
          "CategoryValue": 1,
          "VariableId": 170
        },
        {
          "CategoryId": 779,
          "CategoryLabel": "Fairly well",
          "CategoryValue": 2,
          "VariableId": 170
        },
        {
          "CategoryId": 780,
          "CategoryLabel": "Not very well",
          "CategoryValue": 3,
          "VariableId": 170
        },
        {
          "CategoryId": 781,
          "CategoryLabel": "Not at all well",
          "CategoryValue": 4,
          "VariableId": 170
        }
      ],
      "VariableKeywords": [
        {
          "VariableKeywordsId": 181,
          "VariableId": 170,
          "Keyword": {
            "KeywordId": 41,
            "KeywordValue": "Work-life balance"
          }
        }
      ]
    }




 */