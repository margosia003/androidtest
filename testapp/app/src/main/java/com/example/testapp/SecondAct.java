package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondAct extends AppCompatActivity {
    public static final String TAG = SecondAct.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: SecondAct");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: SecondAct");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: SecondAct");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: SecondAct");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: SecondAct");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: SecondAct");
    }
}