package com.example.arief.analyze5me;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arief on 2/12/2017.
 */
public class Mark extends SQLiteOpenHelper {
    public Mark(Context context) {
        super(context,"markdb",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mark(ma integer,no integer)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists mark");

    }
    public void inmark(int m,int n)
    {
        SQLiteDatabase obj=getWritableDatabase();
        obj.execSQL("insert into mark values(" + m + "," + n + ")");
    }
    public Cursor marks()
    {
        SQLiteDatabase db=getWritableDatabase();
        String selectQuery = "SELECT ma FROM mark";
        Cursor cus = db.rawQuery(selectQuery, null);
        return cus;
    }
    public void delete()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM mark"); //delete all rows in a table
        db.close();
    }

}
