package com.example.buildingmanagementsyestem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public Button butt1;

    public void init() {
        butt1 = (Button) findViewById(R.id.button);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this, Userlogin.class);
                startActivity(toy);
            }
        });

    }

    public Button butt2;

    public void init1() {
        butt2 = (Button) findViewById(R.id.button2);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1 = new Intent(MainActivity.this, Manager_login.class);
                startActivity(toy1);
            }
        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init1();
    }




}

    /*FragmentA frA = new FragmentA();
    FragmentB frB = new FragmentB();*/


//}










  /*  public void method1(View view){

        Toast.makeText(getApplicationContext(), "Transferring To User Login", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, user_login_activity.class);
        intent.putExtra("EXTRA_", "THIS IS THE MESSAGE");
        startActivity(intent);



    FragmentManager fm= getFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.fragment,frA,"FragmentA");
    ft.commit();

    }

    public void method2(View view){
        Toast.makeText(getApplicationContext(), "Transferring To Manager Login", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, manager_login_activity.class);
        intent.putExtra("EXTRA_", "THIS IS THE MESSAGE");
        startActivity(intent);


    }
*/
