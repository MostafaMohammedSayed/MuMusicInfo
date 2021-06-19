package com.example.android.mymusicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        ArrayList<Song> jazzSongs = new ArrayList<>();
        Song summerTime = new Song("Dream A Little Dream Of Me","Louis & Ella",R.mipmap.louisella);
        jazzSongs.add(summerTime);

        TextView songNametextView= (TextView)findViewById(R.id.songName);
        songNametextView.setText(summerTime.songName);

        TextView songArtisttextView= (TextView)findViewById(R.id.artist);
        songArtisttextView.setText(summerTime.artist);


        ImageView songImageImageView= (ImageView)findViewById(R.id.songImage);
        songImageImageView.setImageResource(summerTime.image);
    }
}