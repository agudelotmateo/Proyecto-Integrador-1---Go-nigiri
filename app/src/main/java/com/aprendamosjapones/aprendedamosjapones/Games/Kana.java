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
    private static final int size = 104;

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

    /**
     * Generates a list of n unique kanas.
     * Worst time complexity: O(infinity) :)
     *
     * @param n amount of kanas to fetch.
     * @return the name of n different kanas.
     */
    static ArrayList<Pair<String, String> > getRandomKanas(int n) {
        Random random = new Random();
        HashSet<Integer> exclude = new HashSet<>(n);
        ArrayList<Pair<String, String> > ans = new ArrayList<>(n);
        int temp;

        for (int i = 0; i < n; ++i) {
            temp = random.nextInt(size);
            while (exclude.contains(temp))
                temp = random.nextInt(size);
            ans.add(new Pair<>(Integer.toString(temp+1), kanas[temp]));
            exclude.add(temp);
        }

        return ans;
    }
}
