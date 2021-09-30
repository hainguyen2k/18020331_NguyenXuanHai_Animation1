package com.example.a18020331_nguyenxuanhai_animation1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class Screen01Activity extends AppCompatActivity {
    RecyclerView recyclerViewMusic;
    Srceen01Adapter adapter;
    LinkedList<Song> songs = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen01);

        recyclerViewMusic = findViewById(R.id.recyclerViewMusic);

        songs.add(new Song("Taylor Swift", "Love Story", R.drawable.eclipse));
//        songs.add(new Singer("Sơn Tùng", "Em của ngày hôm qua", R.drawable.sontung));
//        songs.add(new Singer("Phát Hồ", "Cố Giang Tình", R.drawable.phatho));
//        songs.add(new Singer("Chi Dân", "Không quan tâm", R.drawable.chidan));
//        songs.add(new Singer("Khắc Việt", "Như vậy nhé", R.drawable.khacviet));

        adapter = new Srceen01Adapter(songs, this, this);
        recyclerViewMusic.setAdapter(adapter);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}