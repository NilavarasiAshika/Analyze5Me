package com.example.arief.analyze5me;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Task extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4;
    int roll=0;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        Intent i=getIntent();
        roll=i.getIntExtra("staffid",0);
        b1=(Button)findViewById(R.id.button13);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button87);
        b4=(Button)findViewById(R.id.button76);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_task, menu);
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
        switch (v.getId())
        {
            case R.id.button13:
                Intent i=new Intent(this,Upload.class);
                i.putExtra("staffid",roll);
                startActivity(i);

                break;
            case R.id.button14:
             /*  Intent is=new Intent(this,Upload.class);
                is.putExtra("staffid",roll);
                startActivity(is);*/
                final Intent ia = new Intent(this,Graph.class);
             AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Alert Dialog Subject code"); //Set Alert dialog title here
                alert.setMessage("Enter subject code"); //Message here

                // Set an EditText view to get user input
                final EditText input = new EditText(context);
                alert.setView(input);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = input.getEditableText().toString();

                        ia.putExtra("staffid",roll);
                        ia.putExtra("code",srt1);

                        startActivity(ia);
                       // Toast.makeText(context, srt, Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
        // End of onClick(View v)
    //button.setOnClickListener
//End of onCreate

                break;
            case R.id.button87:

                final Intent iss=new Intent(this,Instruction.class);
                AlertDialog.Builder alert1 = new AlertDialog.Builder(context);
                alert1.setTitle("Alert Dialog for Topic Name"); //Set Alert dialog title here
                alert1.setMessage("Enter Topic Name"); //Message here
                final EditText input1 = new EditText(context);
                alert1.setView(input1);
                alert1.setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {

                        String srt = input1.getEditableText().toString();

                        iss.putExtra("staffid",roll);
                        iss.putExtra("top",srt);
                        startActivity(iss);
                    } // End of onClick(DialogInterface dialog, int whichButton)
                });
                alert1.setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog1 = alert1.create();
                alertDialog1.show();
                break;
            case R.id.button76:

                final Intent is1=new Intent(this,FeedBacks.class);
                AlertDialog.Builder alert2 = new AlertDialog.Builder(context);
                alert2.setTitle("Alert Dialog for Topic Name"); //Set Alert dialog title here
                alert2.setMessage("Enter Topic Name"); //Message here
                final EditText input2 = new EditText(context);
                alert2.setView(input2);
                alert2.setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {

                        String srt = input2.getEditableText().toString();
                        is1.putExtra("staffid",roll);
                        is1.putExtra("top",srt);
                        startActivity(is1);
                    } // End of onClick(DialogInterface dialog, int whichButton)
                });
                alert2.setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog2 = alert2.create();
                alertDialog2.show();
                break;

        }
    }
}
