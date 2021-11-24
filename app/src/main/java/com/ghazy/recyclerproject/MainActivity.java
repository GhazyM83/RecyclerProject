package com.ghazy.recyclerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> songNames = new ArrayList<>();
        songNames.add("thank u, next");
        songNames.add("Happier Than Ever");
        songNames.add("Ana Majnoona");
        songNames.add("Smack that");
        songNames.add("Motn Gahar");

        RecyclerView recyclerView = findViewById(R.id.rvAllSongsMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, songNames);
        recyclerView.setAdapter(adapter);
    }
}