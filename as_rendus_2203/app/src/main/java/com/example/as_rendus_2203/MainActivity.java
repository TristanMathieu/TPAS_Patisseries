package com.example.as_rendus_2203;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> listePatisseries = new ArrayList<>();
        listePatisseries.add(new ExampleItem(R.drawable.croissant, "Le croissant"));
        listePatisseries.add(new ExampleItem(R.drawable.pain_choco, "Le pain au chocolat"));
        listePatisseries.add(new ExampleItem(R.drawable.eclairs, "L'éclair à la vanille"));

        mRecyclerView = findViewById(R.id.listePatisserieView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(listePatisseries);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

}
