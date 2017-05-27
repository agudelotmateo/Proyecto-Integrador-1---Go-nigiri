package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryKanjiActivity extends Activity {
    /** Called when the activity is first created. */
	
	private DictionaryKanjiAdapter mAdapter;
	private ArrayList<String> listNamesKanji;
	private ArrayList<Integer> listImageKanji;
	
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_kanji_grid);
        
        prepareList();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new DictionaryKanjiAdapter(this,listNamesKanji, listImageKanji);
        
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
        
    }
    
    public void prepareList()
    {
    	  listNamesKanji = new ArrayList<String>();
    	  
    	  listNamesKanji.add("Dia");
    	  listNamesKanji.add("Uno");
          listNamesKanji.add("Pais");
          listNamesKanji.add("Persona");
          listNamesKanji.add("Año");
          listNamesKanji.add("Grande");
          listNamesKanji.add("Diez");
          listNamesKanji.add("Dos");
          listNamesKanji.add("Libro");
          listNamesKanji.add("Adentro");
          listNamesKanji.add("Largo");
          listNamesKanji.add("Salir");
          listNamesKanji.add("Tres");
          listNamesKanji.add("Tiempo");
          listNamesKanji.add("Ir");
          listNamesKanji.add("Ver");
          listNamesKanji.add("Mes");
          listNamesKanji.add("Atrás");
          listNamesKanji.add("Frente");
        listNamesKanji.add("Vida");
        listNamesKanji.add("Cinco");
        listNamesKanji.add("Entre");
        listNamesKanji.add("Arriba");
        listNamesKanji.add("Oriente");
        listNamesKanji.add("Cuatro");
        listNamesKanji.add("Ahora");
        listNamesKanji.add("Oro");
        listNamesKanji.add("Nueve");
        listNamesKanji.add("Entrar");
        listNamesKanji.add("Estudiar");
        listNamesKanji.add("Alto");
        listNamesKanji.add("Círculo");
        listNamesKanji.add("Niño");
        listNamesKanji.add("Afuera");
        listNamesKanji.add("Ocho");
        listNamesKanji.add("Seis");
        listNamesKanji.add("Abajo");
        listNamesKanji.add("Venir");
        listNamesKanji.add("Espíritu");
        listNamesKanji.add("Pequeño");
        listNamesKanji.add("Siete");
        listNamesKanji.add("Montaña");
        listNamesKanji.add("Cuento");
        listNamesKanji.add("Mujer");
        listNamesKanji.add("Norte");
        listNamesKanji.add("Mediodía");
        listNamesKanji.add("Cien");
        listNamesKanji.add("Escribir");
        listNamesKanji.add("Antes");
        listNamesKanji.add("Nombre");
        listNamesKanji.add("Rio");
        listNamesKanji.add("Mil");
        listNamesKanji.add("Agua");
        listNamesKanji.add("Mitad");
        listNamesKanji.add("Hombre");
        listNamesKanji.add("Oeste");
        listNamesKanji.add("Electricidad");
        listNamesKanji.add("Colegio");
        listNamesKanji.add("Palabra");
        listNamesKanji.add("Suelo");
        listNamesKanji.add("Árbol");
        listNamesKanji.add("Escuchar");
        listNamesKanji.add("Comer");
        listNamesKanji.add("Carro");
        listNamesKanji.add("Qué");
        listNamesKanji.add("Sur");
        listNamesKanji.add("Diez mil");
        listNamesKanji.add("Cada");
        listNamesKanji.add("Blaco");
        listNamesKanji.add("Cielo");
        listNamesKanji.add("Mamá");
        listNamesKanji.add("Fuego");
        listNamesKanji.add("Derecha");
        listNamesKanji.add("Leer");
        listNamesKanji.add("Amigo");
        listNamesKanji.add("Izquierda");
        listNamesKanji.add("Descansar");
        listNamesKanji.add("Papá");
        listNamesKanji.add("Lluvia");

          
          listImageKanji = new ArrayList<Integer>();

          listImageKanji.add(R.drawable.kanji1dia);
          listImageKanji.add(R.drawable.kanji2uno);
          listImageKanji.add(R.drawable.kanji3pais);
          listImageKanji.add(R.drawable.kanji4persona);
          listImageKanji.add(R.drawable.kanji5ano);
          listImageKanji.add(R.drawable.kanji6grande);
          listImageKanji.add(R.drawable.kanji7diez);
          listImageKanji.add(R.drawable.kanji8dos);
          listImageKanji.add(R.drawable.kanji9libro);
          listImageKanji.add(R.drawable.kanji10dentro);
          listImageKanji.add(R.drawable.kanji11largo);
          listImageKanji.add(R.drawable.kanji12salir);
          listImageKanji.add(R.drawable.kanji13tres);
          listImageKanji.add(R.drawable.kanji14tiempo);
          listImageKanji.add(R.drawable.kanji15ir);
          listImageKanji.add(R.drawable.kanji16ver);
          listImageKanji.add(R.drawable.kanji17mes);
          listImageKanji.add(R.drawable.kanji18atras);
          listImageKanji.add(R.drawable.kanji19frente);
          listImageKanji.add(R.drawable.kanji20vida);
          listImageKanji.add(R.drawable.kanji21cinco);
          listImageKanji.add(R.drawable.kanji22entre);
          listImageKanji.add(R.drawable.kanji23encima);
          listImageKanji.add(R.drawable.kanji24oriente);
        listImageKanji.add(R.drawable.kanji25cuatro);
        listImageKanji.add(R.drawable.kanji26ahora);
        listImageKanji.add(R.drawable.kanji27oro);
        listImageKanji.add(R.drawable.kanji28nueve);
        listImageKanji.add(R.drawable.kanji29entrar);
        listImageKanji.add(R.drawable.kanji30estudiar);
        listImageKanji.add(R.drawable.kanji31alto);
        listImageKanji.add(R.drawable.kanji32circulo);
        listImageKanji.add(R.drawable.kanji33nino);
        listImageKanji.add(R.drawable.kanji34afuera);
        listImageKanji.add(R.drawable.kanji35ocho);
        listImageKanji.add(R.drawable.kanji36seis);
        listImageKanji.add(R.drawable.kanji37debajo);
        listImageKanji.add(R.drawable.kanji38venir);
        listImageKanji.add(R.drawable.kanji39espiritu);
        listImageKanji.add(R.drawable.kanji40pequeno);
        listImageKanji.add(R.drawable.kanji41siete);
        listImageKanji.add(R.drawable.kanji42montana);
        listImageKanji.add(R.drawable.kanji43charla);
        listImageKanji.add(R.drawable.kanji44mujer);
        listImageKanji.add(R.drawable.kanji45norte);
        listImageKanji.add(R.drawable.kanji46mediodia);
        listImageKanji.add(R.drawable.kanji47cien);
        listImageKanji.add(R.drawable.kanji48escribir);
        listImageKanji.add(R.drawable.kanji49antes);
        listImageKanji.add(R.drawable.kanji50nombre);
        listImageKanji.add(R.drawable.kanji51rio);
        listImageKanji.add(R.drawable.kanji52mil);
        listImageKanji.add(R.drawable.kanji53agua);
        listImageKanji.add(R.drawable.kanji54mitad);
        listImageKanji.add(R.drawable.kanji55hombre);
        listImageKanji.add(R.drawable.kanji56occidente);
        listImageKanji.add(R.drawable.kanji57electricidad);
        listImageKanji.add(R.drawable.kanji58colegio);
        listImageKanji.add(R.drawable.kanji59palabra);
        listImageKanji.add(R.drawable.kanji60suelo);
        listImageKanji.add(R.drawable.kanji61arbol);
        listImageKanji.add(R.drawable.kanji62escuchar);
        listImageKanji.add(R.drawable.kanji63comer);
        listImageKanji.add(R.drawable.kanji64carro);
        listImageKanji.add(R.drawable.kanji65que);
        listImageKanji.add(R.drawable.kanji66sur);
        listImageKanji.add(R.drawable.kanji67diezmil);
        listImageKanji.add(R.drawable.kanji68cada);
        listImageKanji.add(R.drawable.kanji69blanco);
        listImageKanji.add(R.drawable.kanji70cielo);
        listImageKanji.add(R.drawable.kanji71mama);
        listImageKanji.add(R.drawable.kanji72fuego);
        listImageKanji.add(R.drawable.kanji73derecha);
        listImageKanji.add(R.drawable.kanji74leer);
        listImageKanji.add(R.drawable.kanji75amigo);
        listImageKanji.add(R.drawable.kanji76izquierda);
        listImageKanji.add(R.drawable.kanji77descansar);
        listImageKanji.add(R.drawable.kanji78papa);
        listImageKanji.add(R.drawable.kanji79lluvia);
    }
}