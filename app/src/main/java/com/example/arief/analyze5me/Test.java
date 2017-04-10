package com.example.arief.analyze5me;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity  implements View.OnClickListener
{


        RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50;
        TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t89;
        RadioGroup g1, g2, g3, g4, g5, g6, g7, g8, g9, g10;
        int ro, sro;
        String top, code;
        Button b;
        String que = null, opta = null, optb = null, optc = null, optd = null;
        String que1 = null, opta1 = null, optb1 = null, optc1 = null, optd1 = null;
        String que2 = null, opta2 = null, optb2 = null, optc2 = null, optd2 = null;
        String que3 = null, opta3 = null, optb3 = null, optc3 = null, optd3 = null;
        String que4 = null, opta4 = null, optb4 = null, optc4 = null, optd4 = null;
        String que5 = null, opta5 = null, optb5 = null, optc5 = null, optd5 = null;
        String que6 = null, opta6 = null, optb6 = null, optc6 = null, optd6 = null;
        String que7 = null, opta7 = null, optb7 = null, optc7 = null, optd7 = null;
        String que8 = null, opta8 = null, optb8 = null, optc8 = null, optd8 = null;
        String que9 = null, opta9 = null, optb9 = null, optc9 = null, optd9 = null;
        @Override
        protected void onCreate (Bundle savedInstanceState)
        {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test);

    Intent i = getIntent();
    ro = i.getIntExtra("roll", 0);
    i.putExtra("t33", ro);
    t89 = (TextView) findViewById(R.id.textView100);
    t89.setText("ROLL NO= " + ro);
    sro = i.getIntExtra("ids", 0);
    top = i.getStringExtra("top");
    code = i.getStringExtra("code");


    int n = 1, n2 = 2, n3 = 3, n4 = 4, n5 = 5, n6 = 6, n7 = 7, n8 = 8, n9 = 9, n10 = 10;

    UploadDB7 qdb = new UploadDB7(this);
    Cursor c = qdb.quet(n, sro, code, top);
    Cursor c1 = qdb.quet(n2, sro, code, top);
    Cursor c2 = qdb.quet(n3, sro, code, top);
    Cursor c3 = qdb.quet(n4, sro, code, top);
    Cursor c4 = qdb.quet(n5, sro, code, top);
    Cursor c5 = qdb.quet(n6, sro, code, top);
    Cursor c6 = qdb.quet(n7, sro, code, top);
    Cursor c7 = qdb.quet(n8, sro, code, top);
    Cursor c8 = qdb.quet(n9, sro, code, top);
    Cursor c9 = qdb.quet(n10, sro, code, top);
    if (c.moveToFirst()) {
        do {
            que = c.getString(0);
            opta = c.getString(1);
            optb = c.getString(2);
            optc = c.getString(3);
            optd = c.getString(4);
        } while (c.moveToNext());
    }

    if (c1.moveToFirst()) {
        do {
            que1 = c1.getString(0);
            opta1 = c1.getString(1);
            optb1 = c1.getString(2);
            optc1 = c1.getString(3);
            optd1 = c1.getString(4);
        } while (c1.moveToNext());
    }
    if (c2.moveToFirst()) {
        do {
            que2 = c2.getString(0);
            opta2 = c2.getString(1);
            optb2 = c2.getString(2);
            optc2 = c2.getString(3);
            optd2 = c2.getString(4);
        } while (c2.moveToNext());
    }
    if (c3.moveToFirst()) {
        do {
            que3 = c3.getString(0);
            opta3 = c3.getString(1);
            optb3 = c3.getString(2);
            optc3 = c3.getString(3);
            optd3 = c3.getString(4);
        } while (c3.moveToNext());
    }
    if (c4.moveToFirst()) {
        do {
            que4 = c4.getString(0);
            opta4 = c4.getString(1);
            optb4 = c4.getString(2);
            optc4 = c4.getString(3);
            optd4 = c4.getString(4);
        } while (c4.moveToNext());
    }
    if (c5.moveToFirst()) {
        do {
            que5 = c5.getString(0);
            opta5 = c5.getString(1);
            optb5 = c5.getString(2);
            optc5 = c5.getString(3);
            optd5 = c5.getString(4);
        } while (c5.moveToNext());
    }
    if (c6.moveToFirst()) {
        do {
            que6 = c6.getString(0);
            opta6 = c6.getString(1);
            optb6 = c6.getString(2);
            optc6 = c6.getString(3);
            optd6 = c6.getString(4);
        } while (c6.moveToNext());
    }
    if (c7.moveToFirst()) {
        do {
            que7 = c7.getString(0);
            opta7 = c7.getString(1);
            optb7 = c7.getString(2);
            optc7 = c7.getString(3);
            optd7 = c7.getString(4);
        } while (c7.moveToNext());
    }
    if (c8.moveToFirst()) {
        do {
            que8 = c8.getString(0);
            opta8 = c8.getString(1);
            optb8 = c8.getString(2);
            optc8 = c8.getString(3);
            optd8 = c8.getString(4);
        } while (c8.moveToNext());
    }
    if (c9.moveToFirst()) {
        do {
            que9 = c9.getString(0);
            opta9 = c9.getString(1);
            optb9 = c9.getString(2);
            optc9 = c9.getString(3);
            optd9 = c9.getString(4);
        } while (c9.moveToNext());
    }
    // int t33=i.getIntExtra("roll",0);
    //i.putExtra("t33",t33);
    t89 = (TextView) findViewById(R.id.textView100);
    t89.setText("ROLL NO= " + ro);
    t1 = (TextView) findViewById(R.id.textView27);
    t1.setText("" + que);
    r1 = (RadioButton) findViewById(R.id.radioButton);
    r1.setText("" + opta);
    r2 = (RadioButton) findViewById(R.id.radioButton2);
    r2.setText("" + optb);
    r3 = (RadioButton) findViewById(R.id.radioButton3);
    r3.setText("" + optc);
    r4 = (RadioButton) findViewById(R.id.radioButton4);
    r4.setText("" + optd);

    t2 = (TextView) findViewById(R.id.textView28);
    t2.setText("" + que1);
    r5 = (RadioButton) findViewById(R.id.radioButton5);
    r5.setText("" + opta1);
    r6 = (RadioButton) findViewById(R.id.radioButton6);
    r6.setText("" + optb1);
    r7 = (RadioButton) findViewById(R.id.radioButton7);
    r7.setText("" + optc1);
    r8 = (RadioButton) findViewById(R.id.radioButton8);
    r8.setText("" + optd1);

    t3 = (TextView) findViewById(R.id.textView29);
    t3.setText("" + que2);
    r9 = (RadioButton) findViewById(R.id.radioButton9);
    r9.setText("" + opta2);
    r10 = (RadioButton) findViewById(R.id.radioButton10);
    r10.setText("" + optb2);
    r11 = (RadioButton) findViewById(R.id.radioButton11);
    r11.setText("" + optc2);
    r12 = (RadioButton) findViewById(R.id.radioButton12);
    r12.setText("" + optd2);

    t4 = (TextView) findViewById(R.id.textView30);
    t4.setText("" + que3);
    r13 = (RadioButton) findViewById(R.id.radioButton13);
    r13.setText("" + opta3);
    r14 = (RadioButton) findViewById(R.id.radioButton14);
    r14.setText("" + optb3);
    r15 = (RadioButton) findViewById(R.id.radioButton15);
    r15.setText("" + optc3);
    r16 = (RadioButton) findViewById(R.id.radioButton16);
    r16.setText("" + optd3);

    t5 = (TextView) findViewById(R.id.textView31);
    t5.setText("" + que4);
    r17 = (RadioButton) findViewById(R.id.radioButton17);
    r17.setText("" + opta4);
    r18 = (RadioButton) findViewById(R.id.radioButton18);
    r18.setText("" + optb4);
    r19 = (RadioButton) findViewById(R.id.radioButton19);
    r19.setText("" + optc4);
    r20 = (RadioButton) findViewById(R.id.radioButton20);
    r20.setText("" + optd4);

    t6 = (TextView) findViewById(R.id.textView32);
    t6.setText("" + que5);
    r21 = (RadioButton) findViewById(R.id.radioButton21);
    r21.setText("" + opta5);
    r22 = (RadioButton) findViewById(R.id.radioButton22);
    r22.setText("" + optb5);
    r23 = (RadioButton) findViewById(R.id.radioButton23);
    r23.setText("" + optc5);
    r24 = (RadioButton) findViewById(R.id.radioButton24);
    r24.setText("" + optd5);

    t7 = (TextView) findViewById(R.id.textView33);
    t7.setText("" + que6);
    r25 = (RadioButton) findViewById(R.id.radioButton25);
    r25.setText("" + opta6);
    r26 = (RadioButton) findViewById(R.id.radioButton26);
    r26.setText("" + optb6);
    r27 = (RadioButton) findViewById(R.id.radioButton27);
    r27.setText("" + optc6);
    r28 = (RadioButton) findViewById(R.id.radioButton28);
    r28.setText("" + optd6);

    t8 = (TextView) findViewById(R.id.textView35);
    t8.setText("" + que7);
    r29 = (RadioButton) findViewById(R.id.radioButton29);
    r29.setText("" + opta7);
    r30 = (RadioButton) findViewById(R.id.radioButton30);
    r30.setText("" + optb7);
    r31 = (RadioButton) findViewById(R.id.radioButton31);
    r31.setText("" + optc7);
    r32 = (RadioButton) findViewById(R.id.radioButton32);
    r32.setText("" + optd7);

    t9 = (TextView) findViewById(R.id.textView36);
    t9.setText("" + que8);
    r33 = (RadioButton) findViewById(R.id.radioButton33);
    r33.setText("" + opta8);
    r34 = (RadioButton) findViewById(R.id.radioButton34);
    r34.setText("" + optb8);
    r35 = (RadioButton) findViewById(R.id.radioButton35);
    r35.setText("" + optc8);
    r36 = (RadioButton) findViewById(R.id.radioButton36);
    r36.setText("" + optd8);

    t10 = (TextView) findViewById(R.id.textView37);
    t10.setText("" + que9);
    r37 = (RadioButton) findViewById(R.id.radioButton37);
    r37.setText("" + opta9);
    r38 = (RadioButton) findViewById(R.id.radioButton38);
    r38.setText("" + optb9);
    r39 = (RadioButton) findViewById(R.id.radioButton39);
    r39.setText("" + optc9);
    r40 = (RadioButton) findViewById(R.id.radioButton40);
    r40.setText("" + optd9);

    addListnerOnButton();
}
/*catch (Exception E)
{
    Toast.makeText(this, "enter valid username or password", Toast.LENGTH_LONG).show();

}
  */


    public void addListnerOnButton()  {

//try {


    // final Questiontable t=new Questiontable(this);
    final Intent i = new Intent(this, Marks.class);
    g1 = (RadioGroup) findViewById(R.id.radiogroup1);
    g2 = (RadioGroup) findViewById(R.id.radiogroup2);
    g3 = (RadioGroup) findViewById(R.id.radiogroup3);
    g4 = (RadioGroup) findViewById(R.id.radiogroup4);
    g5 = (RadioGroup) findViewById(R.id.radiogroup5);
    g6 = (RadioGroup) findViewById(R.id.radiogroup6);
    g7 = (RadioGroup) findViewById(R.id.radiogroup7);
    g8 = (RadioGroup) findViewById(R.id.radiogroup8);
    g9 = (RadioGroup) findViewById(R.id.radiogroup9);
    g10 = (RadioGroup) findViewById(R.id.radiogroup10);

    b = (Button) findViewById(R.id.button11);
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selectedid = g1.getCheckedRadioButtonId();
            int selectedid1 = g2.getCheckedRadioButtonId();
            int selectedid2 = g3.getCheckedRadioButtonId();
            int selectedid3 = g4.getCheckedRadioButtonId();
            int selectedid4 = g5.getCheckedRadioButtonId();
            int selectedid5 = g6.getCheckedRadioButtonId();
            int selectedid6 = g7.getCheckedRadioButtonId();
            int selectedid7 = g8.getCheckedRadioButtonId();
            int selectedid8 = g9.getCheckedRadioButtonId();
            int selectedid9 = g10.getCheckedRadioButtonId();
            r41 = (RadioButton) findViewById(selectedid);
            r42 = (RadioButton) findViewById(selectedid1);
            r43 = (RadioButton) findViewById(selectedid2);
            r44 = (RadioButton) findViewById(selectedid3);
            r45 = (RadioButton) findViewById(selectedid4);
            r46 = (RadioButton) findViewById(selectedid5);
            r47 = (RadioButton) findViewById(selectedid6);
            r48 = (RadioButton) findViewById(selectedid7);
            r49 = (RadioButton) findViewById(selectedid8);
            r50 = (RadioButton) findViewById(selectedid9);
            String val = (String) r41.getText();
            String val2 = (String) r42.getText();
            String val3 = (String) r43.getText();
            String val4 = (String) r44.getText();
            String val5 = (String) r45.getText();
            String val6 = (String) r46.getText();
            String val7 = (String) r47.getText();
            String val8 = (String) r48.getText();
            String val9 = (String) r49.getText();
            String val10 = (String) r50.getText();
            i.putExtra("val", val);
            i.putExtra("val2", val2);
            i.putExtra("val3", val3);
            i.putExtra("val4", val4);
            i.putExtra("val5", val5);
            i.putExtra("val6", val6);
            i.putExtra("val7", val7);
            i.putExtra("val8", val8);
            i.putExtra("val9", val9);
            i.putExtra("val10", val10);
            i.putExtra("roll", ro);
            i.putExtra("sid", sro);
            i.putExtra("code", code);
            i.putExtra("top", top);
            startActivity(i);
        }
    });
}





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

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
            Intent i = new Intent(this, Marks.class);

            Toast.makeText(this, ro + sro + top, Toast.LENGTH_LONG).show();
            startActivity(i);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "enter valid username or password", Toast.LENGTH_LONG).show();

        }
    }


}



