package com.example.exp_17_mad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Log.d("Activity Lifecycle","onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Acticity Lifecycle","onStart invoked");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        Log.d("Activity Lifecycle","onDestroy invoked");
        super.onDestroy();

    }
}