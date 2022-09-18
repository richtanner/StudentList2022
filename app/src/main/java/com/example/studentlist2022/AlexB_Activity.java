package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class AlexB_Activity extends AppCompatActivity implements AlexB_RecyclerView_Interface{

    //Gets string array from resources
    String[] appSuggestions = getResources().getStringArray(R.array.ab_appSuggestions_stringArray);

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexb);

        recyclerView = findViewById(R.id.alexb_recyclerView);
        setUpList();

        //Calls the RecyclerView Adapter from AlexB_RecyclerView_Adapter
        AlexB_RecyclerView_Adapter adapter = new AlexB_RecyclerView_Adapter(this, appSuggestions, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<String> setUpList(){

        return Arrays.asList(appSuggestions);
    }

    @Override
    public  void onItemClick(int position){
        Context context = recyclerView.getContext();
        Intent intent;

        switch (position){
            case 0:
                intent = new Intent(context, AlexB_TarkovChad.class);
                context.startActivity(intent);
                break;

            case 1:
                intent = new Intent(context, AlexB_OnlyWaifus.class);
                context.startActivity(intent);
                break;
        }
    }
}