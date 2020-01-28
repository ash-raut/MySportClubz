package com.esparse_matrix.mysportclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContinueAppActivity extends AppCompatActivity {
    Button btlogincontinue, btregistercontinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_app);
        btlogincontinue = findViewById(R.id.logincontinue);
        btregistercontinue = findViewById(R.id.registercontinue);
        btlogincontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new  Intent(ContinueAppActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
       btregistercontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new  Intent(ContinueAppActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
