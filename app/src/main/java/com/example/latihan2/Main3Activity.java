package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button layout3 = findViewById(R.id.explicitintent3);
        layout3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.explicitintent3:
                Intent explicit2 = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(explicit2);
                break;
        }
    }
}
