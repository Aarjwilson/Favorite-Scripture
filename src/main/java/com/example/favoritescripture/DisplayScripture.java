package com.example.favoritescripture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayScripture extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);
        Intent intent = getIntent();
        TextView scripture = findViewById(R.id.rcvd_scripture);
        scripture.setText(intent.getStringExtra("scripture"));

        Log.d(TAG, "Received intent with " + scripture);
    }
}