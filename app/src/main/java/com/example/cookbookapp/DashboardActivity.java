package com.example.cookbookapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void AccountClick(View view){
        Intent intent=new Intent(this, AccountActivity.class);
        startActivity(intent);
    }
    public void SettingsClick(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void SRecipesClick(View view){
        Intent intent = new Intent(this, SavedRecipesActivity.class);
        startActivity(intent);
    }
    public void PostsClick(View view){
        Intent intent=new Intent(this, RecipesActivity.class);
        startActivity(intent);
    }
    public void AboutClick(View view){
        Intent intent = new Intent(this,AboutUsActivity.class);
        startActivity(intent);
    }
    public void onLogOutCLick(View view){
        finish();
    }
}
