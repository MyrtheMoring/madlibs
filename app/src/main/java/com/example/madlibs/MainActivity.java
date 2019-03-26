package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** The button onClick that starts the new activity in the StoryForm activity. */
    public void getStarted(View v) {
        Intent intent = new Intent(MainActivity.this, StoryFormActivity.class);
        startActivity(intent);
    }

}
