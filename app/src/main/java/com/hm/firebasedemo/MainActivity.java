package com.hm.firebasedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent: ");
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            Log.e(TAG, "onNewIntent: " + bundle.toString());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Log.e(TAG, "onResume: age=" + bundle.get("age") + ",height=" + bundle.get("height"));
        }
    }
}
