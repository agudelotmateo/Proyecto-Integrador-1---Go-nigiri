package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by mateo on 6/1/17.
 */

public class MenuMatchit extends AppCompatActivity {

    Button goInstructionsMatchit;
    Button goPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchit_menu);

        setToolbar(); // Reemplazar toolbar

        goInstructionsMatchit = (Button)findViewById(R.id.instructionsMatchit);
        goInstructionsMatchit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tmp = new Intent(MenuMatchit.this, InstructionsMatchit.class);
                startActivity(tmp);
            }
        });

        goPlay = (Button) findViewById(R.id.buttonJugarMatchit);
        goPlay.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
		    Words.init();
		    String key = null;
		    Spinner spinner = (Spinner) findViewById(R.id.spinnerFilaMatchit);
		    switch (spinner.getSelectedItem().toString()) {
                case "a y n":
					key = "aiueon";
                    break;
				case "ka":
			        key = "kakikukeko";
		            break;
                case "sa":
			        key = "sashisuseso";
		            break;
                case "ta":
			        key = "tachitsuteto";
		            break;
                case "na":
			        key = "naninuneno";
		            break;
                case "ha":
			        key = "hahifuheho";
		            break;
                case "ma":
			        key = "mamimumemo";
		            break;
                case "ya":
			        key = "yayuyo";
		            break;
                case "ra":
			        key = "rarirurero";
		            break;
                case "wa":
			        key = "wawo";
		            break;
                case "ga":
			        key = "gagigugego";
		            break;
                case "za":
			        key = "zajizuzezo";
		            break;
                case "da":
			        key = "dajizudedo";
		            break;
                case "ba":
			        key = "babibubebo";
		            break;
                case "pa":
			        key = "papipupepo";
		            break;
                case "kya":
			        key = "kyakyukyo";
		            break;
                case "gya":
			        key = "gyagyugyo";
		            break;
                case "sha":
			        key = "shashusho";
		            break;
                case "ja":
			        key = "jajujo";
		            break;
                case "cha":
			        key = "chachucho";
		            break;
                case "nya":
			        key = "nyanyunyo";
		            break;
                case "hya":
			        key = "hyahyuhyo";
		            break;
                case "bya":
			        key = "byabyubyo";
		            break;
                case "pya":
			        key = "pyapyupyo";
		            break;
                case "mya":
			        key = "myamyumyo";
		            break;
                case "rya":
			        key = "ryaryuryo";
		            break;
                }
                GameMatchit.key = key;

                RadioButton katakana = (RadioButton) findViewById(R.id.radioButtonKatakanaMatchit);
                GameMatchit.katakana = katakana.isChecked();

                Intent tmp = new Intent(MenuMatchit.this, GameMatchit.class);
                startActivity(tmp);
            }
        });
    }
    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
