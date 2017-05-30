package com.aprendamosjapones.aprendedamosjapones.DictionaryHIraganaNEW;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryHiragana {
    private static ItemsDictionaryHiragana[] courses = {
            new ItemsDictionaryHiragana("",
                    R.raw.aud1a, "Funciona ejemplo 1", "Funciona ejemplo 3", "Funciona ejemplo 3", R.drawable.hiragana1,
                     R.drawable.hiragana1a),
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
