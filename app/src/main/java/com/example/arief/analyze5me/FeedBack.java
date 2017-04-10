package com.example.arief.analyze5me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity implements View.OnClickListener {
    EditText e1;
    Button b1;
    RatingBar r1;
    float  f;
    int roll=0,sid=0;
    String top,code;
    FeedBackDB2 fb=new FeedBackDB2(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        Intent i =getIntent();
        roll=i.getIntExtra("roll",0);
        sid=i.getIntExtra("sid", 0);
        code=i.getStringExtra("code");
        top=i.getStringExtra("top");
       // RatingBar mBar = (RatingBar) findViewById(R.id.r1);

        e1=(EditText)findViewById(R.id.editText75);
        b1=(Button)findViewById(R.id.button16);

       // r1= (RatingBar)findViewById(R.id.r1);
       // f=r1.getRating();
      //  mBar.setOnClickListene(this);
        b1.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feed_back, menu);
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
      //  RatingBar bar = (RatingBar) v;
      //  statusMessage.setText("value is " + bar.getRating());
       // Toast.makeText(this,"ratoing"+f, Toast.LENGTH_LONG).show();
        String feedback=e1.getText().toString();
        fb.insertfeed(sid,roll,code,top,feedback);
        Toast.makeText(this,"feedback submitted successfully", Toast.LENGTH_LONG).show();
    }
}
