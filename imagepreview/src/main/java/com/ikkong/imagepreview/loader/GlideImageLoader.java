package com.ikkong.imagepreview.loader;

import android.app.Activity;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.ikkong.imagepreview.R;

import java.io.File;

/**
 * ================================================
 * 作    者：ikkong
 * 版    本：1.0
 * 创建日期：2016/5/19
 * 描    述：
 * 修订历史：保留图片预览，去除其他代码，更新display 方法  修复bug
 * ================================================
 */
public class GlideImageLoader implements ImageLoader {
    private static GlideImageLoader mInstance;
    private GlideImageLoader() {
    }
    public static GlideImageLoader getInstance() {
        if (mInstance == null) {
            synchronized (GlideImageLoader.class) {
                if (mInstance == null) {
                    mInstance = new GlideImageLoader();
                }
            }
        }
        return mInstance;
    }

    @Override
    public void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
        Glide.with(activity)                             //配置上下文
                .load((path.contains("http://")||path.contains("https://"))?path: Uri.fromFile(new File(path)))//设置图片路径
                .error(R.mipmap.ipv_default_image)           //设置错误图片
                .placeholder(R.mipmap.ipv_default_image)     //设置占位图片
                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存全尺寸
                .into(imageView);
    }

    @Override
    public void clearMemoryCache() {
    }
}
