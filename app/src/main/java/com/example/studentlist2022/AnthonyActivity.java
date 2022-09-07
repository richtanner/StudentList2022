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

//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
//    {
//        // we got notified that something was selected!  AND we know WHICH ITEM was selected!
//
//        // get the value of the string in the specific position of the array that was selected (tapped on)
//        String personSelected = (String) recyclerView.getAdapter().getItem(position);
//
//
//        /** do something cool based on the INDEX (int) of the selected item **/
//        switch (position)
//        {
//            case 18:
//                // by specific index
//                Toast.makeText(this, personSelected + " created the Master branch!!", Toast.LENGTH_LONG).show();
//                break;
//
//            default:
//                // every case that wasn't specifically called out
//                Toast.makeText(this, personSelected + " selected", Toast.LENGTH_LONG).show();
//                break;
//        }
//
//
//        /** do something cool based on the exact VALUE (string) of the selected item **/
//        if (personSelected.equals("Prof Tanner, DET & CS"))
//        {
//            // go to a new activity
//            Context context = simpleList.getContext();
//            Intent intent = new Intent(context, ProfTannerActivity.class);
//            context.startActivity(intent);
//        }
//        if(personSelected.equals("Anthony Moncivais, CS & DET"))
//        {
//            Context context = simpleList.getContext();
//            Intent intent = new Intent(context, AnthonyActivity.class);
//            context.startActivity(intent);
//        }
//    }

    @Override
    public void onItemClick(int position) {

        switch(position)
        {
            default:
                Toast.makeText(this, "Ey " + position, Toast.LENGTH_LONG).show();
        }
    }
}
