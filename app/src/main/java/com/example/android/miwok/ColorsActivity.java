package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red", "weṭeṭṭi"));
        words.add(new word("mustard yellow", "chiwiiṭә"));
        words.add(new word("dusty yellow", "ṭopiisә"));
        words.add(new word("green", "chokokki"));
        words.add(new word("brown", "ṭakaakki"));
        words.add(new word("gray", "ṭopoppi"));
        words.add(new word("black", "kululli"));
        words.add(new word("white", "kelelli"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
