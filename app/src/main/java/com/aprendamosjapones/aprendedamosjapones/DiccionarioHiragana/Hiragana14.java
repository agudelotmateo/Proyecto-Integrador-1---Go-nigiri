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

public class Hiragana14 extends AppCompatActivity {
    MediaPlayer audioHiragana014;
    Button audioHiragana14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana14);

        audioHiragana014 = MediaPlayer.create(this, R.raw.aud14se);

        audioHiragana14 = (Button)findViewById(R.id.audioHiragana14);
        audioHiragana14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana014.start();

            }
        });
    }
}
