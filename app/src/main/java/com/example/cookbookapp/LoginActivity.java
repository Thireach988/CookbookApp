package com.example.cookbookapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onButtonClick(View view) {
        username=findViewById(R.id.txt_username);
        password=findViewById(R.id.txt_password);
        if (username.getText().toString().isEmpty()) {
            username.setError("Username is required.");
        }
        else if (password.getText().toString().isEmpty()) {
            password.setError("Password is required.");
        }
//        EditText txtUsername = findViewById(R.id.txt_username);
//        String username = txtUsername.getText().toString();
        else {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        }
    }

}
