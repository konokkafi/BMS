package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Number_Of_Room extends AppCompatActivity {

    public Button butt1;

    public void init() {
        butt1 = (Button) findViewById(R.id.button5);
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
        init();
    }
}
