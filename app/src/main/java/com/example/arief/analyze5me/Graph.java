package com.example.arief.analyze5me;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Graph extends AppCompatActivity {
    LinearLayout linearchart;
    TextView t1;
    int roll,co;
    String code,top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph2);


        Intent is=getIntent();
        roll=is.getIntExtra("staffid", 0);
       // top=is.getStringExtra("top");
         code=is.getStringExtra("code");
        MarkDB5 bg = new MarkDB5(this);
        Cursor c = bg.markssum2(roll,code);
        co=bg.countmark(code);
         // Cursor c= bg.markssum2(roll,code);

        int nc=c.getCount();
        int a[]=new int[nc];
        int i=0;
        if (c.moveToFirst())
        {
            do {
                int n= Integer.parseInt(c.getString(0));
                a[i]=n;
                i++;

            }while (c.moveToNext());
        }
        //Intent i=getIntent();
        //int roll=i.getIntExtra("mark",0);
        linearchart = (LinearLayout) findViewById(R.id.linearchart1);
        for(i=0;i<nc;i++) {
            switch (a[i]/co) {
                case 1&2&3:
                    drawChart(1);
                    break;
                case 4&5&6:
                    drawcharavg(1);
                    break;
                case 7:
                    drawcharty(1);
                    break;
                case 8:
                    drawcharty(1);
                    break;
                case 9:
                    drawchartg(1);
                    break;
                case 10:
                    drawchartg(1);
                    break;

                default:
                    drawChart(1);

            }
        }
    }
    public void drawChart(int count) {
        System.out.println(count);

        for (int k = 1; k <= count; k++) {
            View view = new View(this);
            view.setBackgroundColor(Color.parseColor("#ff0000"));
            view.animate();

            view.setLayoutParams(new LinearLayout.LayoutParams(30, 400));
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view
                    .getLayoutParams();

            params.setMargins(5, 0, 0, 0); // substitute parameters for left,top, right, bottom
            view.setLayoutParams(params);
            linearchart.addView(view);
        }
    }
    public void drawchartg(int count) {
        System.out.println(count);

        for (int k = 1; k <= count; k++) {
            View view = new View(this);
            view.setBackgroundColor(Color.parseColor("#008000"));
            view.setLayoutParams(new LinearLayout.LayoutParams(30, 400));
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view
                    .getLayoutParams();
            params.setMargins(5, 0, 0, 0); // substitute parameters for left,top, right, bottom
            view.setLayoutParams(params);
            linearchart.addView(view);
        }
    }
    public void drawcharty(int count) {
        System.out.println(count);

        for (int k = 1; k <= count; k++) {
            View view = new View(this);
            view.setBackgroundColor(Color.parseColor("#ffff00"));
            view.setLayoutParams(new LinearLayout.LayoutParams(30, 400));
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view
                    .getLayoutParams();
            params.setMargins(5, 0, 0, 0); // substitute parameters for left,top, right, bottom
            view.setLayoutParams(params);
            linearchart.addView(view);
        }
    }
    public void drawcharavg(int count) {
        System.out.println(count);

        for (int k = 1; k <= count; k++) {
            View view = new View(this);
            view.setBackgroundColor(Color.parseColor("#0000ff"));
            view.setLayoutParams(new LinearLayout.LayoutParams(30, 400));
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view
                    .getLayoutParams();
            params.setMargins(5, 0, 0, 0); // substitute parameters for left,top, right, bottom
            view.setLayoutParams(params);
            linearchart.addView(view);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_graph, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
