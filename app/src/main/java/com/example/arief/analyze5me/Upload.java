package com.example.arief.analyze5me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Upload extends AppCompatActivity implements View.OnClickListener {
    TextView t1;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28,e29,e30,e31,e32,e33,e34,e35,e36,e37,e38,e39,e40,e90,e91;
    EditText e41,e42,e43,e44,e45,e46,e47,e48,e49,e50,e51,e52,e53,e54,e55,e56,e57,e58,e59,e60,e61;
    Button b1;
    int roll,ids;
    String top,code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        Intent i=getIntent();
        roll=i.getIntExtra("staffid",0);
        t1=(TextView)findViewById(R.id.textView21);
       t1.setText("staff Number =" + roll);
        e90=(EditText)findViewById(R.id.editText14);
        e91=(EditText)findViewById(R.id.editText98);
      //  ids=i.getIntExtra("ids",0);
       // top=i.getStringExtra("top");
     //   code=i.getStringExtra("code");
        //e1=(EditText)findViewById(R.id.editText14);
        e2=(EditText)findViewById(R.id.editText15);
        e3=(EditText)findViewById(R.id.editText16);
        e4=(EditText)findViewById(R.id.editText17);
        e5=(EditText)findViewById(R.id.editText18);
        e6=(EditText)findViewById(R.id.editText19);
        e7=(EditText)findViewById(R.id.editText20);

        e8=(EditText)findViewById(R.id.editText21);
        e9=(EditText)findViewById(R.id.editText22);
        e10=(EditText)findViewById(R.id.editText23);
        e11=(EditText)findViewById(R.id.editText24);
        e12=(EditText)findViewById(R.id.editText25);
        e13=(EditText)findViewById(R.id.editText26);

        e14=(EditText)findViewById(R.id.editText27);
        e15=(EditText)findViewById(R.id.editText28);
        e16=(EditText)findViewById(R.id.editText29);
        e17=(EditText)findViewById(R.id.editText30);
        e18=(EditText)findViewById(R.id.editText31);
        e19=(EditText)findViewById(R.id.editText32);

        e20=(EditText)findViewById(R.id.editText33);
        e21=(EditText)findViewById(R.id.editText34);
        e22=(EditText)findViewById(R.id.editText35);
        e23=(EditText)findViewById(R.id.editText36);
        e24=(EditText)findViewById(R.id.editText37);
        e25=(EditText)findViewById(R.id.editText38);

        e26=(EditText)findViewById(R.id.editText39);
        e27=(EditText)findViewById(R.id.editText40);
        e28=(EditText)findViewById(R.id.editText41);
        e29=(EditText)findViewById(R.id.editText42);
        e30=(EditText)findViewById(R.id.editText43);
        e31=(EditText)findViewById(R.id.editText44);

        e32=(EditText)findViewById(R.id.editText45);
        e33=(EditText)findViewById(R.id.editText46);
        e34=(EditText)findViewById(R.id.editText47);
        e35=(EditText)findViewById(R.id.editText48);
        e36=(EditText)findViewById(R.id.editText49);
        e37=(EditText)findViewById(R.id.editText50);

        e38=(EditText)findViewById(R.id.editText51);
        e39=(EditText)findViewById(R.id.editText52);
        e40=(EditText)findViewById(R.id.editText53);
        e41=(EditText)findViewById(R.id.editText54);
        e42=(EditText)findViewById(R.id.editText55);
        e43=(EditText)findViewById(R.id.editText56);

        e44=(EditText)findViewById(R.id.editText57);
        e45=(EditText)findViewById(R.id.editText58);
        e46=(EditText)findViewById(R.id.editText59);
        e47=(EditText)findViewById(R.id.editText60);
        e48=(EditText)findViewById(R.id.editText61);
        e49=(EditText)findViewById(R.id.editText62);

        e50=(EditText)findViewById(R.id.editText63);
        e51=(EditText)findViewById(R.id.editText64);
        e52=(EditText)findViewById(R.id.editText65);
        e53=(EditText)findViewById(R.id.editText66);
        e54=(EditText)findViewById(R.id.editText67);
        e55=(EditText)findViewById(R.id.editText68);

        e56=(EditText)findViewById(R.id.editText69);
        e57=(EditText)findViewById(R.id.editText70);
        e58=(EditText)findViewById(R.id.editText71);
        e59=(EditText)findViewById(R.id.editText72);
        e60=(EditText)findViewById(R.id.editText73);
        e61=(EditText)findViewById(R.id.editText74);
        b1=(Button)findViewById(R.id.button10);
        b1.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_upload, menu);
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

       // int id=t1.get();
        String code=e90.getText().toString();
        String topic=e91.getText().toString();

        String q=e2.getText().toString();
        String a=e3.getText().toString();
        String b=e4.getText().toString();
        String c=e5.getText().toString();
        String d=e6.getText().toString();
        String cur=e7.getText().toString();

        String q1=e8.getText().toString();
        String a1=e9.getText().toString();
        String b1=e10.getText().toString();
        String c1=e11.getText().toString();
        String d1=e12.getText().toString();
        String cur1=e13.getText().toString();

        String q2=e14.getText().toString();
        String a2=e15.getText().toString();
        String b2=e16.getText().toString();
        String c2=e17.getText().toString();
        String d2=e18.getText().toString();
        String cur2=e19.getText().toString();

        String q3=e20.getText().toString();
        String a3=e21.getText().toString();
        String b3=e22.getText().toString();
        String c3=e23.getText().toString();
        String d3=e24.getText().toString();
        String cur3=e25.getText().toString();

        String q4=e26.getText().toString();
        String a4=e27.getText().toString();
        String b4=e28.getText().toString();
        String c4=e29.getText().toString();
        String d4=e30.getText().toString();
        String cur4=e31.getText().toString();

        String q5=e32.getText().toString();
        String a5=e33.getText().toString();
        String b5=e34.getText().toString();
        String c5=e35.getText().toString();
        String d5=e36.getText().toString();
        String cur5=e37.getText().toString();

        String q6=e38.getText().toString();
        String a6=e39.getText().toString();
        String b6=e40.getText().toString();
        String c6=e41.getText().toString();
        String d6=e42.getText().toString();
        String cur6=e43.getText().toString();

        String q7=e44.getText().toString();
        String a7=e45.getText().toString();
        String b7=e46.getText().toString();
        String c7=e47.getText().toString();
        String d7=e48.getText().toString();
        String cur7=e49.getText().toString();

        String q8=e50.getText().toString();
        String a8=e51.getText().toString();
        String b8=e52.getText().toString();
        String c8=e53.getText().toString();
        String d8=e54.getText().toString();
        String cur8=e55.getText().toString();

        String q9=e56.getText().toString();
        String a9=e57.getText().toString();
        String b9=e58.getText().toString();
        String c9=e59.getText().toString();
        String d9=e60.getText().toString();
        String cur9=e61.getText().toString();
        UploadDB7 qu=new UploadDB7(this);
        int n1=1,n2=2,n3=3,n4=4,n5=5,n6=6,n7=7,n8=8,n9=9,n10=10;
        qu.insertquestion(q, a, b, c, d, cur,n1,roll,code,topic);
       qu.insertquestion(q1, a1, b1, c1, d1, cur1, n2,roll,code,topic);
        qu.insertquestion(q2, a2, b2, c2, d2, cur2, n3,roll,code,topic);
        qu.insertquestion(q3, a3, b3, c3, d3, cur3, n4,roll,code,topic);
        qu.insertquestion(q4, a4, b4, c4, d4, cur4, n5,roll,code,topic);
        qu.insertquestion(q5, a5, b5, c5, d5, cur5, n6,roll,code,topic);
        qu.insertquestion(q6, a6, b6, c6, d6, cur6, n7,roll,code,topic);
        qu.insertquestion(q7, a7, b7, c7, d7, cur7, n8,roll,code,topic);
        qu.insertquestion(q8, a8, b8, c8, d8, cur8, n9,roll,code,topic);
        qu.insertquestion(q9, a9, b9, c9, d9, cur9, n10,roll,code,topic);

      // Intent i=new Intent(this,Test.class);
        //Mark md=new Mark(this);
      //  md.delete();
        Toast.makeText(this,roll+code+topic, Toast.LENGTH_LONG).show();

       // startActivity(i);

    }
}
