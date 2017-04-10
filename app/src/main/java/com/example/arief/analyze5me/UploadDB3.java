package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arief on 3/5/2017.
 */
public class UploadDB3 extends SQLiteOpenHelper {
    public UploadDB3(Context context) {
        super(context,"done",null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ptable(r text, aop text,bop text,cop text,dop text,ans text,qon integer,sta integer,code text,topic text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists ptable");
    }
    public void insertquestion(String q,String a,String b,String c,String d,String cur,int qn,int sta,String code,String top)
    {
        SQLiteDatabase obj =getWritableDatabase();
        obj.execSQL("insert into ptable values('" + q + "','" + a + "','" + b + "','" + c + "','" + d + "','" + cur + "'," + qn + "," + sta + ",'" + code + "','" + top + "')");
    }

    public boolean check(String pa)
    {
        SQLiteDatabase obj2=getWritableDatabase();
        Cursor cr= obj2.rawQuery("select ans from ptable where  ans='"+pa+"'",null);
        if(cr.moveToNext())
        {
            return true;
        }
        else {
            return false;
        }





    }
    public Cursor que(int n,int staff)
    {
        SQLiteDatabase bo=getWritableDatabase();
        Cursor c=bo.rawQuery("select * from ptable where qon="+n+" and sta="+staff+"",null);
        return c;
    }

    public List<Integer> getAllLabels1(){
        List<Integer> labels1 = new ArrayList<Integer>();

        // Select All Query
        String selectQuery1 = "SELECT distinct sta FROM ptable";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery1, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels1.add(cursor.getInt(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels1;
    }
    public List<String> getAllLabels2(){
        List<String> labels2 = new ArrayList<String>();

        // Select All Query
        String selectQuery2 = "SELECT distinct code FROM ptable";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery2, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels2.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels2;
    }
    public List<String> getAllLabels3(){
        List<String> labels3 = new ArrayList<String>();

        // Select All Query
        String selectQuery3 = "SELECT distinct topic FROM ptable";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery3, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels3.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels3;
    }

}

