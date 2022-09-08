package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MikeRageurActivity extends AppCompatActivity {

    ListView languageList;

    String langArray[] = {
            "A shopping app",
            "A video app",
            "A cookie clicker game but with tacos",
            "Water bottle throwing game"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mike_rageur);

        languageList = (ListView)findViewById(R.id.MR_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }

}