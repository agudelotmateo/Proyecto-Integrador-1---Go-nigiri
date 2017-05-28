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

public class Hiragana6 extends AppCompatActivity {
    MediaPlayer audioHiragana06;
    Button audioHiragana6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana6);

        audioHiragana06 = MediaPlayer.create(this, R.raw.aud6ka);

        audioHiragana6 = (Button)findViewById(R.id.audioHiragana6);
        audioHiragana6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana06.start();

            }
        });
    }
}
