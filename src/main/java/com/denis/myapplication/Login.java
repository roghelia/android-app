package com.denis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b1;
    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = findViewById(R.id.b4);
        t1 = findViewById(R.id.uname);
        t2 = findViewById(R.id.pass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.equals("admin") && t2.equals("abc")) {
                    Toast.makeText(Login.this, "Valid Login", Toast.LENGTH_LONG).show();
                    System.out.println("working");
                } else {
                    Toast.makeText(Login.this, "Invalid Login", Toast.LENGTH_LONG).show();
                    System.out.println("not working");
                }
            }
        });

    }
}