package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class EvanGrauActivity extends AppCompatActivity {

    ListView languageList;
    TextView textView;

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

    public void onItemClick(AdapterView<?> adapterView, View view, int position)
    {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String itemSelected = (String) languageList.getAdapter().getItem(position);
        
        /** do something cool based on the exact VALUE (string) of the selected item **/
        if (itemSelected.equals("Bible app but better"))
        {
            // go to a new activity
            Context context = languageList.getContext();
            Intent intent = new Intent(context, EKGThirdActivity.class);
            context.startActivity(intent);
        }
    }
}