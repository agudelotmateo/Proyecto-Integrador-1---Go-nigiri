package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

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

import com.aprendamosjapones.aprendedamosjapones.R;

public class DictionarKanjiActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public LinearLayoutManager gridView;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        setToolbar(); // Reemplazar toolbar

        setupRecyclerView(); // Preparar recycler view

        setupWindowAnimations(); // Añadir animaciones

    }

    private void setupRecyclerView() {
        gridView = new GridLayoutManager(this, 4);
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setLayoutManager(gridView);
        DictionaryAdapter adapter = new DictionaryAdapter(this, ContentDictionaryKanji.getCourses());
        recyclerView.setAdapter(adapter);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        getWindow().setReenterTransition(new Explode());
        getWindow().setExitTransition(new Explode().setDuration(500));
    }

}
