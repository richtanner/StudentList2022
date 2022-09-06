package com.example.studentlist2022;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class AnthonyActivity extends AppCompatActivity {

    ArrayList<String> appIdeaList = new ArrayList<>();

    // Array of strings...
    String[] langArray = {
            "Create a list of app ideas",
            "C++",
            "C#",
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

        RecyclerView recyclerView = findViewById(R.id.AGM_RecyclerView);
        setUpList();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, appIdeaList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpList()
    {
        appIdeaList.addAll(Arrays.asList(langArray));
    }
}
