package com.aprendamosjapones.aprendedamosjapones.HiraganaLevels;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;


public class HIraganaLevels {
    private static HiraganaLevel[] levels = {
            new HiraganaLevel("¿Qué es el Rōmaji?",
                    "La palabra rōmaji es un término japonés que significa \"caracteres romanos\" y, como supondrás," +
                            " es la representación de la lengua japonesa en el alfabeto romano o latino" +
                            " (nuestro alfabeto). Aunque no es un sistema de escritura oficial del japonés," +
                            " es posible encontrarlo en algunas señales, marcas o similares en Japón. De hecho" +
                            " nosotros conocemos algunas palabras escritas en rōmaji: sushi, karate, Suzuki," +
                            " entre otras.\n\n" +
                            "El uso del rōmaji puede facilitar nuestra tarea de aprender el idioma dado" +
                            " que tratamos un alfabeto más familiar para nosotros, y por este motivo en las" +
                            " primeras lecciones, aquellas para aprender hiragana y katakana, lo veremos " +
                            "constantemente para enseñarte cómo leer y pronunciar las palabras. Sin embargo," +
                            " más allá de esto no lo vamos a utilizar. Aprender japonés con sólo rōmaji no es" +
                            " recomendable, ya que aunque se puede encontrar en el idioma no es el sistema de escritura " +
                            "más utilizado, de manera que es importante adaptarse a los alfabetos propios" +
                            " de la lengua.\n",
                    R.drawable.teorhira1romaji),
            new HiraganaLevel("¿Qué es el hiragana?",
                    "El hiragana es uno de los sistemas oficiales de escritura del japonés. Es como el alfabeto " +
                            "para nosotros en el sentido de que nos define la fonética o sonidos del lenguaje, " +
                            "la diferencia es que más que un alfabeto es un silabario.\n\n" +
                            "El silabario está compuesto por 46 caracteres básicos y es usado para palabras " +
                            "nativas de Japón y elementos gramaticales.\n",
                    R.drawable.teorhira2hiragana),
            new HiraganaLevel("Las vocales y la n (ん)",
                    "El japonés tiene 5 vocales, y por suerte para nosotros son idénticas a las nuestras, " +
                            "con la única diferencia del orden en que se presentan: a, i, u, e, o. " +
                            "Adicionalmente, su pronunciación no cambia para un hablante de la lengua hispana. Eso sí, ten en " +
                            "cuenta que la 'u' se pronuncia más suave, relaja los labios cuando la pronuncies en" +
                            " vez de cerrarlos, como normalmente hacemos.\n\n" +
                            "Hay momentos en los que la 'u' y la 'i' no se pronuncian. Esto se suele dar cuando " +
                            "se encuentran entre las consonantes: 'p', 't', 'k', 'ch', 'f', 'h', 's', 'sh'; o" +
                            " también cuando se encuentran al final de la palabra y son precedidas por alguna" +
                            " de estas consonantes.\n" ,
                    R.drawable.teorhira3vocales),
            new HiraganaLevel("Vocales alargadas",
                    "En el japonés es común encontrar vocales alargadas, esto es, vocales que se pronuncian el " +
                            "doble del tiempo del normal, por ejemplo en español. Para escribirlas la 'a', 'u' " +
                            "y 'o' pueden llevar un guion (ā) o un gorrito (â) sobre ellas, o sencillamente estar " +
                            "escritas dos veces seguidas (aa). Para nuestra facilidad vamos a utilizar esta última " +
                            "convención en las autoevaluaciones y la segunda para la teoría.\n\n" +
                            "¿Esto te suena a algo? La palabra rōmaji no se pronuncia \"romayi\" sino \"roomayi\".\n\n" +
                            "Por otra parte, la 'i' al igual que la 'e' van seguidas por una 'i' ('ii' o 'ei' " +
                            "respectivamente), excepto en algunos pocos casos donde la 'e' se escribe dos veces " +
                            "seguidas, estos casos los tratamos un poquito más cuando comencemos con el aprendizaje " +
                            "de los hiragana.\n\n" +
                            "Es importante que recuerdes que existen vocales alargadas y que las aprendas a pronunciar " +
                            "bien. Porque puedes encontrarte con palabras con diferente significado pero que al " +
                            "pronunciarlas sólo se diferencian en si usan o no vocales alargadas. Por ejemplo \"ojisan\" " +
                            "significa tío, mientras que \"ojiisan\" significa abuelo.\n\n" +
                            "Para escribir vocales alargadas en hiragan ten encuenta las siguientes reglas:\n" +
                            "- La â: Se añade あdespués de un hiragana que al final de la pronunciación tenga la a.\n" +
                            "- La ii: Se añade いdespués de un hiragana que al final de la pronunciación tenga la i.\n" +
                            "- La û: Se añade うdespués de un hiragana que al final de la pronunciación tenga la u.\n" +
                            "- La ei: Se añade いdespués de un hiragana que al final de la pronunciación tenga la e. " +
                            "Excepto ええ (sí), ねえ (decir), おねえさん (hermana mayor).\n" +
                            "- La ô: Se añade お después de un hiragana que al final de la pronunciación tenga la o.",
                    R.drawable.teorhira4alargadas),
            new HiraganaLevel("Las consonantes",
                    "La mayoría de las consonantes se pronuncian como en el español, aunque hay unas cuantas excepciones:\n" +
                            "- La 'g': Se pronuncia igual que en el español sólo que cuando está acompañada por una 'i' o " +
                            "una 'e' suena como si tuviera la u intermedia. Es decir el rōmaji \"ge\" se pronuncia " +
                            "como \"gue\" en español.\n" +
                            "- La 'h': se pronuncia como en el español se pronuncia la 'j'.\n" +
                            "- La 'j': Se pronuncia como la 'y' cuando actúa como consonante como en \"ya\".\n" +
                            "- La 'n': se pronuncia igual que en el español, sólo que cuando se encuentra antes de " +
                            "una 'p', 'b' o 'm' actúa como una 'm'.\n" +
                            "- La 'r': siempre se pronuncia suave como en “aro”, en ningún momento se pronuncia como en “ratón”.\n\n" +
                            "Es importante que tengamos en cuenta que en el japonés no vamos a encontrar la 'v', 'l', o 'q'.",
                    R.drawable.teorhira5consonantes),
            new HiraganaLevel("Consonantes dobles",
                    "En japonés es posible encontrarse palabras con doble consonante (una misma consonante repetida dos veces " +
                            "seguidas). Por ejemplo, puedes ver que la palabra “gakkou” (que significa colegio) tiene doble k. Por " +
                            "suerte representar esto con hiraganas no es complicado, sólo tenemos que usar un  つ (‘tsu’) más pequeño " +
                            "antes de la consonante a alargar. De esta manera, “gakkou” sería がっこう. Tal vez sea difícil " +
                            "diferenciarlo al principio, pero la clave para aprender es la práctica y ésta no va a ser la excepción.",
                    R.drawable.teorhira6consdobles),
            new HiraganaLevel("Tenten y Maru",
                    "Ya conoces los 46 hiraganas básicos, pero estos no representan todas las sílabas del idioma. Algunos de los " +
                            "hiragana que aprendimos pueden llevar una comilla doble '\"' o un círculo pequeño '°' en la parte " +
                            "superior derecha, los cuales modifican la consonante, dándole un sonido diferente. A la comilla la " +
                            "llamamos \"tenten\" y al círculo lo llamamos \"maru\".",
                    R.drawable.teorhira7tentenmaru)

    };

    public static List<HiraganaLevel> getCourses() {
        return Arrays.asList(levels);
    }


    public static HiraganaLevel getCourseByPosition(int position) {
        return levels[position];
    }

}
