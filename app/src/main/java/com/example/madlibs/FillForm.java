package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;

public class FillForm extends AppCompatActivity {

    Story story;
    String placeholder;
    TextView plholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_form);

        if (savedInstanceState != null){
            story = (Story) savedInstanceState.getSerializable("story");
        }
        else {
            Intent intent = getIntent();
            story = (Story) intent.getSerializableExtra("Story");
        }

        int wordsleft = story.getPlaceholderRemainingCount();
        TextView wordcount = findViewById(R.id.numberwords);
        wordcount.setText("Number of words left: " + wordsleft);

        placeholder = story.getNextPlaceholder();
        plholder = findViewById(R.id.placeholder);
        plholder.setText("Word type: " + placeholder.toLowerCase());

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("story", story);
    }

    public void filledStory(View v){

        EditText input = findViewById(R.id.inputword);
        String inputword = input.getText().toString();

        int wordsleft = story.getPlaceholderRemainingCount()-1;
        TextView wordcount = findViewById(R.id.numberwords);
        wordcount.setText("Number of words left: " + wordsleft);


        if (!(inputword.isEmpty())){
            story.fillInPlaceholder(inputword);
            input.setText("");
            placeholder = story.getNextPlaceholder();
            plholder = findViewById(R.id.placeholder);
            plholder.setText("Word type: " + placeholder.toLowerCase());
        }

        if (story.isFilledIn()){
            String storystring = story.toString();
            Intent intent = new Intent(this, FIlledStory.class);
            intent.putExtra("storystring", storystring);
            startActivity(intent);
        }

    }


}
