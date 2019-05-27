package com.androidlabs.toss;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class tosses extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=getIntent();
                String message = intent.getStringExtra("com.androidlabs.toss.MainActivity");

                if (message.equals("Heads"))
                {
                    setContentView(R.layout.heads);
                }
                else {
                    setContentView(R.layout.tails);
                }

            }
        }, 3000);
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
                setContentView(R.layout.activity_main);
            }
        }, 5000);
    }


    }



