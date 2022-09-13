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

public class gjo_main_list extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView simpleList;

    // Array of strings...
    // We could have also have created an empty array and then added each item individually using array.add type functions
    String[] appList = {
            "Bear identification app", //0
            "Homework to do list",
            "tic tac toe "//2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gjo_main_list);

        simpleList = (ListView)findViewById(R.id.complicatedListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_single_list_item, R.id.textViewInLists, appList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) simpleList.getAdapter().getItem(position);



        /** do something cool based on the exact VALUE (string) of the selected item **/

        if (personSelected.equals("Bear identification app"))
        {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, bear_description.class);
            context.startActivity(intent);
        }
    }
}