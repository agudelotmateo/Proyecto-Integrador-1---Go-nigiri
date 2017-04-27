package com.aprendamosjapones.aprendedamosjapones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.View.CreateAcountActivity;
import com.aprendamosjapones.aprendedamosjapones.View.MainMenuActivity1;

public class LoginActivity extends AppCompatActivity {

    Button goMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        goMain = (Button)findViewById(R.id.login);

        goMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goMain = new Intent(LoginActivity.this, MainMenuActivity1.class);
                startActivity(goMain);
            }
        });
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAcountActivity.class);
        startActivity(intent);
    }

}
