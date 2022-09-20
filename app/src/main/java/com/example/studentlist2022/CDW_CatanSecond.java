package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.content.Intent;

public class CDW_CatanSecond extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    public static final String THING = "com.example.studentlist2022.INDEXINT";

    ListView optionsAvailable;

    String optArray[] = {
            "Board Size", //0
            "Unbalanced Randomization",
            "Hex Automatic Balancing",
            "No Hex 'Clusters'", //3
            "No Hex Strings of _ length",
            "Number Automatic Balancing,",
            "No Red Adjacent",
            "No Low Numbers Adjacent", //7
            "No Adjacent Numbers Of Same Dice Roll",
            "No Adjacent Numbers Of Same Value" //9
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdw_catan_second);

        optionsAvailable = (ListView)findViewById(R.id.cdw_simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_cdw_single_list_item, R.id.cdw_textViewInLists, optArray);
        optionsAvailable.setAdapter(arrayAdapter);
        optionsAvailable.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        Context context = optionsAvailable.getContext();
        Intent gotopage = new Intent(context, CDW_optionDescription.class);
        gotopage.putExtra(THING, String.valueOf(position));
        context.startActivity(gotopage);
    }
}