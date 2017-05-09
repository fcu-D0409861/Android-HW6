package com.example.bluesky.android_hw6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bluesky on 2017/5/8.
 */

public class NoteDataBase extends SQLiteOpenHelper {

    // DataBase名稱
    String DATABASE_TABLE_NAME;
    // Table標題
    String TABLE_TITLE;
    // Create a new table
    final String DATABASE_CREAT = "create table " + DATABASE_TABLE_NAME+TABLE_TITLE;

    public NoteDataBase (Context context)
    {
        super(context,"Note.db",null,1);
        DATABASE_TABLE_NAME = null;
        TABLE_TITLE = null;
    }
    private void setTalbe(String tablename,String title)
    {
        DATABASE_TABLE_NAME = tablename;    // set table name
        TABLE_TITLE = title;                    //set table title. Ex:(String ,String ,Stiring);
                                                            //分號也要
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        if(DATABASE_TABLE_NAME == null || TABLE_TITLE == null)
            setTalbe(DATABASE_TABLE_NAME,TABLE_TITLE);
        db.execSQL(DATABASE_CREAT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
