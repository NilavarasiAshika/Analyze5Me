package com.example.arief.analyze5me;

import android.content.Intent;
import android.content.pm.FeatureGroupInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Marks extends AppCompatActivity implements View.OnClickListener{
    TextView t1;
    Button b1,b2;
    int mark=0,rono=0,sid=0;
    String top,code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        Intent i =getIntent();
        b1=(Button)findViewById(R.id.button15);
        b2=(Button)findViewById(R.id.button9);
        // int ro=i.getByteExtra("roll", (byte) 0);
       // Intent i=getIntent();
       // t33=i.getIntExtra("roll",0);
       // i.putExtra("t33", t33);
       // t89=(TextView)findViewById(R.id.textView100);
       // t89.setText("ROLL NO= " + t33);
        rono=i.getIntExtra("roll",0);
        sid=i.getIntExtra("sid", 0);
        code=i.getStringExtra("code");
        top=i.getStringExtra("top");
        String q=i.getExtras().getString("val");
        String q1=i.getExtras().getString("val2");
        String q2=i.getExtras().getString("val3");
        String q3=i.getExtras().getString("val4");
        String q4=i.getExtras().getString("val5");
        String q5=i.getExtras().getString("val6");
        String q6=i.getExtras().getString("val7");
        String q7=i.getExtras().getString("val8");
        String q8=i.getExtras().getString("val9");
        String q9=i.getExtras().getString("val10");
        //int roll=i.getIntExtra("m",0);
        t1=(TextView)findViewById(R.id.textView18);
        //t1.setText("" + q);

        UploadDB7 qob=new UploadDB7(this);


        if(qob.check(sid,code,top,q))
        {
            mark=mark+1;

        }
        else {
            mark = mark + 0;
        }
        // t1.setText("" + mark);
        if(qob.check(sid,code,top,q1))
        {
            mark=mark+1;
        }
        else {

            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q2))
        {
            mark=mark+1;

        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q3))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q4))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q5))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q6))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q7))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q8))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }
        if(qob.check(sid,code,top,q9))
        {
            mark=mark+1;
        }
        else {
            mark = mark + 0;
        }

        t1.setText("MARK=" + mark);
      MarkDB5 bn=new MarkDB5(this);
       // int n=1;
     bn.insertmark2(mark,rono, sid, code, top);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_marks, menu);
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
        //Intent i=new Intent(this,Upload.class);
     //   startActivity(i);
      //  Toast.makeText(this, roll+sid + top+code, Toast.LENGTH_LONG).show();
        switch (v.getId())
        {
            case R.id.button15:
                //  mediasound.start();
                Intent i = new Intent(this, FeedBack.class);

                //  Toast.makeText(this, ro + sro + top, Toast.LENGTH_LONG).show();

                i.putExtra("roll", rono);
                i.putExtra("sid", sid);
                i.putExtra("code",code);
                i.putExtra("top", top);
                startActivity(i);
               // startActivity(new Intent(this,FeedBack.class));
                break;
            case R.id.button9:
                startActivity(new Intent(this,MainActivity.class));
                break;

        }
    }
}
