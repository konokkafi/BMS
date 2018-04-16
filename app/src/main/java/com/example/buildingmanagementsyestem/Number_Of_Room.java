package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Number_Of_Room extends AppCompatActivity {

    public Button butt1;

    public void init1() {
        butt1 = (Button) findViewById(R.id.button5);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy4 = new Intent(Number_Of_Room.this, Rent.class);
                startActivity(toy4);
            }
        });

    }

    public Button butt2;

    public void init2() {
        butt2 = (Button) findViewById(R.id.button6);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy4 = new Intent(Number_Of_Room.this, Rent.class);
                startActivity(toy4);
            }
        });

    }

    public Button butt3;

    public void init3() {
        butt1 = (Button) findViewById(R.id.button7);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy4 = new Intent(Number_Of_Room.this, Rent.class);
                startActivity(toy4);
            }
        });

    }

    public Button butt4;

    public void init4() {
        butt1 = (Button) findViewById(R.id.button8);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy4 = new Intent(Number_Of_Room.this, Rent.class);
                startActivity(toy4);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number__of__room);
        init1();
        init2();
        init3();
        init4();
    }
}
