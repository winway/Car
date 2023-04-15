package com.example.car.utils;

import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.car.R;
import com.squareup.picasso.Picasso;

/**
 * @PackageName: com.example.car.utils
 * @ClassName: DataBindingUtils
 * @Author: winwa
 * @Date: 2023/4/15 7:31
 * @Description:
 **/
public class DataBindingUtils {

    @BindingAdapter("url")
    public static void setBrandLogoItemImage(ImageView imageView, String imgUrl) {
        if (TextUtils.isEmpty(imgUrl)) {
            imageView.setImageResource(R.mipmap.car);
        } else {
            Picasso.get().load(imgUrl).placeholder(R.mipmap.car).error(R.mipmap.car).into(imageView);
        }
    }
}
