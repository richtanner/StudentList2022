package com.example.studentlist2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AppIdeaActivity_blk extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView blkList;

    String [] appList = {
            "NailTime",
            "Take a photo of your plate and it returns the nutrition facts.",
            "Menu app exclusively for a boat-restaurant"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_idea_blk);

        getSupportActionBar().setTitle("Bailey Kimmel's App Ideas");

        blkList = (ListView)findViewById(R.id.BLK_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_single_list_item, R.id.textViewInLists, appList);
        blkList.setAdapter(arrayAdapter);
        blkList.setOnItemClickListener(this);  // set THIS class as the listener
    }

/** to here works!! do not change anything above this !!! **/

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String appSelected = (String) blkList.getAdapter().getItem(position);

        if (appSelected.equals("NailTime"))
        {
            // go to a new activity
            Context context = blkList.getContext();
            Intent intent = new Intent(context, specialapp.class);
            context.startActivity(intent);
        }

    }
}

