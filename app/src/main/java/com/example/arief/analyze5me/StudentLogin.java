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

import junit.framework.Test;

public class StudentLogin extends AppCompatActivity implements View.OnClickListener{
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button5);
        b1.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_login, menu);
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

    public void onClick(View v){
try {
    int r = Integer.parseInt(e1.getText().toString());
    String pass = e2.getText().toString();
    AnalyzeDB d = new AnalyzeDB(this);
    //DatabaseHandler d=new DatabaseHandler(this);
    if (d.checkstudata(r, pass)) {

        Intent i = new Intent(this, AttendTest.class);
        i.putExtra("roll", r);
        startActivity(i);

    } else
        Toast.makeText(this, "Not a valid user!!!enter valid data", Toast.LENGTH_LONG).show();


}
catch (Exception e)
{
    Toast.makeText(this, "enter valid username or password", Toast.LENGTH_LONG).show();
}
    }
}
