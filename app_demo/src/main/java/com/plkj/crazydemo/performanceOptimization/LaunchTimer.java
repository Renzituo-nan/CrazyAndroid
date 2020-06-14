package com.plkj.crazydemo.performanceOptimization;

import android.util.Log;

/**
 * Created by Renzituo
 * on 2020-06-14
 */
public class LaunchTimer {
    private static final String TAG = "LaunchTimer";
    private static long sTime;

    public static void startRecord(){
        sTime = System.currentTimeMillis();
    }

    public static void endRecord(){
        long cost = System.currentTimeMillis() - sTime;
        Log.d("LaunchTimer", "cost:" + cost);
    }
}
