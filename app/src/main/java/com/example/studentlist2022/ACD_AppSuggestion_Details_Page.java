package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ACD_AppSuggestion_Details_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acd_app_suggestion_details_page);

        String ACD_appName = getIntent().getStringExtra("NAME");
        String ACD_appDets = getIntent().getStringExtra("DETAILS");
        String ACD_appMoreInfo = getIntent().getStringExtra("MOREINFO");

        TextView ACD_appSuggTitle = findViewById(R.id.acd_AppSuggTitle);
        TextView ACD_appDetText = findViewById(R.id.acd_AppDetText);
        TextView ACD_appSuggMoreInfo = findViewById(R.id.ACD_appSuggMoreInfo);

        ACD_appSuggTitle.setText(ACD_appName);
        ACD_appDetText.setText(ACD_appDets);
        ACD_appSuggMoreInfo.setText(ACD_appMoreInfo);
    }
}