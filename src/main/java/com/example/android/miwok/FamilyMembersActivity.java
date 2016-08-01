package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> famMem = new ArrayList<Word>();
        famMem.add(new Word("father", "әpә"));
        famMem.add(new Word("mother", "әṭa"));
        famMem.add(new Word("son", "angsi"));
        famMem.add(new Word("daughter", "tune"));
        famMem.add(new Word("older brother", "taachi"));
        famMem.add(new Word("younger brother", "chalitti"));
        famMem.add(new Word("older sister", "teṭe"));
        famMem.add(new Word("younger sister", "kolliti"));
        famMem.add(new Word("grandmother", "ama"));
        famMem.add(new Word("grandfather", "paapa"));

        WordAdapter adapter = new WordAdapter(this, famMem);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
