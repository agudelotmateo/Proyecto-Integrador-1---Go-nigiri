package com.aprendamosjapones.aprendedamosjapones.KanjiLevels;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;


public class KanjiLevels {
    private static KanjiLevel[] levels = {
            new KanjiLevel("¿Que es el Kanji?",
                    "Los kanjis (漢字 kanji?, literalmente «carácter han») son los sinogramas utilizados en la" +
                            " escritura del idioma japonés.", R.drawable.kanji),
    };

    public static List<KanjiLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static KanjiLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
