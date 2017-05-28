package com.aprendamosjapones.aprendedamosjapones.DiccionarioHiragana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.proyecto.diccionarioprueba.R;

/**
 * Created by wilfer on 27/05/17.
 */

public class Hiragana20 extends AppCompatActivity {
    MediaPlayer audioHiragana020;
    Button audioHiragana20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana20);

        audioHiragana020 = MediaPlayer.create(this, R.raw.aud20to);

        audioHiragana20 = (Button)findViewById(R.id.audioHiragana20);
        audioHiragana20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana020.start();

            }
        });
    }
}
