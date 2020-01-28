package com.esparse_matrix.mysportclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ForgotPasswordActivity extends AppCompatActivity {
    ImageView forgotback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        forgotback = findViewById(R.id.forgotback);
        forgotback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
