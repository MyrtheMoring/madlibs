package com.example.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.InputStream;

public class StoryFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storyform);
    }

    /** Button onClick function storyButton that gets the story type from the inputstream and
     * starts a new activity with the story in the given intent. */
    public void storyButton(View v){
        InputStream storystream = getResources().openRawResource(R.raw.madlib0_simple);
        switch (v.getId()) {
            case R.id.tarzan:
                storystream = getResources().openRawResource(R.raw.madlib1_tarzan);
                break;
            case R.id.university:
                storystream = getResources().openRawResource(R.raw.madlib2_university);
                break;
            case R.id.clothes:
                storystream = getResources().openRawResource(R.raw.madlib3_clothes);
                break;
            case R.id.dance:
                storystream = getResources().openRawResource(R.raw.madlib4_dance);
                break;
        }

        Story story = new Story(storystream);
        Intent intent = new Intent(StoryFormActivity.this, FillFormActivity.class);
        intent.putExtra("Story", story);
        startActivity(intent);
    }

}


