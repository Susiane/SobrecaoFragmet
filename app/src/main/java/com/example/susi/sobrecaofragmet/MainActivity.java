package com.example.susi.sobrecaofragmet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private View include1;
    private View include2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new TesteFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                //fragmentManager.beginTransaction().replace(R.id.include_home, fragment).commit();
                fragmentManager.beginTransaction().replace(R.id.include_home1, fragment).addToBackStack(null).commit();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeFragment();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                include1.setVisibility(View.GONE);
                include2.setVisibility(View.VISIBLE);
            }
        });

        include1 = (View) findViewById(R.id.include_home1);
        include2 = (View) findViewById(R.id.include_home2);

    }


    public void closeFragment() {
        getSupportFragmentManager().beginTransaction().remove(fragment).commit();
    }
}
