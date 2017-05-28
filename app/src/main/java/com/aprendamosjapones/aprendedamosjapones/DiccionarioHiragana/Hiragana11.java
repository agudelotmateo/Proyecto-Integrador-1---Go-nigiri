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

public class Hiragana11 extends AppCompatActivity {
    MediaPlayer audioHiragana011;
    Button audioHiragana11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana11);

        audioHiragana011 = MediaPlayer.create(this, R.raw.aud11sa);

        audioHiragana11 = (Button)findViewById(R.id.audioHiragana11);
        audioHiragana11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana011.start();

            }
        });
    }
}
