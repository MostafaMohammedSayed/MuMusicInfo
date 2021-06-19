package com.example.android.mymusicinfo;

import android.media.Image;

public class Song {
    String songName;
    String artist;
    int image;

    public Song(String songName, String artist, int image) {
        this.songName = songName;
        this.artist = artist;
        this.image = image;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}


