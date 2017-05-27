package com.aprendamosjapones.aprendedamosjapones.Games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.aprendamosjapones.aprendedamosjapones.KanjiLevels.KanjiLevelsActivity;
import com.aprendamosjapones.aprendedamosjapones.R;
import com.aprendamosjapones.aprendedamosjapones.View.IntructionMemoryGame;
import com.aprendamosjapones.aprendedamosjapones.View.MainMenuActivity;

// Al terminar el juego, vuelva al menu de inicio.
// Pendiente: rotar reinicia el juego
// Pendiente: warning para salir
// Pendiente: custom size, con sus limitaciones y demás

/**
 * Main activity: menu where game mode is selected.
 *
 * @author Mateo Agudelo Toro
 */
public class MenuMemoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_menu);
        Button goInstructions = (Button) findViewById(R.id.instructionsMemory);
        goInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInstructions = new Intent(MenuMemoryActivity.this, IntructionMemoryGame.class);
                startActivity(goInstructions);
            }
        });

        Button playButton = (Button) findViewById(R.id.buttonJugarConcentrese);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alphabet;
                if (((RadioButton) findViewById(R.id.radioButtonHiragana)).isChecked())
                    alphabet = "hiragana";
                else if (((RadioButton) findViewById(R.id.radioButtonKatakana)).isChecked())
                    alphabet = "katakana";
                else // kanji is checked
                    alphabet = "kanji"; // pending

                int rows, cols;
                if (((RadioButton) findViewById(R.id.radioButton10)).isChecked()) {
                    rows = 4;
                    cols = 5;
                }
                else if (((RadioButton) findViewById(R.id.radioButton15)).isChecked()) {
                    rows = 5;
                    cols = 6;
                }
                else {
                    rows = 5;
                    cols = 8;
                }

                MemoryActivity.rows = rows;
                MemoryActivity.columns = cols;
                MemoryActivity.alphabet = alphabet;
                startActivity(new Intent(MenuMemoryActivity.this, MemoryActivity.class));
            }
        });
    }
}
