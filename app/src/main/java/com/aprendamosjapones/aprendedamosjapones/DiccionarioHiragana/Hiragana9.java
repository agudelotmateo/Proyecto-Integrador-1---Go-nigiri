package com.aprendamosjapones.aprendedamosjapones.DiccionarioHiragana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by wilfer on 27/05/17.
 */

public class Hiragana9 extends AppCompatActivity {
    MediaPlayer audioHiragana09;
    Button audioHiragana9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana9);

        audioHiragana09 = MediaPlayer.create(this, R.raw.aud9ke);

        audioHiragana9 = (Button)findViewById(R.id.audioHiragana9);
        audioHiragana9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana09.start();

            }
        });
    }
}
