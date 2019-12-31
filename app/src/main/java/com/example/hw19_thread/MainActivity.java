package com.example.hw19_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Tv1 = findViewById(R.id.tv_1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              Tv1.setText("Got it");
            }
        }, 2000);
    }

}


//http://brianchen85.blogspot.com/2014/12/android-handler-delay.html