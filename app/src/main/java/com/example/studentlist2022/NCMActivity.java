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

public class NCMActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    ListView appList;

    String[] appArray =
    {
            "Color Collider", //0
            "Mythos Tree",
            "Cheese Matcher",
            "ACU Tinder" //3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncmactivity);

        appList = (ListView)findViewById(R.id.NCM_ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_single_list_item_ncm, R.id.NCMListItem, appArray);
        appList.setAdapter(arrayAdapter);
        appList.setOnItemClickListener(this);  // set THIS class as the listener
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String appSelected = (String) appList.getAdapter().getItem(position);


        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position)
        {
//            case 10:
//                Toast.makeText(this, personSelected + ", made this toast.", Toast.LENGTH_LONG).show();
//                break;

            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, appSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }


        /** do something cool based on the exact VALUE (string) of the selected item **/
        if (appSelected.equals("Mythos Tree"))
        {
            // go to a new activity
            Context context = appList.getContext();
            Intent intent = new Intent(context, AppIdeaActivity.class);
            context.startActivity(intent);
        }
    }
}