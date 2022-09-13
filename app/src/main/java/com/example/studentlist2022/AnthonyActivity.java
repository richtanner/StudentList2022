package com.example.studentlist2022;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class AnthonyActivity extends AppCompatActivity implements RecyclerViewInterfaceAGM {

    ArrayList<String> appIdeaList = new ArrayList<>();
    RecyclerView recyclerView;
    // Array of strings...
    String[] langArray = {
            "LvlUp",
            "Church Geolocator",
            "Custom Sounds Alarm",
            "Christian Social Media",
            "Virtual Study Group",
            "Motivator App",
            "Accountability App"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anthony_moncivais);

        recyclerView = findViewById(R.id.AGM_RecyclerView);
        setUpList();

        RecyclerViewAdapterAGM adapter = new RecyclerViewAdapterAGM(this, appIdeaList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpList()
    {
        appIdeaList.addAll(Arrays.asList(langArray));
    }



    @Override
    public void onItemClick(int position) {
        Context context = recyclerView.getContext();
        Intent intent;

        switch(position)
        {
            case 0:
                intent = new Intent(context, AppIdeaAGM.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, AppIdea2AGM.class);
                context.startActivity(intent);
                break;
        }
    }
}
