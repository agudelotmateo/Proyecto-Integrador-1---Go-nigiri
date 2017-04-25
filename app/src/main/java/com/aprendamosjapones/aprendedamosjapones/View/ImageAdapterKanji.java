package com.aprendamosjapones.aprendedamosjapones.View;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.aprendamosjapones.aprendedamosjapones.R;


public class ImageAdapterKanji extends BaseAdapter {
    // Contexto de la aplicación
    private Context mContext;

    // Array de identificadores
    private Integer[] mThumbIds = {
            //imagenes
            R.drawable.kanji1dia, R.drawable.kanji2uno,
            R.drawable.kanji3pais, R.drawable.kanji4persona,
            R.drawable.kanji5a_o, R.drawable.kanji6grande,
            R.drawable.kanji7diez, R.drawable.kanji8dos,
            R.drawable.kanji9libro, R.drawable.kanji10adentro,
            R.drawable.kanji11largo, R.drawable.kanji12salir,
            R.drawable.kanji13tres, R.drawable.kanji14hora,
            R.drawable.kanji15viajar, R.drawable.kanji16ver,
            R.drawable.kanji17mes, R.drawable.kanji18atras,
            R.drawable.kanji19frente, R.drawable.kanji20vida,
            R.drawable.kanji21cinco, R.drawable.kanji22intervalo,
            R.drawable.kanji23arriba, R.drawable.kanji24este,
            R.drawable.kanji25cuatro, R.drawable.kanji26ahora,
            R.drawable.kanji27oro, R.drawable.kanji28nueve,
            R.drawable.kanji29entrar, R.drawable.kanji30estudiar,
            R.drawable.kanji31alto, R.drawable.kanji32circulo,
            R.drawable.kanji33ni_o, R.drawable.kanji34afuera,
            R.drawable.kanji35ocho, R.drawable.kanji36seis,
            R.drawable.kanji37abajo, R.drawable.kanji38venir,
            R.drawable.kanji39espiritu, R.drawable.kanji40pequeno,
            R.drawable.kanji41siete, R.drawable.kanji42montana,
            R.drawable.kanji43hablar, R.drawable.kanji44mujer,
            R.drawable.kanji45norte, R.drawable.kanji46mediodia,
            R.drawable.kanji47cien, R.drawable.kanji48escribir,
            R.drawable.kanji49antes, R.drawable.kanji50nombre,
            R.drawable.kanji51rio, R.drawable.kanji52mil,
            R.drawable.kanji53agua, R.drawable.kanji54mitad,
            R.drawable.kanji55hombre, R.drawable.kanji56oeste,
            R.drawable.kanji57electricidad,R.drawable.kanji58colegio,
            R.drawable.kanji59palabra, R.drawable.kanji59palabra,
            R.drawable.kanji60tierra, R.drawable.kanji61arbol,
            R.drawable.kanji62escuchar, R.drawable.kanji63comer,
            R.drawable.kanji64carro, R.drawable.kanji65que,
            R.drawable.kanji66sur, R.drawable.kanji67diezmil,
            R.drawable.kanji68cada, R.drawable.kanji69blanco,
            R.drawable.kanji70cielo, R.drawable.kanji72fuego,
            R.drawable.kanji73derecha, R.drawable.kanji74leer,
            R.drawable.kanji75amigo, R.drawable.kanji76izquierda,
            R.drawable.kanji77descansar, R.drawable.kanji78papa,
            R.drawable.kanji78papa, R.drawable.kanji79lluvia
    };

    public ImageAdapterKanji(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public int getThumbId(int position){return mThumbIds[position];}


    public View getView(int position, View convertView, ViewGroup parent) {
        //ImageView a retornar
        ImageView imageView;

        if (convertView == null) {
            /*
            Crear un nuevo Image View de 90x90
            y con recorte alrededor del centro
             */
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350,350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }

        //Setear la imagen desde el recurso drawable
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }


}