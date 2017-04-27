package com.aprendamosjapones.aprendedamosjapones.Games;

import java.util.HashSet;
import java.util.Random;

/**
 * Contains the names of the 107 kanas.
 *
 * @author Mateo Agudelo Toro
 */
class Kana {
    private static final int size = 107;

    private static final String[] kanas = {
            "a",
            "ba",
            "be",
            "bi",
            "bo",
            "bu",
            "bya",
            "byo",
            "byu",
            "cha",
            "chi",
            "cho",
            "chu",
            "da",
            "de",
            "di",
            "do",
            "du",
            "e",
            "fu",
            "ga",
            "ge",
            "gi",
            "go",
            "gu",
            "gya",
            "gyo",
            "gyu",
            "ha",
            "he",
            "hi",
            "ho",
            "hya",
            "hyo",
            "hyu",
            "i",
            "ja",
            "ji",
            "jo",
            "ju",
            "ka",
            "ke",
            "ki",
            "ko",
            "ku",
            "kya",
            "kyo",
            "kyu",
            "ma",
            "me",
            "mi",
            "mo",
            "mu",
            "mya",
            "myo",
            "myu",
            "na",
            "ne",
            "ni",
            "no",
            "n",
            "nu",
            "nya",
            "nyo",
            "nyu",
            "o",
            "pa",
            "pe",
            "pi",
            "po",
            "pu",
            "pya",
            "pyo",
            "pyu",
            "ra",
            "re",
            "ri",
            "ro",
            "ru",
            "rya",
            "ryo",
            "ryu",
            "sa",
            "se",
            "sha",
            "shi",
            "sho",
            "shu",
            "so",
            "su",
            "ta",
            "te",
            "to",
            "tsu",
            "u",
            "wa",
            "wo",
            "ya",
            "yo",
            "yu",
            "za",
            "ze",
            "zo",
            "zu"
    };

    /**
     * Generates a list of n unique kanas.
     * Worst time complexity: O(infinity)
     *
     * @param n amount of kanas to fetch.
     * @return the name of n different kanas.
     */
    static String[] getRandomKanas(int n) {
        Random random = new Random();
        HashSet<Integer> exclude = new HashSet<>(n);
        String[] ans = new String[n];
        int temp;

        for (int i = 0; i < n; ++i) {
            temp = random.nextInt(size);
            while (exclude.contains(temp))
                temp = random.nextInt(size);
            ans[i] = kanas[temp];
            exclude.add(temp);
        }

        return ans;
    }
}
