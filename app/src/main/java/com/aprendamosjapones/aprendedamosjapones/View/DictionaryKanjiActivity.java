package com.aprendamosjapones.aprendedamosjapones.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;


public class DictionaryKanjiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_kanji);

        /*
        Seteando el adaptador al GridView
         */
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapterKanji(this));

        /*
        Creando una nueva escucha para los elementos del Grid
         */
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                /*
                Iniciar una nueva actividad al presionar la foto
                 */
                Intent i = new Intent(DictionaryKanjiActivity.this,Details.class);
                i.putExtra("position",position);//Posición del elemento
                startActivity(i);

            }
        });
    }



}