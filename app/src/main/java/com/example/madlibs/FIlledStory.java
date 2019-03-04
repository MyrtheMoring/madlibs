package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class FIlledStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filled_story);

        Intent intent = getIntent();
        String story = intent.getStringExtra("storystring");

        TextView storytext = (TextView) findViewById(R.id.filledStory);
        storytext.setText(Html.fromHtml(story,Html.FROM_HTML_MODE_LEGACY));
    }

    public void backtoStory(View v){
        Intent intent = new Intent(FIlledStory.this, StoryForm.class);
        startActivity(intent);
    }
}
