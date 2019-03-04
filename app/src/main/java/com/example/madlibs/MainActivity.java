package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.System.out;

import java.io.InputStream;
import java.io.Serializable;


public class MainActivity extends AppCompatActivity {

    Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStarted(View v) {
        Intent intent = new Intent(MainActivity.this, StoryForm.class);
        startActivity(intent);
    }

}
