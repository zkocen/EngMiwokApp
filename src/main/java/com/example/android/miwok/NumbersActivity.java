package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.LinkedList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("one", "lutti"));
        numbers.add(new Word("two", "otiiko"));
        numbers.add(new Word("three", "tolookosu"));
        numbers.add(new Word("four", "oyyisa"));
        numbers.add(new Word("five", "massokka"));
        numbers.add(new Word("six", "temmokka"));
        numbers.add(new Word("seven", "kenekaku"));
        numbers.add(new Word("eight", "kawinta"));
        numbers.add(new Word("nine", "wo'e"));
        numbers.add(new Word("ten", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
