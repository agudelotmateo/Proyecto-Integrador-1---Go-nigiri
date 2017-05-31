package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryKanji {
    private static ItemsDictionaryKanji[] courses = {
            new ItemsDictionaryKanji("Dia",
                    "Significado", "Onjomi", "Kunjomi", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),
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
