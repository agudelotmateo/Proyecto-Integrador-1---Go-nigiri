package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by mateo on 6/1/17.
 */

public class InstructionsMatchit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction_matchit_game);

        setToolbar(); // Reemplazar toolbar
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
