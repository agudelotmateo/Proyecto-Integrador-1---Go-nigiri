package com.aprendamosjapones.aprendedamosjapones.Games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.R;

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

        initMemoryGame("button_hiragana_1", 5, 4, "hiragana");
        initMemoryGame("button_hiragana_2", 8, 7, "hiragana");

        initMemoryGame("button_katakana_1", 5, 4, "katakana");
        initMemoryGame("button_katakana_2", 8, 7, "katakana");
    }

    private void initMemoryGame(final String buttonID, final int rows,
                                final int columns, final String alphabet) {
        Button button = (Button) findViewById(getResources().getIdentifier(buttonID, "id",
                getPackageName()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MemoryActivity.rows = rows;
                MemoryActivity.columns = columns;
                MemoryActivity.alphabet = alphabet;
                startActivity(new Intent(MenuMemoryActivity.this, MemoryActivity.class));
            }
        });
    }
}
