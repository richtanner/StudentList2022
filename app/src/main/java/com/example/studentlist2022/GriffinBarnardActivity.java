package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GriffinBarnardActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "Class Helper",
            "Local Messaging App",
            "Find Nearby Places",
            "World Hunger Solver",
            "Mobile App Maker",
            "Free Money Finder",
            "Delete System 32",
            "App Idea Generator",
            "Homework Solver",
            "Math Practice App",
            "Relationship Advisor"



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griffin_barnard);

        languageList = (ListView)findViewById(R.id.GJB_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activty_single_list_item_gjb,R.id.textViewInLists_GJB ,langArray);
        languageList.setAdapter(arrayAdapter);
        languageList.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String ideaSelected = (String) languageList.getAdapter().getItem(position);


        if (ideaSelected.equals("Class Helper")) {
            // go to a new activity
            Context context = languageList.getContext();
            Intent intent = new Intent(context, ClassHelperActivity.class);
            context.startActivity(intent);
        }
    }
}