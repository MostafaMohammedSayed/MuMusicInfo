package com.example.android.mymusicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jazzTextView = (TextView) findViewById(R.id.jazz);

        jazzTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,JazzActivity.class);
                startActivity(intent);
            }
        });

        TextView bluesTextView = (TextView) findViewById(R.id.blues);

        bluesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BluesActivity.class);
                startActivity(intent);
            }
        });

        TextView countryTextView = (TextView) findViewById(R.id.country);

        countryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(intent);
            }
        });

        TextView classicTextView = (TextView) findViewById(R.id.classic);

        classicTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ClassicActivity.class);
                startActivity(intent);
            }
        });
    }
}