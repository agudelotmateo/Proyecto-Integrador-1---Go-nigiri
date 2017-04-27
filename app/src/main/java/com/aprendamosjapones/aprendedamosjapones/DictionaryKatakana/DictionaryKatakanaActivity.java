package com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryKatakanaActivity extends Activity {
    /** Called when the activity is first created. */
	
	private DictionaryKatakanaAdapter mAdapter;
	private ArrayList<String> listNameKanji;
	private ArrayList<Integer> listImageKanji;
	
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_katakana_grid);
        
        prepareList();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new DictionaryKatakanaAdapter(this,listNameKanji, listImageKanji);
        
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
        
    }

    public void prepareList() {
        listNameKanji = new ArrayList<String>();

        listNameKanji.add("a");
        listNameKanji.add("i");
        listNameKanji.add("u");
        listNameKanji.add("e");
        listNameKanji.add("o");
        listNameKanji.add("ka");
        listNameKanji.add("ki");
        listNameKanji.add("ku");
        listNameKanji.add("ke");
        listNameKanji.add("ko");
        listNameKanji.add("sa");
        listNameKanji.add("shi");
        listNameKanji.add("su");
        listNameKanji.add("se");
        listNameKanji.add("so");
        listNameKanji.add("ta");
        listNameKanji.add("chi");
        listNameKanji.add("tsu");
        listNameKanji.add("te");
        listNameKanji.add("to");
        listNameKanji.add("na");
        listNameKanji.add("ni");
        listNameKanji.add("nu");
        listNameKanji.add("ne");
        listNameKanji.add("no");
        listNameKanji.add("ha");
        listNameKanji.add("hi");
        listNameKanji.add("fu");
        listNameKanji.add("he");
        listNameKanji.add("ho");
        listNameKanji.add("ma");
        listNameKanji.add("mi");
        listNameKanji.add("mu");
        listNameKanji.add("me");
        listNameKanji.add("mo");
        listNameKanji.add("ya");
        listNameKanji.add("");
        listNameKanji.add("yu");
        listNameKanji.add("");
        listNameKanji.add("yo");
        listNameKanji.add("ra");
        listNameKanji.add("ri");
        listNameKanji.add("ru");
        listNameKanji.add("re");
        listNameKanji.add("ro");
        listNameKanji.add("wa");
        listNameKanji.add("");
        listNameKanji.add("");
        listNameKanji.add("");
        listNameKanji.add("wo");
        listNameKanji.add("n");

        listImageKanji = new ArrayList<Integer>();
        listImageKanji.add(R.drawable.katakana1a);
        listImageKanji.add(R.drawable.katakana2i);
        listImageKanji.add(R.drawable.katakana3u);
        listImageKanji.add(R.drawable.katakana4e);
        listImageKanji.add(R.drawable.katakana5o);
        listImageKanji.add(R.drawable.katakana6ka);
        listImageKanji.add(R.drawable.katakana7ki);
        listImageKanji.add(R.drawable.katakana8ku);
        listImageKanji.add(R.drawable.katakana9ke);
        listImageKanji.add(R.drawable.katakana10ko);
        listImageKanji.add(R.drawable.katakana11sa);
        listImageKanji.add(R.drawable.katakana12shi);
        listImageKanji.add(R.drawable.katakana13su);
        listImageKanji.add(R.drawable.katakana14se);
        listImageKanji.add(R.drawable.katakana15so);
        listImageKanji.add(R.drawable.katakana16ta);
        listImageKanji.add(R.drawable.katakana17chi);
        listImageKanji.add(R.drawable.katakana18tsu);
        listImageKanji.add(R.drawable.katakana19te);
        listImageKanji.add(R.drawable.katakana20to);
        listImageKanji.add(R.drawable.katakana21na);
        listImageKanji.add(R.drawable.katakana22ni);
        listImageKanji.add(R.drawable.katakana23nu);
        listImageKanji.add(R.drawable.katakana24ne);
        listImageKanji.add(R.drawable.katakana25no);
        listImageKanji.add(R.drawable.katakana26ha);
        listImageKanji.add(R.drawable.katakana27hi);
        listImageKanji.add(R.drawable.katakana28fu);
        listImageKanji.add(R.drawable.katakana29he);
        listImageKanji.add(R.drawable.katakana30ho);
        listImageKanji.add(R.drawable.katakana31ma);
        listImageKanji.add(R.drawable.katakana32mi);
        listImageKanji.add(R.drawable.katakana33mu);
        listImageKanji.add(R.drawable.katakana34me);
        listImageKanji.add(R.drawable.katakana35mo);
        listImageKanji.add(R.drawable.katakana36ya);
        listImageKanji.add(R.drawable.blanco);
        listImageKanji.add(R.drawable.katakana37yu);
        listImageKanji.add(R.drawable.blanco);
        listImageKanji.add(R.drawable.katakana38yo);
        listImageKanji.add(R.drawable.katakana39ra);
        listImageKanji.add(R.drawable.katakana40ri);
        listImageKanji.add(R.drawable.katakana41ru);
        listImageKanji.add(R.drawable.katakana42re);
        listImageKanji.add(R.drawable.katakana43ro);
        listImageKanji.add(R.drawable.katakana44wa);
        listImageKanji.add(R.drawable.blanco);
        listImageKanji.add(R.drawable.blanco);
        listImageKanji.add(R.drawable.blanco);
        listImageKanji.add(R.drawable.katakana45wo);
        listImageKanji.add(R.drawable.katakana46n);
    }
}