package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class AlexB_Activity extends AppCompatActivity implements AlexB_RecyclerView_Interface {

    RecyclerView recyclerView;
    ArrayList<String> appSuggestions = new ArrayList<>();
    String[] appNames = {
            "Tarkov Chad",
            "Only Waifus"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexb);

        RecyclerView recyclerView= findViewById(R.id.alexb_recyclerView);
        setUpList();

        AlexB_RecyclerView_Adapter adapter = new AlexB_RecyclerView_Adapter(this, appSuggestions, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpList(){
        appSuggestions.addAll((Arrays.asList(appNames)));
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