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

public class HIragana5 extends AppCompatActivity {
    MediaPlayer audioHiragana05;
    Button audioHiragana5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana5);

        audioHiragana05 = MediaPlayer.create(this, R.raw.aud5o);

        audioHiragana5 = (Button)findViewById(R.id.audioHiragana5);
        audioHiragana5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana05.start();

            }
        });
    }
}
