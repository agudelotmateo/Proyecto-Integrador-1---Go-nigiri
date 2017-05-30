package com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryKatakana {
    private static ItemsDictionaryKatakana[] courses = {
            new ItemsDictionaryKatakana("a",
                    R.raw.aud1a, "Funciona ejemplo 1", "Funciona ejemplo 3", "Funciona ejemplo 3", R.drawable.a,
                     R.drawable.katakana1a),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ItemsDictionaryKatakana> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ItemsDictionaryKatakana getCourseByPosition(int position) {
        return courses[position];
    }

}
