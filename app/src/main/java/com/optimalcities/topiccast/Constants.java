package com.optimalcities.topiccast;

import android.widget.Spinner;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by obelix on 23/08/2015.
 */
public class Constants {

    final static String UK_DATA_BROADCAST_ACTION = "ukdatabroadcastaction";
    final static String UK_DATA_BROADCAST_ACTION_RESULT =       "ukdatabroadcastactionresult";

    public static Spinner toolbar_spinner;

    public static String filter = "";
        public static String API_KEY="kak5tj558gc8geb9sbp522eu";

        public static HashMap onClicked = new HashMap();
    public static HashMap<String, JSONObject> query_response = new HashMap<String, JSONObject>();

    public static ArrayList queries = new ArrayList();

    public static ArrayList guardian = new ArrayList();

    public static ArrayList nytimes = new ArrayList();

    public static  void addQueries()
    {

        ReadyQueries readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=128:1");
        readyQueries.setQuery_type("Yes, can Afford Week's Annual Holiday");
        readyQueries.setQuery_keyword("holiday cost");
        queries.add(0, readyQueries);
        readyQueries = new ReadyQueries();

        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=125:5");
        readyQueries.setQuery_type("Yes, Financial situation is much better");
        readyQueries.setQuery_keyword("Financial situation");

        queries.add(1, readyQueries);


        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=125:5|127:2");
        readyQueries.setQuery_type("Yes, Financial situation is much better but Can't afford to keep home warm");
        readyQueries.setQuery_keyword("heating cost");

        queries.add(2, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=170:2|126:4");
        readyQueries.setQuery_type("Yes, work fits family time but difficulty in making ends meet");
        readyQueries.setQuery_keyword("work life balance");

        queries.add(3, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=48:1|49:1");
        readyQueries.setQuery_type("Yes, major problems with noise and air quality");
        readyQueries.setQuery_keyword("pollution");

        queries.add(4, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=62:3|53:1");
        readyQueries.setQuery_type("Yes, easy access to public transport with major traffic problems");
        readyQueries.setQuery_keyword("traffic congestion");

        queries.add(5, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=51:1|125:5");
        readyQueries.setQuery_type("Yes, finances are much better but major local problem with crime");
        readyQueries.setQuery_keyword("crime");

        queries.add(6, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=37:1|6:4");
        readyQueries.setQuery_type("Live in urban area and chronic health problems");

        readyQueries.setQuery_keyword("health problems");

        queries.add(7, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=6:4|140:1");
        readyQueries.setQuery_type("Live in urban area and optimistic about future");
        readyQueries.setQuery_keyword("optmistic");

        queries.add(8, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=40:1");
        readyQueries.setQuery_type("Own property without any loans?");
        readyQueries.setQuery_keyword("housing loans");

        queries.add(9, readyQueries);

        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=185:1|40:2");
        readyQueries.setQuery_keyword("housing loans");

        readyQueries.setQuery_type("Own property with loans and working additional job? ");

        queries.add(10, readyQueries);
        readyQueries = new ReadyQueries();
        readyQueries.setQuery("https://api.ukdataservice.ac.uk/V1/datasets/EQLS/TimeseriesFrequency?user_key=97e27e89f4c710ed8b1f257241214c4f&variableId=2&filter=61:5");
        readyQueries.setQuery_type("Don't use banking services? ");
        readyQueries.setQuery_keyword("banking services");

        queries.add(11,readyQueries);

/*
        queries.add(12,readyQueries);


        queries.add(13,readyQueries);


        queries.add(14,readyQueries);


        queries.add(15,readyQueries);


        queries.add(16,readyQueries);


        queries.add(17,readyQueries);


        queries.add(18,readyQueries);


        queries.add(19,readyQueries);*/

    }















    public static String variablesGroups
            ="{\n" +
            " \"VariableGroups\": [\n" +
            "  {\n" +
            "   \"VariableGroupId\": 0,\n" +
            "   \"VariableGroupValue\": \"Select the field you want to question\"\n" +
            "  },\n"+
            "  {\n" +
            "   \"VariableGroupId\": 3,\n" +
            "   \"VariableGroupValue\": \"Family and Social Life\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 4,\n" +
            "   \"VariableGroupValue\": \"Education\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 5,\n" +
            "   \"VariableGroupValue\": \"Local Environment\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 6,\n" +
            "   \"VariableGroupValue\": \"Citizenship\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 7,\n" +
            "   \"VariableGroupValue\": \"Derived Variables\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 8,\n" +
            "   \"VariableGroupValue\": \"Health\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 9,\n" +
            "   \"VariableGroupValue\": \"Housing\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 10,\n" +
            "   \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 11,\n" +
            "   \"VariableGroupValue\": \"Quality of Society\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 12,\n" +
            "   \"VariableGroupValue\": \"Social Participation\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 13,\n" +
            "   \"VariableGroupValue\": \"Social Exclusion\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 14,\n" +
            "   \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 15,\n" +
            "   \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 16,\n" +
            "   \"VariableGroupValue\": \"Mental Well-Being\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"VariableGroupId\": 17,\n" +
            "   \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
            "  }\n" +
            " ]"+
            "}";


    public static String countryObject = "{\"Categories\": [\n" +
            "    {\n" +
            "     \"CategoryId\": 3,\n" +
            "     \"CategoryLabel\": \"Austria\",\n" +
            "     \"CategoryValue\": 1,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 4,\n" +
            "     \"CategoryLabel\": \"Belgium\",\n" +
            "     \"CategoryValue\": 2,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 5,\n" +
            "     \"CategoryLabel\": \"Bulgaria\",\n" +
            "     \"CategoryValue\": 3,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 6,\n" +
            "     \"CategoryLabel\": \"Cyprus\",\n" +
            "     \"CategoryValue\": 4,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 7,\n" +
            "     \"CategoryLabel\": \"Czech Republic\",\n" +
            "     \"CategoryValue\": 5,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 8,\n" +
            "     \"CategoryLabel\": \"Germany\",\n" +
            "     \"CategoryValue\": 6,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 9,\n" +
            "     \"CategoryLabel\": \"Denmark\",\n" +
            "     \"CategoryValue\": 7,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 10,\n" +
            "     \"CategoryLabel\": \"Estonia\",\n" +
            "     \"CategoryValue\": 8,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 11,\n" +
            "     \"CategoryLabel\": \"Greece\",\n" +
            "     \"CategoryValue\": 9,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 12,\n" +
            "     \"CategoryLabel\": \"Spain\",\n" +
            "     \"CategoryValue\": 10,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 13,\n" +
            "     \"CategoryLabel\": \"Finland\",\n" +
            "     \"CategoryValue\": 11,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 14,\n" +
            "     \"CategoryLabel\": \"France\",\n" +
            "     \"CategoryValue\": 12,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 15,\n" +
            "     \"CategoryLabel\": \"Hungary\",\n" +
            "     \"CategoryValue\": 13,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 16,\n" +
            "     \"CategoryLabel\": \"Ireland\",\n" +
            "     \"CategoryValue\": 14,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 17,\n" +
            "     \"CategoryLabel\": \"Italy\",\n" +
            "     \"CategoryValue\": 15,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 18,\n" +
            "     \"CategoryLabel\": \"Lithuania\",\n" +
            "     \"CategoryValue\": 16,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 19,\n" +
            "     \"CategoryLabel\": \"Luxembourg\",\n" +
            "     \"CategoryValue\": 17,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 20,\n" +
            "     \"CategoryLabel\": \"Latvia\",\n" +
            "     \"CategoryValue\": 18,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 21,\n" +
            "     \"CategoryLabel\": \"Malta\",\n" +
            "     \"CategoryValue\": 19,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 22,\n" +
            "     \"CategoryLabel\": \"Netherlands\",\n" +
            "     \"CategoryValue\": 20,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 23,\n" +
            "     \"CategoryLabel\": \"Poland\",\n" +
            "     \"CategoryValue\": 21,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 24,\n" +
            "     \"CategoryLabel\": \"Portugal\",\n" +
            "     \"CategoryValue\": 22,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 25,\n" +
            "     \"CategoryLabel\": \"Romania\",\n" +
            "     \"CategoryValue\": 23,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 26,\n" +
            "     \"CategoryLabel\": \"Sweden\",\n" +
            "     \"CategoryValue\": 24,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 27,\n" +
            "     \"CategoryLabel\": \"Slovenia\",\n" +
            "     \"CategoryValue\": 25,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 28,\n" +
            "     \"CategoryLabel\": \"Slovakia\",\n" +
            "     \"CategoryValue\": 26,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 29,\n" +
            "     \"CategoryLabel\": \"UK\",\n" +
            "     \"CategoryValue\": 27,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 30,\n" +
            "     \"CategoryLabel\": \"Turkey\",\n" +
            "     \"CategoryValue\": 28,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 31,\n" +
            "     \"CategoryLabel\": \"Croatia\",\n" +
            "     \"CategoryValue\": 29,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 32,\n" +
            "     \"CategoryLabel\": \"Macedonia (FYROM)\",\n" +
            "     \"CategoryValue\": 30,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 33,\n" +
            "     \"CategoryLabel\": \"Kosovo\",\n" +
            "     \"CategoryValue\": 31,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 34,\n" +
            "     \"CategoryLabel\": \"Serbia\",\n" +
            "     \"CategoryValue\": 32,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 35,\n" +
            "     \"CategoryLabel\": \"Montenegro\",\n" +
            "     \"CategoryValue\": 33,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 36,\n" +
            "     \"CategoryLabel\": \"Iceland\",\n" +
            "     \"CategoryValue\": 34,\n" +
            "     \"VariableId\": 2\n" +
            "    },\n" +
            "    {\n" +
            "     \"CategoryId\": 37,\n" +
            "     \"CategoryLabel\": \"Norway\",\n" +
            "     \"CategoryValue\": 35,\n" +
            "     \"VariableId\": 2\n" +
            "    }\n" +
            "   ]}";
    public static ArrayList variables_group = new ArrayList();



    public static void addVariables()
    {
        variables_group.add(0,"");
        variables_group.add(1,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 1,\n" +
                "   \"VariableName\": \"Wave\",\n" +
                "   \"VariableLabel\": \"EQLS Wave\",\n" +
                "   \"Question\": \"EQLS Wave\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 1,\n" +
                "    \"VariableGroupValue\": \"Administrative Variables\"\n" +
                "   },\n" +
                "   \"Topic\": null,\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 1,\n" +
                "     \"CategoryLabel\": \"2007\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 1\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 2,\n" +
                "     \"CategoryLabel\": \"2011\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 1\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": []\n" +
                "  }\n" +
                " ]\n"  +
                "}");
        //=============================================
        variables_group.add(2,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 2,\n" +
                "   \"VariableName\": \"Y11_Country\",\n" +
                "   \"VariableLabel\": \"Country\",\n" +
                "   \"Question\": \"Country\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 1,\n" +
                "    \"TopicValue\": \"Geographies\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 3,\n" +
                "     \"CategoryLabel\": \"Austria\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 4,\n" +
                "     \"CategoryLabel\": \"Belgium\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 5,\n" +
                "     \"CategoryLabel\": \"Bulgaria\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 6,\n" +
                "     \"CategoryLabel\": \"Cyprus\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 7,\n" +
                "     \"CategoryLabel\": \"Czech Republic\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 8,\n" +
                "     \"CategoryLabel\": \"Germany\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 9,\n" +
                "     \"CategoryLabel\": \"Denmark\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 10,\n" +
                "     \"CategoryLabel\": \"Estonia\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 11,\n" +
                "     \"CategoryLabel\": \"Greece\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 12,\n" +
                "     \"CategoryLabel\": \"Spain\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 13,\n" +
                "     \"CategoryLabel\": \"Finland\",\n" +
                "     \"CategoryValue\": 11,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 14,\n" +
                "     \"CategoryLabel\": \"France\",\n" +
                "     \"CategoryValue\": 12,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 15,\n" +
                "     \"CategoryLabel\": \"Hungary\",\n" +
                "     \"CategoryValue\": 13,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 16,\n" +
                "     \"CategoryLabel\": \"Ireland\",\n" +
                "     \"CategoryValue\": 14,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 17,\n" +
                "     \"CategoryLabel\": \"Italy\",\n" +
                "     \"CategoryValue\": 15,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 18,\n" +
                "     \"CategoryLabel\": \"Lithuania\",\n" +
                "     \"CategoryValue\": 16,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 19,\n" +
                "     \"CategoryLabel\": \"Luxembourg\",\n" +
                "     \"CategoryValue\": 17,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 20,\n" +
                "     \"CategoryLabel\": \"Latvia\",\n" +
                "     \"CategoryValue\": 18,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 21,\n" +
                "     \"CategoryLabel\": \"Malta\",\n" +
                "     \"CategoryValue\": 19,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 22,\n" +
                "     \"CategoryLabel\": \"Netherlands\",\n" +
                "     \"CategoryValue\": 20,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 23,\n" +
                "     \"CategoryLabel\": \"Poland\",\n" +
                "     \"CategoryValue\": 21,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 24,\n" +
                "     \"CategoryLabel\": \"Portugal\",\n" +
                "     \"CategoryValue\": 22,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 25,\n" +
                "     \"CategoryLabel\": \"Romania\",\n" +
                "     \"CategoryValue\": 23,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 26,\n" +
                "     \"CategoryLabel\": \"Sweden\",\n" +
                "     \"CategoryValue\": 24,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 27,\n" +
                "     \"CategoryLabel\": \"Slovenia\",\n" +
                "     \"CategoryValue\": 25,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 28,\n" +
                "     \"CategoryLabel\": \"Slovakia\",\n" +
                "     \"CategoryValue\": 26,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 29,\n" +
                "     \"CategoryLabel\": \"UK\",\n" +
                "     \"CategoryValue\": 27,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 30,\n" +
                "     \"CategoryLabel\": \"Turkey\",\n" +
                "     \"CategoryValue\": 28,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 31,\n" +
                "     \"CategoryLabel\": \"Croatia\",\n" +
                "     \"CategoryValue\": 29,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 32,\n" +
                "     \"CategoryLabel\": \"Macedonia (FYROM)\",\n" +
                "     \"CategoryValue\": 30,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 33,\n" +
                "     \"CategoryLabel\": \"Kosovo\",\n" +
                "     \"CategoryValue\": 31,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 34,\n" +
                "     \"CategoryLabel\": \"Serbia\",\n" +
                "     \"CategoryValue\": 32,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 35,\n" +
                "     \"CategoryLabel\": \"Montenegro\",\n" +
                "     \"CategoryValue\": 33,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 36,\n" +
                "     \"CategoryLabel\": \"Iceland\",\n" +
                "     \"CategoryValue\": 34,\n" +
                "     \"VariableId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 37,\n" +
                "     \"CategoryLabel\": \"Norway\",\n" +
                "     \"CategoryValue\": 35,\n" +
                "     \"VariableId\": 2\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": []\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 12,\n" +
                "   \"VariableName\": \"Y11_Agecategory\",\n" +
                "   \"VariableLabel\": \"Age\",\n" +
                "   \"Question\": \"Age of the respondent (5 categories)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 70,\n" +
                "     \"CategoryLabel\": \"18-24\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 12\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 71,\n" +
                "     \"CategoryLabel\": \"25-34\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 12\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 72,\n" +
                "     \"CategoryLabel\": \"35-49\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 12\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 73,\n" +
                "     \"CategoryLabel\": \"50-64\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 12\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 74,\n" +
                "     \"CategoryLabel\": \"65+\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 12\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 11,\n" +
                "     \"VariableId\": 12,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 7,\n" +
                "      \"KeywordValue\": \"Age\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 13,\n" +
                "   \"VariableName\": \"Y11_HH2a\",\n" +
                "   \"VariableLabel\": \"Gender\",\n" +
                "   \"Question\": \"Gender of the respondent\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 75,\n" +
                "     \"CategoryLabel\": \"Male\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 13\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 76,\n" +
                "     \"CategoryLabel\": \"Female\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 13\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 12,\n" +
                "     \"VariableId\": 13,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 8,\n" +
                "      \"KeywordValue\": \"Gender\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 14,\n" +
                "   \"VariableName\": \"Y11_HHsize\",\n" +
                "   \"VariableLabel\": \"Household size\",\n" +
                "   \"Question\": \"Household size (incl. children)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 77,\n" +
                "     \"CategoryLabel\": \"1 person household\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 14\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 78,\n" +
                "     \"CategoryLabel\": \"2 person household\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 14\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 79,\n" +
                "     \"CategoryLabel\": \"3 person household\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 14\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 80,\n" +
                "     \"CategoryLabel\": \"4 or more person household\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 14\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 13,\n" +
                "     \"VariableId\": 14,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 9,\n" +
                "      \"KeywordValue\": \"Households\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 15,\n" +
                "   \"VariableName\": \"Y11_HHsize18plus\",\n" +
                "   \"VariableLabel\": \"Household size - over 18\",\n" +
                "   \"Question\": \"Household size: number of members 18+\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 81,\n" +
                "     \"CategoryLabel\": \"1 person aged 18+ in household\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 15\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 82,\n" +
                "     \"CategoryLabel\": \"2 persons aged 18+ in household\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 15\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 83,\n" +
                "     \"CategoryLabel\": \"3 persons aged 18+ in household\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 15\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 84,\n" +
                "     \"CategoryLabel\": \"4+ persons aged 18+ in household\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 15\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 14,\n" +
                "     \"VariableId\": 15,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 9,\n" +
                "      \"KeywordValue\": \"Households\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 16,\n" +
                "   \"VariableName\": \"Y11_HHstructure\",\n" +
                "   \"VariableLabel\": \"Household structure\",\n" +
                "   \"Question\": \"Household structure\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 85,\n" +
                "     \"CategoryLabel\": \"Single\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 16\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 86,\n" +
                "     \"CategoryLabel\": \"Couple\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 16\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 87,\n" +
                "     \"CategoryLabel\": \"Single parent\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 16\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 88,\n" +
                "     \"CategoryLabel\": \"Couple with children\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 16\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 89,\n" +
                "     \"CategoryLabel\": \"Other\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 16\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 15,\n" +
                "     \"VariableId\": 16,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 9,\n" +
                "      \"KeywordValue\": \"Households\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 17,\n" +
                "   \"VariableName\": \"Y11_Education\",\n" +
                "   \"VariableLabel\": \"Education - 3 groups\",\n" +
                "   \"Question\": \"Education (3 categories)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 7,\n" +
                "    \"TopicValue\": \"Education - general\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 90,\n" +
                "     \"CategoryLabel\": \"Primary or less\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 17\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 91,\n" +
                "     \"CategoryLabel\": \"Secondary\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 17\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 92,\n" +
                "     \"CategoryLabel\": \"Tertiary\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 17\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 93,\n" +
                "     \"CategoryLabel\": \"(Completed education abroad)\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 17\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 94,\n" +
                "     \"CategoryLabel\": \"(Don't know)\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 17\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 95,\n" +
                "     \"CategoryLabel\": \"(Refusal)\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 17\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 16,\n" +
                "     \"VariableId\": 17,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 10,\n" +
                "      \"KeywordValue\": \"Education background\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 18,\n" +
                "   \"VariableName\": \"Y11_EmploymentStatus\",\n" +
                "   \"VariableLabel\": \"Employment - 7 groups\",\n" +
                "   \"Question\": \"Employment status (7 categories)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 8,\n" +
                "    \"TopicValue\": \"Employment and labour - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 96,\n" +
                "     \"CategoryLabel\": \"Employed (includes on leave)\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 18\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 97,\n" +
                "     \"CategoryLabel\": \"Unemployed\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 18\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 98,\n" +
                "     \"CategoryLabel\": \"Unable to work - disability/illness\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 18\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 99,\n" +
                "     \"CategoryLabel\": \"Retired\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 18\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 100,\n" +
                "     \"CategoryLabel\": \"Homemaker\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 18\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 101,\n" +
                "     \"CategoryLabel\": \"Student\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 18\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 102,\n" +
                "     \"CategoryLabel\": \"Other\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 18\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 17,\n" +
                "     \"VariableId\": 18,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 11,\n" +
                "      \"KeywordValue\": \"Status in employment\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 19,\n" +
                "   \"VariableName\": \"Y11_Incomequartiles_percapita\",\n" +
                "   \"VariableLabel\": \"Income quartiles\",\n" +
                "   \"Question\": \"Income quartiles based on equivalised income (Y11_Income_percapita by Y11_Country)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 103,\n" +
                "     \"CategoryLabel\": \"1st quartile\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 19\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 104,\n" +
                "     \"CategoryLabel\": \"2nd quartile\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 19\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 105,\n" +
                "     \"CategoryLabel\": \"3rd quartile\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 19\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 106,\n" +
                "     \"CategoryLabel\": \"4th quartile\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 19\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 18,\n" +
                "     \"VariableId\": 19,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 12,\n" +
                "      \"KeywordValue\": \"Income\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 21,\n" +
                "   \"VariableName\": \"Y11_Degurba\",\n" +
                "   \"VariableLabel\": \"Degree of urbanisation\",\n" +
                "   \"Question\": \"Degree of urbanisation based on Eurostat data matching\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 4,\n" +
                "    \"TopicValue\": \"Environment, conservation and land use - Land use and planning\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 109,\n" +
                "     \"CategoryLabel\": \"Densely populated area\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 21\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 110,\n" +
                "     \"CategoryLabel\": \"Intermediate density area\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 21\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 111,\n" +
                "     \"CategoryLabel\": \"Thinly populated area\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 21\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 21,\n" +
                "     \"VariableId\": 21,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 4,\n" +
                "      \"KeywordValue\": \"Urban Areas\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 22,\n" +
                "     \"VariableId\": 21,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 5,\n" +
                "      \"KeywordValue\": \"Rural Areas\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 22,\n" +
                "   \"VariableName\": \"Y11_CountryGroupEU28\",\n" +
                "   \"VariableLabel\": \"Country group\",\n" +
                "   \"Question\": \"Country Group: EU28 - EU countries in 2013 (includes Croatia)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 1,\n" +
                "    \"TopicValue\": \"Geographies\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 112,\n" +
                "     \"CategoryLabel\": \"Other countries\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 22\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 113,\n" +
                "     \"CategoryLabel\": \"EU28\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 22\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 23,\n" +
                "     \"VariableId\": 22,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 13,\n" +
                "      \"KeywordValue\": \"European Union Member States\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 196,\n" +
                "   \"VariableName\": \"ISO3166_Country\",\n" +
                "   \"VariableLabel\": \"ISO3166_Country URL\",\n" +
                "   \"Question\": \"ISO3166_Country URL\",\n" +
                "   \"VariableType\": \"string\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 2,\n" +
                "    \"VariableGroupValue\": \"Household Grid and Country\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 1,\n" +
                "    \"TopicValue\": \"Geographies\"\n" +
                "   },\n" +
                "   \"Categories\": [],\n" +
                "   \"VariableKeywords\": []\n" +
                "  }\n" +
                " ]\n"  +
                "}");
        //===========================================================================================

        variables_group.add(3,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 3,\n" +
                "   \"VariableName\": \"Y11_Q31\",\n" +
                "   \"VariableLabel\": \"Marital status\",\n" +
                "   \"Question\": \"Marital status\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 38,\n" +
                "     \"CategoryLabel\": \"Married or living with partner\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 3\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 39,\n" +
                "     \"CategoryLabel\": \"Separated or divorced and not living with partner\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 3\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 40,\n" +
                "     \"CategoryLabel\": \"Widowed and not living with partner\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 3\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 41,\n" +
                "     \"CategoryLabel\": \"Never married and not living with partner\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 3\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 1,\n" +
                "     \"VariableId\": 3,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 1,\n" +
                "      \"KeywordValue\": \"Marital staus\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 4,\n" +
                "   \"VariableName\": \"Y11_Q32\",\n" +
                "   \"VariableLabel\": \"No. of children\",\n" +
                "   \"Question\": \"Number of children of your own\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 42,\n" +
                "     \"CategoryLabel\": \"No children\",\n" +
                "     \"CategoryValue\": 0,\n" +
                "     \"VariableId\": 4\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 43,\n" +
                "     \"CategoryLabel\": \"1 child\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 4\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 44,\n" +
                "     \"CategoryLabel\": \"2 children\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 4\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 45,\n" +
                "     \"CategoryLabel\": \"3 children\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 4\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 46,\n" +
                "     \"CategoryLabel\": \"4 children\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 4\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 47,\n" +
                "     \"CategoryLabel\": \"5 or more children\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 4\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 2,\n" +
                "     \"VariableId\": 4,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 2,\n" +
                "      \"KeywordValue\": \"Children\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 23,\n" +
                "   \"VariableName\": \"Y11_Q33a\",\n" +
                "   \"VariableLabel\": \"Direct contact with children\",\n" +
                "   \"Question\": \"How often direct face-to-face contact with: Any of your children (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 114,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 23\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 115,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 23\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 116,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 23\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 117,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 23\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 118,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 23\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 119,\n" +
                "     \"CategoryLabel\": \"NA\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 23\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 24,\n" +
                "     \"VariableId\": 23,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 24,\n" +
                "   \"VariableName\": \"Y11_Q33b\",\n" +
                "   \"VariableLabel\": \"Direct contact with parents\",\n" +
                "   \"Question\": \"How often direct face-to-face contact with: Your mother or father (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 120,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 24\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 121,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 24\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 122,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 24\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 123,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 24\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 124,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 24\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 125,\n" +
                "     \"CategoryLabel\": \"NA\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 24\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 25,\n" +
                "     \"VariableId\": 24,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 25,\n" +
                "   \"VariableName\": \"Y11_Q33c\",\n" +
                "   \"VariableLabel\": \"Direct contact with other relatives\",\n" +
                "   \"Question\": \"How often direct face-to-face contact with: Any brother, sister or other relative (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 126,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 25\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 127,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 25\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 128,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 25\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 129,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 25\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 130,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 25\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 131,\n" +
                "     \"CategoryLabel\": \"NA\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 25\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 26,\n" +
                "     \"VariableId\": 25,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 26,\n" +
                "   \"VariableName\": \"Y11_Q33d\",\n" +
                "   \"VariableLabel\": \"Direct contact with neighbours\",\n" +
                "   \"Question\": \"How often direct face-to-face contact with: Any of your friends or neighbours (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 132,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 26\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 133,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 26\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 134,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 26\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 135,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 26\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 136,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 26\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 27,\n" +
                "     \"VariableId\": 26,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 15,\n" +
                "      \"KeywordValue\": \"Social support\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 27,\n" +
                "   \"VariableName\": \"Y11_Q34a\",\n" +
                "   \"VariableLabel\": \"Phone/internet contact with children\",\n" +
                "   \"Question\": \"How often contact by phone, the Internet or by post with: Any of your children (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 137,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 27\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 138,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 27\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 139,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 27\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 140,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 27\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 141,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 27\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 142,\n" +
                "     \"CategoryLabel\": \"NA\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 27\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 28,\n" +
                "     \"VariableId\": 27,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 28,\n" +
                "   \"VariableName\": \"Y11_Q34b\",\n" +
                "   \"VariableLabel\": \"Phone/internet contact with parents\",\n" +
                "   \"Question\": \"How often contact by phone, the Internet or by post with: Your mother or father (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 143,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 28\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 144,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 28\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 145,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 28\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 146,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 28\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 147,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 28\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 148,\n" +
                "     \"CategoryLabel\": \"NA\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 28\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 29,\n" +
                "     \"VariableId\": 28,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 29,\n" +
                "   \"VariableName\": \"Y11_Q34c\",\n" +
                "   \"VariableLabel\": \"Phone/internet contact with other relatives\",\n" +
                "   \"Question\": \"How often contact by phone, the Internet or by post with: Any brother, sister or other relative (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 149,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 29\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 150,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 29\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 151,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 29\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 152,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 29\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 153,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 29\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 154,\n" +
                "     \"CategoryLabel\": \"NA\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 29\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 30,\n" +
                "     \"VariableId\": 29,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 30,\n" +
                "   \"VariableName\": \"Y11_Q34d\",\n" +
                "   \"VariableLabel\": \"Phone/internet contact with neighbours\",\n" +
                "   \"Question\": \"How often contact by phone, the Internet or by post with: Any of your friends or neighbours (living outside your household)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 155,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 30\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 156,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 30\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 157,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 30\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 158,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 30\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 159,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 30\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 31,\n" +
                "     \"VariableId\": 30,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 31,\n" +
                "   \"VariableName\": \"Y11_Q35a\",\n" +
                "   \"VariableLabel\": \"A person to get support from to help around house \",\n" +
                "   \"Question\": \"From whom would you get: Support to help around the house when ill? The most important person only.\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 160,\n" +
                "     \"CategoryLabel\": \"A member of your family / relative\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 31\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 161,\n" +
                "     \"CategoryLabel\": \"A friend, neighbour, or someone else, who does not belong to\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 31\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 162,\n" +
                "     \"CategoryLabel\": \"A service provider, institution or organisation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 31\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 163,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 31\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 32,\n" +
                "     \"VariableId\": 31,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 15,\n" +
                "      \"KeywordValue\": \"Social support\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 32,\n" +
                "   \"VariableName\": \"Y11_Q35b\",\n" +
                "   \"VariableLabel\": \"A person to get advice from about a personal/family matter\",\n" +
                "   \"Question\": \"From whom would you get: Advice about a serious personal or family matter? The most important person only.\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 164,\n" +
                "     \"CategoryLabel\": \"A member of your family / relative\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 32\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 165,\n" +
                "     \"CategoryLabel\": \"A friend, neighbour, or someone else, who does not belong to\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 32\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 166,\n" +
                "     \"CategoryLabel\": \"A service provider, institution or organisation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 32\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 167,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 32\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 33,\n" +
                "     \"VariableId\": 32,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 15,\n" +
                "      \"KeywordValue\": \"Social support\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 33,\n" +
                "   \"VariableName\": \"Y11_Q35c\",\n" +
                "   \"VariableLabel\": \"A person to get support from when looking for a job\",\n" +
                "   \"Question\": \"From whom would you get: Support when looking for a job? The most important person only.\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 168,\n" +
                "     \"CategoryLabel\": \"A member of your family / relative\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 33\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 169,\n" +
                "     \"CategoryLabel\": \"A friend, neighbour, or someone else, who does not belong to\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 33\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 170,\n" +
                "     \"CategoryLabel\": \"A service provider, institution or organisation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 33\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 171,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 33\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 34,\n" +
                "     \"VariableId\": 33,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 15,\n" +
                "      \"KeywordValue\": \"Social support\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 34,\n" +
                "   \"VariableName\": \"Y11_Q35d\",\n" +
                "   \"VariableLabel\": \"A person to get support from when feeling depressed\",\n" +
                "   \"Question\": \"From whom would you get: Support when feeling a bit depressed and wanting to talk? The most important person only. \",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 172,\n" +
                "     \"CategoryLabel\": \"A member of your family / relative\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 34\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 173,\n" +
                "     \"CategoryLabel\": \"A friend, neighbour, or someone else, who does not belong to\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 34\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 174,\n" +
                "     \"CategoryLabel\": \"A service provider, institution or organisation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 34\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 175,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 34\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 35,\n" +
                "     \"VariableId\": 34,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 15,\n" +
                "      \"KeywordValue\": \"Social support\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 35,\n" +
                "   \"VariableName\": \"Y11_Q35e\",\n" +
                "   \"VariableLabel\": \"A person to get support from to raise emergency money\",\n" +
                "   \"Question\": \"From whom would you get: Support to urgently raise money to face an emergency? The most important person only.\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 3,\n" +
                "    \"VariableGroupValue\": \"Family and Social Life\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 2,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - Family life and marriage\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 176,\n" +
                "     \"CategoryLabel\": \"A member of your family / relative\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 35\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 177,\n" +
                "     \"CategoryLabel\": \"A friend, neighbour, or someone else, who does not belong to\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 35\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 178,\n" +
                "     \"CategoryLabel\": \"A service provider, institution or organisation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 35\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 179,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 35\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 36,\n" +
                "     \"VariableId\": 35,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 15,\n" +
                "      \"KeywordValue\": \"Social support\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        //==========================================

        variables_group.add(4,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 5,\n" +
                "   \"VariableName\": \"Y11_ISCEDsimple\",\n" +
                "   \"VariableLabel\": \"Education completed\",\n" +
                "   \"Question\": \"Highest level of education completed\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 4,\n" +
                "    \"VariableGroupValue\": \"Education\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 3,\n" +
                "    \"TopicValue\": \"Education - Higher and further\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 48,\n" +
                "     \"CategoryLabel\": \"No education completed (ISCED 0)\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 49,\n" +
                "     \"CategoryLabel\": \"Primary education (ISCED 1)\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 50,\n" +
                "     \"CategoryLabel\": \"Lower secondary education (ISCED 2)\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 51,\n" +
                "     \"CategoryLabel\": \"Upper secondary education (ISCED 3)\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 52,\n" +
                "     \"CategoryLabel\": \"Post-secondary including pre-vocational or vocational educat\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 53,\n" +
                "     \"CategoryLabel\": \"Tertiary education – first level (ISCED 5)\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 54,\n" +
                "     \"CategoryLabel\": \"Tertiary education – advanced level (ISCED 6)\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 55,\n" +
                "     \"CategoryLabel\": \"Not applicable\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 5\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 3,\n" +
                "     \"VariableId\": 5,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 3,\n" +
                "      \"KeywordValue\": \"Education levels\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");
        //==========================================

        variables_group.add(5,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 6,\n" +
                "   \"VariableName\": \"Y11_Q49\",\n" +
                "   \"VariableLabel\": \"Rural/urban living\",\n" +
                "   \"Question\": \"The area in which you live is...?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 4,\n" +
                "    \"TopicValue\": \"Environment, conservation and land use - Land use and planning\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 56,\n" +
                "     \"CategoryLabel\": \"The open countryside\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 6\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 57,\n" +
                "     \"CategoryLabel\": \"A village/small town\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 6\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 58,\n" +
                "     \"CategoryLabel\": \"A medium to large town\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 6\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 59,\n" +
                "     \"CategoryLabel\": \"A city or city suburb\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 6\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 4,\n" +
                "     \"VariableId\": 6,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 4,\n" +
                "      \"KeywordValue\": \"Urban Areas\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 5,\n" +
                "     \"VariableId\": 6,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 5,\n" +
                "      \"KeywordValue\": \"Rural Areas\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 48,\n" +
                "   \"VariableName\": \"Y11_Q50a\",\n" +
                "   \"VariableLabel\": \"Neighbourhood problems - noise\",\n" +
                "   \"Question\": \"Thinking of your immediate neighbourhood - do you have problems with: Noise?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 220,\n" +
                "     \"CategoryLabel\": \"Major problems\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 48\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 221,\n" +
                "     \"CategoryLabel\": \"Moderate problems\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 48\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 222,\n" +
                "     \"CategoryLabel\": \"No problems\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 48\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 49,\n" +
                "     \"VariableId\": 48,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 20,\n" +
                "      \"KeywordValue\": \"Neighbourhoods\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 49,\n" +
                "   \"VariableName\": \"Y11_Q50b\",\n" +
                "   \"VariableLabel\": \"Neighbourhood problems - air quality\",\n" +
                "   \"Question\": \"Thinking of your immediate neighbourhood - do you have problems with: Air quality?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 223,\n" +
                "     \"CategoryLabel\": \"Major problems\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 49\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 224,\n" +
                "     \"CategoryLabel\": \"Moderate problems\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 49\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 225,\n" +
                "     \"CategoryLabel\": \"No problems\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 49\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 50,\n" +
                "     \"VariableId\": 49,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 20,\n" +
                "      \"KeywordValue\": \"Neighbourhoods\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 50,\n" +
                "   \"VariableName\": \"Y11_Q50c\",\n" +
                "   \"VariableLabel\": \"Neighbourhood problems - quality of drinking water\",\n" +
                "   \"Question\": \"Thinking of your immediate neighbourhood - do you have problems with: Quality of drinking water?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 226,\n" +
                "     \"CategoryLabel\": \"Major problems\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 50\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 227,\n" +
                "     \"CategoryLabel\": \"Moderate problems\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 50\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 228,\n" +
                "     \"CategoryLabel\": \"No problems\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 50\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 51,\n" +
                "     \"VariableId\": 50,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 20,\n" +
                "      \"KeywordValue\": \"Neighbourhoods\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 51,\n" +
                "   \"VariableName\": \"Y11_Q50d\",\n" +
                "   \"VariableLabel\": \"Neighbourhood problems - crime, violence or vandalism\",\n" +
                "   \"Question\": \"Thinking of your immediate neighbourhood - do you have problems with: Crime, violence or vandalism?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 229,\n" +
                "     \"CategoryLabel\": \"Major problems\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 51\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 230,\n" +
                "     \"CategoryLabel\": \"Moderate problems\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 51\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 231,\n" +
                "     \"CategoryLabel\": \"No problems\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 51\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 52,\n" +
                "     \"VariableId\": 51,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 20,\n" +
                "      \"KeywordValue\": \"Neighbourhoods\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 52,\n" +
                "   \"VariableName\": \"Y11_Q50e\",\n" +
                "   \"VariableLabel\": \"Neighbourhood problems - litter or rubbish\",\n" +
                "   \"Question\": \"Thinking of your immediate neighbourhood - do you have problems with: Litter or rubbish on the street?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 232,\n" +
                "     \"CategoryLabel\": \"Major problems\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 52\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 233,\n" +
                "     \"CategoryLabel\": \"Moderate problems\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 52\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 234,\n" +
                "     \"CategoryLabel\": \"No problems\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 52\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 53,\n" +
                "     \"VariableId\": 52,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 20,\n" +
                "      \"KeywordValue\": \"Neighbourhoods\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 53,\n" +
                "   \"VariableName\": \"Y11_Q50f\",\n" +
                "   \"VariableLabel\": \"Neighbourhood problems - traffic\",\n" +
                "   \"Question\": \"Thinking of your immediate neighbourhood - do you have problems with: Traffic congestion?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 235,\n" +
                "     \"CategoryLabel\": \"Major problems\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 53\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 236,\n" +
                "     \"CategoryLabel\": \"Moderate problems\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 53\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 237,\n" +
                "     \"CategoryLabel\": \"No problems\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 53\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 54,\n" +
                "     \"VariableId\": 53,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 20,\n" +
                "      \"KeywordValue\": \"Neighbourhoods\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 60,\n" +
                "   \"VariableName\": \"Y11_Q51a\",\n" +
                "   \"VariableLabel\": \"Access to postal services?\",\n" +
                "   \"Question\": \"How would you describe your access to: Postal services?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 260,\n" +
                "     \"CategoryLabel\": \"with great difficulty\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 60\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 261,\n" +
                "     \"CategoryLabel\": \"with some difficulty\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 60\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 262,\n" +
                "     \"CategoryLabel\": \"easily\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 60\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 263,\n" +
                "     \"CategoryLabel\": \"very easily\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 60\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 264,\n" +
                "     \"CategoryLabel\": \"service not used\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 60\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 61,\n" +
                "     \"VariableId\": 60,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 22,\n" +
                "      \"KeywordValue\": \"Local community facilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 61,\n" +
                "   \"VariableName\": \"Y11_Q51b\",\n" +
                "   \"VariableLabel\": \"Access to banking services?\",\n" +
                "   \"Question\": \"How would you describe your access to: Banking services?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 265,\n" +
                "     \"CategoryLabel\": \"with great difficulty\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 61\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 266,\n" +
                "     \"CategoryLabel\": \"with some difficulty\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 61\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 267,\n" +
                "     \"CategoryLabel\": \"easily\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 61\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 268,\n" +
                "     \"CategoryLabel\": \"very easily\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 61\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 269,\n" +
                "     \"CategoryLabel\": \"service not used\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 61\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 62,\n" +
                "     \"VariableId\": 61,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 22,\n" +
                "      \"KeywordValue\": \"Local community facilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 62,\n" +
                "   \"VariableName\": \"Y11_Q51c\",\n" +
                "   \"VariableLabel\": \"Access to public transport?\",\n" +
                "   \"Question\": \"How would you describe your access to: Public transport facilities (bus, metro, tram, etc.)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 270,\n" +
                "     \"CategoryLabel\": \"with great difficulty\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 62\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 271,\n" +
                "     \"CategoryLabel\": \"with some difficulty\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 62\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 272,\n" +
                "     \"CategoryLabel\": \"easily\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 62\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 273,\n" +
                "     \"CategoryLabel\": \"very easily\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 62\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 274,\n" +
                "     \"CategoryLabel\": \"service not used\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 62\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 63,\n" +
                "     \"VariableId\": 62,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 22,\n" +
                "      \"KeywordValue\": \"Local community facilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 63,\n" +
                "   \"VariableName\": \"Y11_Q51d\",\n" +
                "   \"VariableLabel\": \"Access to cinema, theatre and cultural centre?\",\n" +
                "   \"Question\": \"How would you describe your access to: Cinema, theatre or cultural centre?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 275,\n" +
                "     \"CategoryLabel\": \"with great difficulty\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 63\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 276,\n" +
                "     \"CategoryLabel\": \"with some difficulty\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 63\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 277,\n" +
                "     \"CategoryLabel\": \"easily\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 63\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 278,\n" +
                "     \"CategoryLabel\": \"very easily\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 63\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 279,\n" +
                "     \"CategoryLabel\": \"service not used\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 63\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 64,\n" +
                "     \"VariableId\": 63,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 22,\n" +
                "      \"KeywordValue\": \"Local community facilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 64,\n" +
                "   \"VariableName\": \"Y11_Q51e\",\n" +
                "   \"VariableLabel\": \"Access to recreational or green areas?\",\n" +
                "   \"Question\": \"How would you describe your access to: Recreational or green areas?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 280,\n" +
                "     \"CategoryLabel\": \"with great difficulty\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 64\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 281,\n" +
                "     \"CategoryLabel\": \"with some difficulty\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 64\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 282,\n" +
                "     \"CategoryLabel\": \"easily\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 64\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 283,\n" +
                "     \"CategoryLabel\": \"very easily\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 64\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 284,\n" +
                "     \"CategoryLabel\": \"service not used\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 64\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 65,\n" +
                "     \"VariableId\": 64,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 22,\n" +
                "      \"KeywordValue\": \"Local community facilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 65,\n" +
                "   \"VariableName\": \"Y11_Q52\",\n" +
                "   \"VariableLabel\": \"How much time spent on travelling to work/study?\",\n" +
                "   \"Question\": \"How much time (minutes) in total do you spend getting to and from work or study?\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 5,\n" +
                "    \"VariableGroupValue\": \"Local Environment\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 14,\n" +
                "    \"TopicValue\": \"Transport\"\n" +
                "   },\n" +
                "   \"Categories\": [],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 66,\n" +
                "     \"VariableId\": 65,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 23,\n" +
                "      \"KeywordValue\": \"Travelling time\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");
        //==========================================

        variables_group.add(6,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 7,\n" +
                "   \"VariableName\": \"Y11_Q67_1\",\n" +
                "   \"VariableLabel\": \"Citizenship - Country\",\n" +
                "   \"Question\": \"Citizenship 1: I am a citizen of [COUNTRY]\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 6,\n" +
                "    \"VariableGroupValue\": \"Citizenship\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 60,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 7\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 61,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 7\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 6,\n" +
                "     \"VariableId\": 7,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 6,\n" +
                "      \"KeywordValue\": \"Citizenship\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 8,\n" +
                "   \"VariableName\": \"Y11_Q67_2\",\n" +
                "   \"VariableLabel\": \"Citizenship - Another EU member\",\n" +
                "   \"Question\": \"Citizenship 2: I am a citizen of another EU member state\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 6,\n" +
                "    \"VariableGroupValue\": \"Citizenship\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 62,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 8\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 63,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 8\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 7,\n" +
                "     \"VariableId\": 8,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 6,\n" +
                "      \"KeywordValue\": \"Citizenship\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 9,\n" +
                "   \"VariableName\": \"Y11_Q67_3\",\n" +
                "   \"VariableLabel\": \"Citizenship - A non-EU country\",\n" +
                "   \"Question\": \"Citizenship 3: I am a citizen of a non-EU country\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 6,\n" +
                "    \"VariableGroupValue\": \"Citizenship\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 64,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 9\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 65,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 9\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 8,\n" +
                "     \"VariableId\": 9,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 6,\n" +
                "      \"KeywordValue\": \"Citizenship\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 10,\n" +
                "   \"VariableName\": \"Y11_Q67_4\",\n" +
                "   \"VariableLabel\": \"Citizenship - Don't know\",\n" +
                "   \"Question\": \"Citizenship 4: Don't know\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 6,\n" +
                "    \"VariableGroupValue\": \"Citizenship\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 66,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 10\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 67,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 10\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 9,\n" +
                "     \"VariableId\": 10,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 6,\n" +
                "      \"KeywordValue\": \"Citizenship\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 11,\n" +
                "   \"VariableName\": \"Y11_Q67_5\",\n" +
                "   \"VariableLabel\": \"Citizenship - Refusal\",\n" +
                "   \"Question\": \"Citizenship 5: Refusal\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 6,\n" +
                "    \"VariableGroupValue\": \"Citizenship\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 68,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 11\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 69,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 11\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 10,\n" +
                "     \"VariableId\": 11,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 6,\n" +
                "      \"KeywordValue\": \"Citizenship\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n"  +
                "}");

        //==========================================

        variables_group.add(7,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 20,\n" +
                "   \"VariableName\": \"Y11_RuralUrban\",\n" +
                "   \"VariableLabel\": \"DV: Rural/urban living\",\n" +
                "   \"Question\": \"Rural or urban area based on response to Y11_Q49\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 4,\n" +
                "    \"TopicValue\": \"Environment, conservation and land use - Land use and planning\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 107,\n" +
                "     \"CategoryLabel\": \"Countryside or village\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 20\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 108,\n" +
                "     \"CategoryLabel\": \"Town or city\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 20\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 19,\n" +
                "     \"VariableId\": 20,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 4,\n" +
                "      \"KeywordValue\": \"Urban Areas\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 20,\n" +
                "     \"VariableId\": 20,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 5,\n" +
                "      \"KeywordValue\": \"Rural Areas\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 54,\n" +
                "   \"VariableName\": \"Y11_Accommproblems\",\n" +
                "   \"VariableLabel\": \"No. of problems with accommodation\",\n" +
                "   \"Question\": \"Number of problems with accommodation\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 238,\n" +
                "     \"CategoryLabel\": \"0 problems with accommodation\",\n" +
                "     \"CategoryValue\": 0,\n" +
                "     \"VariableId\": 54\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 239,\n" +
                "     \"CategoryLabel\": \"1 problem with accommodation\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 54\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 240,\n" +
                "     \"CategoryLabel\": \"2 problems with accommodation\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 54\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 241,\n" +
                "     \"CategoryLabel\": \"3 problems with accommodation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 54\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 242,\n" +
                "     \"CategoryLabel\": \"4 problems with accommodation\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 54\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 243,\n" +
                "     \"CategoryLabel\": \"5 problems with accommodation\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 54\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 244,\n" +
                "     \"CategoryLabel\": \"6 or more problems with accommodation\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 54\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 55,\n" +
                "     \"VariableId\": 54,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 123,\n" +
                "   \"VariableName\": \"Y11_SocExIndex\",\n" +
                "   \"VariableLabel\": \"Social Exclusion Index\",\n" +
                "   \"Question\": \"Social Exclusion Index\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 124,\n" +
                "     \"VariableId\": 123,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 34,\n" +
                "      \"KeywordValue\": \"Social exclusion\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 124,\n" +
                "   \"VariableName\": \"Y11_Volunteering\",\n" +
                "   \"VariableLabel\": \"Volunteering frequency\",\n" +
                "   \"Question\": \"Volunteering frequency\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 563,\n" +
                "     \"CategoryLabel\": \"Does not volunteer\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 124\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 564,\n" +
                "     \"CategoryLabel\": \"Volunteers occasionally\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 124\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 565,\n" +
                "     \"CategoryLabel\": \"Volunteers regularly\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 124\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 125,\n" +
                "     \"VariableId\": 124,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 139,\n" +
                "   \"VariableName\": \"Y11_Deprindex\",\n" +
                "   \"VariableLabel\": \"Deprivation index: No. of items hhold can't afford\",\n" +
                "   \"Question\": \"Deprivation index: Number of items household cannot afford\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 603,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 0 items\",\n" +
                "     \"CategoryValue\": 0,\n" +
                "     \"VariableId\": 139\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 604,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 1 item\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 139\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 605,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 2 items\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 139\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 606,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 3 items\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 139\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 607,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 4 items\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 139\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 608,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 5 items\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 139\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 609,\n" +
                "     \"CategoryLabel\": \"Household cannot afford 6 or more items\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 139\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 152,\n" +
                "     \"VariableId\": 139,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 153,\n" +
                "     \"VariableId\": 139,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 162,\n" +
                "   \"VariableName\": \"Y11_MWIndex\",\n" +
                "   \"VariableLabel\": \"WHO-5 mental wellbeing index\",\n" +
                "   \"Question\": \"WHO-5 mental wellbeing index\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 176,\n" +
                "     \"VariableId\": 162,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 40,\n" +
                "      \"KeywordValue\": \"Emotional states\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 184,\n" +
                "   \"VariableName\": \"Y11_Strainbasedconflict\",\n" +
                "   \"VariableLabel\": \"Work-life balance conflict?\",\n" +
                "   \"Question\": \"Work-life balance conflict\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 837,\n" +
                "     \"CategoryLabel\": \"No or weak conflict\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 184\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 838,\n" +
                "     \"CategoryLabel\": \"Either work or home conflict\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 184\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 839,\n" +
                "     \"CategoryLabel\": \"Both work and home conflict\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 184\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 195,\n" +
                "     \"VariableId\": 184,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 187,\n" +
                "   \"VariableName\": \"DV_Q7\",\n" +
                "   \"VariableLabel\": \"DV: Total number of working hours\",\n" +
                "   \"Question\": \"DV: The total number of working hours\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 8,\n" +
                "    \"TopicValue\": \"Employment and labour - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 1021,\n" +
                "     \"CategoryLabel\": \"1\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1022,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1023,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1024,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1025,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1026,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1027,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1028,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1029,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1030,\n" +
                "     \"CategoryLabel\": \"10\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1031,\n" +
                "     \"CategoryLabel\": \"11\",\n" +
                "     \"CategoryValue\": 11,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1032,\n" +
                "     \"CategoryLabel\": \"12\",\n" +
                "     \"CategoryValue\": 12,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1033,\n" +
                "     \"CategoryLabel\": \"13\",\n" +
                "     \"CategoryValue\": 13,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1034,\n" +
                "     \"CategoryLabel\": \"14\",\n" +
                "     \"CategoryValue\": 14,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1035,\n" +
                "     \"CategoryLabel\": \"15\",\n" +
                "     \"CategoryValue\": 15,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1036,\n" +
                "     \"CategoryLabel\": \"16\",\n" +
                "     \"CategoryValue\": 16,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1037,\n" +
                "     \"CategoryLabel\": \"17\",\n" +
                "     \"CategoryValue\": 17,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1038,\n" +
                "     \"CategoryLabel\": \"18\",\n" +
                "     \"CategoryValue\": 18,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1039,\n" +
                "     \"CategoryLabel\": \"19\",\n" +
                "     \"CategoryValue\": 19,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1040,\n" +
                "     \"CategoryLabel\": \"20\",\n" +
                "     \"CategoryValue\": 20,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1041,\n" +
                "     \"CategoryLabel\": \"21\",\n" +
                "     \"CategoryValue\": 21,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1042,\n" +
                "     \"CategoryLabel\": \"22\",\n" +
                "     \"CategoryValue\": 22,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1043,\n" +
                "     \"CategoryLabel\": \"23\",\n" +
                "     \"CategoryValue\": 23,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1044,\n" +
                "     \"CategoryLabel\": \"24\",\n" +
                "     \"CategoryValue\": 24,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1045,\n" +
                "     \"CategoryLabel\": \"25\",\n" +
                "     \"CategoryValue\": 25,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1046,\n" +
                "     \"CategoryLabel\": \"26\",\n" +
                "     \"CategoryValue\": 26,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1047,\n" +
                "     \"CategoryLabel\": \"27\",\n" +
                "     \"CategoryValue\": 27,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1048,\n" +
                "     \"CategoryLabel\": \"28\",\n" +
                "     \"CategoryValue\": 28,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1049,\n" +
                "     \"CategoryLabel\": \"29\",\n" +
                "     \"CategoryValue\": 29,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1050,\n" +
                "     \"CategoryLabel\": \"30\",\n" +
                "     \"CategoryValue\": 30,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1051,\n" +
                "     \"CategoryLabel\": \"31\",\n" +
                "     \"CategoryValue\": 31,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1052,\n" +
                "     \"CategoryLabel\": \"32\",\n" +
                "     \"CategoryValue\": 32,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1053,\n" +
                "     \"CategoryLabel\": \"33\",\n" +
                "     \"CategoryValue\": 33,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1054,\n" +
                "     \"CategoryLabel\": \"34\",\n" +
                "     \"CategoryValue\": 34,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1055,\n" +
                "     \"CategoryLabel\": \"35\",\n" +
                "     \"CategoryValue\": 35,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1056,\n" +
                "     \"CategoryLabel\": \"36\",\n" +
                "     \"CategoryValue\": 36,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1057,\n" +
                "     \"CategoryLabel\": \"37\",\n" +
                "     \"CategoryValue\": 37,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1058,\n" +
                "     \"CategoryLabel\": \"38\",\n" +
                "     \"CategoryValue\": 38,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1059,\n" +
                "     \"CategoryLabel\": \"39\",\n" +
                "     \"CategoryValue\": 39,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1060,\n" +
                "     \"CategoryLabel\": \"40\",\n" +
                "     \"CategoryValue\": 40,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1061,\n" +
                "     \"CategoryLabel\": \"41\",\n" +
                "     \"CategoryValue\": 41,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1062,\n" +
                "     \"CategoryLabel\": \"42\",\n" +
                "     \"CategoryValue\": 42,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1063,\n" +
                "     \"CategoryLabel\": \"43\",\n" +
                "     \"CategoryValue\": 43,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1064,\n" +
                "     \"CategoryLabel\": \"44\",\n" +
                "     \"CategoryValue\": 44,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1065,\n" +
                "     \"CategoryLabel\": \"45\",\n" +
                "     \"CategoryValue\": 45,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1066,\n" +
                "     \"CategoryLabel\": \"46\",\n" +
                "     \"CategoryValue\": 46,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1067,\n" +
                "     \"CategoryLabel\": \"47\",\n" +
                "     \"CategoryValue\": 47,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1068,\n" +
                "     \"CategoryLabel\": \"48\",\n" +
                "     \"CategoryValue\": 48,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1069,\n" +
                "     \"CategoryLabel\": \"49\",\n" +
                "     \"CategoryValue\": 49,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1070,\n" +
                "     \"CategoryLabel\": \"50\",\n" +
                "     \"CategoryValue\": 50,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1071,\n" +
                "     \"CategoryLabel\": \"51\",\n" +
                "     \"CategoryValue\": 51,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1072,\n" +
                "     \"CategoryLabel\": \"52\",\n" +
                "     \"CategoryValue\": 52,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1073,\n" +
                "     \"CategoryLabel\": \"53\",\n" +
                "     \"CategoryValue\": 53,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1074,\n" +
                "     \"CategoryLabel\": \"54\",\n" +
                "     \"CategoryValue\": 54,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1075,\n" +
                "     \"CategoryLabel\": \"55\",\n" +
                "     \"CategoryValue\": 55,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1076,\n" +
                "     \"CategoryLabel\": \"56\",\n" +
                "     \"CategoryValue\": 56,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1077,\n" +
                "     \"CategoryLabel\": \"57\",\n" +
                "     \"CategoryValue\": 57,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1078,\n" +
                "     \"CategoryLabel\": \"58\",\n" +
                "     \"CategoryValue\": 58,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1079,\n" +
                "     \"CategoryLabel\": \"59\",\n" +
                "     \"CategoryValue\": 59,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1080,\n" +
                "     \"CategoryLabel\": \"60\",\n" +
                "     \"CategoryValue\": 60,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1081,\n" +
                "     \"CategoryLabel\": \"61\",\n" +
                "     \"CategoryValue\": 61,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1082,\n" +
                "     \"CategoryLabel\": \"62\",\n" +
                "     \"CategoryValue\": 62,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1083,\n" +
                "     \"CategoryLabel\": \"63\",\n" +
                "     \"CategoryValue\": 63,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1084,\n" +
                "     \"CategoryLabel\": \"64\",\n" +
                "     \"CategoryValue\": 64,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1085,\n" +
                "     \"CategoryLabel\": \"65\",\n" +
                "     \"CategoryValue\": 65,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1086,\n" +
                "     \"CategoryLabel\": \"66\",\n" +
                "     \"CategoryValue\": 66,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1087,\n" +
                "     \"CategoryLabel\": \"67\",\n" +
                "     \"CategoryValue\": 67,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1088,\n" +
                "     \"CategoryLabel\": \"68\",\n" +
                "     \"CategoryValue\": 68,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1089,\n" +
                "     \"CategoryLabel\": \"69\",\n" +
                "     \"CategoryValue\": 69,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1090,\n" +
                "     \"CategoryLabel\": \"70\",\n" +
                "     \"CategoryValue\": 70,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1091,\n" +
                "     \"CategoryLabel\": \"71\",\n" +
                "     \"CategoryValue\": 71,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1092,\n" +
                "     \"CategoryLabel\": \"72\",\n" +
                "     \"CategoryValue\": 72,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1093,\n" +
                "     \"CategoryLabel\": \"73\",\n" +
                "     \"CategoryValue\": 73,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1094,\n" +
                "     \"CategoryLabel\": \"74\",\n" +
                "     \"CategoryValue\": 74,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1095,\n" +
                "     \"CategoryLabel\": \"75\",\n" +
                "     \"CategoryValue\": 75,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1096,\n" +
                "     \"CategoryLabel\": \"76\",\n" +
                "     \"CategoryValue\": 76,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1097,\n" +
                "     \"CategoryLabel\": \"77\",\n" +
                "     \"CategoryValue\": 77,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1098,\n" +
                "     \"CategoryLabel\": \"78\",\n" +
                "     \"CategoryValue\": 78,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1099,\n" +
                "     \"CategoryLabel\": \"79\",\n" +
                "     \"CategoryValue\": 79,\n" +
                "     \"VariableId\": 187\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1100,\n" +
                "     \"CategoryLabel\": \"80 hrs or more\",\n" +
                "     \"CategoryValue\": 80,\n" +
                "     \"VariableId\": 187\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 198,\n" +
                "     \"VariableId\": 187,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 46,\n" +
                "      \"KeywordValue\": \"Employment\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 188,\n" +
                "   \"VariableName\": \"DV_Q67\",\n" +
                "   \"VariableLabel\": \"DV: Citizenship\",\n" +
                "   \"Question\": \"DV: What is your citizenship?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 6,\n" +
                "    \"TopicValue\": \"Social stratification and groupings - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 842,\n" +
                "     \"CategoryLabel\": \"I am a citizen of [COUNTRY]\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 188\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 843,\n" +
                "     \"CategoryLabel\": \"I am a citizen of another EU member state\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 188\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 844,\n" +
                "     \"CategoryLabel\": \"I am a citizen of a non-EU country\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 188\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 845,\n" +
                "     \"CategoryLabel\": \"Don't know\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 188\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 846,\n" +
                "     \"CategoryLabel\": \"Refusal\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 188\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 847,\n" +
                "     \"CategoryLabel\": \"Duplicate YES responses to options 1 and 2\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 188\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 199,\n" +
                "     \"VariableId\": 188,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 6,\n" +
                "      \"KeywordValue\": \"Citizenship\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 189,\n" +
                "   \"VariableName\": \"DV_Q43Q44\",\n" +
                "   \"VariableLabel\": \"DV: Any limiting/not limiting chronic health problem?\",\n" +
                "   \"Question\": \"DV: Any chronic physical or mental health problem that may or may not limit your daily activities?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 11,\n" +
                "    \"TopicValue\": \"Health - Specific diseases and medical conditions\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 848,\n" +
                "     \"CategoryLabel\": \"illness/disability, limiting\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 189\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 849,\n" +
                "     \"CategoryLabel\": \"illness/disability, not limiting\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 189\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 850,\n" +
                "     \"CategoryLabel\": \"no illness/disability\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 189\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 200,\n" +
                "     \"VariableId\": 189,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 17,\n" +
                "      \"KeywordValue\": \"Debilitative illness\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 190,\n" +
                "   \"VariableName\": \"DV_Q54a\",\n" +
                "   \"VariableLabel\": \"DV: Anyone used/would have like to use child care last 12 months?\",\n" +
                "   \"Question\": \"DV: Have you, or someone close to you, used or would have liked to use child care services in the last 12 months?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 851,\n" +
                "     \"CategoryLabel\": \"I or someone else in my household\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 190\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 852,\n" +
                "     \"CategoryLabel\": \"Someone close to me outside the household\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 190\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 853,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 190\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 854,\n" +
                "     \"CategoryLabel\": \"Don't know\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 190\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 855,\n" +
                "     \"CategoryLabel\": \"Refusal\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 190\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 856,\n" +
                "     \"CategoryLabel\": \"Duplicate YES responses to Options 1 and 2\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 190\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 201,\n" +
                "     \"VariableId\": 190,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 191,\n" +
                "   \"VariableName\": \"DV_Q54b\",\n" +
                "   \"VariableLabel\": \"DV: Anyone used/would have like to use long term care last 12 months?\",\n" +
                "   \"Question\": \"DV: Have you, or someone close to you, used or would have liked to use long term care services in the last 12 months?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 857,\n" +
                "     \"CategoryLabel\": \"I or someone else in my household\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 191\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 858,\n" +
                "     \"CategoryLabel\": \"Someone close to me outside the household\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 191\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 859,\n" +
                "     \"CategoryLabel\": \"Nobody\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 191\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 860,\n" +
                "     \"CategoryLabel\": \"Don't know\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 191\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 861,\n" +
                "     \"CategoryLabel\": \"Refusal\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 191\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 862,\n" +
                "     \"CategoryLabel\": \"Duplicate YES responses to Options 1 and 2\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 191\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 202,\n" +
                "     \"VariableId\": 191,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 192,\n" +
                "   \"VariableName\": \"DV_Q55\",\n" +
                "   \"VariableLabel\": \"DV: No. of factors which made it difficult to use child care?\",\n" +
                "   \"Question\": \"DV: How many factors made it difficult for you to use childcare services?\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 863,\n" +
                "     \"CategoryLabel\": \"0 factors made it difficult to use child care\",\n" +
                "     \"CategoryValue\": 0,\n" +
                "     \"VariableId\": 192\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 864,\n" +
                "     \"CategoryLabel\": \"1 factor made it difficult to use child care\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 192\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 865,\n" +
                "     \"CategoryLabel\": \"2 factors made it difficult to use child care\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 192\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 866,\n" +
                "     \"CategoryLabel\": \"3 factors made it difficult to use child care\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 192\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 867,\n" +
                "     \"CategoryLabel\": \"4 or more factors made it difficult to use child care\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 192\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 203,\n" +
                "     \"VariableId\": 192,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 193,\n" +
                "   \"VariableName\": \"DV_Q56\",\n" +
                "   \"VariableLabel\": \"DV: No. of factors which made it difficult to use long term care?\",\n" +
                "   \"Question\": \"DV: How many factors made it difficult for you to use long term care services?\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 868,\n" +
                "     \"CategoryLabel\": \"0 factors made it difficult to use long term care\",\n" +
                "     \"CategoryValue\": 0,\n" +
                "     \"VariableId\": 193\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 869,\n" +
                "     \"CategoryLabel\": \"1 factor made it difficult to use long term care\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 193\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 870,\n" +
                "     \"CategoryLabel\": \"2 factors made it difficult to use long term care\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 193\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 871,\n" +
                "     \"CategoryLabel\": \"3 factors made it difficult to use long term care\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 193\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 872,\n" +
                "     \"CategoryLabel\": \"4 or more factors made it difficult to use long term care\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 193\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 204,\n" +
                "     \"VariableId\": 193,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 194,\n" +
                "   \"VariableName\": \"DV_Q8\",\n" +
                "   \"VariableLabel\": \"DV: Preferred working hours (3 groups)\",\n" +
                "   \"Question\": \"DV: Would you prefer to work less, more or the same number of hours per week (3 categories)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 8,\n" +
                "    \"TopicValue\": \"Employment and labour - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 873,\n" +
                "     \"CategoryLabel\": \"Would like to work LESS hours\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 194\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 874,\n" +
                "     \"CategoryLabel\": \"Would like to work THE SAME hours\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 194\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 875,\n" +
                "     \"CategoryLabel\": \"Would like to work MORE hours\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 194\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 876,\n" +
                "     \"CategoryLabel\": \"Not enough data/NA/Refusal\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 194\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 205,\n" +
                "     \"VariableId\": 194,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 46,\n" +
                "      \"KeywordValue\": \"Employment\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 195,\n" +
                "   \"VariableName\": \"DV_Q10\",\n" +
                "   \"VariableLabel\": \"DV: Preferred working hours of respondent's partner? (3 groups)\",\n" +
                "   \"Question\": \"DV: Would you prefer your partner to work less, more or the same number of hours per week (3 categories)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 7,\n" +
                "    \"VariableGroupValue\": \"Derived Variables\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 8,\n" +
                "    \"TopicValue\": \"Employment and labour - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 877,\n" +
                "     \"CategoryLabel\": \"Would like partner to work LESS hours\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 195\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 878,\n" +
                "     \"CategoryLabel\": \"Would like partner to work THE SAME hours\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 195\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 879,\n" +
                "     \"CategoryLabel\": \"Would like partner to work MORE hours\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 195\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 880,\n" +
                "     \"CategoryLabel\": \"Not enough data/NA/Refusal\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 195\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 206,\n" +
                "     \"VariableId\": 195,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 46,\n" +
                "      \"KeywordValue\": \"Employment\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n"  +
                "}");

        //==========================================

        variables_group.add(8,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 36,\n" +
                "   \"VariableName\": \"Y11_Q42\",\n" +
                "   \"VariableLabel\": \"Health condition\",\n" +
                "   \"Question\": \"In general, your health is …?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 8,\n" +
                "    \"VariableGroupValue\": \"Health\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 10,\n" +
                "    \"TopicValue\": \"Health - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 180,\n" +
                "     \"CategoryLabel\": \"Very good\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 36\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 181,\n" +
                "     \"CategoryLabel\": \"Good\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 36\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 182,\n" +
                "     \"CategoryLabel\": \"Fair\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 36\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 183,\n" +
                "     \"CategoryLabel\": \"Bad\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 36\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 184,\n" +
                "     \"CategoryLabel\": \"Very bad\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 36\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 37,\n" +
                "     \"VariableId\": 36,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 16,\n" +
                "      \"KeywordValue\": \"Health\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 37,\n" +
                "   \"VariableName\": \"Y11_Q43\",\n" +
                "   \"VariableLabel\": \"Chronic health problems?\",\n" +
                "   \"Question\": \"Any chronic (long-standing) physical or mental health problem, illness or disability?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 8,\n" +
                "    \"VariableGroupValue\": \"Health\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 11,\n" +
                "    \"TopicValue\": \"Health - Specific diseases and medical conditions\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 185,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 37\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 186,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 37\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 38,\n" +
                "     \"VariableId\": 37,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 17,\n" +
                "      \"KeywordValue\": \"Debilitative illness\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 38,\n" +
                "   \"VariableName\": \"Y11_Q44\",\n" +
                "   \"VariableLabel\": \"Limited by chronic health problems?\",\n" +
                "   \"Question\": \"Are you limited in your daily activities by this physical or mental health problem, illness or disability?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 8,\n" +
                "    \"VariableGroupValue\": \"Health\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 11,\n" +
                "    \"TopicValue\": \"Health - Specific diseases and medical conditions\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 187,\n" +
                "     \"CategoryLabel\": \"Yes, severely\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 38\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 188,\n" +
                "     \"CategoryLabel\": \"Yes, to some extent\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 38\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 189,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 38\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 39,\n" +
                "     \"VariableId\": 38,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 17,\n" +
                "      \"KeywordValue\": \"Debilitative illness\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        //==========================================

        variables_group.add(9,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 39,\n" +
                "   \"VariableName\": \"Y11_Q17\",\n" +
                "   \"VariableLabel\": \"No. of rooms in accommodation\",\n" +
                "   \"Question\": \"How many rooms does the accommodation in which you live have? Excl. kitchen, bathrooms, hallways, storerooms and rooms used solely for business.\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 190,\n" +
                "     \"CategoryLabel\": \"1 room in accommodation\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 191,\n" +
                "     \"CategoryLabel\": \"2 rooms in accommodation\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 192,\n" +
                "     \"CategoryLabel\": \"3 rooms in accommodation\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 193,\n" +
                "     \"CategoryLabel\": \"4 rooms in accommodation\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 194,\n" +
                "     \"CategoryLabel\": \"5 rooms in accommodation\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 195,\n" +
                "     \"CategoryLabel\": \"6 rooms in accommodation\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 196,\n" +
                "     \"CategoryLabel\": \"7 rooms in accommodation\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 39\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 197,\n" +
                "     \"CategoryLabel\": \"8 or more rooms in accommodation\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 39\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 40,\n" +
                "     \"VariableId\": 39,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 18,\n" +
                "      \"KeywordValue\": \"Housing tenure\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 40,\n" +
                "   \"VariableName\": \"Y11_Q18\",\n" +
                "   \"VariableLabel\": \"Tenure\",\n" +
                "   \"Question\": \"Which of the following best describes your accommodation?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 198,\n" +
                "     \"CategoryLabel\": \"Own without mortgage (i.e. without any loans)\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 40\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 199,\n" +
                "     \"CategoryLabel\": \"Own with mortgage\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 40\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 200,\n" +
                "     \"CategoryLabel\": \"Tenant, paying rent to private landlord\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 40\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 201,\n" +
                "     \"CategoryLabel\": \"Tenant, paying rent in social/voluntary/municipal housing\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 40\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 202,\n" +
                "     \"CategoryLabel\": \"Accommodation is provided rent free\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 40\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 203,\n" +
                "     \"CategoryLabel\": \"Other\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 40\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 41,\n" +
                "     \"VariableId\": 40,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 18,\n" +
                "      \"KeywordValue\": \"Housing tenure\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 41,\n" +
                "   \"VariableName\": \"Y11_Q19a\",\n" +
                "   \"VariableLabel\": \"Problems with accommodation - space\",\n" +
                "   \"Question\": \"Problems with your accommodation: Shortage of space?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 204,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 41\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 205,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 41\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 42,\n" +
                "     \"VariableId\": 41,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 42,\n" +
                "   \"VariableName\": \"Y11_Q19b\",\n" +
                "   \"VariableLabel\": \"Problems with accommodation - rot in windows etc.\",\n" +
                "   \"Question\": \"Problems with your accommodation: Rot in windows, doors or floors?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 206,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 42\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 207,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 42\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 43,\n" +
                "     \"VariableId\": 42,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 43,\n" +
                "   \"VariableName\": \"Y11_Q19c\",\n" +
                "   \"VariableLabel\": \"Problems with accommodation - damp or leaks\",\n" +
                "   \"Question\": \"Problems with your accommodation: Damp or leaks in walls or roof?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 208,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 43\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 209,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 43\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 44,\n" +
                "     \"VariableId\": 43,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 44,\n" +
                "   \"VariableName\": \"Y11_Q19d\",\n" +
                "   \"VariableLabel\": \"Problems with accommodation - no toilet\",\n" +
                "   \"Question\": \"Problems with your accommodation: Lack of indoor flushing toilet?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 210,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 44\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 211,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 44\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 45,\n" +
                "     \"VariableId\": 44,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 45,\n" +
                "   \"VariableName\": \"Y11_Q19e\",\n" +
                "   \"VariableLabel\": \"Problems with accommodation - no bath/shower\",\n" +
                "   \"Question\": \"Problems with your accommodation: Lack of bath or shower?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 212,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 45\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 213,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 45\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 46,\n" +
                "     \"VariableId\": 45,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 46,\n" +
                "   \"VariableName\": \"Y11_Q19f\",\n" +
                "   \"VariableLabel\": \"Problems with accommodation - no outside space\",\n" +
                "   \"Question\": \"Problems with your accommodation: Lack of place to sit outside (e.g. garden, balcony, terrace)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 214,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 46\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 215,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 46\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 47,\n" +
                "     \"VariableId\": 46,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 19,\n" +
                "      \"KeywordValue\": \"Housing conditions\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 47,\n" +
                "   \"VariableName\": \"Y11_Q20\",\n" +
                "   \"VariableLabel\": \"Likelihood of leaving accom within 6 months\",\n" +
                "   \"Question\": \"How likely need to leave your accom within the next 6mths because you can no longer afford it?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 9,\n" +
                "    \"VariableGroupValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 12,\n" +
                "    \"TopicValue\": \"Housing\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 216,\n" +
                "     \"CategoryLabel\": \"Very likely\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 47\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 217,\n" +
                "     \"CategoryLabel\": \"Quite likely\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 47\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 218,\n" +
                "     \"CategoryLabel\": \"Quite unlikely\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 47\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 219,\n" +
                "     \"CategoryLabel\": \"Very unlikely\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 47\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 48,\n" +
                "     \"VariableId\": 47,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 18,\n" +
                "      \"KeywordValue\": \"Housing tenure\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        //==========================================

        variables_group.add(10,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 55,\n" +
                "   \"VariableName\": \"Y11_Q47a\",\n" +
                "   \"VariableLabel\": \"Difficult to see a doctor because of distance?\",\n" +
                "   \"Question\": \"Last time you saw a doctor, what factors made it difficult? - Distance to doctor’s office/hospital/medical centre\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 13,\n" +
                "    \"TopicValue\": \"Health - Health services and medical \"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 245,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 55\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 246,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 55\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 247,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 55\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 56,\n" +
                "     \"VariableId\": 55,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 21,\n" +
                "      \"KeywordValue\": \"Access to health services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 56,\n" +
                "   \"VariableName\": \"Y11_Q47b\",\n" +
                "   \"VariableLabel\": \"Difficult to see a doctor because of delay in getting appointment?\",\n" +
                "   \"Question\": \"Last time you saw a doctor, what factors made it difficult? - Delay in getting appointment\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 13,\n" +
                "    \"TopicValue\": \"Health - Health services and medical \"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 248,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 56\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 249,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 56\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 250,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 56\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 57,\n" +
                "     \"VariableId\": 56,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 21,\n" +
                "      \"KeywordValue\": \"Access to health services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 57,\n" +
                "   \"VariableName\": \"Y11_Q47c\",\n" +
                "   \"VariableLabel\": \"Difficult to see a doctor because of waiting time?\",\n" +
                "   \"Question\": \"Last time you saw a doctor, what factors made it difficult? - Waiting time to see doctor on day of appointment\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 13,\n" +
                "    \"TopicValue\": \"Health - Health services and medical \"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 251,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 57\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 252,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 57\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 253,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 57\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 58,\n" +
                "     \"VariableId\": 57,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 21,\n" +
                "      \"KeywordValue\": \"Access to health services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 58,\n" +
                "   \"VariableName\": \"Y11_Q47d\",\n" +
                "   \"VariableLabel\": \"Difficult to see a doctor because of cost?\",\n" +
                "   \"Question\": \"Last time you saw a doctor, what factors made it difficult? - Cost of seeing the doctor\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 13,\n" +
                "    \"TopicValue\": \"Health - Health services and medical \"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 254,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 58\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 255,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 58\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 256,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 58\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 59,\n" +
                "     \"VariableId\": 58,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 21,\n" +
                "      \"KeywordValue\": \"Access to health services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 59,\n" +
                "   \"VariableName\": \"Y11_Q47e\",\n" +
                "   \"VariableLabel\": \"Difficult to see a doctor because of lack of time?\",\n" +
                "   \"Question\": \"Last time you saw a doctor, what factors made it difficult? - Finding time because of work, care for children or for others\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 13,\n" +
                "    \"TopicValue\": \"Health - Health services and medical \"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 257,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 59\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 258,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 59\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 259,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 59\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 60,\n" +
                "     \"VariableId\": 59,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 21,\n" +
                "      \"KeywordValue\": \"Access to health services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 66,\n" +
                "   \"VariableName\": \"Y11_Q53a\",\n" +
                "   \"VariableLabel\": \"Quality of health services?\",\n" +
                "   \"Question\": \"How would you rate the quality of: Health services?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 285,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 286,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 287,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 288,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 289,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 290,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 291,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 292,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 293,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 66\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 294,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 66\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 67,\n" +
                "     \"VariableId\": 66,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 67,\n" +
                "   \"VariableName\": \"Y11_Q53b\",\n" +
                "   \"VariableLabel\": \"Quality of education system?\",\n" +
                "   \"Question\": \"How would you rate the quality of: Education system?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 295,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 296,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 297,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 298,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 299,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 300,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 301,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 302,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 303,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 67\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 304,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 67\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 68,\n" +
                "     \"VariableId\": 67,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 68,\n" +
                "   \"VariableName\": \"Y11_Q53c\",\n" +
                "   \"VariableLabel\": \"Quality of public transport?\",\n" +
                "   \"Question\": \"How would you rate the quality of: Public transport?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 305,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 306,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 307,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 308,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 309,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 310,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 311,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 312,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 313,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 68\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 314,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 68\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 69,\n" +
                "     \"VariableId\": 68,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 69,\n" +
                "   \"VariableName\": \"Y11_Q53d\",\n" +
                "   \"VariableLabel\": \"Quality of child care services?\",\n" +
                "   \"Question\": \"How would you rate the quality of: Child care services?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 315,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 316,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 317,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 318,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 319,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 320,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 321,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 322,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 323,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 69\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 324,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 69\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 70,\n" +
                "     \"VariableId\": 69,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 70,\n" +
                "   \"VariableName\": \"Y11_Q53e\",\n" +
                "   \"VariableLabel\": \"Quality of long term care services?\",\n" +
                "   \"Question\": \"How would you rate the quality of: Long term care services?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 325,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 326,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 327,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 328,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 329,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 330,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 331,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 332,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 333,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 70\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 334,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 70\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 71,\n" +
                "     \"VariableId\": 70,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 71,\n" +
                "   \"VariableName\": \"Y11_Q53f\",\n" +
                "   \"VariableLabel\": \"Quality of social/municipal housing?\",\n" +
                "   \"Question\": \"How would you rate the quality of: Social/municipal housing?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 335,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 336,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 337,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 338,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 339,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 340,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 341,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 342,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 343,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 71\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 344,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 71\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 72,\n" +
                "     \"VariableId\": 71,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 72,\n" +
                "   \"VariableName\": \"Y11_Q53g\",\n" +
                "   \"VariableLabel\": \"Quality of state pension system?\",\n" +
                "   \"Question\": \"How would you rate the quality of: State pension system?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 345,\n" +
                "     \"CategoryLabel\": \"1 - very poor quality\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 346,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 347,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 348,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 349,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 350,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 351,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 352,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 353,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 72\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 354,\n" +
                "     \"CategoryLabel\": \"10 - very high quality\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 72\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 73,\n" +
                "     \"VariableId\": 72,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 73,\n" +
                "   \"VariableName\": \"Y11_Q54a_1\",\n" +
                "   \"VariableLabel\": \"I or someone else in household used child care in 12 months\",\n" +
                "   \"Question\": \"Child care services. Have used or liked to use it in the last 12 months? - I or someone else in my household\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 355,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 73\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 356,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 73\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 74,\n" +
                "     \"VariableId\": 73,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 74,\n" +
                "   \"VariableName\": \"Y11_Q54a_2\",\n" +
                "   \"VariableLabel\": \"Someone close outside household used child care in 12 months\",\n" +
                "   \"Question\": \"Child care services. Have used or liked to use it in the last 12 months? - Someone close to me outside the household\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 357,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 74\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 358,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 74\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 75,\n" +
                "     \"VariableId\": 74,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 75,\n" +
                "   \"VariableName\": \"Y11_Q54a_3\",\n" +
                "   \"VariableLabel\": \"Nobody used child care in 12 months\",\n" +
                "   \"Question\": \"Child care services. Have used or liked to use it in the last 12 months? - Nobody\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 359,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 75\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 360,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 75\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 76,\n" +
                "     \"VariableId\": 75,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 76,\n" +
                "   \"VariableName\": \"Y11_Q54a_4\",\n" +
                "   \"VariableLabel\": \"Child care used in 12 months - don't know\",\n" +
                "   \"Question\": \"Child care services. Have used or liked to use it in the last 12 months? - Don't know\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 361,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 76\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 362,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 76\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 77,\n" +
                "     \"VariableId\": 76,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 77,\n" +
                "   \"VariableName\": \"Y11_Q54a_5\",\n" +
                "   \"VariableLabel\": \"Child care used in 12 months - refusal\",\n" +
                "   \"Question\": \"Child care services. Have used or liked to use it in the last 12 months? - Refusal\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 363,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 77\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 364,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 77\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 78,\n" +
                "     \"VariableId\": 77,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 78,\n" +
                "   \"VariableName\": \"Y11_Q54b_1\",\n" +
                "   \"VariableLabel\": \"I or someone else in household used long term care in 12 months\",\n" +
                "   \"Question\": \"Long term care services. Have used or liked to use it in the last 12 months? - I or someone else in my household\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 365,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 78\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 366,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 78\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 79,\n" +
                "     \"VariableId\": 78,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 79,\n" +
                "   \"VariableName\": \"Y11_Q54b_2\",\n" +
                "   \"VariableLabel\": \"Someone close outside household used long term care in 12 months\",\n" +
                "   \"Question\": \"Long term care services. Have used or liked to use it in the last 12 months? - Someone close to me outside the household\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 367,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 79\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 368,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 79\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 80,\n" +
                "     \"VariableId\": 79,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 80,\n" +
                "   \"VariableName\": \"Y11_Q54b_3\",\n" +
                "   \"VariableLabel\": \"Nobody used long term care in 12 months\",\n" +
                "   \"Question\": \"Long term care services. Have used or liked to use it in the last 12 months? - Nobody\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 369,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 80\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 370,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 80\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 81,\n" +
                "     \"VariableId\": 80,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 81,\n" +
                "   \"VariableName\": \"Y11_Q54b_4\",\n" +
                "   \"VariableLabel\": \"Long term care used in 12 months - don't know\",\n" +
                "   \"Question\": \"Long term care services. Have used or liked to use it in the last 12 months? - Don't know\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 371,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 81\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 372,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 81\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 82,\n" +
                "     \"VariableId\": 81,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 82,\n" +
                "   \"VariableName\": \"Y11_Q54b_5\",\n" +
                "   \"VariableLabel\": \"Long term care used in 12 months - refusal\",\n" +
                "   \"Question\": \"Long term care services. Have used or liked to use it in the last 12 months? - Refusal\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 373,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 82\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 374,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 82\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 83,\n" +
                "     \"VariableId\": 82,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 83,\n" +
                "   \"VariableName\": \"Y11_Q55a\",\n" +
                "   \"VariableLabel\": \"Difficult to use child care because of cost?\",\n" +
                "   \"Question\": \"Make it difficult to use childcare services: Cost?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 375,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 83\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 376,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 83\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 377,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 83\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 84,\n" +
                "     \"VariableId\": 83,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 84,\n" +
                "   \"VariableName\": \"Y11_Q55b\",\n" +
                "   \"VariableLabel\": \"Difficult to use child care because of availability?\",\n" +
                "   \"Question\": \"Make it difficult to use childcare services: Availability (e.g. waiting lists, lack of services)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 378,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 84\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 379,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 84\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 380,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 84\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 85,\n" +
                "     \"VariableId\": 84,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 85,\n" +
                "   \"VariableName\": \"Y11_Q55c\",\n" +
                "   \"VariableLabel\": \"Difficult to use child care because of access?\",\n" +
                "   \"Question\": \"Make it difficult to use childcare services: Access (e.g. because of distance or opening-hours)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 381,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 85\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 382,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 85\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 383,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 85\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 86,\n" +
                "     \"VariableId\": 85,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 86,\n" +
                "   \"VariableName\": \"Y11_Q55d\",\n" +
                "   \"VariableLabel\": \"Difficult to use child care because of quality of care?\",\n" +
                "   \"Question\": \"Make it difficult to use childcare services: Quality of care?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 384,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 86\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 385,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 86\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 386,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 86\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 87,\n" +
                "     \"VariableId\": 86,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 25,\n" +
                "      \"KeywordValue\": \"Child care\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 87,\n" +
                "   \"VariableName\": \"Y11_Q56a\",\n" +
                "   \"VariableLabel\": \"Difficult to use long term care because of cost?\",\n" +
                "   \"Question\": \"Make it difficult to use long term care services: Cost?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 387,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 87\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 388,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 87\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 389,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 87\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 88,\n" +
                "     \"VariableId\": 87,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 88,\n" +
                "   \"VariableName\": \"Y11_Q56b\",\n" +
                "   \"VariableLabel\": \"Difficult to use long term care because of availability?\",\n" +
                "   \"Question\": \"Make it difficult to use long term care services: Availability (e.g. waiting lists, lack of services)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 390,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 88\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 391,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 88\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 392,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 88\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 89,\n" +
                "     \"VariableId\": 88,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 89,\n" +
                "   \"VariableName\": \"Y11_Q56c\",\n" +
                "   \"VariableLabel\": \"Difficult to use long term care because of access?\",\n" +
                "   \"Question\": \"Make it difficult to use long term care services: Access (e.g. because of distance or opening-hours)?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 393,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 89\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 394,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 89\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 395,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 89\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 90,\n" +
                "     \"VariableId\": 89,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 90,\n" +
                "   \"VariableName\": \"Y11_Q56d\",\n" +
                "   \"VariableLabel\": \"Difficult to use long term care because of quality of care?\",\n" +
                "   \"Question\": \"Make it difficult to use long term care services: Quality of care?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 10,\n" +
                "    \"VariableGroupValue\": \"Public Services (Access and Quality)\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 396,\n" +
                "     \"CategoryLabel\": \"Very difficult\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 90\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 397,\n" +
                "     \"CategoryLabel\": \"A little difficult\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 90\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 398,\n" +
                "     \"CategoryLabel\": \"Not difficult at all\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 90\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 91,\n" +
                "     \"VariableId\": 90,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 24,\n" +
                "      \"KeywordValue\": \"Public services\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n"  +
                "}");

        //==========================================

        variables_group.add(11,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 91,\n" +
                "   \"VariableName\": \"Y11_Q24\",\n" +
                "   \"VariableLabel\": \"Can most people be trusted?\",\n" +
                "   \"Question\": \"Would you say that most people can be trusted? (on a scale of 1 to 10)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 399,\n" +
                "     \"CategoryLabel\": \"1 - you can’t be too careful\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 400,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 401,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 402,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 403,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 404,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 405,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 406,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 407,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 91\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 408,\n" +
                "     \"CategoryLabel\": \"10 - most people can be trusted\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 91\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 92,\n" +
                "     \"VariableId\": 91,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 92,\n" +
                "   \"VariableName\": \"Y11_Q25a\",\n" +
                "   \"VariableLabel\": \"How much tension between Poor and Rich?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Poor and rich people?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 409,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 92\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 410,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 92\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 411,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 92\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 93,\n" +
                "     \"VariableId\": 92,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 93,\n" +
                "   \"VariableName\": \"Y11_Q25b\",\n" +
                "   \"VariableLabel\": \"How much tension between Management and Workers?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Management and workers?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 412,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 93\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 413,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 93\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 414,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 93\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 94,\n" +
                "     \"VariableId\": 93,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 94,\n" +
                "   \"VariableName\": \"Y11_Q25c\",\n" +
                "   \"VariableLabel\": \"How much tension between Men and Women?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Men and women?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 415,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 94\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 416,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 94\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 417,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 94\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 95,\n" +
                "     \"VariableId\": 94,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 95,\n" +
                "   \"VariableName\": \"Y11_Q25d\",\n" +
                "   \"VariableLabel\": \"How much tension between Old and Young people?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Old people and young people?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 418,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 95\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 419,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 95\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 420,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 95\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 96,\n" +
                "     \"VariableId\": 95,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 96,\n" +
                "   \"VariableName\": \"Y11_Q25e\",\n" +
                "   \"VariableLabel\": \"How much tension between different racial/ethnic groups?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Different racial and ethnic groups?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 421,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 96\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 422,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 96\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 423,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 96\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 97,\n" +
                "     \"VariableId\": 96,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 97,\n" +
                "   \"VariableName\": \"Y11_Q25f\",\n" +
                "   \"VariableLabel\": \"How much tension between different religious groups?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Different religious groups?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 424,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 97\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 425,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 97\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 426,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 97\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 98,\n" +
                "     \"VariableId\": 97,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 98,\n" +
                "   \"VariableName\": \"Y11_Q25g\",\n" +
                "   \"VariableLabel\": \"How much tension between groups with different sexual orientation?\",\n" +
                "   \"Question\": \"How much tension is there in this country: Groups with different sexual orientation?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 427,\n" +
                "     \"CategoryLabel\": \"A lot of tension\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 98\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 428,\n" +
                "     \"CategoryLabel\": \"Some tension\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 98\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 429,\n" +
                "     \"CategoryLabel\": \"No tension\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 98\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 99,\n" +
                "     \"VariableId\": 98,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 27,\n" +
                "      \"KeywordValue\": \"Disadvantaged groups\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 99,\n" +
                "   \"VariableName\": \"Y11_Q28a\",\n" +
                "   \"VariableLabel\": \"How much trust the parliament?\",\n" +
                "   \"Question\": \"How much you personally trust: [NATIONALITY] parliament?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 430,\n" +
                "     \"CategoryLabel\": \"1 - Do not trust at all\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 431,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 432,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 433,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 434,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 435,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 436,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 437,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 438,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 99\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 439,\n" +
                "     \"CategoryLabel\": \"10 - Trust completely\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 99\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 100,\n" +
                "     \"VariableId\": 99,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 100,\n" +
                "   \"VariableName\": \"Y11_Q28b\",\n" +
                "   \"VariableLabel\": \"How much trust the legal system?\",\n" +
                "   \"Question\": \"How much you personally trust: The legal system?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 440,\n" +
                "     \"CategoryLabel\": \"1 - Do not trust at all\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 441,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 442,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 443,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 444,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 445,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 446,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 447,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 448,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 100\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 449,\n" +
                "     \"CategoryLabel\": \"10 - Trust completely\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 100\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 101,\n" +
                "     \"VariableId\": 100,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 101,\n" +
                "   \"VariableName\": \"Y11_Q28c\",\n" +
                "   \"VariableLabel\": \"How much trust the press?\",\n" +
                "   \"Question\": \"How much you personally trust: The press?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 450,\n" +
                "     \"CategoryLabel\": \"1 - Do not trust at all\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 451,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 452,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 453,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 454,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 455,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 456,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 457,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 458,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 101\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 459,\n" +
                "     \"CategoryLabel\": \"10 - Trust completely\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 101\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 102,\n" +
                "     \"VariableId\": 101,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 102,\n" +
                "   \"VariableName\": \"Y11_Q28d\",\n" +
                "   \"VariableLabel\": \"How much trust the police?\",\n" +
                "   \"Question\": \"How much you personally trust: The police?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 460,\n" +
                "     \"CategoryLabel\": \"1 - Do not trust at all\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 461,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 462,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 463,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 464,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 465,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 466,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 467,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 468,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 102\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 469,\n" +
                "     \"CategoryLabel\": \"10 - Trust completely\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 102\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 103,\n" +
                "     \"VariableId\": 102,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 103,\n" +
                "   \"VariableName\": \"Y11_Q28e\",\n" +
                "   \"VariableLabel\": \"How much trust the government?\",\n" +
                "   \"Question\": \"How much you personally trust: The government?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 470,\n" +
                "     \"CategoryLabel\": \"1 - Do not trust at all\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 471,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 472,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 473,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 474,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 475,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 476,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 477,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 478,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 103\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 479,\n" +
                "     \"CategoryLabel\": \"10 - Trust completely\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 103\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 104,\n" +
                "     \"VariableId\": 103,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 104,\n" +
                "   \"VariableName\": \"Y11_Q28f\",\n" +
                "   \"VariableLabel\": \"How much trust the local authorities?\",\n" +
                "   \"Question\": \"How much you personally trust: The local/municipal authorities?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 11,\n" +
                "    \"VariableGroupValue\": \"Quality of Society\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 480,\n" +
                "     \"CategoryLabel\": \"1 - Do not trust at all\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 481,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 482,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 483,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 484,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 485,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 486,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 487,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 488,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 104\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 489,\n" +
                "     \"CategoryLabel\": \"10 - Trust completely\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 104\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 105,\n" +
                "     \"VariableId\": 104,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 26,\n" +
                "      \"KeywordValue\": \"Trust\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        //==========================================

        variables_group.add(12,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 105,\n" +
                "   \"VariableName\": \"Y11_Q21a\",\n" +
                "   \"VariableLabel\": \"How frequently attend religious services?\",\n" +
                "   \"Question\": \"How frequently do you: Attend religious services, apart from weddings, funerals or christenings?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 490,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 105\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 491,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 105\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 492,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 105\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 493,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 105\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 494,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 105\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 106,\n" +
                "     \"VariableId\": 105,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 28,\n" +
                "      \"KeywordValue\": \"Religious attendance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 106,\n" +
                "   \"VariableName\": \"Y11_Q21b\",\n" +
                "   \"VariableLabel\": \"How frequently use the Internet other than for work?\",\n" +
                "   \"Question\": \"How frequently do you: Use the Internet other than for work?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 495,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 106\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 496,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 106\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 497,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 106\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 498,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 106\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 499,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 106\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 107,\n" +
                "     \"VariableId\": 106,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 29,\n" +
                "      \"KeywordValue\": \"Internet use\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 107,\n" +
                "   \"VariableName\": \"Y11_Q21c\",\n" +
                "   \"VariableLabel\": \"How frequently take part in sports or exercise?\",\n" +
                "   \"Question\": \"How frequently do you: Take part in sports or physical exercise?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 500,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 107\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 501,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 107\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 502,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 107\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 503,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 107\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 504,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 107\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 108,\n" +
                "     \"VariableId\": 107,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 30,\n" +
                "      \"KeywordValue\": \"Exercise\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 108,\n" +
                "   \"VariableName\": \"Y11_Q21d\",\n" +
                "   \"VariableLabel\": \"How frequently participate in social activities?\",\n" +
                "   \"Question\": \"How frequently do you: Participate in social activities of a club, society, or an association?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 505,\n" +
                "     \"CategoryLabel\": \"Every day or almost every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 108\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 506,\n" +
                "     \"CategoryLabel\": \"At least once a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 108\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 507,\n" +
                "     \"CategoryLabel\": \"One to three times a month\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 108\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 508,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 108\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 509,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 108\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 109,\n" +
                "     \"VariableId\": 108,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 31,\n" +
                "      \"KeywordValue\": \"Leisure time activities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 109,\n" +
                "   \"VariableName\": \"Y11_Q22a\",\n" +
                "   \"VariableLabel\": \"How often worked unpaid for community services last 12 months?\",\n" +
                "   \"Question\": \"How often unpaid voluntary work in the last 12 months: Community and social services?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 510,\n" +
                "     \"CategoryLabel\": \"Every week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 109\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 511,\n" +
                "     \"CategoryLabel\": \"Every month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 109\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 512,\n" +
                "     \"CategoryLabel\": \"Less often/occasionally\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 109\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 513,\n" +
                "     \"CategoryLabel\": \"Not at all\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 109\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 110,\n" +
                "     \"VariableId\": 109,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 110,\n" +
                "   \"VariableName\": \"Y11_Q22b\",\n" +
                "   \"VariableLabel\": \"How often worked unpaid for education/cultural etc organisation last 12 months?\",\n" +
                "   \"Question\": \"How often unpaid voluntary work in the last 12 months: Education, cultural, sports or professional organisation?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 514,\n" +
                "     \"CategoryLabel\": \"Every week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 110\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 515,\n" +
                "     \"CategoryLabel\": \"Every month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 110\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 516,\n" +
                "     \"CategoryLabel\": \"Less often/occasionally\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 110\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 517,\n" +
                "     \"CategoryLabel\": \"Not at all\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 110\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 111,\n" +
                "     \"VariableId\": 110,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 111,\n" +
                "   \"VariableName\": \"Y11_Q22c\",\n" +
                "   \"VariableLabel\": \"How often worked unpaid for social movements/charities last 12 months?\",\n" +
                "   \"Question\": \"How often unpaid voluntary work in the last 12 months: Social movements or charities?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 518,\n" +
                "     \"CategoryLabel\": \"Every week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 111\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 519,\n" +
                "     \"CategoryLabel\": \"Every month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 111\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 520,\n" +
                "     \"CategoryLabel\": \"Less often/occasionally\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 111\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 521,\n" +
                "     \"CategoryLabel\": \"Not at all\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 111\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 112,\n" +
                "     \"VariableId\": 111,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 112,\n" +
                "   \"VariableName\": \"Y11_Q22d\",\n" +
                "   \"VariableLabel\": \"How often worked unpaid for political parties or trade unions last 12 months?\",\n" +
                "   \"Question\": \"How often unpaid voluntary work in the last 12 months: Political parties, trade unions?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 522,\n" +
                "     \"CategoryLabel\": \"Every week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 112\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 523,\n" +
                "     \"CategoryLabel\": \"Every month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 112\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 524,\n" +
                "     \"CategoryLabel\": \"Less often/occasionally\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 112\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 525,\n" +
                "     \"CategoryLabel\": \"Not at all\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 112\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 113,\n" +
                "     \"VariableId\": 112,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 113,\n" +
                "   \"VariableName\": \"Y11_Q22e\",\n" +
                "   \"VariableLabel\": \"How often worked unpaid for other voluntary org last 12 months?\",\n" +
                "   \"Question\": \"How often unpaid voluntary work in the last 12 months: Other voluntary organisations?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 526,\n" +
                "     \"CategoryLabel\": \"Every week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 113\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 527,\n" +
                "     \"CategoryLabel\": \"Every month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 113\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 528,\n" +
                "     \"CategoryLabel\": \"Less often/occasionally\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 113\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 529,\n" +
                "     \"CategoryLabel\": \"Not at all\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 113\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 114,\n" +
                "     \"VariableId\": 113,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 114,\n" +
                "   \"VariableName\": \"Y11_Q23a\",\n" +
                "   \"VariableLabel\": \"Attended a trade union/political party meeting last 12 months?\",\n" +
                "   \"Question\": \"Over the last 12 months, have you: Attended a meeting of a trade union, a political party or political action group?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 15,\n" +
                "    \"TopicValue\": \"Politics - Political behaviour and attitudes\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 530,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 114\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 531,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 114\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 115,\n" +
                "     \"VariableId\": 114,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 33,\n" +
                "      \"KeywordValue\": \"Attitudes\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 115,\n" +
                "   \"VariableName\": \"Y11_Q23b\",\n" +
                "   \"VariableLabel\": \"Attended a protest or demonstration last 12 months?\",\n" +
                "   \"Question\": \"Over the last 12 months, have you: Attended a protest or demonstration?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 15,\n" +
                "    \"TopicValue\": \"Politics - Political behaviour and attitudes\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 532,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 115\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 533,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 115\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 116,\n" +
                "     \"VariableId\": 115,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 33,\n" +
                "      \"KeywordValue\": \"Attitudes\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 116,\n" +
                "   \"VariableName\": \"Y11_Q23c\",\n" +
                "   \"VariableLabel\": \"Signed a petition last 12 months?\",\n" +
                "   \"Question\": \"Over the last 12 months, have you: Signed a petition, including an e-mail or on-line petition?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 15,\n" +
                "    \"TopicValue\": \"Politics - Political behaviour and attitudes\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 534,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 116\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 535,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 116\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 117,\n" +
                "     \"VariableId\": 116,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 33,\n" +
                "      \"KeywordValue\": \"Attitudes\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 117,\n" +
                "   \"VariableName\": \"Y11_Q23d\",\n" +
                "   \"VariableLabel\": \"Contacted a politician last 12 months?\",\n" +
                "   \"Question\": \"Over the last 12 months, have you: Contacted a politician or public official?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 12,\n" +
                "    \"VariableGroupValue\": \"Social Participation\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 15,\n" +
                "    \"TopicValue\": \"Politics - Political behaviour and attitudes\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 536,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 117\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 537,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 117\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 118,\n" +
                "     \"VariableId\": 117,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 33,\n" +
                "      \"KeywordValue\": \"Attitudes\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        //==========================================

        variables_group.add(13,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 118,\n" +
                "   \"VariableName\": \"Y11_Q29e\",\n" +
                "   \"VariableLabel\": \"Feel left out of sociey?\",\n" +
                "   \"Question\": \"I feel left out of society\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 13,\n" +
                "    \"VariableGroupValue\": \"Social Exclusion\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 538,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 118\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 539,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 118\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 540,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 118\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 541,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 118\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 542,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 118\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 119,\n" +
                "     \"VariableId\": 118,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 34,\n" +
                "      \"KeywordValue\": \"Social exclusion\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 119,\n" +
                "   \"VariableName\": \"Y11_Q29f\",\n" +
                "   \"VariableLabel\": \"Can't find the way because life has become so complicated?\",\n" +
                "   \"Question\": \"Life has become so complicated today that I almost can’t find my way\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 13,\n" +
                "    \"VariableGroupValue\": \"Social Exclusion\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 543,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 119\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 544,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 119\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 545,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 119\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 546,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 119\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 547,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 119\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 120,\n" +
                "     \"VariableId\": 119,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 34,\n" +
                "      \"KeywordValue\": \"Social exclusion\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 120,\n" +
                "   \"VariableName\": \"Y11_Q29g\",\n" +
                "   \"VariableLabel\": \"The value of what I do is not recognised by others?\",\n" +
                "   \"Question\": \"I feel that the value of what I do is not recognised by others\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 13,\n" +
                "    \"VariableGroupValue\": \"Social Exclusion\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 548,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 120\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 549,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 120\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 550,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 120\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 551,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 120\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 552,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 120\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 121,\n" +
                "     \"VariableId\": 120,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 34,\n" +
                "      \"KeywordValue\": \"Social exclusion\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 121,\n" +
                "   \"VariableName\": \"Y11_Q29h\",\n" +
                "   \"VariableLabel\": \"People look down on me because of my job situation or income?\",\n" +
                "   \"Question\": \"Some people look down on me because of my job situation or income\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 13,\n" +
                "    \"VariableGroupValue\": \"Social Exclusion\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 553,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 121\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 554,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 121\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 555,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 121\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 556,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 121\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 557,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 121\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 122,\n" +
                "     \"VariableId\": 121,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 34,\n" +
                "      \"KeywordValue\": \"Social exclusion\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 122,\n" +
                "   \"VariableName\": \"Y11_Q29i\",\n" +
                "   \"VariableLabel\": \"Feel close to people in the area where I live\",\n" +
                "   \"Question\": \"I feel close to people in the area where I live\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 13,\n" +
                "    \"VariableGroupValue\": \"Social Exclusion\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 5,\n" +
                "    \"TopicValue\": \"Society and culture - Social attitudes and behaviour\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 558,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 122\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 559,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 122\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 560,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 122\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 561,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 122\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 562,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 122\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 123,\n" +
                "     \"VariableId\": 122,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 34,\n" +
                "      \"KeywordValue\": \"Social exclusion\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        //==========================================

        variables_group.add(14,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 125,\n" +
                "   \"VariableName\": \"Y11_Q57\",\n" +
                "   \"VariableLabel\": \"Personal financial situation\",\n" +
                "   \"Question\": \"Could you please evaluate your financial situation? In comparison to most people in [COUNTRY]\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 566,\n" +
                "     \"CategoryLabel\": \"Much worse\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 125\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 567,\n" +
                "     \"CategoryLabel\": \"Somewhat worse\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 125\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 568,\n" +
                "     \"CategoryLabel\": \"Neither worse nor better\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 125\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 569,\n" +
                "     \"CategoryLabel\": \"Somewhat better\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 125\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 570,\n" +
                "     \"CategoryLabel\": \"Much better\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 125\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 126,\n" +
                "     \"VariableId\": 125,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 12,\n" +
                "      \"KeywordValue\": \"Income\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 126,\n" +
                "   \"VariableName\": \"Y11_Q58\",\n" +
                "   \"VariableLabel\": \"Household able to make ends meet?\",\n" +
                "   \"Question\": \"Thinking of your households total monthly income: is your household able to make ends meet?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 571,\n" +
                "     \"CategoryLabel\": \"Very easily\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 126\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 572,\n" +
                "     \"CategoryLabel\": \"Easily\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 126\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 573,\n" +
                "     \"CategoryLabel\": \"Fairly easily\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 126\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 574,\n" +
                "     \"CategoryLabel\": \"With some difficulty\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 126\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 575,\n" +
                "     \"CategoryLabel\": \"With difficulty\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 126\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 576,\n" +
                "     \"CategoryLabel\": \"With great difficulty\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 126\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 127,\n" +
                "     \"VariableId\": 126,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 12,\n" +
                "      \"KeywordValue\": \"Income\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 127,\n" +
                "   \"VariableName\": \"Y11_Q59a\",\n" +
                "   \"VariableLabel\": \"Can afford to keep home adequately warm?\",\n" +
                "   \"Question\": \"Can household afford it if you want it? - Keeping your home adequately warm\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 577,\n" +
                "     \"CategoryLabel\": \"Yes, can afford if want\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 127\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 578,\n" +
                "     \"CategoryLabel\": \"No, cannot afford it\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 127\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 128,\n" +
                "     \"VariableId\": 127,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 129,\n" +
                "     \"VariableId\": 127,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 128,\n" +
                "   \"VariableName\": \"Y11_Q59b\",\n" +
                "   \"VariableLabel\": \"Can afford to pay for a week's annual holiday away?\",\n" +
                "   \"Question\": \"Can household afford it if you want it? - Paying for a week's annual holiday away from home\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 579,\n" +
                "     \"CategoryLabel\": \"Yes, can afford if want\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 128\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 580,\n" +
                "     \"CategoryLabel\": \"No, cannot afford it\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 128\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 130,\n" +
                "     \"VariableId\": 128,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 131,\n" +
                "     \"VariableId\": 128,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 129,\n" +
                "   \"VariableName\": \"Y11_Q59c\",\n" +
                "   \"VariableLabel\": \"Can afford to replace any worn-out furniture?\",\n" +
                "   \"Question\": \"Can household afford it if you want it? - Replacing any worn-out furniture\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 581,\n" +
                "     \"CategoryLabel\": \"Yes, can afford if want\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 129\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 582,\n" +
                "     \"CategoryLabel\": \"No, cannot afford it\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 129\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 132,\n" +
                "     \"VariableId\": 129,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 133,\n" +
                "     \"VariableId\": 129,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 130,\n" +
                "   \"VariableName\": \"Y11_Q59d\",\n" +
                "   \"VariableLabel\": \"Can afford a meal with meat/chicken/fish every second day?\",\n" +
                "   \"Question\": \"Can household afford it if you want it? - A meal with meat, chicken, fish every second day\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 583,\n" +
                "     \"CategoryLabel\": \"Yes, can afford if want\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 130\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 584,\n" +
                "     \"CategoryLabel\": \"No, cannot afford it\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 130\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 134,\n" +
                "     \"VariableId\": 130,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 135,\n" +
                "     \"VariableId\": 130,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 131,\n" +
                "   \"VariableName\": \"Y11_Q59e\",\n" +
                "   \"VariableLabel\": \"Can afford to buy new, rather than second-hand, clothes?\",\n" +
                "   \"Question\": \"Can household afford it if you want it? - Buying new, rather than second-hand, clothes\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 585,\n" +
                "     \"CategoryLabel\": \"Yes, can afford if want\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 131\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 586,\n" +
                "     \"CategoryLabel\": \"No, cannot afford it\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 131\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 136,\n" +
                "     \"VariableId\": 131,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 137,\n" +
                "     \"VariableId\": 131,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 132,\n" +
                "   \"VariableName\": \"Y11_Q59f\",\n" +
                "   \"VariableLabel\": \"Can afford to have friends or family for a drink/meal at least once a month?\",\n" +
                "   \"Question\": \"Can household afford it if you want it? - Having friends or family for a drink or meal at least once a month\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 587,\n" +
                "     \"CategoryLabel\": \"Yes, can afford if want\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 132\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 588,\n" +
                "     \"CategoryLabel\": \"No, cannot afford it\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 132\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 138,\n" +
                "     \"VariableId\": 132,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 139,\n" +
                "     \"VariableId\": 132,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 133,\n" +
                "   \"VariableName\": \"Y11_Q60a\",\n" +
                "   \"VariableLabel\": \"Rent/mortgage payments for accommodation\",\n" +
                "   \"Question\": \"Rent or mortgage payments for accommodation\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 589,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 133\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 590,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 133\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 140,\n" +
                "     \"VariableId\": 133,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 141,\n" +
                "     \"VariableId\": 133,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 134,\n" +
                "   \"VariableName\": \"Y11_Q60b\",\n" +
                "   \"VariableLabel\": \"Utility bills, such as electricity, water, gas\",\n" +
                "   \"Question\": \"Utility bills, such as electricity, water, gas\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 591,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 134\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 592,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 134\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 142,\n" +
                "     \"VariableId\": 134,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 143,\n" +
                "     \"VariableId\": 134,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 135,\n" +
                "   \"VariableName\": \"Y11_Q60c\",\n" +
                "   \"VariableLabel\": \"Payments for consumer loans/credit cards\",\n" +
                "   \"Question\": \"Payments related to consumer loans, including credit card overdrafts (to buy electrical appliances, a car, furniture, etc.)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 593,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 135\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 594,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 135\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 144,\n" +
                "     \"VariableId\": 135,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 145,\n" +
                "     \"VariableId\": 135,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 136,\n" +
                "   \"VariableName\": \"Y11_Q60d\",\n" +
                "   \"VariableLabel\": \"Payments for informal loans from friends/relatives\",\n" +
                "   \"Question\": \"Payments related to informal loans from friends or relatives not living in your household\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 595,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 136\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 596,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 136\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 146,\n" +
                "     \"VariableId\": 136,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 147,\n" +
                "     \"VariableId\": 136,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 137,\n" +
                "   \"VariableName\": \"Y11_Q65\",\n" +
                "   \"VariableLabel\": \"Financial situation of your household compared to 12 months ago?\",\n" +
                "   \"Question\": \"Financial situation of your household compared to 12 months ago?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 597,\n" +
                "     \"CategoryLabel\": \"Better\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 137\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 598,\n" +
                "     \"CategoryLabel\": \"The same\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 137\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 599,\n" +
                "     \"CategoryLabel\": \"Worse\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 137\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 148,\n" +
                "     \"VariableId\": 137,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 149,\n" +
                "     \"VariableId\": 137,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 138,\n" +
                "   \"VariableName\": \"Y11_Q66\",\n" +
                "   \"VariableLabel\": \"Household financial expectations for th 12 months?\",\n" +
                "   \"Question\": \"What are your expectations for the financial situation of your hhold for the 12 months?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 14,\n" +
                "    \"VariableGroupValue\": \"Economic Situation of Household\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 9,\n" +
                "    \"TopicValue\": \"Economics - Income, property and investment\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 600,\n" +
                "     \"CategoryLabel\": \"Better\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 138\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 601,\n" +
                "     \"CategoryLabel\": \"The same\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 138\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 602,\n" +
                "     \"CategoryLabel\": \"Worse\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 138\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 150,\n" +
                "     \"VariableId\": 138,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 35,\n" +
                "      \"KeywordValue\": \"Financial difficulties\"\n" +
                "     }\n" +
                "    },\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 151,\n" +
                "     \"VariableId\": 138,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 36,\n" +
                "      \"KeywordValue\": \"Financial resources\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n"  +
                "}");

        //==========================================

        variables_group.add(15,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 140,\n" +
                "   \"VariableName\": \"Y11_Q29a\",\n" +
                "   \"VariableLabel\": \"I am optimistic about the future\",\n" +
                "   \"Question\": \"I am optimistic about the future\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 610,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 140\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 611,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 140\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 612,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 140\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 613,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 140\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 614,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 140\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 154,\n" +
                "     \"VariableId\": 140,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 37,\n" +
                "      \"KeywordValue\": \"Quality of life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 141,\n" +
                "   \"VariableName\": \"Y11_Q29b\",\n" +
                "   \"VariableLabel\": \"I generally feel that what I do in life is worthwhile\",\n" +
                "   \"Question\": \"I generally feel that what I do in life is worthwhile\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 615,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 141\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 616,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 141\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 617,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 141\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 618,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 141\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 619,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 141\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 155,\n" +
                "     \"VariableId\": 141,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 37,\n" +
                "      \"KeywordValue\": \"Quality of life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 142,\n" +
                "   \"VariableName\": \"Y11_Q29c\",\n" +
                "   \"VariableLabel\": \"I feel I am free to decide how to live my life\",\n" +
                "   \"Question\": \"I feel I am free to decide how to live my life\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 620,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 142\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 621,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 142\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 622,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 142\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 623,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 142\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 624,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 142\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 156,\n" +
                "     \"VariableId\": 142,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 37,\n" +
                "      \"KeywordValue\": \"Quality of life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 143,\n" +
                "   \"VariableName\": \"Y11_Q29d\",\n" +
                "   \"VariableLabel\": \"I seldom have time to do the things I really enjoy\",\n" +
                "   \"Question\": \"In my daily life, I seldom have time to do the things I really enjoy\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 625,\n" +
                "     \"CategoryLabel\": \"Strongly agree\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 143\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 626,\n" +
                "     \"CategoryLabel\": \"Agree\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 143\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 627,\n" +
                "     \"CategoryLabel\": \"Neither agree nor disagree\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 143\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 628,\n" +
                "     \"CategoryLabel\": \"Disagree\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 143\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 629,\n" +
                "     \"CategoryLabel\": \"Strongly disagree\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 143\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 157,\n" +
                "     \"VariableId\": 143,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 37,\n" +
                "      \"KeywordValue\": \"Quality of life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 144,\n" +
                "   \"VariableName\": \"Y11_Q30\",\n" +
                "   \"VariableLabel\": \"How satisfied with life these days?\",\n" +
                "   \"Question\": \"All things considered, how satisfied would you say you are with your life these days?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 630,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 631,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 632,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 633,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 634,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 635,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 636,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 637,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 638,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 144\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 639,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 144\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 158,\n" +
                "     \"VariableId\": 144,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 145,\n" +
                "   \"VariableName\": \"Y11_Q40a\",\n" +
                "   \"VariableLabel\": \"How satisfied with education?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your education?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 640,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 641,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 642,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 643,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 644,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 645,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 646,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 647,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 648,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 145\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 649,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 145\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 159,\n" +
                "     \"VariableId\": 145,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 146,\n" +
                "   \"VariableName\": \"Y11_Q40b\",\n" +
                "   \"VariableLabel\": \"How satisfied with present job?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your present job?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 650,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 651,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 652,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 653,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 654,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 655,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 656,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 657,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 658,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 146\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 659,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 146\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 160,\n" +
                "     \"VariableId\": 146,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 147,\n" +
                "   \"VariableName\": \"Y11_Q40c\",\n" +
                "   \"VariableLabel\": \"How satisfied with present standard of living?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your present standard of living?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 660,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 661,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 662,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 663,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 664,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 665,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 666,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 667,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 668,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 147\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 669,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 147\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 161,\n" +
                "     \"VariableId\": 147,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 148,\n" +
                "   \"VariableName\": \"Y11_Q40d\",\n" +
                "   \"VariableLabel\": \"How satisfied with accommodation?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your accommodation?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 670,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 671,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 672,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 673,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 674,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 675,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 676,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 677,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 678,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 148\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 679,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 148\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 162,\n" +
                "     \"VariableId\": 148,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 149,\n" +
                "   \"VariableName\": \"Y11_Q40e\",\n" +
                "   \"VariableLabel\": \"How satisfied with family life?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your family life?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 680,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 681,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 682,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 683,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 684,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 685,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 686,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 687,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 688,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 149\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 689,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 149\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 163,\n" +
                "     \"VariableId\": 149,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 150,\n" +
                "   \"VariableName\": \"Y11_Q40f\",\n" +
                "   \"VariableLabel\": \"How satisfied with health?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your health?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 690,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 691,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 692,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 693,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 694,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 695,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 696,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 697,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 698,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 150\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 699,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 150\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 164,\n" +
                "     \"VariableId\": 150,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 151,\n" +
                "   \"VariableName\": \"Y11_Q40g\",\n" +
                "   \"VariableLabel\": \"How satisfied with social life?\",\n" +
                "   \"Question\": \"How satisfied are you with: Your social life?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 700,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 701,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 702,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 703,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 704,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 705,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 706,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 707,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 708,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 151\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 709,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 151\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 165,\n" +
                "     \"VariableId\": 151,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 152,\n" +
                "   \"VariableName\": \"Y11_Q40h\",\n" +
                "   \"VariableLabel\": \"How satisfied with economic situation in the country?\",\n" +
                "   \"Question\": \"How satisfied are you with: Economic situation in [COUNTRY]?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 710,\n" +
                "     \"CategoryLabel\": \"1 - very dissatisfied\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 711,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 712,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 713,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 714,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 715,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 716,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 717,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 718,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 152\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 719,\n" +
                "     \"CategoryLabel\": \"10 - very satisfied\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 152\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 166,\n" +
                "     \"VariableId\": 152,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 153,\n" +
                "   \"VariableName\": \"Y11_Q41\",\n" +
                "   \"VariableLabel\": \"How happy are you?\",\n" +
                "   \"Question\": \"Taking all things together on a scale of 1 to 10, how happy would you say you are?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 15,\n" +
                "    \"VariableGroupValue\": \"Subjective Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 720,\n" +
                "     \"CategoryLabel\": \"1 - very unhappy\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 721,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 722,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 723,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 724,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 725,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 726,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 727,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 728,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 153\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 729,\n" +
                "     \"CategoryLabel\": \"10 - very happy\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 153\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 167,\n" +
                "     \"VariableId\": 153,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 39,\n" +
                "      \"KeywordValue\": \"Happiness\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n"  +
                "}");


        //===========================================
        variables_group.add(16,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 154,\n" +
                "   \"VariableName\": \"Y11_Q45a\",\n" +
                "   \"VariableLabel\": \"How often felt cheerful and in good spirits last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I have felt cheerful and in good spirits\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 730,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 154\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 731,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 154\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 732,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 154\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 733,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 154\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 734,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 154\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 735,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 154\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 168,\n" +
                "     \"VariableId\": 154,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 40,\n" +
                "      \"KeywordValue\": \"Emotional states\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 155,\n" +
                "   \"VariableName\": \"Y11_Q45b\",\n" +
                "   \"VariableLabel\": \"How often felt calm and relaxed last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I have felt calm and relaxed\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 736,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 155\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 737,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 155\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 738,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 155\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 739,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 155\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 740,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 155\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 741,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 155\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 169,\n" +
                "     \"VariableId\": 155,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 40,\n" +
                "      \"KeywordValue\": \"Emotional states\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 156,\n" +
                "   \"VariableName\": \"Y11_Q45c\",\n" +
                "   \"VariableLabel\": \"How often felt active and vigorous last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I have felt active and vigorous\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 742,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 156\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 743,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 156\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 744,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 156\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 745,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 156\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 746,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 156\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 747,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 156\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 170,\n" +
                "     \"VariableId\": 156,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 157,\n" +
                "   \"VariableName\": \"Y11_Q45d\",\n" +
                "   \"VariableLabel\": \"How often woke up feeling fresh and rested last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I woke up feeling fresh and rested\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 748,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 157\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 749,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 157\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 750,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 157\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 751,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 157\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 752,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 157\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 753,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 157\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 171,\n" +
                "     \"VariableId\": 157,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 158,\n" +
                "   \"VariableName\": \"Y11_Q45e\",\n" +
                "   \"VariableLabel\": \"How often felt your daily life has been filled with things that interest you last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - My daily life has been filled with things that interest me\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 754,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 158\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 755,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 158\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 756,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 158\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 757,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 158\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 758,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 158\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 759,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 158\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 172,\n" +
                "     \"VariableId\": 158,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 38,\n" +
                "      \"KeywordValue\": \"Life satisfaction\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 159,\n" +
                "   \"VariableName\": \"Y11_Q46a\",\n" +
                "   \"VariableLabel\": \"How often felt particularly tense last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I have felt particularly tense\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 760,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 159\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 761,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 159\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 762,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 159\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 763,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 159\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 764,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 159\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 765,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 159\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 173,\n" +
                "     \"VariableId\": 159,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 40,\n" +
                "      \"KeywordValue\": \"Emotional states\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 160,\n" +
                "   \"VariableName\": \"Y11_Q46b\",\n" +
                "   \"VariableLabel\": \"How often felt lonely last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I have felt lonely\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 766,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 160\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 767,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 160\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 768,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 160\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 769,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 160\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 770,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 160\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 771,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 160\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 174,\n" +
                "     \"VariableId\": 160,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 40,\n" +
                "      \"KeywordValue\": \"Emotional states\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 161,\n" +
                "   \"VariableName\": \"Y11_Q46c\",\n" +
                "   \"VariableLabel\": \"How often felt downhearted and depressed last 2 weeks?\",\n" +
                "   \"Question\": \"Which is closest to how you have been feeling over the last 2 weeks? - I have felt downhearted and depressed\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 16,\n" +
                "    \"VariableGroupValue\": \"Mental Well-Being\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 772,\n" +
                "     \"CategoryLabel\": \"All of the time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 161\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 773,\n" +
                "     \"CategoryLabel\": \"Most of the time\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 161\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 774,\n" +
                "     \"CategoryLabel\": \"More than half of the time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 161\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 775,\n" +
                "     \"CategoryLabel\": \"Less than half of the time\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 161\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 776,\n" +
                "     \"CategoryLabel\": \"Some of the time\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 161\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 777,\n" +
                "     \"CategoryLabel\": \"At no time\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 161\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 175,\n" +
                "     \"VariableId\": 161,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 40,\n" +
                "      \"KeywordValue\": \"Emotional states\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");


        //===================================================


        variables_group.add(17,"{\n" +
                " \"Variables\": [\n" +
                "  {\n" +
                "   \"VariableId\": 166,\n" +
                "   \"VariableName\": \"Y11_Q7\",\n" +
                "   \"VariableLabel\": \"How many hours work per week in 1st job?\",\n" +
                "   \"Question\": \"How many hours do you normally work per week in your main job?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 17,\n" +
                "    \"TopicValue\": \"Employment and labour – General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 881,\n" +
                "     \"CategoryLabel\": \"1\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 882,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 883,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 884,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 885,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 886,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 887,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 888,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 889,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 890,\n" +
                "     \"CategoryLabel\": \"10\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 891,\n" +
                "     \"CategoryLabel\": \"11\",\n" +
                "     \"CategoryValue\": 11,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 892,\n" +
                "     \"CategoryLabel\": \"12\",\n" +
                "     \"CategoryValue\": 12,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 893,\n" +
                "     \"CategoryLabel\": \"13\",\n" +
                "     \"CategoryValue\": 13,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 894,\n" +
                "     \"CategoryLabel\": \"14\",\n" +
                "     \"CategoryValue\": 14,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 895,\n" +
                "     \"CategoryLabel\": \"15\",\n" +
                "     \"CategoryValue\": 15,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 896,\n" +
                "     \"CategoryLabel\": \"16\",\n" +
                "     \"CategoryValue\": 16,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 897,\n" +
                "     \"CategoryLabel\": \"17\",\n" +
                "     \"CategoryValue\": 17,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 898,\n" +
                "     \"CategoryLabel\": \"18\",\n" +
                "     \"CategoryValue\": 18,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 899,\n" +
                "     \"CategoryLabel\": \"19\",\n" +
                "     \"CategoryValue\": 19,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 900,\n" +
                "     \"CategoryLabel\": \"20\",\n" +
                "     \"CategoryValue\": 20,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 901,\n" +
                "     \"CategoryLabel\": \"21\",\n" +
                "     \"CategoryValue\": 21,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 902,\n" +
                "     \"CategoryLabel\": \"22\",\n" +
                "     \"CategoryValue\": 22,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 903,\n" +
                "     \"CategoryLabel\": \"23\",\n" +
                "     \"CategoryValue\": 23,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 904,\n" +
                "     \"CategoryLabel\": \"24\",\n" +
                "     \"CategoryValue\": 24,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 905,\n" +
                "     \"CategoryLabel\": \"25\",\n" +
                "     \"CategoryValue\": 25,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 906,\n" +
                "     \"CategoryLabel\": \"26\",\n" +
                "     \"CategoryValue\": 26,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 907,\n" +
                "     \"CategoryLabel\": \"27\",\n" +
                "     \"CategoryValue\": 27,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 908,\n" +
                "     \"CategoryLabel\": \"28\",\n" +
                "     \"CategoryValue\": 28,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 909,\n" +
                "     \"CategoryLabel\": \"29\",\n" +
                "     \"CategoryValue\": 29,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 910,\n" +
                "     \"CategoryLabel\": \"30\",\n" +
                "     \"CategoryValue\": 30,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 911,\n" +
                "     \"CategoryLabel\": \"31\",\n" +
                "     \"CategoryValue\": 31,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 912,\n" +
                "     \"CategoryLabel\": \"32\",\n" +
                "     \"CategoryValue\": 32,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 913,\n" +
                "     \"CategoryLabel\": \"33\",\n" +
                "     \"CategoryValue\": 33,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 914,\n" +
                "     \"CategoryLabel\": \"34\",\n" +
                "     \"CategoryValue\": 34,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 915,\n" +
                "     \"CategoryLabel\": \"35\",\n" +
                "     \"CategoryValue\": 35,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 916,\n" +
                "     \"CategoryLabel\": \"36\",\n" +
                "     \"CategoryValue\": 36,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 917,\n" +
                "     \"CategoryLabel\": \"37\",\n" +
                "     \"CategoryValue\": 37,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 918,\n" +
                "     \"CategoryLabel\": \"38\",\n" +
                "     \"CategoryValue\": 38,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 919,\n" +
                "     \"CategoryLabel\": \"39\",\n" +
                "     \"CategoryValue\": 39,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 920,\n" +
                "     \"CategoryLabel\": \"40\",\n" +
                "     \"CategoryValue\": 40,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 921,\n" +
                "     \"CategoryLabel\": \"41\",\n" +
                "     \"CategoryValue\": 41,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 922,\n" +
                "     \"CategoryLabel\": \"42\",\n" +
                "     \"CategoryValue\": 42,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 923,\n" +
                "     \"CategoryLabel\": \"43\",\n" +
                "     \"CategoryValue\": 43,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 924,\n" +
                "     \"CategoryLabel\": \"44\",\n" +
                "     \"CategoryValue\": 44,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 925,\n" +
                "     \"CategoryLabel\": \"45\",\n" +
                "     \"CategoryValue\": 45,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 926,\n" +
                "     \"CategoryLabel\": \"46\",\n" +
                "     \"CategoryValue\": 46,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 927,\n" +
                "     \"CategoryLabel\": \"47\",\n" +
                "     \"CategoryValue\": 47,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 928,\n" +
                "     \"CategoryLabel\": \"48\",\n" +
                "     \"CategoryValue\": 48,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 929,\n" +
                "     \"CategoryLabel\": \"49\",\n" +
                "     \"CategoryValue\": 49,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 930,\n" +
                "     \"CategoryLabel\": \"50\",\n" +
                "     \"CategoryValue\": 50,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 931,\n" +
                "     \"CategoryLabel\": \"51\",\n" +
                "     \"CategoryValue\": 51,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 932,\n" +
                "     \"CategoryLabel\": \"52\",\n" +
                "     \"CategoryValue\": 52,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 933,\n" +
                "     \"CategoryLabel\": \"53\",\n" +
                "     \"CategoryValue\": 53,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 934,\n" +
                "     \"CategoryLabel\": \"54\",\n" +
                "     \"CategoryValue\": 54,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 935,\n" +
                "     \"CategoryLabel\": \"55\",\n" +
                "     \"CategoryValue\": 55,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 936,\n" +
                "     \"CategoryLabel\": \"56\",\n" +
                "     \"CategoryValue\": 56,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 937,\n" +
                "     \"CategoryLabel\": \"57\",\n" +
                "     \"CategoryValue\": 57,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 938,\n" +
                "     \"CategoryLabel\": \"58\",\n" +
                "     \"CategoryValue\": 58,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 939,\n" +
                "     \"CategoryLabel\": \"59\",\n" +
                "     \"CategoryValue\": 59,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 940,\n" +
                "     \"CategoryLabel\": \"60\",\n" +
                "     \"CategoryValue\": 60,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 941,\n" +
                "     \"CategoryLabel\": \"61\",\n" +
                "     \"CategoryValue\": 61,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 942,\n" +
                "     \"CategoryLabel\": \"62\",\n" +
                "     \"CategoryValue\": 62,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 943,\n" +
                "     \"CategoryLabel\": \"63\",\n" +
                "     \"CategoryValue\": 63,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 944,\n" +
                "     \"CategoryLabel\": \"64\",\n" +
                "     \"CategoryValue\": 64,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 945,\n" +
                "     \"CategoryLabel\": \"65\",\n" +
                "     \"CategoryValue\": 65,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 946,\n" +
                "     \"CategoryLabel\": \"66\",\n" +
                "     \"CategoryValue\": 66,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 947,\n" +
                "     \"CategoryLabel\": \"67\",\n" +
                "     \"CategoryValue\": 67,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 948,\n" +
                "     \"CategoryLabel\": \"68\",\n" +
                "     \"CategoryValue\": 68,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 949,\n" +
                "     \"CategoryLabel\": \"69\",\n" +
                "     \"CategoryValue\": 69,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 950,\n" +
                "     \"CategoryLabel\": \"70\",\n" +
                "     \"CategoryValue\": 70,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 951,\n" +
                "     \"CategoryLabel\": \"71\",\n" +
                "     \"CategoryValue\": 71,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 952,\n" +
                "     \"CategoryLabel\": \"72\",\n" +
                "     \"CategoryValue\": 72,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 953,\n" +
                "     \"CategoryLabel\": \"73\",\n" +
                "     \"CategoryValue\": 73,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 954,\n" +
                "     \"CategoryLabel\": \"74\",\n" +
                "     \"CategoryValue\": 74,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 955,\n" +
                "     \"CategoryLabel\": \"75\",\n" +
                "     \"CategoryValue\": 75,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 956,\n" +
                "     \"CategoryLabel\": \"76\",\n" +
                "     \"CategoryValue\": 76,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 957,\n" +
                "     \"CategoryLabel\": \"77\",\n" +
                "     \"CategoryValue\": 77,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 958,\n" +
                "     \"CategoryLabel\": \"78\",\n" +
                "     \"CategoryValue\": 78,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 959,\n" +
                "     \"CategoryLabel\": \"79\",\n" +
                "     \"CategoryValue\": 79,\n" +
                "     \"VariableId\": 166\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 960,\n" +
                "     \"CategoryLabel\": \"80 hrs or more\",\n" +
                "     \"CategoryValue\": 80,\n" +
                "     \"VariableId\": 166\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 177,\n" +
                "     \"VariableId\": 166,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 167,\n" +
                "   \"VariableName\": \"Y11_Q8\",\n" +
                "   \"VariableLabel\": \"How many hours per week would you prefer to work at present?\",\n" +
                "   \"Question\": \"How many hours per week would you prefer to work at present?\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 17,\n" +
                "    \"TopicValue\": \"Employment and labour – General\"\n" +
                "   },\n" +
                "   \"Categories\": [],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 178,\n" +
                "     \"VariableId\": 167,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 168,\n" +
                "   \"VariableName\": \"Y11_Q9\",\n" +
                "   \"VariableLabel\": \"How many hours does your partner work per week?\",\n" +
                "   \"Question\": \"How many hours does your partner normally work per week?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 17,\n" +
                "    \"TopicValue\": \"Employment and labour – General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 1101,\n" +
                "     \"CategoryLabel\": \"1\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1102,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1103,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1104,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1105,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1106,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1107,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1108,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1109,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1110,\n" +
                "     \"CategoryLabel\": \"10\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1111,\n" +
                "     \"CategoryLabel\": \"11\",\n" +
                "     \"CategoryValue\": 11,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1112,\n" +
                "     \"CategoryLabel\": \"12\",\n" +
                "     \"CategoryValue\": 12,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1113,\n" +
                "     \"CategoryLabel\": \"13\",\n" +
                "     \"CategoryValue\": 13,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1114,\n" +
                "     \"CategoryLabel\": \"14\",\n" +
                "     \"CategoryValue\": 14,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1115,\n" +
                "     \"CategoryLabel\": \"15\",\n" +
                "     \"CategoryValue\": 15,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1116,\n" +
                "     \"CategoryLabel\": \"16\",\n" +
                "     \"CategoryValue\": 16,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1117,\n" +
                "     \"CategoryLabel\": \"17\",\n" +
                "     \"CategoryValue\": 17,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1118,\n" +
                "     \"CategoryLabel\": \"18\",\n" +
                "     \"CategoryValue\": 18,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1119,\n" +
                "     \"CategoryLabel\": \"19\",\n" +
                "     \"CategoryValue\": 19,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1120,\n" +
                "     \"CategoryLabel\": \"20\",\n" +
                "     \"CategoryValue\": 20,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1121,\n" +
                "     \"CategoryLabel\": \"21\",\n" +
                "     \"CategoryValue\": 21,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1122,\n" +
                "     \"CategoryLabel\": \"22\",\n" +
                "     \"CategoryValue\": 22,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1123,\n" +
                "     \"CategoryLabel\": \"23\",\n" +
                "     \"CategoryValue\": 23,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1124,\n" +
                "     \"CategoryLabel\": \"24\",\n" +
                "     \"CategoryValue\": 24,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1125,\n" +
                "     \"CategoryLabel\": \"25\",\n" +
                "     \"CategoryValue\": 25,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1126,\n" +
                "     \"CategoryLabel\": \"26\",\n" +
                "     \"CategoryValue\": 26,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1127,\n" +
                "     \"CategoryLabel\": \"27\",\n" +
                "     \"CategoryValue\": 27,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1128,\n" +
                "     \"CategoryLabel\": \"28\",\n" +
                "     \"CategoryValue\": 28,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1129,\n" +
                "     \"CategoryLabel\": \"29\",\n" +
                "     \"CategoryValue\": 29,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1130,\n" +
                "     \"CategoryLabel\": \"30\",\n" +
                "     \"CategoryValue\": 30,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1131,\n" +
                "     \"CategoryLabel\": \"31\",\n" +
                "     \"CategoryValue\": 31,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1132,\n" +
                "     \"CategoryLabel\": \"32\",\n" +
                "     \"CategoryValue\": 32,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1133,\n" +
                "     \"CategoryLabel\": \"33\",\n" +
                "     \"CategoryValue\": 33,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1134,\n" +
                "     \"CategoryLabel\": \"34\",\n" +
                "     \"CategoryValue\": 34,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1135,\n" +
                "     \"CategoryLabel\": \"35\",\n" +
                "     \"CategoryValue\": 35,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1136,\n" +
                "     \"CategoryLabel\": \"36\",\n" +
                "     \"CategoryValue\": 36,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1137,\n" +
                "     \"CategoryLabel\": \"37\",\n" +
                "     \"CategoryValue\": 37,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1138,\n" +
                "     \"CategoryLabel\": \"38\",\n" +
                "     \"CategoryValue\": 38,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1139,\n" +
                "     \"CategoryLabel\": \"39\",\n" +
                "     \"CategoryValue\": 39,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1140,\n" +
                "     \"CategoryLabel\": \"40\",\n" +
                "     \"CategoryValue\": 40,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1141,\n" +
                "     \"CategoryLabel\": \"41\",\n" +
                "     \"CategoryValue\": 41,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1142,\n" +
                "     \"CategoryLabel\": \"42\",\n" +
                "     \"CategoryValue\": 42,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1143,\n" +
                "     \"CategoryLabel\": \"43\",\n" +
                "     \"CategoryValue\": 43,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1144,\n" +
                "     \"CategoryLabel\": \"44\",\n" +
                "     \"CategoryValue\": 44,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1145,\n" +
                "     \"CategoryLabel\": \"45\",\n" +
                "     \"CategoryValue\": 45,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1146,\n" +
                "     \"CategoryLabel\": \"46\",\n" +
                "     \"CategoryValue\": 46,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1147,\n" +
                "     \"CategoryLabel\": \"47\",\n" +
                "     \"CategoryValue\": 47,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1148,\n" +
                "     \"CategoryLabel\": \"48\",\n" +
                "     \"CategoryValue\": 48,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1149,\n" +
                "     \"CategoryLabel\": \"49\",\n" +
                "     \"CategoryValue\": 49,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1150,\n" +
                "     \"CategoryLabel\": \"50\",\n" +
                "     \"CategoryValue\": 50,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1151,\n" +
                "     \"CategoryLabel\": \"51\",\n" +
                "     \"CategoryValue\": 51,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1152,\n" +
                "     \"CategoryLabel\": \"52\",\n" +
                "     \"CategoryValue\": 52,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1153,\n" +
                "     \"CategoryLabel\": \"53\",\n" +
                "     \"CategoryValue\": 53,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1154,\n" +
                "     \"CategoryLabel\": \"54\",\n" +
                "     \"CategoryValue\": 54,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1155,\n" +
                "     \"CategoryLabel\": \"55\",\n" +
                "     \"CategoryValue\": 55,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1156,\n" +
                "     \"CategoryLabel\": \"56\",\n" +
                "     \"CategoryValue\": 56,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1157,\n" +
                "     \"CategoryLabel\": \"57\",\n" +
                "     \"CategoryValue\": 57,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1158,\n" +
                "     \"CategoryLabel\": \"58\",\n" +
                "     \"CategoryValue\": 58,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1159,\n" +
                "     \"CategoryLabel\": \"59\",\n" +
                "     \"CategoryValue\": 59,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1160,\n" +
                "     \"CategoryLabel\": \"60\",\n" +
                "     \"CategoryValue\": 60,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1161,\n" +
                "     \"CategoryLabel\": \"61\",\n" +
                "     \"CategoryValue\": 61,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1162,\n" +
                "     \"CategoryLabel\": \"62\",\n" +
                "     \"CategoryValue\": 62,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1163,\n" +
                "     \"CategoryLabel\": \"63\",\n" +
                "     \"CategoryValue\": 63,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1164,\n" +
                "     \"CategoryLabel\": \"64\",\n" +
                "     \"CategoryValue\": 64,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1165,\n" +
                "     \"CategoryLabel\": \"65\",\n" +
                "     \"CategoryValue\": 65,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1166,\n" +
                "     \"CategoryLabel\": \"66\",\n" +
                "     \"CategoryValue\": 66,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1167,\n" +
                "     \"CategoryLabel\": \"67\",\n" +
                "     \"CategoryValue\": 67,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1168,\n" +
                "     \"CategoryLabel\": \"68\",\n" +
                "     \"CategoryValue\": 68,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1169,\n" +
                "     \"CategoryLabel\": \"69\",\n" +
                "     \"CategoryValue\": 69,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1170,\n" +
                "     \"CategoryLabel\": \"70\",\n" +
                "     \"CategoryValue\": 70,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1171,\n" +
                "     \"CategoryLabel\": \"71\",\n" +
                "     \"CategoryValue\": 71,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1172,\n" +
                "     \"CategoryLabel\": \"72\",\n" +
                "     \"CategoryValue\": 72,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1173,\n" +
                "     \"CategoryLabel\": \"73\",\n" +
                "     \"CategoryValue\": 73,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1174,\n" +
                "     \"CategoryLabel\": \"74\",\n" +
                "     \"CategoryValue\": 74,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1175,\n" +
                "     \"CategoryLabel\": \"75\",\n" +
                "     \"CategoryValue\": 75,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1176,\n" +
                "     \"CategoryLabel\": \"76\",\n" +
                "     \"CategoryValue\": 76,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1177,\n" +
                "     \"CategoryLabel\": \"77\",\n" +
                "     \"CategoryValue\": 77,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1178,\n" +
                "     \"CategoryLabel\": \"78\",\n" +
                "     \"CategoryValue\": 78,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1179,\n" +
                "     \"CategoryLabel\": \"79\",\n" +
                "     \"CategoryValue\": 79,\n" +
                "     \"VariableId\": 168\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1180,\n" +
                "     \"CategoryLabel\": \"80 hrs or more\",\n" +
                "     \"CategoryValue\": 80,\n" +
                "     \"VariableId\": 168\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 179,\n" +
                "     \"VariableId\": 168,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 169,\n" +
                "   \"VariableName\": \"Y11_Q10\",\n" +
                "   \"VariableLabel\": \"How many hours per week would you prefer your partner to work?\",\n" +
                "   \"Question\": \"How many hours per week would you prefer your partner to work?\",\n" +
                "   \"VariableType\": \"numeric\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 17,\n" +
                "    \"TopicValue\": \"Employment and labour – General\"\n" +
                "   },\n" +
                "   \"Categories\": [],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 180,\n" +
                "     \"VariableId\": 169,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 170,\n" +
                "   \"VariableName\": \"Y11_Q11\",\n" +
                "   \"VariableLabel\": \"Working hours fit with family/social commitments?\",\n" +
                "   \"Question\": \"Do your working hours fit in with your family or social commitments outside work?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 17,\n" +
                "    \"TopicValue\": \"Employment and labour – General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 778,\n" +
                "     \"CategoryLabel\": \"Very well\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 170\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 779,\n" +
                "     \"CategoryLabel\": \"Fairly well\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 170\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 780,\n" +
                "     \"CategoryLabel\": \"Not very well\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 170\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 781,\n" +
                "     \"CategoryLabel\": \"Not at all well\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 170\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 181,\n" +
                "     \"VariableId\": 170,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 171,\n" +
                "   \"VariableName\": \"Y11_Q12a\",\n" +
                "   \"VariableLabel\": \"Come home from work too tired to do some of the household jobs\",\n" +
                "   \"Question\": \"I have come home from work too tired to do some of the household jobs which need to be done\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 782,\n" +
                "     \"CategoryLabel\": \"Several times a week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 171\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 783,\n" +
                "     \"CategoryLabel\": \"Several times a month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 171\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 784,\n" +
                "     \"CategoryLabel\": \"Several times a year\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 171\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 785,\n" +
                "     \"CategoryLabel\": \"Less often/rarely\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 171\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 786,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 171\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 182,\n" +
                "     \"VariableId\": 171,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 172,\n" +
                "   \"VariableName\": \"Y11_Q12b\",\n" +
                "   \"VariableLabel\": \"Difficult to fulfil family responsibilities because of the time at work\",\n" +
                "   \"Question\": \"It has been difficult for me to fulfil my family responsibilities because of the amount of time I spend on the job\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 787,\n" +
                "     \"CategoryLabel\": \"Several times a week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 172\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 788,\n" +
                "     \"CategoryLabel\": \"Several times a month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 172\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 789,\n" +
                "     \"CategoryLabel\": \"Several times a year\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 172\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 790,\n" +
                "     \"CategoryLabel\": \"Less often/rarely\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 172\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 791,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 172\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 183,\n" +
                "     \"VariableId\": 172,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 173,\n" +
                "   \"VariableName\": \"Y11_Q12c\",\n" +
                "   \"VariableLabel\": \"Difficult to concentrate at work because of family responsibilities\",\n" +
                "   \"Question\": \"I have found it difficult to concentrate at work because of my family responsibilities\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 792,\n" +
                "     \"CategoryLabel\": \"Several times a week\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 173\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 793,\n" +
                "     \"CategoryLabel\": \"Several times a month\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 173\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 794,\n" +
                "     \"CategoryLabel\": \"Several times a year\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 173\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 795,\n" +
                "     \"CategoryLabel\": \"Less often/rarely\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 173\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 796,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 173\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 184,\n" +
                "     \"VariableId\": 173,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 174,\n" +
                "   \"VariableName\": \"Y11_Q15\",\n" +
                "   \"VariableLabel\": \"How likely to lose job in 6 months?\",\n" +
                "   \"Question\": \"How likely do you think is it that you might lose your job in the next 6 months?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 797,\n" +
                "     \"CategoryLabel\": \"Very likely\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 174\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 798,\n" +
                "     \"CategoryLabel\": \"Quite likely\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 174\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 799,\n" +
                "     \"CategoryLabel\": \"Neither likely nor unlikely\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 174\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 800,\n" +
                "     \"CategoryLabel\": \"Quite unlikely\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 174\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 801,\n" +
                "     \"CategoryLabel\": \"Very unlikely\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 174\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 185,\n" +
                "     \"VariableId\": 174,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 175,\n" +
                "   \"VariableName\": \"Y11_Q16\",\n" +
                "   \"VariableLabel\": \"How likely to find another job of similar salary?\",\n" +
                "   \"Question\": \"If you were to lose/quit your current job, how likely it is that you will find a job of similar salary?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": true,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 802,\n" +
                "     \"CategoryLabel\": \"Very likely\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 175\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 803,\n" +
                "     \"CategoryLabel\": \"Quite likely\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 175\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 804,\n" +
                "     \"CategoryLabel\": \"Neither likely nor unlikely\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 175\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 805,\n" +
                "     \"CategoryLabel\": \"Quite unlikely\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 175\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 806,\n" +
                "     \"CategoryLabel\": \"Very unlikely\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 175\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 186,\n" +
                "     \"VariableId\": 175,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 41,\n" +
                "      \"KeywordValue\": \"Work-life balance\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 176,\n" +
                "   \"VariableName\": \"Y11_Q36a\",\n" +
                "   \"VariableLabel\": \"How often care for your children?\",\n" +
                "   \"Question\": \"How often are you involved in activity outside of work? - Caring for your children\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 807,\n" +
                "     \"CategoryLabel\": \"Every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 176\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 808,\n" +
                "     \"CategoryLabel\": \"Several days a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 176\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 809,\n" +
                "     \"CategoryLabel\": \"Once or twice a week\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 176\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 810,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 176\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 811,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 176\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 187,\n" +
                "     \"VariableId\": 176,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 42,\n" +
                "      \"KeywordValue\": \"Care of dependants\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 177,\n" +
                "   \"VariableName\": \"Y11_Q36b\",\n" +
                "   \"VariableLabel\": \"How often cook and doing housework?\",\n" +
                "   \"Question\": \"How often are you involved in activity outside of work? - Cooking and/or housework\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 812,\n" +
                "     \"CategoryLabel\": \"Every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 177\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 813,\n" +
                "     \"CategoryLabel\": \"Several days a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 177\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 814,\n" +
                "     \"CategoryLabel\": \"Once or twice a week\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 177\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 815,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 177\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 816,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 177\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 188,\n" +
                "     \"VariableId\": 177,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 43,\n" +
                "      \"KeywordValue\": \"Domestic responsibilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 178,\n" +
                "   \"VariableName\": \"Y11_Q36c\",\n" +
                "   \"VariableLabel\": \"How often care for elderly or disabled relatives?\",\n" +
                "   \"Question\": \"How often are you involved in activity outside of work? - Caring for elderly or disabled relatives\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 817,\n" +
                "     \"CategoryLabel\": \"Every day\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 178\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 818,\n" +
                "     \"CategoryLabel\": \"Several days a week\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 178\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 819,\n" +
                "     \"CategoryLabel\": \"Once or twice a week\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 178\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 820,\n" +
                "     \"CategoryLabel\": \"Less often\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 178\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 821,\n" +
                "     \"CategoryLabel\": \"Never\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 178\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 189,\n" +
                "     \"VariableId\": 178,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 42,\n" +
                "      \"KeywordValue\": \"Care of dependants\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 179,\n" +
                "   \"VariableName\": \"Y11_Q38\",\n" +
                "   \"VariableLabel\": \"The share of housework you do is…\",\n" +
                "   \"Question\": \"Do you think that the share of housework you do is…\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 822,\n" +
                "     \"CategoryLabel\": \"More than your fair share\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 179\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 823,\n" +
                "     \"CategoryLabel\": \"Just about your fair share\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 179\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 824,\n" +
                "     \"CategoryLabel\": \"Less than your fair share\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 179\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 190,\n" +
                "     \"VariableId\": 179,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 43,\n" +
                "      \"KeywordValue\": \"Domestic responsibilities\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 180,\n" +
                "   \"VariableName\": \"Y11_Q39a\",\n" +
                "   \"VariableLabel\": \"As much time as would like with family members?\",\n" +
                "   \"Question\": \"Do you spend as much time as you would like? - Contact with family members living in this hhld or elsewhere\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 825,\n" +
                "     \"CategoryLabel\": \"Spend less time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 180\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 826,\n" +
                "     \"CategoryLabel\": \"As much as I currently do\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 180\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 827,\n" +
                "     \"CategoryLabel\": \"Spend more time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 180\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 191,\n" +
                "     \"VariableId\": 180,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 14,\n" +
                "      \"KeywordValue\": \"Family life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 181,\n" +
                "   \"VariableName\": \"Y11_Q39b\",\n" +
                "   \"VariableLabel\": \"As much time as would like with others (not family)?\",\n" +
                "   \"Question\": \"Do you spend as much time as you would like? - Other social contact (not family)\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 828,\n" +
                "     \"CategoryLabel\": \"Spend less time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 181\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 829,\n" +
                "     \"CategoryLabel\": \"As much as I currently do\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 181\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 830,\n" +
                "     \"CategoryLabel\": \"Spend more time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 181\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 192,\n" +
                "     \"VariableId\": 181,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 44,\n" +
                "      \"KeywordValue\": \"Social life\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 182,\n" +
                "   \"VariableName\": \"Y11_Q39c\",\n" +
                "   \"VariableLabel\": \"As much time as would like on own hobbies/interests?\",\n" +
                "   \"Question\": \"Do you spend as much time as you would like? - Own hobbies/interests\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 831,\n" +
                "     \"CategoryLabel\": \"Spend less time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 182\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 832,\n" +
                "     \"CategoryLabel\": \"As much as I currently do\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 182\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 833,\n" +
                "     \"CategoryLabel\": \"Spend more time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 182\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 193,\n" +
                "     \"VariableId\": 182,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 45,\n" +
                "      \"KeywordValue\": \"Hobbies\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 183,\n" +
                "   \"VariableName\": \"Y11_Q39d\",\n" +
                "   \"VariableLabel\": \"As much time as would like on voluntary work?\",\n" +
                "   \"Question\": \"Do you spend as much time as you would like? - Voluntary work\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 16,\n" +
                "    \"TopicValue\": \"Society and culture - Social indicators and quality of life\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 834,\n" +
                "     \"CategoryLabel\": \"Spend less time\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 183\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 835,\n" +
                "     \"CategoryLabel\": \"As much as I currently do\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 183\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 836,\n" +
                "     \"CategoryLabel\": \"Spend more time\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 183\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 194,\n" +
                "     \"VariableId\": 183,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 32,\n" +
                "      \"KeywordValue\": \"Voluntary work\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 185,\n" +
                "   \"VariableName\": \"Y11_Q7a\",\n" +
                "   \"VariableLabel\": \"Worked at an additional paid job last 4 weeks?\",\n" +
                "   \"Question\": \"Have you also worked at an additional paid job during the past four weeks?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 8,\n" +
                "    \"TopicValue\": \"Employment and labour - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 840,\n" +
                "     \"CategoryLabel\": \"Yes\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 185\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 841,\n" +
                "     \"CategoryLabel\": \"No\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 185\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 196,\n" +
                "     \"VariableId\": 185,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 46,\n" +
                "      \"KeywordValue\": \"Employment\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  },\n" +
                "  {\n" +
                "   \"VariableId\": 186,\n" +
                "   \"VariableName\": \"Y11_Q7b\",\n" +
                "   \"VariableLabel\": \"How many hours per week worked in the additional job?\",\n" +
                "   \"Question\": \"About how many hours per week did you work in this additional job?\",\n" +
                "   \"VariableType\": \"categorical\",\n" +
                "   \"IsMeanAllowed\": false,\n" +
                "   \"DatasetId\": 2,\n" +
                "   \"VariableGroup\": {\n" +
                "    \"VariableGroupId\": 17,\n" +
                "    \"VariableGroupValue\": \"Employment and Work-Life Balance\"\n" +
                "   },\n" +
                "   \"Topic\": {\n" +
                "    \"TopicId\": 8,\n" +
                "    \"TopicValue\": \"Employment and labour - General\"\n" +
                "   },\n" +
                "   \"Categories\": [\n" +
                "    {\n" +
                "     \"CategoryId\": 961,\n" +
                "     \"CategoryLabel\": \"1\",\n" +
                "     \"CategoryValue\": 1,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 962,\n" +
                "     \"CategoryLabel\": \"2\",\n" +
                "     \"CategoryValue\": 2,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 963,\n" +
                "     \"CategoryLabel\": \"3\",\n" +
                "     \"CategoryValue\": 3,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 964,\n" +
                "     \"CategoryLabel\": \"4\",\n" +
                "     \"CategoryValue\": 4,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 965,\n" +
                "     \"CategoryLabel\": \"5\",\n" +
                "     \"CategoryValue\": 5,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 966,\n" +
                "     \"CategoryLabel\": \"6\",\n" +
                "     \"CategoryValue\": 6,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 967,\n" +
                "     \"CategoryLabel\": \"7\",\n" +
                "     \"CategoryValue\": 7,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 968,\n" +
                "     \"CategoryLabel\": \"8\",\n" +
                "     \"CategoryValue\": 8,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 969,\n" +
                "     \"CategoryLabel\": \"9\",\n" +
                "     \"CategoryValue\": 9,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 970,\n" +
                "     \"CategoryLabel\": \"10\",\n" +
                "     \"CategoryValue\": 10,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 971,\n" +
                "     \"CategoryLabel\": \"11\",\n" +
                "     \"CategoryValue\": 11,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 972,\n" +
                "     \"CategoryLabel\": \"12\",\n" +
                "     \"CategoryValue\": 12,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 973,\n" +
                "     \"CategoryLabel\": \"13\",\n" +
                "     \"CategoryValue\": 13,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 974,\n" +
                "     \"CategoryLabel\": \"14\",\n" +
                "     \"CategoryValue\": 14,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 975,\n" +
                "     \"CategoryLabel\": \"15\",\n" +
                "     \"CategoryValue\": 15,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 976,\n" +
                "     \"CategoryLabel\": \"16\",\n" +
                "     \"CategoryValue\": 16,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 977,\n" +
                "     \"CategoryLabel\": \"17\",\n" +
                "     \"CategoryValue\": 17,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 978,\n" +
                "     \"CategoryLabel\": \"18\",\n" +
                "     \"CategoryValue\": 18,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 979,\n" +
                "     \"CategoryLabel\": \"19\",\n" +
                "     \"CategoryValue\": 19,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 980,\n" +
                "     \"CategoryLabel\": \"20\",\n" +
                "     \"CategoryValue\": 20,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 981,\n" +
                "     \"CategoryLabel\": \"21\",\n" +
                "     \"CategoryValue\": 21,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 982,\n" +
                "     \"CategoryLabel\": \"22\",\n" +
                "     \"CategoryValue\": 22,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 983,\n" +
                "     \"CategoryLabel\": \"23\",\n" +
                "     \"CategoryValue\": 23,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 984,\n" +
                "     \"CategoryLabel\": \"24\",\n" +
                "     \"CategoryValue\": 24,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 985,\n" +
                "     \"CategoryLabel\": \"25\",\n" +
                "     \"CategoryValue\": 25,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 986,\n" +
                "     \"CategoryLabel\": \"26\",\n" +
                "     \"CategoryValue\": 26,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 987,\n" +
                "     \"CategoryLabel\": \"27\",\n" +
                "     \"CategoryValue\": 27,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 988,\n" +
                "     \"CategoryLabel\": \"28\",\n" +
                "     \"CategoryValue\": 28,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 989,\n" +
                "     \"CategoryLabel\": \"29\",\n" +
                "     \"CategoryValue\": 29,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 990,\n" +
                "     \"CategoryLabel\": \"30\",\n" +
                "     \"CategoryValue\": 30,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 991,\n" +
                "     \"CategoryLabel\": \"31\",\n" +
                "     \"CategoryValue\": 31,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 992,\n" +
                "     \"CategoryLabel\": \"32\",\n" +
                "     \"CategoryValue\": 32,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 993,\n" +
                "     \"CategoryLabel\": \"33\",\n" +
                "     \"CategoryValue\": 33,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 994,\n" +
                "     \"CategoryLabel\": \"34\",\n" +
                "     \"CategoryValue\": 34,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 995,\n" +
                "     \"CategoryLabel\": \"35\",\n" +
                "     \"CategoryValue\": 35,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 996,\n" +
                "     \"CategoryLabel\": \"36\",\n" +
                "     \"CategoryValue\": 36,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 997,\n" +
                "     \"CategoryLabel\": \"37\",\n" +
                "     \"CategoryValue\": 37,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 998,\n" +
                "     \"CategoryLabel\": \"38\",\n" +
                "     \"CategoryValue\": 38,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 999,\n" +
                "     \"CategoryLabel\": \"39\",\n" +
                "     \"CategoryValue\": 39,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1000,\n" +
                "     \"CategoryLabel\": \"40\",\n" +
                "     \"CategoryValue\": 40,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1001,\n" +
                "     \"CategoryLabel\": \"41\",\n" +
                "     \"CategoryValue\": 41,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1002,\n" +
                "     \"CategoryLabel\": \"42\",\n" +
                "     \"CategoryValue\": 42,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1003,\n" +
                "     \"CategoryLabel\": \"43\",\n" +
                "     \"CategoryValue\": 43,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1004,\n" +
                "     \"CategoryLabel\": \"44\",\n" +
                "     \"CategoryValue\": 44,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1005,\n" +
                "     \"CategoryLabel\": \"45\",\n" +
                "     \"CategoryValue\": 45,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1006,\n" +
                "     \"CategoryLabel\": \"46\",\n" +
                "     \"CategoryValue\": 46,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1007,\n" +
                "     \"CategoryLabel\": \"47\",\n" +
                "     \"CategoryValue\": 47,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1008,\n" +
                "     \"CategoryLabel\": \"48\",\n" +
                "     \"CategoryValue\": 48,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1009,\n" +
                "     \"CategoryLabel\": \"49\",\n" +
                "     \"CategoryValue\": 49,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1010,\n" +
                "     \"CategoryLabel\": \"50\",\n" +
                "     \"CategoryValue\": 50,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1011,\n" +
                "     \"CategoryLabel\": \"51\",\n" +
                "     \"CategoryValue\": 51,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1012,\n" +
                "     \"CategoryLabel\": \"52\",\n" +
                "     \"CategoryValue\": 52,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1013,\n" +
                "     \"CategoryLabel\": \"53\",\n" +
                "     \"CategoryValue\": 53,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1014,\n" +
                "     \"CategoryLabel\": \"54\",\n" +
                "     \"CategoryValue\": 54,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1015,\n" +
                "     \"CategoryLabel\": \"55\",\n" +
                "     \"CategoryValue\": 55,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1016,\n" +
                "     \"CategoryLabel\": \"56\",\n" +
                "     \"CategoryValue\": 56,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1017,\n" +
                "     \"CategoryLabel\": \"57\",\n" +
                "     \"CategoryValue\": 57,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1018,\n" +
                "     \"CategoryLabel\": \"58\",\n" +
                "     \"CategoryValue\": 58,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1019,\n" +
                "     \"CategoryLabel\": \"59\",\n" +
                "     \"CategoryValue\": 59,\n" +
                "     \"VariableId\": 186\n" +
                "    },\n" +
                "    {\n" +
                "     \"CategoryId\": 1020,\n" +
                "     \"CategoryLabel\": \"60 hrs or more\",\n" +
                "     \"CategoryValue\": 60,\n" +
                "     \"VariableId\": 186\n" +
                "    }\n" +
                "   ],\n" +
                "   \"VariableKeywords\": [\n" +
                "    {\n" +
                "     \"VariableKeywordsId\": 197,\n" +
                "     \"VariableId\": 186,\n" +
                "     \"Keyword\": {\n" +
                "      \"KeywordId\": 46,\n" +
                "      \"KeywordValue\": \"Employment\"\n" +
                "     }\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n"  +
                "}");
    }

}
