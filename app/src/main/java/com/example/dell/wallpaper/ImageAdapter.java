package com.example.dell.wallpaper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by DELL on 30/11/2015.
 */
public class ImageAdapter extends BaseAdapter {
    //Keep  all Images
    private Context mContext;
    public Integer[] mThumbIds={
      R.drawable.pic_01,R.drawable.pic_02,
      R.drawable.pic_03,R.drawable.pic_04,
      R.drawable.pic_05,R.drawable.pic_06,
      R.drawable.pic_07,R.drawable.pic_08,
      R.drawable.pic_09

    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return  mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,200));
        return imageView;
    }
}
