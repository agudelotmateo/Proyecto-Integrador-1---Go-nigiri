package com.aprendamosjapones.aprendedamosjapones.DictionaryHIragana;

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
public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.CourseViewHolder> implements ItemClickListener {
    private final Context context;
    private List<ItemsDictionaryHiragana> items;


    public DictionaryAdapter(Context context, List<ItemsDictionaryHiragana> items) {
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
                .inflate(R.layout.list_item_dictionary, viewGroup, false);
        return new CourseViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder viewHolder, int i) {
        // Item procesado actualmente
        ItemsDictionaryHiragana currentItem = items.get(i);

        viewHolder.hiraganaTittle.setText(currentItem.getListen());
        // Cargar imagen
        Glide.with(context)
                .load(currentItem.getIdImage())
                .into(viewHolder.image);
    }

    @Override
    public void onItemClick(View view, int position) {
        // Imagen a compartir entre transiciones
        View sharedImage = view.findViewById(R.id.image);
        DetailsDictionaryHiragana.launch(
                (Activity) context, position, sharedImage);
    }

    /**
     * View holder para reciclar elementos
     */
    public static class CourseViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Views para un curso
        public final TextView hiraganaTittle;
        public final ImageView image;

        // Interfaz de comunicación
        public ItemClickListener listener;

        public CourseViewHolder(View v, ItemClickListener listener) {
            super(v);
            hiraganaTittle = (TextView) v.findViewById(R.id.hiraganaTittle);
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