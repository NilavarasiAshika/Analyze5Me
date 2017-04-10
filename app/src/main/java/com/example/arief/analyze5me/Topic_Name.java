package com.example.arief.analyze5me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class Topic_Name extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    Spinner dropdown3;
    Button b1;
    String top,code;
    int sro,roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic__name);
        UploadDB7 db=new UploadDB7(this);
        Intent i=getIntent();
        sro=i.getIntExtra("ids", 0);
        roll=i.getIntExtra("roll", 0);
       // top=i.getStringExtra("top");
        code=i.getStringExtra("code");
        dropdown3 = (Spinner)findViewById(R.id.spinner3);
        List<String> lables3 = db.getAllLabels3(sro,code);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, lables3);
        dropdown3.setAdapter(adapter3);
        dropdown3.setOnItemSelectedListener(this);
        b1=(Button)findViewById(R.id.button34);
        b1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_topic__name, menu);
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
        Intent i = new Intent(this, Test.class);
       i.putExtra("ids",sro);
        i.putExtra("roll",roll);
      //  i.putExtra("ids", idd);
         i.putExtra("top",top);
        i.putExtra("code",code);
        startActivity(i);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        top=dropdown3.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
