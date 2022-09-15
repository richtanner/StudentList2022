package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MikeRageurActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    public static final String THING = "com.example.studentlist2022.INDEXINT";
    ListView languagezList;

    String langzArray[] = {
            "A shopping app",
            "A video app",
            "A cookie clicker game but with tacos",
            "Water bottle throwing game",
            "Livestream app"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mike_rageur);

        languagezList = (ListView)findViewById(R.id.MR_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langzArray);
        languagezList.setAdapter(arrayAdapter);
        languagezList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        Context context = languagezList.getContext();
        Intent gotopage = new Intent(context, MikeRageurActivity2.class);
        gotopage.putExtra(THING, String.valueOf(position));
        context.startActivity(gotopage);
    }
}