package com.hcb.utils;

import android.content.Context;
import android.content.res.Resources;


public class Utils {

    //根据手机屏幕的分辨率从 dp 单位转换为 px 像素
    public static int dip2px(Context context, float dpValue) {
        //获取当前手机的像素密度
        float scale = context.getResources().getDisplayMetrics().density;
        //四舍五入取整
        int v = (int) (dpValue * scale + 0.5f);

        return v;
    }
}
