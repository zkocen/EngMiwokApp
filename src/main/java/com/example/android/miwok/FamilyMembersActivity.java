package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> famMem = new ArrayList<Word>();
        famMem.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        famMem.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        famMem.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        famMem.add(new Word("daughter", "tune", R.drawable.family_daughter, R.drawable.family_daughter));
        famMem.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        famMem.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        famMem.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        famMem.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        famMem.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        famMem.add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, famMem, R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word famMems = famMem.get(position);
                mediaPlayer.create(FamilyMembersActivity.this, famMems.getmAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}
