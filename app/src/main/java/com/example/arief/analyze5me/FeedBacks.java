package com.example.arief.analyze5me;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FeedBacks extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    TextView t1;
    Button b;
    int t33,sid=0;

    Spinner dropdown1;
    String topic,code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_backs);
        //t1=(TextView)findViewById(R.id.textView34);
        Intent is=getIntent();
        sid=is.getIntExtra("staffid", 0);
        // top=is.getStringExtra("top");
        topic=is.getStringExtra("top");
       FeedBackDB2 f=new FeedBackDB2(this);
        b=(Button)findViewById(R.id.button56);
        dropdown1 = (Spinner)findViewById(R.id.spinner5);


        List<String> lables2 = f.getAll(sid, topic);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, lables2);
        dropdown1.setAdapter(adapter2);

        dropdown1.setOnItemSelectedListener(this);

        b=(Button)findViewById(R.id.button56);
        b.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feed_backs, menu);
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

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,Task.class));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
