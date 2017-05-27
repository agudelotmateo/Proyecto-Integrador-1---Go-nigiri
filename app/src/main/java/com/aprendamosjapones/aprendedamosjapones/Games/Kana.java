package com.aprendamosjapones.aprendedamosjapones.Games;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Contains the names of the 107 kanas.
 *
 * @author Mateo Agudelo Toro
 */
class Kana {

    private static final String[] kanas = {
            "a",
            "i",
            "u",
            "e",
            "o",
            "ka",
            "ki",
            "ku",
            "ke",
            "ko",
            "sa",
            "shi",
            "su",
            "se",
            "so",
            "ta",
            "chi",
            "tsu",
            "te",
            "to",
            "na",
            "ni",
            "nu",
            "ne",
            "no",
            "ha",
            "hi",
            "fu",
            "he",
            "ho",
            "ma",
            "mi",
            "mu",
            "me",
            "mo",
            "ya",
            "yu",
            "yo",
            "ra",
            "ri",
            "ru",
            "re",
            "ro",
            "wa",
            "wo",
            "n",
            "ga",
            "gi",
            "gu",
            "ge",
            "go",
            "za",
            "ji",
            "zu",
            "ze",
            "zo",
            "da",
            "di",
            "du",
            "de",
            "do",
            "ba",
            "bi",
            "bu",
            "be",
            "bo",
            "pa",
            "pi",
            "pu",
            "pe",
            "po",
            "kya",
            "kyu",
            "kyo",
            "gya",
            "gyu",
            "gyo",
            "sha",
            "shu",
            "sho",
            "ja",
            "ju",
            "jo",
            "cha",
            "chu",
            "cho",
            "nya",
            "nyu",
            "nyo",
            "hya",
            "hyu",
            "hyo",
            "bya",
            "byu",
            "byo",
            "pya",
            "pyu",
            "pyo",
            "mya",
            "myu",
            "myo",
            "rya",
            "ryu",
            "ryo"
    };

    private static final String[] kanjis = {
            "dia",
            "uno",
            "pais",
            "persona",
            "ano",
            "grande",
            "diez",
            "dos",
            "libro",
            "dentro",
            "largo",
            "salir",
            "tres",
            "tiempo",
            "ir",
            "ver",
            "mes",
            "atras",
            "frente",
            "vida",
            "cinco",
            "entre",
            "encima",
            "oriente",
            "cuatro",
            "ahora",
            "oro",
            "nueve",
            "entrar",
            "estudiar",
            "alto",
            "circulo",
            "nino",
            "afuera",
            "ocho",
            "seis",
            "debajo",
            "venir",
            "espiritu",
            "pequeno",
            "siete",
            "montana",
            "charla",
            "mujer",
            "norte",
            "mediodia",
            "cien",
            "escribir",
            "antes",
            "nombre",
            "rio",
            "mil",
            "agua",
            "mitad",
            "hombre",
            "occidente",
            "electricidad",
            "colegio",
            "palabra",
            "suelo",
            "arbol",
            "escuchar",
            "comer",
            "carro",
            "que",
            "sur",
            "diezmil",
            "cada",
            "blanco",
            "cielo",
            "mama",
            "fuego",
            "derecha",
            "leer",
            "amigo",
            "izquierda",
            "descansar",
            "papa",
            "lluvia"
    };

    static String[][] getRandom(int rows, int columns, String alphabet, String match) {
        Random random = new Random();
        int total = rows * columns;
        int totalCards = total / 2;
        HashSet<Integer> exclude = new HashSet<>(totalCards);
        ArrayList<Pair<String, String>> pairs = new ArrayList<>(totalCards);
        boolean kanjiMode = alphabet.equals("kanji");
        String[] list = kanjiMode ? kanjis : kanas;
        int size = list.length, temp;
        for (int i = 0; i < totalCards; ++i) {
            temp = random.nextInt(size);
            while (exclude.contains(temp))
                temp = random.nextInt(size);
            pairs.add(new Pair<>(Integer.toString(temp + 1), list[temp]));
            exclude.add(temp);
        }
        String[][] matrix = new String[rows][columns];
        int inv;
        String name;
        for (int i = 0; i < totalCards; ++i) {
            name = pairs.get(i).second;
            matrix[i / columns][i % columns] = alphabet + pairs.get(i).first + name;

            inv = total - i - 1;
            if (kanjiMode)
                matrix[inv / columns][inv % columns] = match + pairs.get(i).first + name;
            else
                matrix[inv / columns][inv % columns] = match + name;
        }
        return matrix;
    }

}
