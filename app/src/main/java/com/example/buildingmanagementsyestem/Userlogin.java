package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Userlogin extends AppCompatActivity {


    public Button butt1;

    public void init() {
        butt1 = (Button) findViewById(R.id.button3);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy3 = new Intent(Userlogin.this, Number_Of_Room.class);
                startActivity(toy3);
            }
        });

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        init();
    }
}
