package com.example.arief.analyze5me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Instruction extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    int roll;
    String top;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        Intent i=getIntent();
        roll=i.getIntExtra("staffid",0);
        top=i.getStringExtra("top");
        b1=(Button)findViewById(R.id.button17);
        b1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_instruction, menu);
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

        Intent i = new Intent(this, OverAll_performance.class);

        //  Toast.makeText(this, ro + sro + top, Toast.LENGTH_LONG).show();

        i.putExtra("staffid", roll);

        i.putExtra("top", top);
        startActivity(i);

    }
}
