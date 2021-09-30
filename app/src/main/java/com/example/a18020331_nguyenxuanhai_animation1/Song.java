package com.example.a18020331_nguyenxuanhai_animation1;

import java.io.Serializable;

public class Song implements Serializable {
    private String namesong;
    private String artist;
    private int imgAvatar;

    public Song() {
    }

    public Song(String namesong, String artist, int imgAvatar) {
        this.namesong = namesong;
        this.artist = artist;
        this.imgAvatar = imgAvatar;
    }

    public String getNamesong() {
        return namesong;
    }

    public void setNamesong(String namesong) {
        this.namesong = namesong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(int imgAvatar) {
        this.imgAvatar = imgAvatar;
    }
}
