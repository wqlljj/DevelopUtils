package com.example.wangqi.developutils.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import java.io.File;

/**
 * create by wangqi
 * on 2020/8/13 0013
 * UI效果预览
 */
public class ImageData {
    private static String[] list;
    private static int index = 0;
    private static String path;

    public static void init(String path){
        list = new File(path).list();
        ImageData.path = path;
    }
    public static Bitmap getNextBitmap() {
        if (list!=null&&list.length > 0) {
            return BitmapFactory.decodeFile(path+list[index++ % list.length]);
        }
        return null;
    }
}
