package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        RecyclerView postsRecyclerView = findViewById(R.id.recyclerView);
        postsRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.happy3,"New Sponsorship","Reagale ->"));
        postItems.add(new PostItem(R.drawable.gift,"Johanna","Give a gift ->"));
        postItems.add(new PostItem(R.drawable.happy4,"Johanna","Give a gift"));
        postItems.add(new PostItem(R.drawable.happy7,"","How to use Amazon smile and give as you live"));
        postItems.add(new PostItem(R.drawable.happy8,"Sergio","3 years of sponsorship Thank you"));
        postItems.add(new PostItem(R.drawable.happy5,"New Photo","Sergio"));
        postItems.add(new PostItem(R.drawable.weatherfor,"Weather","My community ->"));
        postItems.add(new PostItem(R.drawable.happy10,"Sergio","Pray now ->"));
        postItems.add(new PostItem(R.drawable.thankyou,"Thank you","My children"));



        postsRecyclerView.setAdapter(new PostsAdapter(postItems));





    }
}