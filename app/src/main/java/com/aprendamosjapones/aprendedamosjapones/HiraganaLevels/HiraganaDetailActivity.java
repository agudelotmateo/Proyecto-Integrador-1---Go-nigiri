package com.aprendamosjapones.aprendedamosjapones.HiraganaLevels;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;
import com.bumptech.glide.Glide;

public class HiraganaDetailActivity extends AppCompatActivity {
    private static final String EXTRA_POSITION = "com.herprogramacion.cursospoint.extra.POSITION";

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_level);

        setToolbar();

        int position = getIntent().getIntExtra(EXTRA_POSITION, -1);

        setupViews(position);

        Window window = getWindow();

        // Aca estan definidas varias transiciones.
        //https://developer.android.com/training/material/animations.html?hl=es#Transitions
        switch (position) {
            // Explode
            case 0:
                Explode t0 = new Explode();
                window.setEnterTransition(t0);
                break;
            // Slide
            case 1:
                Slide t1 = new Slide();
                t1.setSlideEdge(Gravity.END);
                window.setEnterTransition(t1);
                break;
            // Fade
            case 2:
                Fade t2 = new Fade();
                window.setEnterTransition(t2);
                break;
            // Personalizado
            case 3:
                Transition t3 = TransitionInflater.from(this)
                        .inflateTransition(R.transition.detail_enter_trasition);
                window.setEnterTransition(t3);
                break;
            // Eventos de transicion
            case 4:
                Fade t4 = new Fade();
                window.setEnterTransition(t4);
                break;
            case 5:
                window.setEnterTransition(null);
                break;

        }
    }

    private void setupViews(int position) {
        TextView name = (TextView) findViewById(R.id.detail_tittle);
        TextView description = (TextView) findViewById(R.id.detail_description);
        ImageView image = (ImageView) findViewById(R.id.detail_image);

        // Obtiene el curso ha detallar basado en la posición
        HiraganaLevel detailLevel = HIraganaLevels.getCourseByPosition(position);

        name.setText(detailLevel.getName());
        description.setText(detailLevel.getDescription());
        Glide.with(this).load(detailLevel.getIdImage()).into(image);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            default:
                return super.onOptionsItemSelected(item);
            case android.R.id.home:
                // Obtener intent de la actividad padre
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Comprobar si DetailActivity no se creó desde LevelsActivity
                if (NavUtils.shouldUpRecreateTask(this, upIntent)
                        || this.isTaskRoot()) {

                    // Construir de nuevo la tarea para ligar ambas actividades
                    TaskStackBuilder.create(this)
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // Terminar con el método correspondiente para Android 5.x
                    this.finishAfterTransition();
                    return true;
                }

                // Dejar que el sistema maneje el comportamiento del up button
                return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static void launch(Activity context, int position, View sharedView) {
        Intent intent = new Intent(context, HiraganaDetailActivity.class);
        intent.putExtra(EXTRA_POSITION, position);

        // Los elementos 4, 5 y 6 usan elementos compartidos,
        if (position >= 3) {
            ActivityOptions options0 = ActivityOptions
                    .makeSceneTransitionAnimation(context, sharedView, sharedView.getTransitionName());
            context.startActivity(intent, options0.toBundle());
        } else {
            ActivityOptions options0 = ActivityOptions.makeSceneTransitionAnimation(context);
            context.startActivity(intent, options0.toBundle());
        }
    }
}