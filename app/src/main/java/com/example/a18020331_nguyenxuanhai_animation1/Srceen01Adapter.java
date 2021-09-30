package com.example.a18020331_nguyenxuanhai_animation1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class Srceen01Adapter extends RecyclerView.Adapter<Srceen01Adapter.Screen01Holder>{

    private LinkedList<Song> songs;
    private LayoutInflater inflater;
    private Context context;
    private Activity activity;

    public Srceen01Adapter(LinkedList<Song> songs, Context context, Activity activity) {
        this.songs = songs;
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.activity = activity;
    }
    @NonNull
    @Override
    public Srceen01Adapter.Screen01Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.music, parent, false);
        return new Screen01Holder(view, this);

    }

    @Override
    public void onBindViewHolder(@NonNull Srceen01Adapter.Screen01Holder holder, int position) {
        Song song = songs.get(position);
        holder.tvArtist.setText(song.getArtist());
        holder.tvNameSong.setText(song.getNamesong());
        holder.img.setImageResource(song.getImgAvatar());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class Screen01Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private Srceen01Adapter adapter;
        ImageView img;
        TextView tvNameSong, tvArtist;
        public Screen01Holder(@NonNull View itemView, Srceen01Adapter srceen01Adapter) {
            super(itemView);
            tvArtist = itemView.findViewById(R.id.tvArtist);
            tvNameSong = itemView.findViewById(R.id.tvNameSong);
            img = itemView.findViewById(R.id.imgAvatar);
            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, Srceen02Activity.class);
            Song song = songs.get(getLayoutPosition());

            Bundle bundle = new Bundle();
            bundle.putSerializable("song", song);
            intent.putExtra("entity", bundle);

            context.startActivity(intent);
            activity.overridePendingTransition(R.anim.enter_x, R.anim.exit_x);
        }
    }
}
