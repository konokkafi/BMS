package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rent extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1;
    Save_rent my;
    EditText a,b,c,d,e,f,g;
    TextView m,n,o,p,q,r,s,t;
  //  public final static String MESSAGE_KEY ="GOOD JOB";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);


        e1 = (EditText) findViewById(R.id.editText4);
        e2 = (EditText) findViewById(R.id.editText5);
        e3 = (EditText) findViewById(R.id.editText6);
        e4 = (EditText) findViewById(R.id.editText7);
        e5 = (EditText) findViewById(R.id.editText8);
        e6 = (EditText) findViewById(R.id.editText9);
        e7 = (EditText) findViewById(R.id.editText12);
        b1 = (Button) findViewById(R.id.button9);
        my = new Save_rent(this);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rent.this,Show_rent.class);
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e1.getText().toString();
                if (e1.length() != 0) {

                    AddData(newentry);
                    e1.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e2.getText().toString();
                if (e2.length() != 0) {

                    AddData(newentry);
                    e2.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e3.getText().toString();
                if (e3.length() != 0) {

                    AddData(newentry);
                    e3.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e4.getText().toString();
                if (e4.length() != 0) {

                    AddData(newentry);
                    e4.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e5.getText().toString();
                if (e5.length() != 0) {

                    AddData(newentry);
                    e5.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e6.getText().toString();
                if (e6.length() != 0) {

                    AddData(newentry);
                    e6.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newentry = e7.getText().toString();
                if (e7.length() != 0) {

                    AddData(newentry);
                    e7.setText(" ");

                } else {
                    Toast.makeText(Rent.this, "you must put ", Toast.LENGTH_LONG).show();
                }

            }
        });







    }

        public void AddData (String newentry){

               boolean checker= my.addtotable(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString(),e7.getText().toString(),e6.getText().toString());
           if(checker==true)
           {
               Toast.makeText(Rent.this,"sucessfull",Toast.LENGTH_LONG).show();

           }
           else
           {

               Toast.makeText(Rent.this,"Unsucessfull",Toast.LENGTH_LONG).show();
           }


    }

    public void sendMessage(View view){

        a = (EditText)findViewById(R.id.editText4);

        b = (EditText)findViewById(R.id.editText5);

        c = (EditText)findViewById(R.id.editText6);

        d = (EditText)findViewById(R.id.editText7);

        e = (EditText)findViewById(R.id.editText8);

        f = (EditText)findViewById(R.id.editText9);

        g = (EditText)findViewById(R.id.editText12);

        String message1 = a.getText().toString();
        String message2 = b.getText().toString();
        String message3 = c.getText().toString();
        String message4 = d.getText().toString();
        String message5 = e.getText().toString();
        String message6 = f.getText().toString();
        String message7 = g.getText().toString();

        Intent intent = new Intent(Rent.this,Show_rent.class);
        intent.putExtra("House rent",message1);
        intent.putExtra("Gas bill",message2);
        intent.putExtra("Water bill",message3);
        intent.putExtra("Electric bill",message4);
        intent.putExtra("Others",message5);
        intent.putExtra("Total",message6);
        intent.putExtra("Rent",message7);
        startActivity(intent);

    }




}
