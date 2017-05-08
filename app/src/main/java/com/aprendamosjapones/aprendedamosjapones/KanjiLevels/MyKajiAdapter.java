package com.aprendamosjapones.aprendedamosjapones.KanjiLevels;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * {@link android.support.v7.widget.RecyclerView.Adapter} para la lista de elementos
 */
class LevelKanjiAdapter extends RecyclerView.Adapter<LevelKanjiAdapter.CourseViewHolder> implements ItemClickListener {
    private final Context context;
    private List<KanjiLevel> items;


    public LevelKanjiAdapter(Context context, List<KanjiLevel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_level, viewGroup, false);
        return new CourseViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder viewHolder, int i) {
        // Item procesado actualmente
        KanjiLevel currentItem = items.get(i);

        viewHolder.name.setText(currentItem.getName());

        // Cargar imagen
        Glide.with(context)
                .load(currentItem.getIdImage())
                .into(viewHolder.image);
    }

    @Override
    public void onItemClick(View view, int position) {
        // Imagen a compartir entre transiciones
        View sharedImage = view.findViewById(R.id.image);
        KanjiDetailActivity.launch(
                (Activity) context, position, sharedImage);
    }

    /**
     * View holder para reciclar elementos
     */
    public static class CourseViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Views para un curso
        public final TextView name;
        public final ImageView image;

        // Interfaz de comunicación
        public ItemClickListener listener;

        public CourseViewHolder(View v, ItemClickListener listener) {
            super(v);
            name = (TextView) v.findViewById(R.id.name);

            image = (ImageView) v.findViewById(R.id.image);
            v.setOnClickListener(this);

            this.listener = listener;
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }
}

interface ItemClickListener {
    void onItemClick(View view, int position);
}