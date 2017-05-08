package com.aprendamosjapones.aprendedamosjapones.DictionaryHiragana;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryHiraganaAdapter extends BaseAdapter
{
	private ArrayList<String> listNameHiragana;
	private ArrayList<Integer> listImagesHiragana;
	private Activity activity;
	
	public DictionaryHiraganaAdapter(Activity activity, ArrayList<String> listNameHiragana, ArrayList<Integer> listImagesHiragana) {
		super();
		this.listNameHiragana = listNameHiragana;
		this.listImagesHiragana = listImagesHiragana;
		this.activity = activity;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listNameHiragana.size();
	}

	@Override
	public String getItem(int position) {
		// TODO Auto-generated method stub
		return listNameHiragana.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder
	{
		public ImageView imgView;
		public TextView txtView;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder view;
		LayoutInflater inflator = activity.getLayoutInflater();
		
		if(convertView==null)
		{
			view = new ViewHolder();
			convertView = inflator.inflate(R.layout.dictionary_hiragana_row, null);
			
			view.txtView = (TextView) convertView.findViewById(R.id.textView1);
			view.imgView = (ImageView) convertView.findViewById(R.id.imageView1);
			
			convertView.setTag(view);
		}
		else
		{
			view = (ViewHolder) convertView.getTag();
		}
		
		view.txtView.setText(listNameHiragana.get(position));
		view.imgView.setImageResource(listImagesHiragana.get(position));
		
		return convertView;
	}

}
