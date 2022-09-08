package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MarlonMillerActivity extends AppCompatActivity {

    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "Risky World Accounting",
            "ACU Greek Life",
            "Money Handler",
            "The Social Meme",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marlon_miller);

        languageList = (ListView)findViewById(R.id.App_MEMM);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}