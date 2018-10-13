package com.example.rawrensia.northspineapp;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by rawrensia on 26/9/18.
 */

public class ImageAdapterNetw extends BaseAdapter {
    private Context mContext;
    public ImageAdapterNetw(Context c) {
        mContext = c;
    }

    public int getCount(){
        return mNetwIds.length;
    }
    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView,ViewGroup parent){
        ImageView imageView;
        if (convertView == null){
            imageView = new ImageView(mContext);
            //imageView.setLayoutParams((new ViewGroup.LayoutParams(100, 100)));
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else{
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mNetwIds[position]);
        return imageView;
    }

    private Integer[] mNetwIds = {
            R.drawable.shopeelogo, R.drawable.nasa, R.drawable.fb,
            R.drawable.dyson, R.drawable.ms, R.drawable.hsbc,
            R.drawable.google, R.drawable.pp, R.drawable.disney,
            R.drawable.rr, R.drawable.toshiba, R.drawable.grab,

    };
}

