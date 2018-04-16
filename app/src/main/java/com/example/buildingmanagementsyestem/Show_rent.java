package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show_rent extends AppCompatActivity {

    String hr;
    String gb;
    String wb;
    String eb;
    String ot;
    String to;
    String co;

    //public final static String MESSAGE_KEY ="GOOD JOB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
/*
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView textView = new TextView(this);
       // textView.setTextSize(20);
        textView.setText(message);
        setContentView(textView);

*/      setContentView(R.layout.activity_show_rent);


        hr = getIntent().getExtras().getString("House rent");
        gb = getIntent().getExtras().getString("Gas bil");
        wb = getIntent().getExtras().getString("Water bill");
        eb = getIntent().getExtras().getString("Electric bill");
        ot = getIntent().getExtras().getString("Others");
        to = getIntent().getExtras().getString("Totals");
        co = getIntent().getExtras().getString("Rent");

        TextView textView = (TextView)findViewById(R.id.textView9);
        textView.setText("House rent:"+" "+hr+'\n'+'\n'+"Gas bill:"+" "+gb+'\n'+'\n'+"Water bill:"+" "+wb+'\n'+'\n'+"Electric bill:"+" "+eb+'\n'+'\n'+"Others:"+" "+ot+'\n'+'\n'+"Total:"+" "+to+'\n'+'\n'+"Rent status:"+" "+co+" ");

    }
}
