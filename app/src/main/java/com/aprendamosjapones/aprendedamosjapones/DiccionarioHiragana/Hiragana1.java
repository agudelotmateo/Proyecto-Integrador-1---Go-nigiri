package com.aprendamosjapones.aprendedamosjapones.DiccionarioHiragana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.proyecto.diccionarioprueba.R;

/**
 * Created by wilfer on 24/05/17.
 */

public class Hiragana1 extends AppCompatActivity {
    MediaPlayer audioHiragana01;
    Button audioHiragana1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana1);

        audioHiragana01 = MediaPlayer.create(this, R.raw.aud1a);

        audioHiragana1 = (Button)findViewById(R.id.audioHiragana1);
        audioHiragana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana01.start();

            }
        });
    }

}
