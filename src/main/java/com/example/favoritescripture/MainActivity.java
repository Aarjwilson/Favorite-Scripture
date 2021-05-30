package com.example.favoritescripture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    String book;
    String chapter;
    String verse;

    EditText textBook;
    EditText textChapter;
    EditText textVerse;

    Button submitScripture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBook = (EditText) findViewById(R.id.textBook);
        textChapter = (EditText) findViewById(R.id.textChapter);
        textVerse = (EditText) findViewById(R.id.textVerse);

        submitScripture = (Button) findViewById(R.id.submitScripture);

    }

    public void submitScripture(View view) {
        // Enter Code Here
        book = textBook.getText().toString();
        chapter = textChapter.getText().toString();
        verse = textVerse.getText().toString();

        String scripture = book + " " + chapter + ":" + verse;

        //Debug Code
        Log.d(TAG, "About to create intent with " + scripture);


        Intent intent = new Intent(this, DisplayScripture.class);
        intent.putExtra("scripture", scripture);
        startActivity(intent);

        //showToast(book);
        //showToast(chapter);
        //showToast(verse);
    }

    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

}