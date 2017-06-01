package com.aprendamosjapones.aprendedamosjapones.KanjiLevels;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;

import com.aprendamosjapones.aprendedamosjapones.R;

public class KanjiLevelsActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public LinearLayoutManager linearLayout;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanji_theory);

        setToolbar(); // Reemplazar toolbar

        setupRecyclerView(); // Preparar recycler view

        setupWindowAnimations(); // Añadir animaciones

    }

    private void setupRecyclerView() {
        linearLayout = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setLayoutManager(linearLayout);
        LevelKanjiAdapter adapter = new LevelKanjiAdapter(this, KanjiLevels.getCourses());
        recyclerView.setAdapter(adapter);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        getWindow().setReenterTransition(new Explode());
        getWindow().setExitTransition(new Explode().setDuration(500));
    }

}
