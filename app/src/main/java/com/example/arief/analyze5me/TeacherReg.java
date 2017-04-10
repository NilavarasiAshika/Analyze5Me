package com.example.arief.analyze5me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TeacherReg extends AppCompatActivity implements View.OnClickListener{
    EditText e1,e2,e3,e4,e5;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_reg);
        e1=(EditText)findViewById(R.id.editText9);
        e2=(EditText)findViewById(R.id.editText10);
        e3=(EditText)findViewById(R.id.editText11);
        e4=(EditText)findViewById(R.id.editText12);
        e5=(EditText)findViewById(R.id.editText13);
        b1=(Button)findViewById(R.id.button8);
        b1.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_teacher_reg, menu);
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
    public void onClick(View v)
    {
       try {


           AnalyzeDB obj2 = new AnalyzeDB(this);
           int r = Integer.parseInt(e1.getText().toString());
           String name = e2.getText().toString();
           String dept = e3.getText().toString();
           //String qu=e4.getText().toString();
           String pass = e5.getText().toString();
           obj2.insertstu(r, name, dept, pass);

           Intent i = new Intent(this, TeacherLogin.class);
           startActivity(i);
       }
       catch (Exception e)
       {
           Toast.makeText(this, "staff id already exits or please enter valid details!!!!!! ", Toast.LENGTH_LONG).show();
       }

    }
}
