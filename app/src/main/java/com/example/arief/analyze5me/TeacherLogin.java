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

public class TeacherLogin extends AppCompatActivity implements View.OnClickListener{
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
        e1=(EditText)findViewById(R.id.editText7);
        e2=(EditText)findViewById(R.id.editText8);
        b1=(Button)findViewById(R.id.button7);
        b1.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_teacher_login, menu);
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
        try {
            int r = Integer.parseInt(e1.getText().toString());
            String pass = e2.getText().toString();
            AnalyzeDB d = new AnalyzeDB(this);
            //DatabaseHandler d=new DatabaseHandler(this);
            if (d.checkstudata(r, pass))
            {
                Intent i = new Intent(this, Task.class);
                i.putExtra("staffid", r);
                startActivity(i);
                //i.putExtra("staffid", r);
            } else
                Toast.makeText(this, "Not a valid user", Toast.LENGTH_LONG).show();

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Enter vaild type user name and password!!!!", Toast.LENGTH_LONG).show();
        }
    }


}
