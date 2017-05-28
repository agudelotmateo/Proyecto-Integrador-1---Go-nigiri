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

public class Hiragana16 extends AppCompatActivity {
    MediaPlayer audioHiragana016;
    Button audioHiragana16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana16);

        audioHiragana016 = MediaPlayer.create(this, R.raw.aud16ta);

        audioHiragana16 = (Button)findViewById(R.id.audioHiragana16);
        audioHiragana16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana016.start();

            }
        });
    }
}
