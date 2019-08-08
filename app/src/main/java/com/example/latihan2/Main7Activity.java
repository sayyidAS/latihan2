package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button layout7 = findViewById(R.id.explicitintent7);
        layout7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.explicitintent7:
                Intent explicit6 = new Intent(Main7Activity.this, MainActivity.class);
                startActivity(explicit6);
                break;
        }
    }
}