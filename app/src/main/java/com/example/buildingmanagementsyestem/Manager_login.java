package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manager_login extends AppCompatActivity {

    public Button butt1;

    public void init() {
        butt1 = (Button) findViewById(R.id.button4);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy6 = new Intent(Manager_login.this,Rent.class);
                startActivity(toy6);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_login);
        init();
    }
}
