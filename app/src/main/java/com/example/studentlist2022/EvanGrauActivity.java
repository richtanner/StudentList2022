package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EvanGrauActivity extends AppCompatActivity {

    ListView languageList;

    // array of app ideas
    String appIdeas[] = {
            "Bible app but better",
            "ripoff Instagram",
            "ripoff Discord",
            "app to generate app ideas",
            "a moblie game that has abnoxious ads",
            "GraviSwitch on mobile?!?!?!",
            "an app that helps me cope with being bad at video games",
            "CashApp except I steal your money instead"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evan_grau);

        languageList = (ListView)findViewById(R.id.EKG_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, appIdeas);
        languageList.setAdapter(arrayAdapter);
    }
}