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

public class activity_Kelli_Norris extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "Notes App",
            "Plant Foraging and baking app",
            "Genetics app",
            "Color mixing",
            "About yourself app",
            "Your friends and family app!!",
            "Random fart generator",
            "quick shower app",
            "Your Friends Trivia"
    };

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String appS = (String) languageList.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position)
        {

            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, appS + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        if (appS.equals("Notes App"))
        {
            // go to a new activity
            Context context = languageList.getContext();
            Intent intent = new Intent(context, NotesApp.class);
            context.startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelli_norris);

        languageList = (ListView)findViewById(R.id.KN_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_single_list_item,  R.id.textViewInLists, langArray);
        languageList.setAdapter(arrayAdapter);
        languageList.setOnItemClickListener(this);
    }
}