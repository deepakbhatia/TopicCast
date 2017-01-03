package com.optimalcities.topiccast;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by obelix on 19/09/2015.
 */
public class CountrySQLite extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Country.db";
    public static final String CONTACTS_TABLE_NAME = "country";
    public static final String CONTACTS_COLUMN_CATEGORY_ID = "category_id";
    public static final String CONTACTS_COLUMN_VARIABLE_ID = "variable_id";
    public static final String CONTACTS_COLUMN_CATEGORY_LABEL = "category_label";
    public static final String CONTACTS_COLUMN_CATEGORY_VALUE = "category_value";


    public CountrySQLite(Context context)
    {
        super(context, DATABASE_NAME, null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table " + CONTACTS_TABLE_NAME + " " +
                        "(id integer primary key," +
                        CONTACTS_COLUMN_CATEGORY_ID + "," +
                        CONTACTS_COLUMN_VARIABLE_ID + "," +
                        CONTACTS_COLUMN_CATEGORY_LABEL + "," +
                        CONTACTS_COLUMN_CATEGORY_VALUE + ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean insertCountry  (String category_id, String variable_id, String category_label, String category_value)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CONTACTS_COLUMN_CATEGORY_ID, category_id);
        contentValues.put(CONTACTS_COLUMN_VARIABLE_ID, variable_id);
        contentValues.put(CONTACTS_COLUMN_CATEGORY_LABEL, category_label);
        contentValues.put(CONTACTS_COLUMN_CATEGORY_VALUE, category_value);
        if(category_value.equals("3"))
        {
            long val = db.insert(CONTACTS_TABLE_NAME, null, contentValues);

            Log.d("SQLSTAT",category_id +":" + variable_id + "=" + category_label + ":"+category_value+"===="+val);

        }
        return true;
    }

    public String getData(String category_value){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.query(CONTACTS_TABLE_NAME, new String[]{CONTACTS_COLUMN_CATEGORY_LABEL}, CONTACTS_COLUMN_CATEGORY_VALUE + "=?", new String[]{category_value}, null, null, null);

        String selectQuery = "SELECT  * FROM " + CONTACTS_TABLE_NAME;

        //res = db.rawQuery(selectQuery,null);
        Log.d("SQLSTAT","select * " + "from "+ CONTACTS_TABLE_NAME +" where " + CONTACTS_COLUMN_CATEGORY_VALUE + " = " + category_value + ":");
        if (res != null)
        {
            res.moveToFirst();
            String countryName = res.getString(res.getColumnIndex(CONTACTS_COLUMN_CATEGORY_LABEL));
            return countryName;
        }

        return null;
    }
}
