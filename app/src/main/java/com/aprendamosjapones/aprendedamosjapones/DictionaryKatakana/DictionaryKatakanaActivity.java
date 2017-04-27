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

        listCountry.add("a");
        listCountry.add("i");
        listCountry.add("u");
        listCountry.add("e");
        listCountry.add("o");
        listCountry.add("ka");
        listCountry.add("ki");
        listCountry.add("ku");
        listCountry.add("ke");
        listCountry.add("ko");
        listCountry.add("sa");
        listCountry.add("shi");
        listCountry.add("su");
        listCountry.add("se");
        listCountry.add("so");
        listCountry.add("ta");
        listCountry.add("chi");
        listCountry.add("tsu");
        listCountry.add("te");
        listCountry.add("to");
        listCountry.add("na");
        listCountry.add("ni");
        listCountry.add("nu");
        listCountry.add("ne");
        listCountry.add("no");
        listCountry.add("ha");
        listCountry.add("hi");
        listCountry.add("fu");
        listCountry.add("he");
        listCountry.add("ho");
        listCountry.add("ma");
        listCountry.add("mi");
        listCountry.add("mu");
        listCountry.add("me");
        listCountry.add("mo");
        listCountry.add("ya");
        listCountry.add("");
        listCountry.add("yu");
        listCountry.add("");
        listCountry.add("yo");
        listCountry.add("ra");
        listCountry.add("ri");
        listCountry.add("ru");
        listCountry.add("re");
        listCountry.add("ro");
        listCountry.add("wa");
        listCountry.add("");
        listCountry.add("");
        listCountry.add("");
        listCountry.add("wo");
        listCountry.add("n");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.katakana1a);
        listFlag.add(R.drawable.katakana2i);
        listFlag.add(R.drawable.katakana3u);
        listFlag.add(R.drawable.katakana4e);
        listFlag.add(R.drawable.katakana5o);
        listFlag.add(R.drawable.katakana6ka);
        listFlag.add(R.drawable.katakana7ki);
        listFlag.add(R.drawable.katakana8ku);
        listFlag.add(R.drawable.katakana9ke);
        listFlag.add(R.drawable.katakana10ko);
        listFlag.add(R.drawable.katakana11sa);
        listFlag.add(R.drawable.katakana12shi);
        listFlag.add(R.drawable.katakana13su);
        listFlag.add(R.drawable.katakana14se);
        listFlag.add(R.drawable.katakana15so);
        listFlag.add(R.drawable.katakana16ta);
        listFlag.add(R.drawable.katakana17chi);
        listFlag.add(R.drawable.katakana18tsu);
        listFlag.add(R.drawable.katakana19te);
        listFlag.add(R.drawable.katakana20to);
        listFlag.add(R.drawable.katakana21na);
        listFlag.add(R.drawable.katakana22ni);
        listFlag.add(R.drawable.katakana23nu);
        listFlag.add(R.drawable.katakana24ne);
        listFlag.add(R.drawable.katakana25no);
        listFlag.add(R.drawable.katakana26ha);
        listFlag.add(R.drawable.katakana27hi);
        listFlag.add(R.drawable.katakana28fu);
        listFlag.add(R.drawable.katakana29he);
        listFlag.add(R.drawable.katakana30ho);
        listFlag.add(R.drawable.katakana31ma);
        listFlag.add(R.drawable.katakana32mi);
        listFlag.add(R.drawable.katakana33mu);
        listFlag.add(R.drawable.katakana34me);
        listFlag.add(R.drawable.katakana35mo);
        listFlag.add(R.drawable.katakana36ya);
        listFlag.add(R.drawable.blanco);
        listFlag.add(R.drawable.katakana37yu);
        listFlag.add(R.drawable.blanco);
        listFlag.add(R.drawable.katakana38yo);
        listFlag.add(R.drawable.katakana39ra);
        listFlag.add(R.drawable.katakana40ri);
        listFlag.add(R.drawable.katakana41ru);
        listFlag.add(R.drawable.katakana42re);
        listFlag.add(R.drawable.katakana43ro);
        listFlag.add(R.drawable.katakana44wa);
        listFlag.add(R.drawable.blanco);
        listFlag.add(R.drawable.blanco);
        listFlag.add(R.drawable.blanco);
        listFlag.add(R.drawable.katakana45wo);
        listFlag.add(R.drawable.katakana46n);
    }
}