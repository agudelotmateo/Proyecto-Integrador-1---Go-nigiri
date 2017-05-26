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
    };

    public static List<KatakanaLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static KatakanaLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
