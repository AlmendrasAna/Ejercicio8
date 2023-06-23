package com.example.ejercicio8;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG,"onCreate Activity2 ---");
        initLiteners();

    }

    private void initLiteners() {

        Button goToUrlB = findViewById(R.id.buttonGoUrl);
        Button backB = findViewById(R.id.back);


        goToUrlB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intertWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(intertWeb);
            }
        });

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}