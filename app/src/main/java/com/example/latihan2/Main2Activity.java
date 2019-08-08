package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button layout2 = findViewById(R.id.explicitintent2);
        layout2.setOnClickListener(this);
    }

    @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.explicitintent2:
                    Intent explicit1 = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(explicit1);
                    break;
    }
}
}