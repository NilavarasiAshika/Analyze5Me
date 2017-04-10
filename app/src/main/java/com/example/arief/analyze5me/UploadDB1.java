package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arief on 2/23/2017.
 */
public class UploadDB1 extends SQLiteOpenHelper {
    public UploadDB1(Context context) {
        super(context,"yesok",null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table question(r text, aop text,bop text,cop text,dop text,ans text,qon integer,sta integer,code text,topic text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists question");
    }
    public void insertquestion(String q,String a,String b,String c,String d,String cur,int qn,int sta,String code,String top)
    {
        SQLiteDatabase obj =getWritableDatabase();
        obj.execSQL("insert into question values('" + q + "','" + a + "','" + b + "','" + c + "','" + d + "','" + cur + "'," + qn + "," + sta + ",'" + code + "','" + top + "')");
    }

    public boolean check(String pa)
    {
        SQLiteDatabase obj2=getWritableDatabase();
        Cursor cr= obj2.rawQuery("select ans from question where  ans='"+pa+"'",null);
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
        Cursor c=bo.rawQuery("select * from question where qon="+n+" and sta="+staff+"",null);
        return c;
    }

    public List<String> getAllLabels(int staff){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  top FROM question where sta="+staff+"";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
}
