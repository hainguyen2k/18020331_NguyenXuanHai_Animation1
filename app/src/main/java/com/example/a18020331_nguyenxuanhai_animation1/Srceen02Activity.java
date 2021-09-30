package com.example.a18020331_nguyenxuanhai_animation1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Srceen02Activity extends AppCompatActivity {

    ImageView imgAvatar2;
    TextView tvArtist2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srceen02);

        imgAvatar2 = findViewById(R.id.imgAvatar2);
        tvArtist2 = findViewById(R.id.tvArtist2);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("entity");
        Song song = (Song) bundle.getSerializable("song");
        tvArtist2.setText(song.getNamesong() + "-" + song.getArtist());
        imgAvatar2.setImageResource(song.getImgAvatar());

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anirotate);

        imgAvatar2.startAnimation(animation);
    }
}