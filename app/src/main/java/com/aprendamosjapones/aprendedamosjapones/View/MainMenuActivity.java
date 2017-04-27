package com.aprendamosjapones.aprendedamosjapones.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.DiccionarioKanji.DictionaryKanjiActivity1;
import com.aprendamosjapones.aprendedamosjapones.LoginActivity;
import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by wilfer on 19/04/17.
 */

public class MainMenuActivity extends AppCompatActivity {

    Button goActivityKanji;
    Button goActivityHirgana;
    Button goLevelHiragana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);

        goActivityKanji = (Button)findViewById(R.id.kanjiDiccionario);

        goActivityHirgana = (Button)findViewById(R.id.hiraganaDiccionario);

        goActivityKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityKanji = new Intent(MainMenuActivity.this, DictionaryKanjiActivity1.class);
                startActivity(goActivityKanji);
            }
        });

        goActivityHirgana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityHirgana = new Intent(MainMenuActivity.this, DictionaryHiraganaActivity.class);
                startActivity(goActivityHirgana);
            }
        });


    }
}


