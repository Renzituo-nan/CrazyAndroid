package com.plkj.crazydemo.performanceOptimization.utils;

import android.util.Log;


import java.util.concurrent.ExecutorService;

import debug.DemoApplication;

public class LogUtils {

    private static ExecutorService sExecutorService;

    public static void setExecutor(ExecutorService executorService){
        sExecutorService = executorService;
    }

    public static final String TAG = "performance";

    public static void i(String msg){
        if(Utils.isMainProcess(DemoApplication.getApplication())){
            Log.i(TAG,msg);
        }
        // 异步
        if(sExecutorService != null){
//            sExecutorService.execute();
        }
    }

}
