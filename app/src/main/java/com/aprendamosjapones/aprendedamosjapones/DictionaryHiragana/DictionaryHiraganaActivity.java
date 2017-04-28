package com.aprendamosjapones.aprendedamosjapones.DictionaryHiragana;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryHiraganaActivity extends Activity {
    /** Called when the activity is first created. */
	
	private DictionaryHiraganaAdapter mAdapter;
    private DictionaryHiraganaAdapter mAdapter2;
	private ArrayList<String> listNameHiragana5;
	private ArrayList<Integer> listImagesHiragana5;
    private ArrayList<String> listNameHiragana3;
    private ArrayList<Integer> listImagesHiragana3;
	
	private GridView gridView;
    private GridView gridView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_hiragana_grid);
        
        prepareList();
        prepareList2();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new DictionaryHiraganaAdapter(this,listNameHiragana5, listImagesHiragana5);

        mAdapter2 = new DictionaryHiraganaAdapter(this,listNameHiragana3, listImagesHiragana3);
        
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        gridView2 = (GridView) findViewById(R.id.gridView2);
        gridView2.setAdapter(mAdapter2);
        
    }

    public void prepareList()
    {
        listNameHiragana5 = new ArrayList<String>();

        listNameHiragana5.add("a");
        listNameHiragana5.add("i");
        listNameHiragana5.add("u");
        listNameHiragana5.add("e");
        listNameHiragana5.add("o");
        listNameHiragana5.add("ka");
        listNameHiragana5.add("ki");
        listNameHiragana5.add("ku");
        listNameHiragana5.add("ke");
        listNameHiragana5.add("ko");
        listNameHiragana5.add("sa");
        listNameHiragana5.add("shi");
        listNameHiragana5.add("su");
        listNameHiragana5.add("se");
        listNameHiragana5.add("so");
        listNameHiragana5.add("ta");
        listNameHiragana5.add("chi");
        listNameHiragana5.add("tsu");
        listNameHiragana5.add("te");
        listNameHiragana5.add("to");
        listNameHiragana5.add("na");
        listNameHiragana5.add("ni");
        listNameHiragana5.add("nu");
        listNameHiragana5.add("ne");
        listNameHiragana5.add("no");
        listNameHiragana5.add("ha");
        listNameHiragana5.add("hi");
        listNameHiragana5.add("fu");
        listNameHiragana5.add("he");
        listNameHiragana5.add("ho");
        listNameHiragana5.add("ma");
        listNameHiragana5.add("mi");
        listNameHiragana5.add("mu");
        listNameHiragana5.add("me");
        listNameHiragana5.add("mo");
        listNameHiragana5.add("ya");
        listNameHiragana5.add("");
        listNameHiragana5.add("yu");
        listNameHiragana5.add("");
        listNameHiragana5.add("yo");
        listNameHiragana5.add("ra");
        listNameHiragana5.add("ri");
        listNameHiragana5.add("re");
        listNameHiragana5.add("ru");
        listNameHiragana5.add("re");
        listNameHiragana5.add("ro");
        listNameHiragana5.add("wa");
        listNameHiragana5.add("");
        listNameHiragana5.add("");
        listNameHiragana5.add("");
        listNameHiragana5.add("wo");
        listNameHiragana5.add("n");


        listImagesHiragana5 = new ArrayList<Integer>();

        listImagesHiragana5.add(R.drawable.hiragana1a);
        listImagesHiragana5.add(R.drawable.hiragana2i);
        listImagesHiragana5.add(R.drawable.hiragana3u);
        listImagesHiragana5.add(R.drawable.hiragana4e);
        listImagesHiragana5.add(R.drawable.hiragana5o);
        listImagesHiragana5.add(R.drawable.hiragana6ka);
        listImagesHiragana5.add(R.drawable.hiragana7ki);
        listImagesHiragana5.add(R.drawable.hiragana8ku);
        listImagesHiragana5.add(R.drawable.hiragana9ke);
        listImagesHiragana5.add(R.drawable.hiragana10ko);
        listImagesHiragana5.add(R.drawable.hiragana11sa);
        listImagesHiragana5.add(R.drawable.hiragana12shi);
        listImagesHiragana5.add(R.drawable.hiragana13su);
        listImagesHiragana5.add(R.drawable.hiragana14se);
        listImagesHiragana5.add(R.drawable.hiragana15so);
        listImagesHiragana5.add(R.drawable.hiragana16ta);
        listImagesHiragana5.add(R.drawable.hiragana17chi);
        listImagesHiragana5.add(R.drawable.hiragana18tsu);
        listImagesHiragana5.add(R.drawable.hiragana19te);
        listImagesHiragana5.add(R.drawable.hiragana20to);
        listImagesHiragana5.add(R.drawable.hiragana21na);
        listImagesHiragana5.add(R.drawable.hiragana22ni);
        listImagesHiragana5.add(R.drawable.hiragana23nu);
        listImagesHiragana5.add(R.drawable.hiragana24ne);
        listImagesHiragana5.add(R.drawable.hiragana25no);
        listImagesHiragana5.add(R.drawable.hiragana26ha);
        listImagesHiragana5.add(R.drawable.hiragana27hi);
        listImagesHiragana5.add(R.drawable.hiragana28fu);
        listImagesHiragana5.add(R.drawable.hiragana29he);
        listImagesHiragana5.add(R.drawable.hiragana30ho);
        listImagesHiragana5.add(R.drawable.hiragana31ma);
        listImagesHiragana5.add(R.drawable.hiragana32mi);
        listImagesHiragana5.add(R.drawable.hiragana33mu);
        listImagesHiragana5.add(R.drawable.hiragana34me);
        listImagesHiragana5.add(R.drawable.hiragana35mo);
        listImagesHiragana5.add(R.drawable.hiragana36ya);
        listImagesHiragana5.add(R.drawable.blanco);
        listImagesHiragana5.add(R.drawable.hiragana37yu);
        listImagesHiragana5.add(R.drawable.blanco);
        listImagesHiragana5.add(R.drawable.hiragana38yo);
        listImagesHiragana5.add(R.drawable.hiragana39ra);
        listImagesHiragana5.add(R.drawable.hiragana40ri);
        listImagesHiragana5.add(R.drawable.hiragana41ru);
        listImagesHiragana5.add(R.drawable.hiragana42re);
        listImagesHiragana5.add(R.drawable.hiragana43ro);
        listImagesHiragana5.add(R.drawable.hiragana44wa);
        listImagesHiragana5.add(R.drawable.blanco);
        listImagesHiragana5.add(R.drawable.blanco);
        listImagesHiragana5.add(R.drawable.blanco);
        listImagesHiragana5.add(R.drawable.hiragana45wo);
        listImagesHiragana5.add(R.drawable.hiragana46n);
    }

    public void prepareList2() {

        listNameHiragana3 = new ArrayList<String>();

        listNameHiragana3.add("a");
        listNameHiragana3.add("i");
        listNameHiragana3.add("a");
        listNameHiragana3.add("i");

        listImagesHiragana3 = new ArrayList<Integer>();

        listImagesHiragana3.add(R.drawable.hiragana1a);
        listImagesHiragana3.add(R.drawable.hiragana2i);
        listImagesHiragana3.add(R.drawable.hiragana2i);
        listImagesHiragana3.add(R.drawable.hiragana2i);
    }


}