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

public class LaurenNajera extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView languageList;

    // Array of strings...
    String langArray[] =
        {
            "Doggy Lost and Found",
            "Walking sim with a theme",
            "An app where you put all your life events from biggest to small and an AI gives a single picture of your future",
            "An app where a rat tells you what to do; and if you don't do it, it hacks into your bank account and takes $5 dollars (the rat is named Garrett)",
            "The opposite of a motivational app, it just tells you suck in some different way everyday; and since it's AI, the more you use the more it doesn't make sense",
            "Photoshop, but it tries to fit the PC interface",
            "A plugin app that autocorrects all your texts to sound like they're sarcastic; but since it's texting you still can't tell and you look pretentious",
            "An app that sends you random texts that make you look like your cheating on someone",
            "My Tutor Ben (It literally gives you the phone numbers all of the tutors named Ben in the area)",
            "An app that lets you share anything no matter how big it is (eat your heart out Discord)"
        };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lauren_najera);

        languageList = (ListView)findViewById(R.id.LN_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
        languageList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) languageList.getAdapter().getItem(position);


        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position)
        {
            case 18:
                // by specific index
                Toast.makeText(this, personSelected + " created the Master branch!!", Toast.LENGTH_LONG).show();
                break;

            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, personSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }


        /** do something cool based on the exact VALUE (string) of the selected item **/
        if (personSelected.equals("Doggy Lost and Found"))
        {
            // go to a new activity
            Context context = languageList.getContext();
            Intent intent = new Intent(context, DoggyLostAndFound.class);
            context.startActivity(intent);
        }


    }

}