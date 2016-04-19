package com.hadis.hadiscarousel.cycleviewpager;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hadis.hadiscarousel.R;

/**
 * ImageView创建工厂
 */
public class ViewFactory {

    public static ImageView getImageView(Context context, String url) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.view_banner, null);
        //ImageLoader.getInstance().displayImage(url, imageView, getOptions());
        Glide.with(context).load(url).centerCrop().placeholder(R.mipmap.ic_launcher).into(imageView);
        return imageView;
    }
}
