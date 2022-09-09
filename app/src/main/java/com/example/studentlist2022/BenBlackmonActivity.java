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

public class BenBlackmonActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    ListView projectList;

    // Array of strings...
    String ideaArray[] = {
            "List Maker",
            "RPG Life",
            "Aggravated Intelligence: A Chat-bot",
            "Weighted Dice App",
            "Simple Drawing App",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ben_blackmon);

        projectList = (ListView)findViewById(R.id.BMB_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, ideaArray);
        projectList.setAdapter(arrayAdapter);
        projectList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String itemSelected = (String) projectList.getAdapter().getItem(position);


        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position)
        {
            case 2:
                // by specific index
                Toast.makeText(this, itemSelected + " created the Master branch!!", Toast.LENGTH_LONG).show();
                break;

            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, itemSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }


        /** do something cool based on the exact VALUE (string) of the selected item **/
        if (itemSelected.equals("List Maker"))
        {
            // go to a new activity
            Context context = projectList.getContext();
            Intent intent = new Intent(context, ListMaker.class);
            context.startActivity(intent);
        }
        else if (itemSelected.equals("RPG Life"))
        {
            // go to a new activity
            Context context = projectList.getContext();
            Intent intent = new Intent(context, RPGLifeActivity.class);
            context.startActivity(intent);
        }
    }
}