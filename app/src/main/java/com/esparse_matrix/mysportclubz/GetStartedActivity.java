package com.esparse_matrix.mysportclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedActivity extends AppCompatActivity {
    Button btstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        btstarted = findViewById(R.id.getstarted);
        btstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetStartedActivity.this,ContinueAppActivity.class);
                startActivity(intent);
            }
        });
    }
}
