package com.example.a18020331_nguyenxuanhai_animation1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LavenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavender);
        findViewById(R.id.btnBack1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ex2Activity.class));

                overridePendingTransition(R.anim.enter, R.anim.exit);


            }
        });
    }
}