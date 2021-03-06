package com.ikkong.adgo.utils;

import android.net.Uri;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by sunny on 2015-10-19.
 */
public class FileUtils {
    /**
     * 创建 文件名
     *
     * @param type 1 jpg  2 mp4
     * @return
     */
    public static Uri getOutputMediaFileUri(int type) {
        return Uri.fromFile(getOutputMediaFile(type,"media"));
    }

    /**
     * Create a File for saving an image or video
     */
    public static File getOutputMediaFile(int type,String folderName) {
        // To be safe, you should check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.

        File mediaStorageDir = null;
        try {
            // This location works best if you want the created images to be
            // shared
            // between applications and persist after your app has been
            // uninstalled.
            mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), folderName);

            // Log.d(LOG_TAG, "Successfully created mediaStorageDir: "
            // + mediaStorageDir);

        } catch (Exception e) {
            e.printStackTrace();
            // Log.d(LOG_TAG, "Error in Creating mediaStorageDir: "
            // + mediaStorageDir);
        }

        // 如果不存在 就创建文件夹
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                // 在SD卡上创建文件夹需要权限：
                // <uses-permission
                // android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
//                 Log.d("LOG_TAG",
//                         "failed to create directory, check if you have the WRITE_EXTERNAL_STORAGE permission");
                return null;
            }
        }

        // Create a media file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
        File mediaFile;
        if (type == 1) {
            mediaFile = new File(mediaStorageDir.getPath() + File.separator + "IMG_" + timeStamp + ".jpg");
            Log.d("LOG_TAG", "mediaFile.path---->" + mediaFile.getPath());
        } else if (type == 2) {
            mediaFile = new File(mediaStorageDir.getPath() + File.separator + "VID_" + timeStamp + ".mp4");
        } else {
            return null;
        }
        
        return mediaFile;
    }

    /**
     * Create a File for saving an apk
     */
    public static String getDownloadApkPath() {
        File mediaStorageDir = null;
        try {
            mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "apk");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 如果不存在 就创建文件夹
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                return null;
            }
        }
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
        return mediaStorageDir.getPath() + File.separator + timeStamp + ".apk";
    }
}
