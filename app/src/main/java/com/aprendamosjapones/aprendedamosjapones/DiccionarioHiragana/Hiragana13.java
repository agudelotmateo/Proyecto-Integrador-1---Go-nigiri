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

public class Hiragana13 extends AppCompatActivity {
    MediaPlayer audioHiragana013;
    Button audioHiragana13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana13);

        audioHiragana013 = MediaPlayer.create(this, R.raw.aud13su);

        audioHiragana13 = (Button)findViewById(R.id.audioHiragana13);
        audioHiragana13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana013.start();

            }
        });
    }
}
