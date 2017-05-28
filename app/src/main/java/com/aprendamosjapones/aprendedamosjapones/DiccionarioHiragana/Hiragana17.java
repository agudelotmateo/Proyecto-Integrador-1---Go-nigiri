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

public class Hiragana17 extends AppCompatActivity {
    MediaPlayer audioHiragana017;
    Button audioHiragana17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana17);

        audioHiragana017 = MediaPlayer.create(this, R.raw.aud17chi);

        audioHiragana17 = (Button)findViewById(R.id.audioHiragana17);
        audioHiragana17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana017.start();

            }
        });
    }
}
