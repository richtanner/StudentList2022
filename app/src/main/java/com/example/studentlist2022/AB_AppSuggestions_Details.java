package com.example.studentlist2022;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AB_AppSuggestions_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alex_bapp_suggestions_detail);

        //Holds a string from strings.xml
        String AB_appName = getIntent().getStringExtra("Name");
        String AB_appDetails = getIntent().getStringExtra("Details");
        String AB_appMoreInfo = getIntent().getStringExtra("MoreInfo");

        //Holds the objects in the app suggestion activity layout.
        TextView AB_appSuggestionTitle = findViewById(R.id.ab_AppSuggestionTitle);
        TextView AB_appDetailsText = findViewById(R.id.ab_AppDetailsText);
        TextView AB_appSuggestionMoreInfo = findViewById(R.id.ab_appSuggestionMoreInfo);

        //Sets text in the app suggestion activity layout
        AB_appSuggestionTitle.setText(AB_appName);
        AB_appDetailsText.setText(AB_appDetails);
        AB_appSuggestionMoreInfo.setText(AB_appMoreInfo);
    }
}
