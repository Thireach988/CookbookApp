package com.example.cookbookapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartupActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        new Handler().postDelayed(new Runnabl() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(StartupActivity.this, RecipesActivity.class);
                startActivity(loginIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
