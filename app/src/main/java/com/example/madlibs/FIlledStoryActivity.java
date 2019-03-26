package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class FIlledStoryActivity extends AppCompatActivity {

    /** The onCreate function gets the story from the FillForm activity and set the text in the
     * filledStory activity layout. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filled_story);

        Intent intent = getIntent();
        String story = intent.getStringExtra("storystring");

        TextView storytext = (TextView) findViewById(R.id.filledStory);
        storytext.setText(Html.fromHtml(story,Html.FROM_HTML_MODE_LEGACY));
    }

    /** The onClick function to go back to the StoryForm to fill in a new story. */
    public void backtoStory(View v){
        Intent intent = new Intent(FIlledStoryActivity.this, StoryFormActivity.class);
        startActivity(intent);
    }
}
