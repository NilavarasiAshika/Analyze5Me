package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 2/12/2017.
 */
public class NewDB extends SQLiteOpenHelper {
    public NewDB(Context context) {
        super(context,"yes",null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ques(r text, aop text,bop text,cop text,dop text,ans text,qon integer,sta integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists ques");
    }
    public void insertques(String q,String a,String b,String c,String d,String cur,int qn,int sta)
    {
        SQLiteDatabase obj =getWritableDatabase();
        obj.execSQL("insert into ques values('" + q + "','" + a + "','" + b + "','" + c + "','" + d + "','" + cur + "'," + qn + "," + sta + ")");
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
    public Cursor que(int n,int staff)
    {
        SQLiteDatabase bo=getWritableDatabase();
        Cursor c=bo.rawQuery("select * from ques where qon="+n+" and sta="+staff+"",null);
        return c;
    }

}



