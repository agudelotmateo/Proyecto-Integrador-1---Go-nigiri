package com.aprendamosjapones.aprendedamosjapones.DiccionarioKanji;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

/**
 * Created by wilfer on 25/04/17.
 */

public class DictionaryKanjiActivity1 extends Activity {

    private GridviewAdapter mAdapter;
    private ArrayList<String> listKanjisWords;
    private ArrayList<Integer> listKanjiImage;
    private GridView gridView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_kanji1);

        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listKanjisWords, listKanjiImage);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(DictionaryKanjiActivity1.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void prepareList(){
        listKanjisWords = new ArrayList<String>();
        listKanjisWords.add("Dia");
        listKanjisWords.add("Uno");

        listKanjiImage = new ArrayList<Integer>();
        listKanjiImage.add(R.drawable.kanji1dia);
        listKanjiImage.add(R.drawable.kanji2uno);
    }
}
