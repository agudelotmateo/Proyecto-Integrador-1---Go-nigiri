package com.aprendamosjapones.aprendedamosjapones.HiraganaLevels;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;


public class HIraganaLevels {
    private static HiraganaLevel[] levels = {
            new HiraganaLevel("¿Que es el Rōmaji?",
                    "La palabra rōmaji es un término japonés que significa \"caractéres romanos\" y, como supondrás," +
                            " es la representación de la lengua japonesa en el alfabeto romano o latino" +
                            " (nuestro alfabeto). Aunque no es un sistema de escritura oficial del japonés," +
                            " es posible encontrarlo en algunas señales, marcas o similares en Japón. De hecho" +
                            " nosotros conocemos algunas palabras escritas en rōmaji: sushi, karate, Suzuki," +
                            " entre otras.\n" +
                            "El uso del rōmaji puede facilitar nuestra tarea de aprender el idioma dado" +
                            " que tratamos un alfabeto más familiar a nosotros, y por este motivo en las" +
                            " primeras lecciones, aquellas para aprender hiragana y katakana, lo veremos " +
                            "constantemente para enseñarte cómo leer y pronunciar las palabras, sin embargo," +
                            " más allá de esto no lo vamos a utilizar. Aprender japonés con sólo rōmaji no es" +
                            " recomendable, aunque se puede encontrar en el idioma no es el sistema de escritura " +
                            "más utilizado, por lo que es importante adaptarse a los alfabetos propios" +
                            " de la lengua.\n", "","","", R.drawable.romaji),
            new HiraganaLevel("¿Qué es el hiragana?",
                    "El hiragana es uno de los sistemas oficiales de escritura del japonés. Es como el alfabeto " +
                            "para nosotros en el sentido de que nos define la fonética o sonidos del lenguaje, " +
                            "la diferencia es que más que un alfabeto es un silabario.\n" +
                            "El silabario está compuesto por 46 caracteres básicos y es usado para palabras " +
                            "nativas de Japón y elementos gramaticales.\n", "","","", R.drawable.hiragana),
            new HiraganaLevel("Las vocales y la n (ん)",
                    "El japonés tiene 5 vocales, y por suerte para nosotros son equivalentes a las que nosotros " +
                            "utilizamos, la única diferencia es el orden en el que se presentan: a, i, u, e, o. " +
                            "Y su pronunciación no cambia para un hablante de la lengua hispana. Eso sí, ten en " +
                            "cuenta que la 'u' se pronuncia más suave, relaja los labios cuando la pronuncies en" +
                            " vez de cerrarlos formando una o, como normalmente hacemos.\n" +
                            "Hay momentos en los que la 'u' y la 'i' no se pronuncian. Esto se suele dar cuando " +
                            "se encuentran entre las consonantes: 'p', 't', 'k', 'ch', 'f', 'h', 's', 'sh'. O" +
                            " también cuando se encuentran al final de la palabra y son precedidas por alguna" +
                            " de estas consonantes.\n" , "","","", R.drawable.uno),
    };

    public static List<HiraganaLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static HiraganaLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
