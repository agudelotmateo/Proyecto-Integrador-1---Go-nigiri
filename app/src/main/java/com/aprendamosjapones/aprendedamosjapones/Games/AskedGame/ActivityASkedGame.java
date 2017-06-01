package com.aprendamosjapones.aprendedamosjapones.Games.AskedGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.KanjiLevels.KanjiLevelsActivity;
import com.aprendamosjapones.aprendedamosjapones.R;
import com.aprendamosjapones.aprendedamosjapones.View.MainMenuActivity;

/**
 * Created by wilfer on 30/05/17.
 */

public class ActivityASkedGame extends AppCompatActivity {

    Button goInstructionAskedGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntados_menu);


        goInstructionAskedGame = (Button)findViewById(R.id.instructionsPreguntados);

        goInstructionAskedGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goInstructionAskedGame = new Intent(ActivityASkedGame.this, InstructionsAskedGame.class);
                startActivity(goInstructionAskedGame);
            }
        });
    }
}
