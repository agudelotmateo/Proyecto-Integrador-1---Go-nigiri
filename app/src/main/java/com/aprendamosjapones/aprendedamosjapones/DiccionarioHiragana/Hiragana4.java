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

public class Hiragana4 extends AppCompatActivity {
    MediaPlayer audioHiragana04;
    Button audioHiragana4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana4);

        audioHiragana04 = MediaPlayer.create(this, R.raw.aud4e);

        audioHiragana4 = (Button)findViewById(R.id.audioHiragana4);
        audioHiragana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana04.start();

            }
        });
    }
}
