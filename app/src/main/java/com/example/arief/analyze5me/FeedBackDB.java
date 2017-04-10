package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 3/20/2017.
 */
public class FeedBackDB extends SQLiteOpenHelper {
    public FeedBackDB(Context context) {
        super(context, "feedback", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table feedback(sid integer,roll integer,code text,topic text,feedback text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists feedback");

    }

    public void insertfeed(int sid, int roll, String code, String topic,String feedback) {
        SQLiteDatabase obj = getWritableDatabase();
        obj.execSQL("insert into feedback values(" + sid + "," + roll + ",'" + code + "','" + topic + "','"+ feedback +"')");
    }

    public Cursor feedtopic(int sid, String topic) {
        SQLiteDatabase db = getWritableDatabase();
        String selectQuery1 = "SELECT feedback FROM feedback where topic='" + topic + "' and sid=" + sid + "";
        Cursor cus = db.rawQuery(selectQuery1, null);
        return cus;
    }

    public Cursor feedcode(int sid, String code) {
        SQLiteDatabase db = getWritableDatabase();
        String selectQuery2 = "SELECT sum(mark) FROM mark2 where sid=" + sid + " and code='" + code + "' group by topic";


        Cursor cus = db.rawQuery(selectQuery2, null);
        return cus;
    }

    public void delete2() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM mark2"); //delete all rows in a table
        db.close();
    }

    public Cursor marks2() {
        SQLiteDatabase db = getWritableDatabase();
        String selectQuery = "SELECT mark FROM mark2";
        Cursor cus = db.rawQuery(selectQuery, null);
        return cus;
    }

}