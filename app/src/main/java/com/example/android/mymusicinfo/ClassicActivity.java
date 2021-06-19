package com.example.android.mymusicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Für Elise","Beethoven",R.drawable.beethoven));
        songs.add(new Song("Ave Maria","Charles Gounod",R.drawable.charlesgounod));
        songs.add(new Song("Für Elise","Beethoven",R.drawable.beethoven));
        songs.add(new Song("Ave Maria","Charles Gounod",R.drawable.charlesgounod));
        songs.add(new Song("Für Elise","Beethoven",R.drawable.beethoven));
        songs.add(new Song("Ave Maria","Charles Gounod",R.drawable.charlesgounod));
        songs.add(new Song("Für Elise","Beethoven",R.drawable.beethoven));
        songs.add(new Song("Ave Maria","Charles Gounod",R.drawable.charlesgounod));
        songs.add(new Song("Für Elise","Beethoven",R.drawable.beethoven));
        songs.add(new Song("Ave Maria","Charles Gounod",R.drawable.charlesgounod));



        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}