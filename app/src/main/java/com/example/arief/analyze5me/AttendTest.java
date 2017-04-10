package com.example.arief.analyze5me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AttendTest extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    TextView t1;
    Button b;
    int t33,idd=0;

    Spinner dropdown1,dropdown2;
    String top,code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend_test);
        UploadDB7 db=new UploadDB7(this);
        Intent i = getIntent();
        t33 = i.getIntExtra("roll", 0);
        i.putExtra("t33", t33);
        t1 = (TextView) findViewById(R.id.textView26);
        t1.setText("ROLL NO= " + t33);
        b=(Button)findViewById(R.id.button12);
        dropdown1 = (Spinner)findViewById(R.id.spinner);
        dropdown2 = (Spinner)findViewById(R.id.spinner2);
        //dropdown3 = (Spinner)findViewById(R.id.spinner3);

      List<Integer> lables1 = db.getAllLabels1();
        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, lables1);
        dropdown1.setAdapter(adapter1);

        List<String> lables2 = db.getAllLabels2();
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, lables2);
        dropdown2.setAdapter(adapter2);



        dropdown1.setOnItemSelectedListener(this);
        dropdown2.setOnItemSelectedListener(this);



      //  dropdown3.setOnItemSelectedListener(this);
        b=(Button)findViewById(R.id.button12);
       /* UploadDB1 db = new UploadDB1(getApplicationContext());
        ArrayList<String> my_array = new ArrayList<String>();
        my_array = (ArrayList<String>) db.getAllLabels(va);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> my_Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,my_array);
        spinner.setAdapter(my_Adapter);*/

       // spinner.setOnItemSelectedListener(this);
       //loadSpinnerData();*/
        b.setOnClickListener(this);

        
    }



    @Override
    public void onClick(View v) {
        Toast.makeText(this,t33+" "+idd+" "+code, Toast.LENGTH_LONG).show();


      Intent i = new Intent(this, Topic_Name.class);
        i.putExtra("roll", t33);
        i.putExtra("ids", idd);
      //  i.putExtra("top",top);
        i.putExtra("code",code);
        startActivity(i);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       idd= (int) dropdown1.getItemAtPosition(position);
        code= dropdown2.getItemAtPosition(position).toString();
     // top=dropdown3.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

