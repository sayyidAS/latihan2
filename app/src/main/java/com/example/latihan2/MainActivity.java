package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button link = findViewById(R.id.imppliciintent);
        Button layout1 = findViewById(R.id.explicitintent1);
        link.setOnClickListener(this);
        layout1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imppliciintent:
                Intent implisit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(implisit);
                break;
            case R.id.explicitintent1:
                Intent explicit1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(explicit1);
                break;
        }
    }

}
