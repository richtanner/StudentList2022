package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EvanGrauActivity extends AppCompatActivity {

    ListView languageList;

    // array of app ideas
    String langArray[] = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evan_grau);

        languageList = (ListView)findViewById(R.id.RWT_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}