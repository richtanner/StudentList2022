package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
//s
public class AlissaDavisActivity extends AppCompatActivity implements ACD_RecyclerViewInterface{

    ArrayList<ACD_AppSuggestionsModel> acd_appSuggestionsModels = new ArrayList<>();
    int[] ACD_infoButtonImage = {android.R.drawable.ic_menu_info_details};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alissa_davis);

        RecyclerView acd_recyclerView = findViewById(R.id.DavisrecyclerView);
        setUpACD_AppSuggestionsModel();
        ACD_RecyclerView_Adapter acd_adapter = new ACD_RecyclerView_Adapter(this, acd_appSuggestionsModels, this);
        acd_recyclerView.setAdapter(acd_adapter);
        acd_recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpACD_AppSuggestionsModel(){
        String[] ACD_appSuggestionNames = getResources().getStringArray(R.array.acd_app_suggestions);
        String[] ACD_appSuggDesc = getResources().getStringArray(R.array.acd_appsugg_desc);
        String[] ACD_appSuggMoreInfo = getResources().getStringArray(R.array.acd_appsugg_moreinfo);

        for(int i = 0; i<ACD_appSuggestionNames.length; i++){
            acd_appSuggestionsModels.add(new ACD_AppSuggestionsModel(ACD_appSuggestionNames[i],
                    ACD_appSuggDesc[i], ACD_appSuggMoreInfo[i],
                    ACD_infoButtonImage[0]));
        }
    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(AlissaDavisActivity.this, ACD_AppSuggestion_Details_Page.class);
        intent.putExtra("NAME", acd_appSuggestionsModels.get(position).getAD_appSuggestionName());
        intent.putExtra("DETAILS", acd_appSuggestionsModels.get(position).getAD_appSuggestionDetails());
        intent.putExtra("MOREINFO", acd_appSuggestionsModels.get(position).getAD_appSuggestionMoreInfo());
        startActivity(intent);
    }
}