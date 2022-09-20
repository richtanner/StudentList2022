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

public class CDW_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView simpleList;

    // Array of strings...
    // We could have also have created an empty array and then added each item individually using array.add type functions
    String[] peopleList = {
            "Catan Board Generator", //0
            "Mini Calculator",
            "Mini Dice Roller"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdw);

        simpleList = (ListView)findViewById(R.id.cdw_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_cdw_single_list_item, R.id.cdw_textViewInLists, peopleList);
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
            case 0:
                // by specific index
                Context context = simpleList.getContext();
                Intent intent = new Intent(this, CDW_CatanBoardGeneratorIdea.class);
                startActivity(intent);
                break;

            default:
                Toast.makeText(this, "It's a " + personSelected + ", I don't know what you expected lol.", Toast.LENGTH_LONG).show();
                break;
        }


    }

}