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

public class MarlonMillerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "Risky World Accounting",
            "ACU Greek Life",
            "Money Handler",
            "The Social Meme",
            "CS vs DET",
            "My Bank",
            "Fitness App",
            "Honduras Travel",
            "ACU Tour"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marlon_miller);

        languageList = (ListView)findViewById(R.id.App_MEMM);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);

        languageList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        String appSelected = (String) languageList.getAdapter().getItem(position);
        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position)
        {
            case 1:
                // by specific index
                Toast.makeText(this, appSelected + " app selected", Toast.LENGTH_LONG).show();
                break;

            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, appSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        //String appSelected = (String) languageList.getAdapter().getItem(position);
        if (appSelected.equals("Risky World Accounting")) //
        {
            // go to a new activity
            Context context = languageList.getContext();
            Intent intent = new Intent(context, MM_RiskyWorldAccounting.class);
            context.startActivity(intent);
        }
    }
}