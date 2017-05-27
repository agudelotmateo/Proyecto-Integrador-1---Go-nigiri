package com.aprendamosjapones.aprendedamosjapones.Games.matching;

import android.util.Pair;

import java.util.ArrayList;

/**
 * Created by mateo on 5/4/17.
 */

public class Match {
    private String kana, spanish;
    private ArrayList<Pair<String, Integer> > syllables;
    private int[][] backtable;
    private boolean preprocessed;

    public Match(String kana, String spanish, String[] syllables) {
        this.kana = kana;
        this.spanish = spanish;
        this.syllables = new ArrayList<>(syllables.length);
        int x = 0;
        for (String s : syllables) {
            this.syllables.add(new Pair<>(s, x));
            x += s.length();
        }
    }

    private void preprocess() {
        if (preprocessed || kana == null || syllables == null || syllables.size() == 0)
            return; // weird error with word list
        int i, j;
        backtable = new int[syllables.size()][];
        for (int k = 0; k < syllables.size(); ++k) {
            backtable[k] = new int[syllables.get(k).first.length()+1];
            i = 0;
            j = -1;
            backtable[k][0] = -1;
            while (i < syllables.get(k).first.length()) {
                while (j >= 0 && syllables.get(k).first.charAt(i) != syllables.get(k).first.charAt(j))
                    j = backtable[k][j];
                ++i;
                ++j;
                backtable[k][i] = j;
            }
        }
        preprocessed = true;
    }

    public ArrayList<Pair<Integer, Integer>> match(String text) {
        if (!preprocessed)
            preprocess();
        int i, j;
        boolean matched;
        ArrayList<Pair<Integer, Integer> > matchList = new ArrayList<>(syllables.size());
        for (int k = 0; k < syllables.size(); ++k) {
            i = 0;
            j = 0;
            matched = false;
            while (!matched && i < text.length()) {
                while (j >= 0 && text.charAt(i) != syllables.get(k).first.charAt(j))
                    j = backtable[k][j];
                ++i;
                ++j;
                if (j == syllables.get(k).first.length()) {
                    if (i-j >= syllables.get(k).second) {
                        matchList.add(new Pair<>(i-j, i));
                        matched = true;
                    }
                    else
                        j = backtable[k][j];
                }
            }
            if (!matched)
                matchList.add(null);
        }
        return matchList;
    }


    public String getKana() {
        return kana;
    }

    public String getSpanish() {
        return spanish;
    }

    public ArrayList<Pair<String,Integer> > getSyllables() {
        return syllables;
    }

}
