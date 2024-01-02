package com.denis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signup, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.button);
        login = findViewById(R.id.button2);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "leading to the signup page.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "leading to the login page.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}