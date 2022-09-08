package com.example.studentlist2022;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class AnthonyActivity extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<String> appIdeaList = new ArrayList<>();
    RecyclerView recyclerView;
    // Array of strings...
    String[] langArray = {
            "LvlUp",
            "Church Geolocator",
            "HTML",
            "CSS",
            "JavaScript",
            "SQL",
            "C++"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anthony_moncivais);

        recyclerView = findViewById(R.id.AGM_RecyclerView);
        setUpList();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, appIdeaList, this);
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
                intent = new Intent(context, AppIdea2.class);
                context.startActivity(intent);
                break;
        }
    }
}
