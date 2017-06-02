package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

/**
 * Created by mateo on 6/1/17.
 */

public class GameMatchit extends AppCompatActivity {
    static String key;
    static boolean katakana;
    private TextView kana, spanish;
    private Match match;
    private Match[] matches;
    private int i, n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchit);

        kana = (TextView) findViewById(R.id.textKanaMatchit);
        spanish = (TextView) findViewById(R.id.textSpanishMatchit);
        final EditText text = (EditText) findViewById(R.id.editTextMatchit);
        final TextView feedback = (TextView) findViewById(R.id.textFeedbackMatchit);

        matches = Words.map.get(key);
        i = 0;
        n = matches.length;
        match = matches[i];

        repaint(text, feedback);

        Button check = (Button) findViewById(R.id.checkMatchit);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                ArrayList<Pair<Integer, Integer>> list = match.match(str);
                if (list == null) {
                    if (i == n-1)
                        finish();
                    else {
                        match = matches[++i];
                        repaint(text, feedback);
                    }
                }
                else {
                    Spannable spanRange = new SpannableString(str);
                    spanRange.setSpan(new ForegroundColorSpan(Color.RED), 0, str.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
                    for (Pair<Integer, Integer> p : list)
                        if (p != null)
                            spanRange.setSpan(new ForegroundColorSpan(Color.parseColor("#3AA827")), p.first, p.second, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
                    feedback.setText(spanRange);
                }
            }
        });
    }

    private void repaint(EditText text, TextView feedback) {
        String original = match.getKana();
        if (katakana)
            original = toKatakana(original);
        kana.setText(original.toCharArray(), 0, match.getKana().length());
        spanish.setText(match.getSpanish().toCharArray(), 0, match.getSpanish().length());
        text.setText("");
        feedback.setText("");
    }

    private String toKatakana(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i)
            sb.append((char) (s.charAt(i) + 0x60));
        return sb.toString();
    }

}
