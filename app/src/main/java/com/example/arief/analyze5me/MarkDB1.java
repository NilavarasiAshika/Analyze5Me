package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 2/12/2017.
 */
public class MarkDB1 extends SQLiteOpenHelper {
    public MarkDB1(Context context) {
        super(context,"markdb",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mark1(mark integer,roll integer,sid integer,code text,topic text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists mark1");

    }
    public void insertmark(int mark,int roll,int sid,String code,String topic)
    {
        SQLiteDatabase obj=getWritableDatabase();
        obj.execSQL("insert into mark1 values("+ mark +","+ roll +","+ sid +",'"+ code +"','"+ topic +"')");
    }
    public Cursor marks1(int sid,String topic)
    {
        SQLiteDatabase db=getWritableDatabase();
        String selectQuery1 = "SELECT mark FROM mark1 where topic='"+ topic +"' and sid="+ sid +"";
        Cursor cus = db.rawQuery(selectQuery1, null);
        return cus;
    }
    public Cursor markssum(int sid,String topic)
    {
        SQLiteDatabase db=getWritableDatabase();
        String selectQuery2 = "SELECT sum(mark) FROM mark1 group by topic where sid="+ sid +"";


        Cursor cus = db.rawQuery(selectQuery2, null);
        return cus;
    }
    public void delete()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM mark1"); //delete all rows in a table
        db.close();
    }

}

