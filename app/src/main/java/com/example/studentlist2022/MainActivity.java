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

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView simpleList;

    // Array of strings...
    // We could have also have created an empty array and then added each item individually using array.add type functions
    String[] peopleList = {
            "Clayton Arnett, CS", //0
            "Griffin Barnard, CS",
            "Ben Blackmon, DET",
            "Ben Briggs, DET",
            "Alex Burgos, CS",
            "Ethan Clayton, CS",
            "Alissa Davis, DET",
            "Evan Grau, CS",
            "McLennan Jones, CS",
            "Bailey Kimmel, CS",
            "Noah Massie, DET",
            "Marlon Miller Matute, CS",
            "Anthony Moncivais, CS & DET",
            "Lauren Najera, DET",
            "Kelli Norris, DET",
            "Grayson Orcutt, DET",
            "Mike Rageur, CS",
            "Cameron Wallace, DET",
            "Prof Tanner, DET & CS" //18
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        if (personSelected.equals("Prof Tanner, DET & CS"))
        {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, ProfTannerActivity.class);
            context.startActivity(intent);
        }
        else if(personSelected.equals("Noah Massie, DET"))
        {
            //waow new act
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, NCMActivity.class);
            context.startActivity(intent);
        }
        else if(personSelected.equals("Anthony Moncivais, CS & DET"))
        {
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, AnthonyActivity.class);
            context.startActivity(intent);
        }
        else if(personSelected.equals("Alissa Davis, DET"))
        {
            //Alissa One
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, AlissaDavisActivity.class);
            context.startActivity(intent);
        }
        else if (personSelected.equals("Bailey Kimmel, CS"))
        {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, AppIdeaActivity_blk.class);
            context.startActivity(intent);
        }
    }

    public void randoStudent(View view)
    {
        // we want a random number that we can match to the student list
        Random r = new Random();
        int max = 17;
        int min = 0;
        int random = r.nextInt(max-min+1)+min;
        String mergePersonSelected = (String) simpleList.getAdapter().getItem(random);

        // every case that wasn't specifically called out
        Toast.makeText(this, mergePersonSelected + " is NEXT on MERGE MASTER MIXUP", Toast.LENGTH_SHORT).show();


//        if (personSelected.equals("Marlon Miller Matute, CS")) {
//            Context context = simpleList.getContext();
//            Intent intent = new Intent(context, MarlonMillerActivity.class);
//            context.startActivity(intent);
//        }
    }
}