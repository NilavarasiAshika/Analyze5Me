package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 3/19/2017.
 */
public class MarkDB3 extends SQLiteOpenHelper {
    public MarkDB3(Context context) {

        super(context, "markdone62", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mark2(mark integer,roll integer,sid integer,code text,topic text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists mark2");

    }

    public void insertmark2(int mark, int roll, int sid, String code, String topic) {
        SQLiteDatabase obj = getWritableDatabase();
        obj.execSQL("insert into mark2 values(" + mark + "," + roll + "," + sid + ",'" + code + "','" + topic + "')");
    }

    public Cursor marks2(int sid, String topic) {
        SQLiteDatabase db = getWritableDatabase();
        String selectQuery1 = "SELECT mark FROM mark2 where topic='" + topic + "' and sid=" + sid + "";
        Cursor cus = db.rawQuery(selectQuery1, null);
        return cus;
    }

    public Cursor markssum2(int sid, String code) {
        SQLiteDatabase db = getWritableDatabase();
        String selectQuery2 = "SELECT sum(mark) FROM mark2 where sid=" + sid + " and code='" + code + "' group by topic";


        Cursor cus = db.rawQuery(selectQuery2, null);
        return cus;
    }



}