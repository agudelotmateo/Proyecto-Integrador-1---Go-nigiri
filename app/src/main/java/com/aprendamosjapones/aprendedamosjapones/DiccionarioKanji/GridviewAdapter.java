package com.aprendamosjapones.aprendedamosjapones.DiccionarioKanji;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

/**
 * Created by wilfer on 25/04/17.
 */

public class GridviewAdapter extends BaseAdapter {

    private ArrayList<String> listKanjiWord;
    private ArrayList<Integer> listKanjiImage;
    private Activity activity;

    public GridviewAdapter(Activity activity,ArrayList<String> listCountry, ArrayList<Integer> listFlag) {
        super();
        this.listKanjiWord = listKanjiWord;
        this.listKanjiImage = listKanjiImage;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listKanjiWord.size();
    }

    @Override
    public String getItem(int position) {
        // TODO Auto-generated method stub
        return listKanjiWord.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder
    {
        public ImageView imgViewKanji;
        public TextView txtViewWord;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if(convertView==null)
        {
            view = new ViewHolder();
            convertView = inflator.inflate(R.layout.activity_main_dictionary_kanji, null);

            view.txtViewWord = (TextView) convertView.findViewById(R.id.textView1);
            view.imgViewKanji = (ImageView) convertView.findViewById(R.id.imageView1);

            convertView.setTag(view);
        }
        else
        {
            view = (ViewHolder) convertView.getTag();
        }

        view.txtViewWord.setText(listKanjiWord.get(position));
        view.imgViewKanji.setImageResource(listKanjiImage.get(position));

        return convertView;
    }

}
