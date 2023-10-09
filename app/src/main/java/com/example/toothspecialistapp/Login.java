package com.example.toothspecialistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText emailEditText;
    EditText passwordEditText;
    Button btnLogin;


    @Override
    protected <activity_Login, activity_login> void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            if (emailEditText.getText().toString().equals("user")&& passwordEditText.getText().toString().equals("1234")) {
                Toast.makeText(activity_Login.this,"Login Successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(activity_login.this,"Login Failed!", Toast.LENGTH_SHORT).show();
              }
           });
        }
    }
