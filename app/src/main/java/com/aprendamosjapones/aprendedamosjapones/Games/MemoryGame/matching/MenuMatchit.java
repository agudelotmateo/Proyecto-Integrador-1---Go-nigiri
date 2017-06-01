package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by mateo on 6/1/17.
 */

public class MenuMatchit extends AppCompatActivity {

    Button goInstructionsMatchit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchit_menu);

        goInstructionsMatchit = (Button)findViewById(R.id.instructionsMatchit);

        goInstructionsMatchit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goInstructionAskedGame = new Intent(MenuMatchit.this, InstructionsMatchit.class);
                startActivity(goInstructionAskedGame);
            }
        });


    }
}
