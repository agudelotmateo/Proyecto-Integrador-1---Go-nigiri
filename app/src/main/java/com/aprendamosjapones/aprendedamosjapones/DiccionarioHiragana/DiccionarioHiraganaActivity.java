package com.aprendamosjapones.aprendedamosjapones.DiccionarioHiragana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.aprendamosjapones.aprendedamosjapones.R;
/**
 * Created by wilfer on 24/05/17.
 */

public class DiccionarioHiraganaActivity extends AppCompatActivity {

    ImageView goHiragana1;
    ImageView goHiragana2;
    ImageView goHiragana3;
    ImageView goHiragana4;
    ImageView goHiragana5;
    ImageView goHiragana6;
    ImageView goHiragana7;
    ImageView goHiragana8;
    ImageView goHiragana9;
    ImageView goHiragana10;
    ImageView goHiragana11;
    ImageView goHiragana12;
    ImageView goHiragana13;
    ImageView goHiragana14;
    ImageView goHiragana15;
    ImageView goHiragana16;
    ImageView goHiragana17;
    ImageView goHiragana18;
    ImageView goHiragana19;
    ImageView goHiragana20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diccionario_hiragana);

        goHiragana1 = (ImageView)findViewById(R.id.hiragana1a);


        goHiragana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana1 = new Intent(DiccionarioHiraganaActivity.this, Hiragana1.class);
                startActivity(goHiragana1);

            }
        });

        goHiragana2 = (ImageView)findViewById(R.id.hiragana2i);


        goHiragana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana2 = new Intent(DiccionarioHiraganaActivity.this, Hiragana2.class);
                startActivity(goHiragana2);

            }
        });

        goHiragana3 = (ImageView)findViewById(R.id.hiragana3u);


        goHiragana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana3 = new Intent(DiccionarioHiraganaActivity.this, Hiragana3.class);
                startActivity(goHiragana3);

            }
        });

        goHiragana4 = (ImageView)findViewById(R.id.hiragana4e);


        goHiragana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana4 = new Intent(DiccionarioHiraganaActivity.this, Hiragana4.class);
                startActivity(goHiragana4);

            }
        });

        goHiragana5 = (ImageView)findViewById(R.id.hiragana5o);


        goHiragana5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana5 = new Intent(DiccionarioHiraganaActivity.this, HIragana5.class);
                startActivity(goHiragana5);

            }
        });


        goHiragana6 = (ImageView)findViewById(R.id.hiragana6ka);

        goHiragana6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana6 = new Intent(DiccionarioHiraganaActivity.this, Hiragana6.class);
                startActivity(goHiragana6);

            }
        });

        goHiragana7 = (ImageView)findViewById(R.id.hiragana7ki);

        goHiragana7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana7 = new Intent(DiccionarioHiraganaActivity.this, Hiragana7.class);
                startActivity(goHiragana7);

            }
        });

        goHiragana8 = (ImageView)findViewById(R.id.hiragana8ku);

        goHiragana8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana8 = new Intent(DiccionarioHiraganaActivity.this, Hiragana8.class);
                startActivity(goHiragana8);

            }
        });

        goHiragana9 = (ImageView)findViewById(R.id.hiragana9ke);

        goHiragana9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana9 = new Intent(DiccionarioHiraganaActivity.this, Hiragana9.class);
                startActivity(goHiragana9);

            }
        });

        goHiragana10 = (ImageView)findViewById(R.id.hiragana10ko);

        goHiragana10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana10 = new Intent(DiccionarioHiraganaActivity.this, Hiragana10.class);
                startActivity(goHiragana10);

            }
        });

        goHiragana11 = (ImageView)findViewById(R.id.hiragana11sa);

        goHiragana11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana11 = new Intent(DiccionarioHiraganaActivity.this, Hiragana11.class);
                startActivity(goHiragana11);

            }
        });

        goHiragana12 = (ImageView)findViewById(R.id.hiragana12shi);

        goHiragana12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana12 = new Intent(DiccionarioHiraganaActivity.this, Hiragana12.class);
                startActivity(goHiragana12);

            }
        });

        goHiragana13 = (ImageView)findViewById(R.id.hiragana13su);

        goHiragana13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana13 = new Intent(DiccionarioHiraganaActivity.this, Hiragana14.class);
                startActivity(goHiragana13);

            }
        });

        goHiragana14 = (ImageView)findViewById(R.id.hiragana14se);

        goHiragana14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana14 = new Intent(DiccionarioHiraganaActivity.this, Hiragana14.class);
                startActivity(goHiragana14);

            }
        });

        goHiragana15 = (ImageView)findViewById(R.id.hiragana15so);

        goHiragana15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana15 = new Intent(DiccionarioHiraganaActivity.this, Hiragana15.class);
                startActivity(goHiragana15);

            }
        });





        goHiragana16 = (ImageView)findViewById(R.id.hiragana16ta);

        goHiragana16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana16 = new Intent(DiccionarioHiraganaActivity.this, Hiragana16.class);
                startActivity(goHiragana16);

            }
        });

        goHiragana17 = (ImageView)findViewById(R.id.hiragana17chi);

        goHiragana17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana17 = new Intent(DiccionarioHiraganaActivity.this, Hiragana17.class);
                startActivity(goHiragana17);

            }
        });

        goHiragana18 = (ImageView)findViewById(R.id.hiragana18tsu);

        goHiragana18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana18 = new Intent(DiccionarioHiraganaActivity.this, Hiragana18.class);
                startActivity(goHiragana18);

            }
        });

        goHiragana19 = (ImageView)findViewById(R.id.hiragana19te);

        goHiragana19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana19 = new Intent(DiccionarioHiraganaActivity.this, Hiragana19.class);
                startActivity(goHiragana19);

            }
        });

        goHiragana20 = (ImageView)findViewById(R.id.hiragana20to);

        goHiragana20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHiragana20 = new Intent(DiccionarioHiraganaActivity.this, Hiragana20.class);
                startActivity(goHiragana20);

            }
        });

    }

}
