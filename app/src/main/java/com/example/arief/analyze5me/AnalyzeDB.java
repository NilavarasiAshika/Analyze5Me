package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 2/7/2017.
 */
public class AnalyzeDB extends SQLiteOpenHelper {
    private int id;

    public AnalyzeDB(Context context) {
        super(context,"AnaDB",null,1);
    }





    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table studenttable(r integer primary key, name text,dept text,pass text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists studenttable");
        onCreate(db);

    }
    public void insertstu(int roll,String name,String dept,String  pass)
    {
        SQLiteDatabase obj =getWritableDatabase();
        obj.execSQL("insert into studenttable values(" + roll + ",'" + name + "','" + dept + "','" + pass + "')");
    }
    public boolean checkstudata(int r,String pa) {
        SQLiteDatabase obj2 = getWritableDatabase();
        Cursor cr = obj2.rawQuery("select r,pass from studenttable where r=" + r + " and pass='" + pa + "'", null);
        if (cr.moveToNext()) {
            return true;
        } else
            return false;
    }

}


