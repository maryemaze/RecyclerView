package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String[] titre;
    String[] Soust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv =findViewById(R.id.RecyclerV);

        titre = getResources().getStringArray(R.array.tit);
        Soust = getResources().getStringArray(R.array.stit);
        ListAdapter ad;
        Integer[] img = {R.drawable.Home,R.drawable.p,R.drawable.Home,R.drawable.p,R.drawable.Home,R.drawable.p};

        ad = new ListAdapter(MainActivity.this,titre,Soust,img);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ad);
    }
}