package com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;

import com.aprendamosjapones.aprendedamosjapones.R;

public class DictionarKatakanaActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public LinearLayoutManager gridLayout;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana_dictionary);

        setToolbar(); // Reemplazar toolbar

        setupRecyclerView(); // Preparar recycler view

        setupWindowAnimations(); // Añadir animaciones

    }

    private void setupRecyclerView() {
        gridLayout = new GridLayoutManager(this, 5);
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setLayoutManager(gridLayout);
        DictionaryAdapter adapter = new DictionaryAdapter(this, ContentDictionaryKatakana.getCourses());
        recyclerView.setAdapter(adapter);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        getWindow().setReenterTransition(new Explode());
        getWindow().setExitTransition(new Explode().setDuration(500));
    }

}
