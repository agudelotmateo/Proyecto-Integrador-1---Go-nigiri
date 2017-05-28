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

public class Hiragana12 extends AppCompatActivity {
    MediaPlayer audioHiragana012;
    Button audioHiragana12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana12);

        audioHiragana012 = MediaPlayer.create(this, R.raw.aud12shi);

        audioHiragana12 = (Button)findViewById(R.id.audioHiragana12);
        audioHiragana12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana012.start();

            }
        });
    }
}