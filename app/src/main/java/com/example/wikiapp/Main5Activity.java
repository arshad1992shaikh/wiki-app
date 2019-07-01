package com.example.wikiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {

    ImageButton b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b1 = (ImageButton) findViewById(R.id.next);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        b2 = (ImageButton) findViewById(R.id.back);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, Main4Activity.class);
                startActivity(i);
            }
        });
    }
}
