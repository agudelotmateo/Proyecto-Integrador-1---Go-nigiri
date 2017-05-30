package com.aprendamosjapones.aprendedamosjapones.DictionaryHIraganaNEW;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryHiragana {
    private static ItemsDictionaryHiragana[] courses = {
            new ItemsDictionaryHiragana("a",
                    R.raw.aud1a, "Funciona ejemplo 1", "Funciona ejemplo 2", "Funciona ejemplo 3", R.drawable.hiragana1,
                    R.drawable.hiragana1a),
             new ItemsDictionaryHiragana("i",
                     R.raw.aud2i, "Ejemplo 2", "Ejemplo 2", "Ejemplo 3", R.drawable.i,
                    R.drawable.hiragana2i),
            new ItemsDictionaryHiragana("u",
                    R.raw.aud3u, "Funciona ejemplo 1", "Funciona ejemplo 2", "Funciona ejemplo 3", R.drawable.u,
                    R.drawable.hiragana3u),
            new ItemsDictionaryHiragana("e",
                    R.raw.aud4e, "Ejemplo 1", "Ejemplo 2", "Ejemplo 3", R.drawable.e,
                    R.drawable.hiragana4e),
            new ItemsDictionaryHiragana("o",
                    R.raw.aud5o,"", "", "", R.drawable.o,
                    R.drawable.hiragana5o),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ItemsDictionaryHiragana> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ItemsDictionaryHiragana getCourseByPosition(int position) {
        return courses[position];
    }

}
