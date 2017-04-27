package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryKanjiActivity extends Activity {
    /** Called when the activity is first created. */
	
	private DictionaryKanjiAdapter mAdapter;
	private ArrayList<String> listCountry;
	private ArrayList<Integer> listFlag;
	
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_kanji_grid);
        
        prepareList();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new DictionaryKanjiAdapter(this,listCountry, listFlag);
        
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
        
    }
    
    public void prepareList()
    {
    	  listCountry = new ArrayList<String>();
    	  
    	  listCountry.add("Dia");
    	  listCountry.add("Uno");
          listCountry.add("Pais");
          listCountry.add("Persona");
          listCountry.add("Año");
          listCountry.add("Grande");
          listCountry.add("Diez");
          listCountry.add("Dos");
          listCountry.add("Libro");
          listCountry.add("Adentro");
          listCountry.add("Largo");
          listCountry.add("Salir");
          listCountry.add("Tres");
          listCountry.add("Hora");
          listCountry.add("Viajar");
          listCountry.add("Ver");
          listCountry.add("Mes");
          listCountry.add("Atras");
          listCountry.add("Frente");
        listCountry.add("Vida");
        listCountry.add("Cinco");
        listCountry.add("Intervalo");
        listCountry.add("Arriba");
        listCountry.add("Este");
        listCountry.add("Cuatro");
        listCountry.add("Ahora");
        listCountry.add("Oro");
        listCountry.add("Nuevo");
        listCountry.add("Entrar");
        listCountry.add("Estudiar");
        listCountry.add("Alto");
        listCountry.add("Circulo");
        listCountry.add("Niño");
        listCountry.add("Afuera");
        listCountry.add("Ocho");
        listCountry.add("Seis");
        listCountry.add("Abajo");
        listCountry.add("Venir");
        listCountry.add("Espiritu");
        listCountry.add("Pequeño");
        listCountry.add("Siete");
        listCountry.add("Montaña");
        listCountry.add("Hablar");
        listCountry.add("Mujer");
        listCountry.add("Norte");
        listCountry.add("Medio dia");
        listCountry.add("Cien");
        listCountry.add("Escribir");
        listCountry.add("Antes");
        listCountry.add("Nombre");
        listCountry.add("Rio");
        listCountry.add("Mil");
        listCountry.add("Agua");
        listCountry.add("Mitad");
        listCountry.add("Oeste");
        listCountry.add("Electricidad   ");
        listCountry.add("Colegio");
        listCountry.add("Palabra");
        listCountry.add("Tierra");
        listCountry.add("Arbol");
        listCountry.add("Escuchar");
        listCountry.add("Comer");
        listCountry.add("Carro");
        listCountry.add("Que");
        listCountry.add("Sur");
        listCountry.add("Diez mil");
        listCountry.add("Cada");
        listCountry.add("Blaco");
        listCountry.add("Cielo");
        listCountry.add("Mama");
        listCountry.add("Fuego");
        listCountry.add("Derecha");
        listCountry.add("Leer");
        listCountry.add("Amigo");
        listCountry.add("Izquierda");
        listCountry.add("Descansar");
        listCountry.add("Papa");
        listCountry.add("Lluvia");

          
          listFlag = new ArrayList<Integer>();

          listFlag.add(R.drawable.kanji1dia);
          listFlag.add(R.drawable.kanji2uno);
          listFlag.add(R.drawable.kanji3pais);
          listFlag.add(R.drawable.kanji4persona);
          listFlag.add(R.drawable.kanji5a_o);
          listFlag.add(R.drawable.kanji6grande);
          listFlag.add(R.drawable.kanji7diez);
          listFlag.add(R.drawable.kanji8dos);
          listFlag.add(R.drawable.kanji9libro);
          listFlag.add(R.drawable.kanji10adentro);
          listFlag.add(R.drawable.kanji11largo);
          listFlag.add(R.drawable.kanji12salir);
          listFlag.add(R.drawable.kanji13tres);
          listFlag.add(R.drawable.kanji14hora);
          listFlag.add(R.drawable.kanji15viajar);
          listFlag.add(R.drawable.kanji16ver);
          listFlag.add(R.drawable.kanji17mes);
          listFlag.add(R.drawable.kanji18atras);
          listFlag.add(R.drawable.kanji19frente);
          listFlag.add(R.drawable.kanji20vida);
          listFlag.add(R.drawable.kanji21cinco);
          listFlag.add(R.drawable.kanji22intervalo);
          listFlag.add(R.drawable.kanji23arriba);
          listFlag.add(R.drawable.kanji24este);
        listFlag.add(R.drawable.kanji25cuatro);
        listFlag.add(R.drawable.kanji26ahora);
        listFlag.add(R.drawable.kanji27oro);
        listFlag.add(R.drawable.kanji28nueve);
        listFlag.add(R.drawable.kanji29entrar);
        listFlag.add(R.drawable.kanji30estudiar);
        listFlag.add(R.drawable.kanji31alto);
        listFlag.add(R.drawable.kanji32circulo);
        listFlag.add(R.drawable.kanji33ni_o);
        listFlag.add(R.drawable.kanji34afuera);
        listFlag.add(R.drawable.kanji35ocho);
        listFlag.add(R.drawable.kanji36seis);
        listFlag.add(R.drawable.kanji37abajo);
        listFlag.add(R.drawable.kanji38venir);
        listFlag.add(R.drawable.kanji39espiritu);
        listFlag.add(R.drawable.kanji40pequeno);
        listFlag.add(R.drawable.kanji41siete);
        listFlag.add(R.drawable.kanji42montana);
        listFlag.add(R.drawable.kanji43hablar);
        listFlag.add(R.drawable.kanji44mujer);
        listFlag.add(R.drawable.kanji45norte);
        listFlag.add(R.drawable.kanji46mediodia);
        listFlag.add(R.drawable.kanji47cien);
        listFlag.add(R.drawable.kanji48escribir);
        listFlag.add(R.drawable.kanji49antes);
        listFlag.add(R.drawable.kanji50nombre);
        listFlag.add(R.drawable.kanji51rio);
        listFlag.add(R.drawable.kanji52mil);
        listFlag.add(R.drawable.kanji53agua);
        listFlag.add(R.drawable.kanji54mitad);
        listFlag.add(R.drawable.kanji56oeste);
        listFlag.add(R.drawable.kanji57electricidad);
        listFlag.add(R.drawable.kanji58colegio);
        listFlag.add(R.drawable.kanji59palabra);
        listFlag.add(R.drawable.kanji60tierra);
        listFlag.add(R.drawable.kanji61arbol);
        listFlag.add(R.drawable.kanji62escuchar);
        listFlag.add(R.drawable.kanji63comer);
        listFlag.add(R.drawable.kanji64carro);
        listFlag.add(R.drawable.kanji65que);
        listFlag.add(R.drawable.kanji66sur);
        listFlag.add(R.drawable.kanji67diezmil);
        listFlag.add(R.drawable.kanji68cada);
        listFlag.add(R.drawable.kanji69blanco);
        listFlag.add(R.drawable.kanji70cielo);
        listFlag.add(R.drawable.kanji71mama);
        listFlag.add(R.drawable.kanji72fuego);
        listFlag.add(R.drawable.kanji73derecha);
        listFlag.add(R.drawable.kanji74leer);
        listFlag.add(R.drawable.kanji75amigo);
        listFlag.add(R.drawable.kanji76izquierda);
        listFlag.add(R.drawable.kanji77descansar);
        listFlag.add(R.drawable.kanji78papa);
        listFlag.add(R.drawable.kanji79lluvia);
    }
}