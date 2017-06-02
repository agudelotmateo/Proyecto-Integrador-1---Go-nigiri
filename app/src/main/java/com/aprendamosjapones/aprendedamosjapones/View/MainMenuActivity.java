package com.aprendamosjapones.aprendedamosjapones.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.DictionaryHIragana.DictionarHIraganaActivity;
import com.aprendamosjapones.aprendedamosjapones.DictionaryKanji.DictionarKanjiActivity;
import com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana.DictionarKatakanaActivity;
import com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching.MenuMatchit;
import com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.memory.MenuMemoryActivity;
import com.aprendamosjapones.aprendedamosjapones.HiraganaLevels.HiraganaLevelsActivity;
import com.aprendamosjapones.aprendedamosjapones.KanjiLevels.KanjiLevelsActivity;
import com.aprendamosjapones.aprendedamosjapones.KatakanaLevels.KatakanaLevelsActivity;
import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by wilfer on 19/04/17.
 */

public class MainMenuActivity extends AppCompatActivity {

    Button goActivityHiraganaLevel;
    Button goActivityKatakanaDictionary;
    Button goActivityLevelKanji;
    Button goActivityMemory;
    Button goActivityHiraganaDictionary;
    Button getGoActivityLevelKatakana;
    Button goActivityKanjiDictionary;
    Button getGoActivityMatchitGame;
    Button goActivityCredits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);

        setToolbar(); // Reemplazar toolbar


        //Botones
        goActivityHiraganaLevel = (Button)findViewById(R.id.hiraganaLevel);

        getGoActivityLevelKatakana = (Button)findViewById(R.id.kataLevel);

        goActivityLevelKanji = (Button)findViewById(R.id.kanjiLevel);

        goActivityMemory = (Button)findViewById(R.id.juegoConcentrese);

        goActivityKanjiDictionary = (Button)findViewById(R.id.kanjiDiccionario);

        goActivityHiraganaDictionary = (Button)findViewById(R.id.hiraganaDiccionario);

        goActivityKatakanaDictionary = (Button)findViewById(R.id.katakanaDicionario);

        getGoActivityLevelKatakana = (Button)findViewById(R.id.kataLevel);

        getGoActivityMatchitGame = (Button)findViewById(R.id.juegoMatchIt);

        goActivityCredits = (Button)findViewById(R.id.credits);


        //Intents
        goActivityHiraganaLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityHiraganaLevel = new Intent(MainMenuActivity.this, HiraganaLevelsActivity.class);
                startActivity(goActivityHiraganaLevel);
            }
        });

        getGoActivityLevelKatakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityLevelKatakana = new Intent(MainMenuActivity.this, KatakanaLevelsActivity.class);
                startActivity(goActivityLevelKatakana);
            }
        });

        goActivityLevelKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityLevelKanji = new Intent(MainMenuActivity.this, KanjiLevelsActivity.class);
                startActivity(goActivityLevelKanji);
            }
        });

        goActivityMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityMemory = new Intent(MainMenuActivity.this, MenuMemoryActivity.class);
                startActivity(goActivityMemory);
            }
        });

        goActivityHiraganaDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityHiraganaDictionary = new Intent(MainMenuActivity.this, DictionarHIraganaActivity.class);
                startActivity(goActivityHiraganaDictionary);
            }
        });

        goActivityKatakanaDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                Intent goActivityKatakanaDictionary = new Intent(MainMenuActivity.this, DictionarKatakanaActivity.class);
                startActivity(goActivityKatakanaDictionary);
            }
        });

        goActivityKanjiDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityKanjiDictionary = new Intent(MainMenuActivity.this, DictionarKanjiActivity.class);
                startActivity(goActivityKanjiDictionary);
            }
        });


        getGoActivityMatchitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent getGoActivityAskedGame = new Intent(MainMenuActivity.this, MenuMatchit.class);
                startActivity(getGoActivityAskedGame);
            }
        });

        goActivityCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goActivityCredits = new Intent(MainMenuActivity.this, CreditsActivity.class);
                startActivity(goActivityCredits);
            }
        });
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}


