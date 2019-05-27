package com.androidlabs.toss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public String result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toss(View view) {
        TextView tview=(TextView)findViewById(R.id.textView3);
        int random = new Random().nextInt(10);
        if (random % 2 == 0) {
            result = "Heads";
        } else {
            result = "Tails";
        }

        Intent intent = new Intent(this,tosses.class);
        intent.putExtra("com.androidlabs.toss.MainActivity", result);
        startActivity(intent);

    }
}

