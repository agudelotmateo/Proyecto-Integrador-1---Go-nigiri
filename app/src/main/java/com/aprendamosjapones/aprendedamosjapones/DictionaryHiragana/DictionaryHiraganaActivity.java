package com.aprendamosjapones.aprendedamosjapones.DictionaryHiragana;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryHiraganaActivity extends Activity {
    /** Called when the activity is first created. */
	
	private DictionaryHiraganaAdapter mAdapter;
	private ArrayList<String> listCountry;
	private ArrayList<Integer> listFlag;
	
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_hiragana_grid);
        
        prepareList();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new DictionaryHiraganaAdapter(this,listCountry, listFlag);
        
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
        
    }

    public void prepareList()
    {
        listCountry = new ArrayList<String>();

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
        listCountry.add("yu");
        listCountry.add("yo");
        listCountry.add("ra");
        listCountry.add("ri");
        listCountry.add("re");
        listCountry.add("ru");
        listCountry.add("re");
        listCountry.add("ro");
        listCountry.add("wa");
        listCountry.add("");
        listCountry.add("wo");
        listCountry.add("n");


        listFlag = new ArrayList<Integer>();

        listFlag.add(R.drawable.hiragana1a);
        listFlag.add(R.drawable.hiragana2i);
        listFlag.add(R.drawable.hiragana3u);
        listFlag.add(R.drawable.hiragana4e);
        listFlag.add(R.drawable.hiragana5o);
        listFlag.add(R.drawable.hiragana6ka);
        listFlag.add(R.drawable.hiragana7ki);
        listFlag.add(R.drawable.hiragana8ku);
        listFlag.add(R.drawable.hiragana9ke);
        listFlag.add(R.drawable.hiragana10ko);
        listFlag.add(R.drawable.hiragana11sa);
        listFlag.add(R.drawable.hiragana12shi);
        listFlag.add(R.drawable.hiragana13su);
        listFlag.add(R.drawable.hiragana14se);
        listFlag.add(R.drawable.hiragana15so);
        listFlag.add(R.drawable.hiragana16ta);
        listFlag.add(R.drawable.hiragana17chi);
        listFlag.add(R.drawable.hiragana18tsu);
        listFlag.add(R.drawable.hiragana19te);
        listFlag.add(R.drawable.hiragana20to);
        listFlag.add(R.drawable.hiragana21na);
        listFlag.add(R.drawable.hiragana22ni);
        listFlag.add(R.drawable.hiragana23nu);
        listFlag.add(R.drawable.hiragana24ne);
        listFlag.add(R.drawable.hiragana25no);
        listFlag.add(R.drawable.hiragana26ha);
        listFlag.add(R.drawable.hiragana27hi);
        listFlag.add(R.drawable.hiragana28fu);
        listFlag.add(R.drawable.hiragana29he);
        listFlag.add(R.drawable.hiragana30ho);
        listFlag.add(R.drawable.hiragana31ma);
        listFlag.add(R.drawable.hiragana32mi);
        listFlag.add(R.drawable.hiragana33mu);
        listFlag.add(R.drawable.hiragana34me);
        listFlag.add(R.drawable.hiragana35mo);
        listFlag.add(R.drawable.hiragana36ya);
        listFlag.add(R.drawable.hiragana37yu);
        listFlag.add(R.drawable.hiragana38yo);
        listFlag.add(R.drawable.hiragana39ra);
        listFlag.add(R.drawable.hiragana40ri);
        listFlag.add(R.drawable.hiragana41ru);
        listFlag.add(R.drawable.hiragana42re);
        listFlag.add(R.drawable.hiragana43ro);
        listFlag.add(R.drawable.hiragana44wa);
        listFlag.add(R.drawable.blanco);
        listFlag.add(R.drawable.hiragana45wo);
        listFlag.add(R.drawable.hiragana46n);
    }
   
}