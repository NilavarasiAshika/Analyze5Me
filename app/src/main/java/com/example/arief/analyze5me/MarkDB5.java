package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 3/26/2017.
 */
public class MarkDB5 extends SQLiteOpenHelper {
    public MarkDB5(Context context) {

        super(context, "super", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mark5(mark integer,roll integer,sid integer,code text,topic text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists mark5");

    }

    public void insertmark2(int mark, int roll, int sid, String code, String topic) {
        SQLiteDatabase obj = getWritableDatabase();
        obj.execSQL("insert into mark5 values(" + mark + "," + roll + "," + sid + ",'" + code + "','" + topic + "')");
    }

    public Cursor marks2(int sid, String topic) {
        SQLiteDatabase db = getWritableDatabase();
        String selectQuery1 = "SELECT mark FROM mark5 where topic='" + topic + "' and sid=" + sid + "";
        Cursor cus = db.rawQuery(selectQuery1, null);
        return cus;
    }

    public Cursor markssum2(int sid, String code) {
        SQLiteDatabase db = getWritableDatabase();

        String selectQuery2 = "SELECT sum(mark) FROM mark5 where sid="+sid+" and code='"+code+"' group by roll,code";

        //String selectQuery2 = "SELECT mark FROM mark4";
        Cursor cus = db.rawQuery(selectQuery2, null);
        return cus;
    }
    public int countmark(String code)
    {
        SQLiteDatabase db = getWritableDatabase();

       /* String countm="select count(distinct topic) from mark5 where code='"+code+"'";
        int co=Integer.parseInt(countm);
        int cus = db.rawQuery(co, null);*/
        Cursor dataCount = db.rawQuery("select distinct topic from mark5 where code='"+code+"'", null);
        int co=dataCount.getCount();
        return  co;
    }



}