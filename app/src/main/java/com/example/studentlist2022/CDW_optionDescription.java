package com.example.studentlist2022;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.ImageView;

public class CDW_optionDescription extends AppCompatActivity {

    int optionsDisplayIndex;
    TextView optionsText;
    ImageView catanImage;
    int bringImageIn[] = {
            R.drawable.cdw_catan1,
            R.drawable.cdw_catan2,
            R.drawable.cdw_catan3,
            R.drawable.cdw_catan4,
            R.drawable.cdw_catan5,
            R.drawable.cdw_catan6,
            R.drawable.cdw_catan7,
            R.drawable.cdw_catan8,
            R.drawable.cdw_catan9,
            R.drawable.cdw_catan10
    };
    String alloptions[] = {
            "For this option, it can either be set to the standard 3-4 player board, "
                    + "or set to the larger, 5-6 player board. Due to the logistical nightmare "
                    + "that would be involved in trying to include the different variations of the "
                    + "Seafarer's expansion, it will not include any Seafarer's randomization",

            "This is simply raw, unbalanced randomization. Whatever it comes up with is completely "
                    + "unrestricted in any way.",

            "This will use the 'default' balanced randomization options, which will include removing "
                    + "clusters and strings of 3 or greater",
            "This will make sure that there is not a single instance of three hexes of the same color "
                    + "coming up next to each other, forming a 'Cluster'", //3
            "This will ensure that the board will not have more than a number specified by the user "
                    + "of the same colored hex come up in a row. The maximum that is possible in a 3-4 player "
                    + "game is 4, and the max possible in a 5-6 player game is 6",

            "This will use the 'default' balancing randomization options, which will make sure that "
                    + "no numbers of the same dice roll are next to each other, and no numbers of the same "
                    + "'value' are next to each other either. There is an exception for 4s and 10s, because "
                    + "they are of 'average' value, and I am pretty sure it's impossible to have no numbers "
                    + "of the same 'value' next to each other",

            "The dice rolls 6 and 8 are marked with red color instead of black, due to how often they "
                    + "roll, this will make sure that only the red numbers do not come up next to each other",

            "This will make sure that the lowest rolling numbers, 2 and 12, do not end up next to each other", //7

            "None of the same numbers will be allowed to come up next to each other, but 'value' is unaffected",

            "No numbers of the same 'value' will come up next to each other, with the exception of 4 and 10" //9
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdw_option_description);
        Intent intent = getIntent();
        int i = Integer.parseInt(intent.getStringExtra(CDW_CatanSecond.THING));
        catanImage = (ImageView)findViewById(R.id.cdw_catanimage);
        Log.e("TAG", String.valueOf(i));

        optionsText = (TextView)findViewById(R.id.cdw_scrolltext);
        optionsText.setText(alloptions[i]);
        catanImage.setImageResource(bringImageIn[i]);

    }
}