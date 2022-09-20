package com.example.studentlist2022;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ScrollView;

public class CDW_CatanBoardGeneratorIdea extends AppCompatActivity {

    TextView catanparag;
    TextView catantitle;
    Button setoptions;
    ScrollView catanpara;

    public String[] BoardGeneratorPage = {
            "I want this to be an app that will create a randomized board for the game 'Settlers of Catan.' "
                    + "the idea would be you can tell it to randomize the board, and it will give a board with the "
                    + "hexes and the dice roll numbers randomly placed, but it also would have some other options. "
                    + "If the players want a 'balanced' randomized board, they can have that, or they can customize "
                    + "how the randomization works, if they want high value numbers not appearing near each other, "
                    + " or if they don't want hexes of the same type next to each other, they can do that. ",
            "Click Here to see the customization options allowed",
            "Catan Random Board Generator"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("TAG", "WEEWOOOWEEEOWOOO");
        setContentView(R.layout.activity_cdw_catan_board_generator_idea);
        catanpara = (ScrollView)findViewById(R.id.cdw_catanParagraph);
        catanparag = (TextView)findViewById(R.id.cdw_scrolltext);
        catanparag.setText(BoardGeneratorPage[0]);

        catantitle = (TextView)findViewById(R.id.cdw_catanTitle);
        catantitle.setText(BoardGeneratorPage[2]);

        setoptions = (Button)findViewById(R.id.cdw_nextCatanButton);
        setoptions.setText(BoardGeneratorPage[1]);


    }
    public void optionExamples(View view) {
        Intent intent = new Intent(this, CDW_CatanSecond.class);
        startActivity(intent);

    }
}