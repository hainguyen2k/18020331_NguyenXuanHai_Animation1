package com.example.a18020331_nguyenxuanhai_animation1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class Ex2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        // we are adding fade animation for enter transition.
        getWindow().setEnterTransition(fade);

        // we are also setting fade animation for exit transition.
        getWindow().setExitTransition(fade);
        // initializing our imageview.

        final ImageView imgLavender = findViewById(R.id.imgLavender);
        // setting on click listener for our imageview.
        imgLavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(Ex2Activity.this,
                        LavenderActivity.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Ex2Activity.this, imgLavender,
                                ViewCompat.getTransitionName(imgLavender));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

        final ImageView imgLightLavender = findViewById(R.id.imgLightLavender);
        // setting on click listener for our imageview.
        imgLightLavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(Ex2Activity.this,
                        LightLavenderActivity.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Ex2Activity.this, imgLightLavender,
                                ViewCompat.getTransitionName(imgLightLavender));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });
    }
}