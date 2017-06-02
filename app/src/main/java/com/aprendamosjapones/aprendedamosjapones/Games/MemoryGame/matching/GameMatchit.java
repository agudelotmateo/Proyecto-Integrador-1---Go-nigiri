package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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
    private boolean skipMode;
    private long time, accum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchit);

        kana = (TextView) findViewById(R.id.textKanaMatchit);
        spanish = (TextView) findViewById(R.id.textSpanishMatchit);
        final EditText text = (EditText) findViewById(R.id.editTextMatchit);
        final TextView feedback = (TextView) findViewById(R.id.textFeedbackMatchit);

        matches = katakana ? Words.katakana.get(key) : Words.hiragana.get(key);
        i = 0;
        n = matches.length;
        match = matches[i];

        repaint(text, feedback);

        final Button check = (Button) findViewById(R.id.checkMatchit);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString().toLowerCase();
                ArrayList<Pair<Integer, Integer>> list = match.match(str);
                if (list == null)
                    next(text, feedback);
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

        final Button skip = (Button) findViewById(R.id.skipMatchit);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (skipMode) {
                    check.setEnabled(false);
                    StringBuilder sb = new StringBuilder();
                    for (Pair<String, Integer> s : match.getSyllables())
                        sb.append(s.first);
                    feedback.setText(sb.toString());
                    skip.setText("Continuar");
                    skipMode = false;
                }
                else {
                    next(text, feedback);
                    check.setEnabled(true);
                    skip.setText("Saltar");
                }
            }
        });

        accum = 0L;
        time = System.currentTimeMillis();
    }

    private void repaint(EditText text, TextView feedback) {
        String original = match.getKana();
        kana.setText(original.toCharArray(), 0, match.getKana().length());
        spanish.setText(match.getSpanish().toCharArray(), 0, match.getSpanish().length());
        text.setText("");
        feedback.setText("");
        skipMode = true;
    }

    private void next(EditText text, TextView feedback) {
        if (i == n-1) {
            time = System.currentTimeMillis() - time;
            long second = (time / 1000) % 60;
            long minute = (time / (1000 * 60)) % 60;
            long hour = (time / (1000 * 60 * 60)) % 24;
            String formattedTime;
            if (minute == 0)
                formattedTime = String.format("%ds", second);
            else if (hour == 0)
                formattedTime = String.format("%02d:%02d", minute, second);
            else
                formattedTime = String.format("%02d:%02d:%02d", hour, minute, second);
            new AlertDialog.Builder(this)
                    .setTitle("Fin del juego")
                    .setMessage("Tiempo utilizado: " + formattedTime)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .show();
        }
        else {
            match = matches[++i];
            repaint(text, feedback);
        }
    }

    @Override
    public void onPause() {
        accum += System.currentTimeMillis()-time;
        super.onPause();
    }

    @Override
    public void onResume() {
        time = System.currentTimeMillis()-accum;
        accum = 0;
        super.onResume();
    }
}
