package com.example.pr1java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imgBoom;
    private Button buttoboom;
    private AnimationDrawable animationDrawable;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgBoom = findViewById(R.id.imgBoom);
        buttoboom = findViewById(R.id.buttoboom);

        animationDrawable = (AnimationDrawable) imgBoom.getDrawable();

        if(!animationDrawable.isRunning()){
            animationDrawable.start();
        }

        buttoboom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}