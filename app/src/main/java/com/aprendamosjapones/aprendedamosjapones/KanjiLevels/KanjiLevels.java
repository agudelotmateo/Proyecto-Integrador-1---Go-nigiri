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
            new KanjiLevel("Onyomi, Kunyomi y Okurigana",
                    "Antes de aprender los kanjis es importante entender cómo los vamos a leer a la " +
                            "hora de pronunciarlos.\n\n" +
                            "Cómo ya sabemos los kanjis son ideogramas provenientes de China, esto implica " +
                            "que ya tenían una pronunciación definida. Pero esto no significa que antes de " +
                            "que llegaran a Japón no existía una forma para escribir y decir en japonés una " +
                            "palabra representada por un kanji. Entonces, al mezclar los sistemas de escritura " +
                            "obtenemos kanjis con dos formas de pronunciarlos: una en chino y otra en japonés. " +
                            "De aquí nace el onyomi y el kunyomi.\n\n" +
                            "El onyomi hace referencia a la pronunciación del kanji derivada del chino, la cual " +
                            "se escribe en katakana porque proviene de otro país diferente a Japón. Por su parte, " +
                            "el kunyomi es la pronunciación japonesa del kanji, y se escribe en hiragana.\n\n" +
                            "Sin embargo, aquí surgen unos pequeños problemas: por un lado un mismo kanji puede " +
                            "tener más de un significado, y por el otro hace falta escribir las inflexiones para " +
                            "los kanjis que no los tengan (no es lo mismo \"comer\" que \"comió\"). Como solución " +
                            "a estos inconvenientes es común encontrar kanjis acompañados de hiragana para diferenciar " +
                            "los múltiples significados que puede tener un kanji, o para reconocer las diversas " +
                            "inflexiones de la palabra. A este pedacito en hiragana, que normalmente aparece como " +
                            "sufijo del kanji, se le conoce como okurigana, y lo vamos a reconocer en esta aplicación " +
                            "porque encontramos el kanji acompañado por el hiragana encerrado en paréntesis '()'.\n\n" +
                            "Como podrás deducir, cuando encontramos okurigana con el kanji, su lectura debe ser " +
                            "usando la pronunciación kun (kunyomi).",
                    R.drawable.kanji)
    };

    public static List<KanjiLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static KanjiLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
