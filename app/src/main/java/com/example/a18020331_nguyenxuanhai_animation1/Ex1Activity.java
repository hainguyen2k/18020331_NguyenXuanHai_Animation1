package com.example.a18020331_nguyenxuanhai_animation1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ex1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        findViewById(R.id.btnGo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Ex1Activity.this,
                        Ex2Activity.class));

                overridePendingTransition(R.anim.enter_x, R.anim.exit_x);

            }
        });
    }
}