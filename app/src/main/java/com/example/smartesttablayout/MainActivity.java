package com.example.smartesttablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSmartTab,btnNormalTab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSmartTab=findViewById(R.id.btnSmartTab);
        btnNormalTab=findViewById(R.id.btnNormalTab);

        btnSmartTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SmartTabActivity.class);
                startActivity(i);

            }
        });
        btnNormalTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NormalTabActivity.class);
                startActivity(i);



            }
        });
    }

}