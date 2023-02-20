package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "onCreate: MainActivity");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: MainActivity");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: MainActivity");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: MainActivity");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: MainActivity");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: MainActivity");
    }

    public void LaunchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondAct.class);
        startActivity(intent);
    }
}