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

public class BriggsAppIdeas extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    ListView mahApplicationIdeas;

    // Array of strings...
    String langArray[] = {
            "New and better chapel App",
            "Tip calculator",
            "GPS?",
            "Scheduling app/Calender",
            "Messaging App",
            "Translation App"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briggs_app_ideas);

        mahApplicationIdeas = (ListView)findViewById(R.id.BAB_App_Ideas);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        mahApplicationIdeas.setAdapter(arrayAdapter);

        mahApplicationIdeas.setOnItemClickListener(this);  // set THIS class as the listener
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String personSelected = (String) mahApplicationIdeas.getAdapter().getItem(position);

        switch (position) {
            case 5:
                // by specific index
                Toast.makeText(this, personSelected + " is a GOOD idea!! :)", Toast.LENGTH_LONG).show();
                break;

            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, personSelected + " is a BAD idea!! :(", Toast.LENGTH_LONG).show();
                break;
        }

        if (personSelected.equals("Translation App")) {
            Context context = mahApplicationIdeas.getContext();
            Intent intent = new Intent(context, BriggsExpandedApp.class);
            context.startActivity(intent);
        }
    }
}