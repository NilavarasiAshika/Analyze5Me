package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 2/12/2017.
 */

public class UploadDB extends SQLiteOpenHelper {
    public UploadDB(Context context) {
        super(context,"Q",null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ques(r text, aop text,bop text,cop text,dop text,ans text,qon integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists ques");
    }
    public void insertques(String q,String a,String b,String c,String d,String cur,int qn)
    {
        SQLiteDatabase obj =getWritableDatabase();
        obj.execSQL("insert into ques values('" + q + "','" + a + "','" + b + "','" + c + "','" + d + "','" + cur + "'," + qn + ")");
    }

    public boolean check(String pa)
    {
        SQLiteDatabase obj2=getWritableDatabase();
        Cursor cr= obj2.rawQuery("select ans from ques where  ans='"+pa+"'",null);
        if(cr.moveToNext())
        {
            return true;
        }
        else {
            return false;
        }





    }
    public Cursor que(int n)
    {
        SQLiteDatabase bo=getWritableDatabase();
        Cursor c=bo.rawQuery("select * from ques where qon="+n+"",null);
        return c;
    }

}


