package com.esparse_matrix.mysportclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button DoNotAccregister,btlogin;
    ImageView loginback;
    TextView forgotpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DoNotAccregister = findViewById(R.id.DHARegister);
        loginback = findViewById(R.id.loginback);
        forgotpass = findViewById(R.id.forgotpass);
        btlogin = findViewById(R.id.login);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,DrawerActivity.class);
                startActivity(intent);

            }
        });
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
        loginback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ContinueAppActivity.class);
                startActivity(intent);
            }
        });
        DoNotAccregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
