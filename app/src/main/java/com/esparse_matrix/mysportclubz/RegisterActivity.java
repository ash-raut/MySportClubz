package com.esparse_matrix.mysportclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {
    Button AlreadyLogin;
    ImageView registerback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        AlreadyLogin = findViewById(R.id.AHAlogin);
        registerback = findViewById(R.id.registerback);
        registerback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,ContinueAppActivity.class);
                startActivity(intent);
            }
        });
        AlreadyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
