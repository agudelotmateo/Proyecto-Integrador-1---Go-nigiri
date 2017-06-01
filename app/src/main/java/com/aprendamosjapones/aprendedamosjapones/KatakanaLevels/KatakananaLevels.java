package com.aprendamosjapones.aprendedamosjapones.KatakanaLevels;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;


public class KatakananaLevels {
    private static KatakanaLevel[] levels = {
            new KatakanaLevel("¿Qué es el katakana?",
                    "El katakana, al igual que el hiragana, es un sistema oficial de escritura del japonés, que" +
                            " representa fonemas del idioma. Los fonemas son los mismos del hiragana, por lo" +
                            " que, como supondrás, también son 46 caracteres básicos. La diferencia es que" +
                            " este silabario se usa para escribir palabras de origen extranjero a Japón y" +
                            " para escribir onomatopeyas. De hecho, notarás que algunas palabras en japonés" +
                            " suenan muy similar o igual a como suenan en otro idioma, por ejemplo “pan” en" +
                            " español se escribe “pan” en rōmaji, y se pronuncia igual. Esto se" +
                            " debe a que las palabras que se toman de otro idioma se ajustan ligeramente para" +
                            " que suenen prácticamente igual pero usando los símbolos del katakana.\n", R.drawable.katakana),
            new KatakanaLevel("Vocales alargadas",
                    "Por suerte, representar las vocales alargadas en katakana es mucho más fácil que en " +
                            "hiragana. Independiente de la vocal a alargar, lo único que hay que hacer es añadir " +
                            "‘ー’ después del caracter.",
                    R.drawable.katakana),
            new KatakanaLevel("Consonantes dobles",
                    "Al igual que con el hiragana, en el katakana también se pueden encontrar palabras con doble " +
                            "consonante, como en el caso de la palabra “kukkii” (que significa galleta). Pero, al " +
                            "igual que en el hiragana, se escribe con el pequeño ‘tsu’, la diferencia es que utilizamos " +
                            "el del katakana: ツ. De esta forma, “kukki” sería クッキー.",
                    R.drawable.katakana),
            new KatakanaLevel("Sílabas extranjeras",
                    "Ya sabes que el katakana tiene las mismas sílabas del hiragana y que se usa para onomatopeyas y " +
                            "palabras extranjeras. Pero, te has preguntado cómo hacemos con palabras como “comedy” " +
                            "(que es comedia en inglés y que se pronuncia “comedi”), o cómo haríamos con “información”, " +
                            "el cual se suele acortar a “info”. Si lo recuerdas, no existe un hiragana para ‘di’ o ‘fo’, " +
                            "y por ende tampoco existe un katakana, así que para representar estos sonidos extranjeros " +
                            "tendremos que valernos de un nuevo elemento conocido como el pequeño katakana.\n\n" +
                            "Cuando después de un katakana normal encuentres el katakana de una de las vocales pero " +
                            "más pequeño de lo normal, la sílaba va a ser modificada de manera que se va a coger " +
                            "la consonante de la sílaba pero con la vocal indicada. Por ejemplo “info” se escribirá " +
                            "como インフォ (donde フ es el katakana de ‘fu’, y ォes el de ‘o’). Hay otros casos en " +
                            "los que no se cambia la vocal sino que se coge la consonante de la sílaba y se cambia " +
                            "por la consonante representativa del grupo (fila) en el que se encuentra. Esto es lo " +
                            "que pasa con “comedy” que se escribe comoコメディー, donde  デes el katakana de “ji”, el " +
                            "cual se encuentra en el mismo grupo que ‘da’, ‘de’, ‘do’ (si no te acuerdas de esto, te " +
                            "invitamos a que le des un repaso a los diccionarios y lo verifiques).",
                    R.drawable.katakana)
    };

    public static List<KatakanaLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static KatakanaLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
