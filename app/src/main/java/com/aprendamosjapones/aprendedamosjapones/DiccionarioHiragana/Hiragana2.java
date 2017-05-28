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

public class Hiragana2 extends AppCompatActivity {

    MediaPlayer audioHiragana02;
    Button audioHiragana2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana2);

        audioHiragana02 = MediaPlayer.create(this, R.raw.aud2i);

        audioHiragana2 = (Button)findViewById(R.id.audioHiragana2);
        audioHiragana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana02.start();

            }
        });
    }
}
