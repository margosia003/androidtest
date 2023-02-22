package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMusic(View view) {
        Intent playMusicIntent = new Intent(this, MusicPlayerService.class);

        startService(playMusicIntent);
    }

    public void pauseMusic(View view) {
        Intent pauseMusicIntent = new Intent(this, MusicPlayerService.class);

        stopService(pauseMusicIntent);
    }
}