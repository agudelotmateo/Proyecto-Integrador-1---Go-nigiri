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

public class Hiragana15 extends AppCompatActivity {
    MediaPlayer audioHiragana015;
    Button audioHiragana15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana15);

        audioHiragana015 = MediaPlayer.create(this, R.raw.aud15so);

        audioHiragana15 = (Button)findViewById(R.id.audioHiragana15);
        audioHiragana15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana015.start();

            }
        });
    }
}
