package com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;
import com.bumptech.glide.Glide;

public class DetailsDictionaryKatakana extends AppCompatActivity {
    private static final String EXTRA_POSITION = "com.herprogramacion.cursospoint.extra.POSITION";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dictionary);

        setToolbar(); // Reemplazar la action bar

        // Se obtiene la posición del item seleccionado
        int position = getIntent().getIntExtra(EXTRA_POSITION, -1);

        // Carga los datos en la vista
        setupViews(position);

        Window window = getWindow();

        // Elegir transiciones
        switch (position) {
            // EXPLODE
            case 0:
                Explode t0 = new Explode();
                window.setEnterTransition(t0);
                break;
            // SLIDE
            case 1:
                Slide t1 = new Slide();
                t1.setSlideEdge(Gravity.END);
                window.setEnterTransition(t1);
                break;
            // FADE
            case 2:
                Fade t2 = new Fade();
                window.setEnterTransition(t2);
                break;
            // PERSONALIZADA
            case 3:
                Transition t3 = TransitionInflater.from(this)
                        .inflateTransition(R.transition.detail_enter_trasition);
                window.setEnterTransition(t3);
                break;
            // EVENTOS DE TRANSICIÓN
            case 4:
                Fade t4 = new Fade();
                t4.addListener(
                        new Transition.TransitionListener() {
                            @Override
                            public void onTransitionStart(Transition transition) {

                            }

                            @Override
                            public void onTransitionEnd(Transition transition) {
                                Snackbar.make(
                                        findViewById(R.id.coordinator),
                                        "Terminó la transición",
                                        Snackbar.LENGTH_SHORT)
                                        .show();
                            }

                            @Override
                            public void onTransitionCancel(Transition transition) {

                            }

                            @Override
                            public void onTransitionPause(Transition transition) {

                            }

                            @Override
                            public void onTransitionResume(Transition transition) {

                            }
                        }
                );
                window.setEnterTransition(t4);
                break;
            // POR DEFECTO
            case 5:
                window.setEnterTransition(null);
                break;

        }
    }

    private void setupViews(int position) {

        Button audioListen = (Button) findViewById(R.id.audiolisten);
        TextView example1 = (TextView) findViewById(R.id.example1);
        TextView example2 = (TextView) findViewById(R.id.example2);
        TextView example3 = (TextView) findViewById(R.id.example3);
        ImageView practice = (ImageView) findViewById(R.id.practice);
        ImageView image = (ImageView) findViewById(R.id.lastImage);

        // Obtiene el curso ha detallar basado en la posición
        final ItemsDictionaryKatakana detailCourse = ContentDictionaryKatakana.getCourseByPosition(position);

        audioListen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), detailCourse.getExample());
                mediaPlayer.start();
            }
        });

        example1.setText(detailCourse.getExample1());
        example2.setText(detailCourse.getExample2());
        example3.setText(detailCourse.getExample3());
        practice.setImageResource(detailCourse.getPractice());
        Glide.with(this).load(detailCourse.getIdImage()).into(image);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            default:
                return super.onOptionsItemSelected(item);
            case android.R.id.home:
                // Obtener intent de la actividad padre
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Comprobar si DetailActivity no se creó desde CourseActivity
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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void launch(Activity context, int position, View sharedView) {
        Intent intent = new Intent(context, DetailsDictionaryKatakana.class);
        intent.putExtra(EXTRA_POSITION, position);

        // Los elementos 4, 5 y 6 usan elementos compartidos,
        if (position >= 150) {
            ActivityOptions options0 = ActivityOptions
                    .makeSceneTransitionAnimation(context, sharedView, sharedView.getTransitionName());
            context.startActivity(intent, options0.toBundle());
        } else {
            ActivityOptions options0 = ActivityOptions.makeSceneTransitionAnimation(context);
            context.startActivity(intent, options0.toBundle());
        }
    }
}