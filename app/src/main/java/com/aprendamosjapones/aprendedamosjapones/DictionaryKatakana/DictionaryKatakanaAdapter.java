package com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.ArrayList;

public class DictionaryKatakanaAdapter extends BaseAdapter
{
	private ArrayList<String> listNameKanji;
	private ArrayList<Integer> listImageKanji;
	private Activity activity;
	
	public DictionaryKatakanaAdapter(Activity activity, ArrayList<String> listNameKanji, ArrayList<Integer> listImageKanji) {
		super();
		this.listNameKanji = listNameKanji;
		this.listImageKanji = listImageKanji;
		this.activity = activity;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listNameKanji.size();
	}

	@Override
	public String getItem(int position) {
		// TODO Auto-generated method stub
		return listNameKanji.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder
	{
		public ImageView imgViewFlag;
		public TextView txtViewTitle;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder view;
		LayoutInflater inflator = activity.getLayoutInflater();
		
		if(convertView==null)
		{
			view = new ViewHolder();
			convertView = inflator.inflate(R.layout.dictionary_katakana_row, null);
			
			view.txtViewTitle = (TextView) convertView.findViewById(R.id.textView1);
			view.imgViewFlag = (ImageView) convertView.findViewById(R.id.imageView1);
			
			convertView.setTag(view);
		}
		else
		{
			view = (ViewHolder) convertView.getTag();
		}
		
		view.txtViewTitle.setText(listNameKanji.get(position));
		view.imgViewFlag.setImageResource(listImageKanji.get(position));
		
		return convertView;
	}

}
