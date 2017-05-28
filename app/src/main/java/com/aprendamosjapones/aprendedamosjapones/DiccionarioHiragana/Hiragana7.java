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

public class Hiragana7 extends AppCompatActivity {
    MediaPlayer audioHiragana07;
    Button audioHiragana7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana7);

        audioHiragana07 = MediaPlayer.create(this, R.raw.aud7ki);

        audioHiragana7 = (Button)findViewById(R.id.audioHiragana7);
        audioHiragana7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana07.start();

            }
        });
    }
}
