package com.example.blackcoffer_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView2;
    RecyclerView recyclerView;
    Toolbar toolbar;
ArrayList<ProfileModel> arrProfile = new ArrayList<>();
ArrayList<OnlineModel> arrOnline = new ArrayList<>();
    Intent inext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView2 =  findViewById(R.id.recyclerOnline);
        recyclerView = findViewById(R.id.recyclercontainer);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
        toolbar.setTitle("BlackCoffer");


        arrProfile.add(new ProfileModel(R.drawable.p1,
                "Shrikant Tiwari",
                "Mumbai",
                "Analyst",
                "Within 500 m",
                "Coffee",
                "Bussiness",
                "Friendship",
                "Hi community! I am open to new connection"));
        arrProfile.add(new ProfileModel(R.drawable.p2,
                "Loolak Dubey",
                "Mumbai",
                "Doctor",
                "Within 100-200 m",
                "Coffee",
                "Movie",
                "Friendship",
                "Hi community! I want to spend some happy times."));
        arrProfile.add(new ProfileModel(R.drawable.p3,
                "Munna Tripathi",
                "Mirzapur",
                "Bussinessman",
                "Within 400-500 m",
                "",
                "Bussiness",
                "",
                "Hi community! I am open to new connection"));
        arrProfile.add(new ProfileModel(R.drawable.p4,
                "Guddu Pandit",
                "Mirzapur",
                "Bussinessman",
                "Within 200-300 m",
                "Dinning",
                "Bussiness",
                "Friendship",
                "Hi community! I am open to new Bussinesses and Friendship."));
        arrProfile.add(new ProfileModel(R.drawable.p5,
                "Suchi",
                "Mumbai",
                "Software Developer",
                "Within 200-300 m",
                "Dinning",
                "Bussiness",
                "Friendship",
                "Hi community! I am open to new Bussinesses and Friendship."));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        RecyclerProfileAdapter adapter = new RecyclerProfileAdapter(MainActivity.this,arrProfile);
        recyclerView.setAdapter(adapter);

        arrOnline.add(new OnlineModel(R.drawable.p1));
        arrOnline.add(new OnlineModel(R.drawable.p2));
        arrOnline.add(new OnlineModel(R.drawable.p3));
        arrOnline.add(new OnlineModel(R.drawable.p4));
        arrOnline.add(new OnlineModel(R.drawable.p1));
        arrOnline.add(new OnlineModel(R.drawable.p5));
        arrOnline.add(new OnlineModel(R.drawable.p4));
        arrOnline.add(new OnlineModel(R.drawable.p3));
        arrOnline.add(new OnlineModel(R.drawable.p2));
        arrOnline.add(new OnlineModel(R.drawable.p5));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        RecyclerOnlineAdapter adapter2 = new RecyclerOnlineAdapter(MainActivity.this,arrOnline);
        recyclerView2.setAdapter(adapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();
        if (itemid == R.id.refine) {
            inext = new Intent(MainActivity.this,Refine_Page.class);
            startActivity(inext);
        } else {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}