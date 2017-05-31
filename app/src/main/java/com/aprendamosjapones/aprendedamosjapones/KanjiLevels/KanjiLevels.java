package com.aprendamosjapones.aprendedamosjapones.KanjiLevels;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;


public class KanjiLevels {
    private static KanjiLevel[] levels = {
            new KanjiLevel("¿Qué es el Kanji?",
                    "El kanji es un sistema de escritura originario de China, " +
                            "motivo por el que es posible que se te haga tan parecida la escritura " +
                            "de ambos idiomas. Sin embargo, es posible encontrar diferencias entre el " +
                            "kanji japonés y hanzi chino, resultado del transcurso del tiempo.\n\n" +
                            "Los caracteres del kanji a diferencia del hiragana y del katakana no " +
                            "representan sonidos del idioma sino una idea completa, " +
                            "es decir, son ideogramas. Por este motivo pueden existir una gran " +
                            "variedad de estos caracteres, y aprenderlos todos no es una tarea " +
                            "fácil. De hecho hay más de 7000 pero un adulto promedio sólo " +
                            "conoce alrededor de 2000.\n\n" +
                            "Lastimosamente, por el momento sólo aprenderemos 80 kanjis, " +
                            "los más básicos y los que necesitas conocer para presentar " +
                            "el nivel 5 del examen de certificación de japonés: JLPT. Ten " +
                            "en cuenta que son 5 niveles, donde el quinto es el más básico " +
                            "de todos.",  R.drawable.kanji),
    };

    public static List<KanjiLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static KanjiLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
