package com.aprendamosjapones.aprendedamosjapones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aprendamosjapones.aprendedamosjapones.View.CreateAcountActivity;
import com.aprendamosjapones.aprendedamosjapones.View.DictionaryKanjiActivity;
import com.aprendamosjapones.aprendedamosjapones.View.MainMenuActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAcountActivity.class);
        startActivity(intent);
    }

    public void goMainMenu(View view){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }


}
