package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by wilfer on 11/05/17.
 */

public class IntructionMemoryGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction_memory_game);

        setToolbar(); // Reemplazar toolbar
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
