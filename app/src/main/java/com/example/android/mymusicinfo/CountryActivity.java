package com.example.android.mymusicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Forever After All","Luke Combs",R.drawable.forever));
        songs.add(new Song("Amazed","Lonestar ",R.drawable.amazed));
        songs.add(new Song("Forever After All","Luke Combs",R.drawable.forever));
        songs.add(new Song("Amazed","Lonestar ",R.drawable.amazed));
        songs.add(new Song("Forever After All","Luke Combs",R.drawable.forever));
        songs.add(new Song("Amazed","Lonestar ",R.drawable.amazed));
        songs.add(new Song("Forever After All","Luke Combs",R.drawable.forever));
        songs.add(new Song("Amazed","Lonestar ",R.drawable.amazed));
        songs.add(new Song("Forever After All","Luke Combs",R.drawable.forever));
        songs.add(new Song("Amazed","Lonestar ",R.drawable.amazed));



        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}