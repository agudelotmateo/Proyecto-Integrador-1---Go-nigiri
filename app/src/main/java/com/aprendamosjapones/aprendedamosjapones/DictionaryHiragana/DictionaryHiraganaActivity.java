package com.aprendamosjapones.aprendedamosjapones.DictionaryHiragana;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryHiraganaActivity extends Activity {
    /** Called when the activity is first created. */
	
	private DictionaryHiraganaAdapter mAdapter;
	private ArrayList<String> listNameHiragana;
	private ArrayList<Integer> listImagesHiragana;

	private GridView gridView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_hiragana_grid);
        
        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new DictionaryHiraganaAdapter(this,listNameHiragana, listImagesHiragana);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridViewHiragana);
        gridView.setAdapter(mAdapter);

    }

    public void prepareList()
    {
        listNameHiragana = new ArrayList<String>();

        listNameHiragana.add("a");
        listNameHiragana.add("i");
        listNameHiragana.add("u");
        listNameHiragana.add("e");
        listNameHiragana.add("o");
        listNameHiragana.add("ka");
        listNameHiragana.add("ki");
        listNameHiragana.add("ku");
        listNameHiragana.add("ke");
        listNameHiragana.add("ko");
        listNameHiragana.add("sa");
        listNameHiragana.add("shi");
        listNameHiragana.add("su");
        listNameHiragana.add("se");
        listNameHiragana.add("so");
        listNameHiragana.add("ta");
        listNameHiragana.add("chi");
        listNameHiragana.add("tsu");
        listNameHiragana.add("te");
        listNameHiragana.add("to");
        listNameHiragana.add("na");
        listNameHiragana.add("ni");
        listNameHiragana.add("nu");
        listNameHiragana.add("ne");
        listNameHiragana.add("no");
        listNameHiragana.add("ha");
        listNameHiragana.add("hi");
        listNameHiragana.add("fu");
        listNameHiragana.add("he");
        listNameHiragana.add("ho");
        listNameHiragana.add("ma");
        listNameHiragana.add("mi");
        listNameHiragana.add("mu");
        listNameHiragana.add("me");
        listNameHiragana.add("mo");
        listNameHiragana.add("ya");
        listNameHiragana.add("");
        listNameHiragana.add("yu");
        listNameHiragana.add("");
        listNameHiragana.add("yo");
        listNameHiragana.add("ra");
        listNameHiragana.add("ri");
        listNameHiragana.add("ru");
        listNameHiragana.add("re");
        listNameHiragana.add("ro");
        listNameHiragana.add("wa");
        listNameHiragana.add("");
        listNameHiragana.add("");
        listNameHiragana.add("");
        listNameHiragana.add("wo");
        listNameHiragana.add("n");


        listImagesHiragana = new ArrayList<Integer>();

        listImagesHiragana.add(R.drawable.hiragana1a);
        listImagesHiragana.add(R.drawable.hiragana2i);
        listImagesHiragana.add(R.drawable.hiragana3u);
        listImagesHiragana.add(R.drawable.hiragana4e);
        listImagesHiragana.add(R.drawable.hiragana5o);
        listImagesHiragana.add(R.drawable.hiragana6ka);
        listImagesHiragana.add(R.drawable.hiragana7ki);
        listImagesHiragana.add(R.drawable.hiragana8ku);
        listImagesHiragana.add(R.drawable.hiragana9ke);
        listImagesHiragana.add(R.drawable.hiragana10ko);
        listImagesHiragana.add(R.drawable.hiragana11sa);
        listImagesHiragana.add(R.drawable.hiragana12shi);
        listImagesHiragana.add(R.drawable.hiragana13su);
        listImagesHiragana.add(R.drawable.hiragana14se);
        listImagesHiragana.add(R.drawable.hiragana15so);
        listImagesHiragana.add(R.drawable.hiragana16ta);
        listImagesHiragana.add(R.drawable.hiragana17chi);
        listImagesHiragana.add(R.drawable.hiragana18tsu);
        listImagesHiragana.add(R.drawable.hiragana19te);
        listImagesHiragana.add(R.drawable.hiragana20to);
        listImagesHiragana.add(R.drawable.hiragana21na);
        listImagesHiragana.add(R.drawable.hiragana22ni);
        listImagesHiragana.add(R.drawable.hiragana23nu);
        listImagesHiragana.add(R.drawable.hiragana24ne);
        listImagesHiragana.add(R.drawable.hiragana25no);
        listImagesHiragana.add(R.drawable.hiragana26ha);
        listImagesHiragana.add(R.drawable.hiragana27hi);
        listImagesHiragana.add(R.drawable.hiragana28fu);
        listImagesHiragana.add(R.drawable.hiragana29he);
        listImagesHiragana.add(R.drawable.hiragana30ho);
        listImagesHiragana.add(R.drawable.hiragana31ma);
        listImagesHiragana.add(R.drawable.hiragana32mi);
        listImagesHiragana.add(R.drawable.hiragana33mu);
        listImagesHiragana.add(R.drawable.hiragana34me);
        listImagesHiragana.add(R.drawable.hiragana35mo);
        listImagesHiragana.add(R.drawable.hiragana36ya);
        listImagesHiragana.add(R.drawable.blanco);
        listImagesHiragana.add(R.drawable.hiragana37yu);
        listImagesHiragana.add(R.drawable.blanco);
        listImagesHiragana.add(R.drawable.hiragana38yo);
        listImagesHiragana.add(R.drawable.hiragana39ra);
        listImagesHiragana.add(R.drawable.hiragana40ri);
        listImagesHiragana.add(R.drawable.hiragana41ru);
        listImagesHiragana.add(R.drawable.hiragana42re);
        listImagesHiragana.add(R.drawable.hiragana43ro);
        listImagesHiragana.add(R.drawable.hiragana44wa);
        listImagesHiragana.add(R.drawable.blanco);
        listImagesHiragana.add(R.drawable.blanco);
        listImagesHiragana.add(R.drawable.blanco);
        listImagesHiragana.add(R.drawable.hiragana45wo);
        listImagesHiragana.add(R.drawable.hiragana46n);
    }

}

