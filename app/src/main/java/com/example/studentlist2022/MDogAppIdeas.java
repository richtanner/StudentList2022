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

public class MDogAppIdeas extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView simpleList;

    // Array of strings...
    // We could have also have created an empty array and then added each item individually using array.add type functions
    String[] peopleList = {
            "The Inventors App", //0
            "Couple Buttons",
            "Snack Raid"//3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdog_app_ideas);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_single_list_item, R.id.textViewInLists, peopleList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) simpleList.getAdapter().getItem(position);


        /** do something cool based on the INDEX (int) of the selected item **/
        /** but like, just a suggestion here, what if we just watched shrek? **/
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
        if (personSelected.equals("Couple Buttons"))
        {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, CoupleButtons.class);
            context.startActivity(intent);
        }
    }
}