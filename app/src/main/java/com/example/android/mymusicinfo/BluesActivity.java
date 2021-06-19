package com.example.android.mymusicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Lonely Bed","Albert Cummings",R.drawable.bed));
        songs.add(new Song("Picasso Blue","Mo Rodgers",R.drawable.picasso));
        songs.add(new Song("Lonely Bed","Albert Cummings",R.drawable.bed));
        songs.add(new Song("Picasso Blue","Mo Rodgers",R.drawable.picasso));
        songs.add(new Song("Lonely Bed","Albert Cummings",R.drawable.bed));
        songs.add(new Song("Picasso Blue","Mo Rodgers",R.drawable.picasso));
        songs.add(new Song("Lonely Bed","Albert Cummings",R.drawable.bed));
        songs.add(new Song("Picasso Blue","Mo Rodgers",R.drawable.picasso));
        songs.add(new Song("Lonely Bed","Albert Cummings",R.drawable.bed));
        songs.add(new Song("Picasso Blue","Mo Rodgers",R.drawable.picasso));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}