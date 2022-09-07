package com.hcb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String GetNowTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
