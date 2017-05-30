package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryKanji {
    private static ItemsDictionaryKanji[] courses = {
            new ItemsDictionaryKanji("a",
                    R.raw.aud1a, "Funciona ejemplo 1", "Funciona ejemplo 3", "Funciona ejemplo 3", R.drawable.a,
                     R.drawable.kanji1dia),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ItemsDictionaryKanji> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ItemsDictionaryKanji getCourseByPosition(int position) {
        return courses[position];
    }

}
