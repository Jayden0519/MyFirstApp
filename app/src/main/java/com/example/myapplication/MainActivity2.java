package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void back(View v)
    {
        Log.i("click", "you clicked button next");
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "you clicked next!", Toast.LENGTH_LONG).show();
    }

    }
