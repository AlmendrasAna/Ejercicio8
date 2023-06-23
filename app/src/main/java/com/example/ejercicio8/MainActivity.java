package com.example.ejercicio8;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initLiteners();
    Log.d(TAG,"onCreate ---Activity1");

    }

    private void initLiteners() {

        Button secondActivityB = findViewById(R.id.buttonSecondActivity);
        Button destroyB = findViewById(R.id.buttonDestroy);
        secondActivityB.setOnClickListener(new View.OnClickListener() {
             @Override
    public void onClick(View v) {
        Intent intent = new Intent( MainActivity.this, MainActivity2.class );
    startActivity(intent);
             }
});
        destroyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
onDestroy();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy ---");

    }
}