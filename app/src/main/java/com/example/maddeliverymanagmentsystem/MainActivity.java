package com.example.maddeliverymanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "On Create called...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "On Start called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "On Resume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "On Pause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "On Stop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "On Stop called...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "On Restart called...");
    }
}