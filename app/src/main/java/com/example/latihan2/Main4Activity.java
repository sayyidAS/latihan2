package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button layout4 = findViewById(R.id.explicitintent4);
        layout4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.explicitintent4:
                Intent explicit3 = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(explicit3);
                break;
        }
    }
}
