package com.example.android.mymusicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Dream A Little Dream Of Me","Louis & Ella",R.drawable.louisella));
        songs.add(new Song("New York, New York","Frank Sinatra",R.drawable.franksinatra));
        songs.add(new Song("Dream A Little Dream Of Me","Louis & Ella",R.drawable.louisella));
        songs.add(new Song("New York, New York","Frank Sinatra",R.drawable.franksinatra));
        songs.add(new Song("Dream A Little Dream Of Me","Louis & Ella",R.drawable.louisella));
        songs.add(new Song("New York, New York","Frank Sinatra",R.drawable.franksinatra));
        songs.add(new Song("Dream A Little Dream Of Me","Louis & Ella",R.drawable.louisella));
        songs.add(new Song("New York, New York","Frank Sinatra",R.drawable.franksinatra));
        songs.add(new Song("Dream A Little Dream Of Me","Louis & Ella",R.drawable.louisella));
        songs.add(new Song("New York, New York","Frank Sinatra",R.drawable.franksinatra));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}