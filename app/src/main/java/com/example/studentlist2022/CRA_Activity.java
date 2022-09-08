package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CRA_Activity extends AppCompatActivity {

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            " Cashapp",
            " Venmo",
            " Apple Pay",
            " Something else",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cra);

        languageList = (ListView)findViewById(R.id.CRA_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}