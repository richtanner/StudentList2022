package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CRA_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView languageList;

    String[] appList = {
            " Play Volleyball!",
            " RankCheck",
            " PokemonGoRaider",
            " Just Books",
            " Binocular Discovery"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cra);

        languageList = (ListView)findViewById(R.id.CRA_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, appList);
        languageList.setAdapter(arrayAdapter);
        languageList.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        String itemSelected = (String) languageList.getAdapter().getItem(position);

        if (itemSelected.equals(" Play Volleyball!"))
        {
            Context context = languageList.getContext();
            Intent intent = new Intent(context, ThirdActivity.class);
            context.startActivity(intent);
        }
    }
}