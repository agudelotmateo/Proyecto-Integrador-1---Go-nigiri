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

public class Hiragana10 extends AppCompatActivity {
    MediaPlayer audioHiragana010;
    Button audioHiragana10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana10);

        audioHiragana010 = MediaPlayer.create(this, R.raw.aud10ko);

        audioHiragana10 = (Button)findViewById(R.id.audioHiragana10);
        audioHiragana10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana010.start();

            }
        });
    }
}
