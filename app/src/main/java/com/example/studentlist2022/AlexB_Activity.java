package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class AlexB_Activity extends AppCompatActivity implements AB_RecyclerView_Interface{

    //Grabs string arrays from resources
    ArrayList<AB_AppSuggestions> ab_appSuggestions = new ArrayList<>();
    //int[] AB_ImageInfo =

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alex_bactivity);

        //Initiate recyclerView
        RecyclerView ab_recyclerView = findViewById(R.id.activity_ab_recyclerView);
    }

    private void Initiate_AB_AppSuggestions(){
        String[] AB_appSuggestionsNames = getResources().getStringArray(R.array.ab_appSuggestions_stringArray);
        String[] AB_appSuggestionsDetails = getResources().getStringArray(R.array.ab_appDescriptions_stringArray);
        String[] AB_appSuggestionsMoreInfo = getResources().getStringArray(R.array.ab_appMoreInfo_stringArray);

        for(int i = 0; i < AB_appSuggestionsNames.length; i++){
            ab_appSuggestions.add(new AB_AppSuggestions(AB_appSuggestionsNames[i],
                    AB_appSuggestionsDetails [i],
                    AB_appSuggestionsMoreInfo[i],
                    ab_)
        }
    }

    @Override
    public void onItemClick(int position){
        Intent intent = new Intent(AlexB_Activity.this, AB_AppSuggestions_Details.class);
        Intent.putExtra("Name", ab_appSuggestions.get(position).getAB_AppName());
        Intent.putExtra("Details", ab_appSuggestions.get(position).getAB_AppDetails());
        Intent.putExtra("MoreInfo", ab_appSuggestions.get(position).getAB_MoreInfo());
        startActivity(intent);
    }
}