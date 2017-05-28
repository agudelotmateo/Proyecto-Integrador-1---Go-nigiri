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

public class Hiragana3 extends AppCompatActivity {

    MediaPlayer audioHiragana03;
    Button audioHiragana3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana3);

        audioHiragana03 = MediaPlayer.create(this, R.raw.aud3u);

        audioHiragana3 = (Button)findViewById(R.id.audioHiragana3);
        audioHiragana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana03.start();

            }
        });
    }
}
