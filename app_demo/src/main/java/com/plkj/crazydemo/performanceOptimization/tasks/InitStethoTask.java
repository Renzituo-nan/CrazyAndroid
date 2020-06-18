package com.plkj.crazydemo.performanceOptimization.tasks;

import android.os.Handler;
import android.os.Looper;

import com.facebook.stetho.Stetho;
import com.plkj.crazydemo.performanceOptimization.launchstarter.task.Task;


/**
 * Created by Renzituo
 * on 2020-06-18
 */
public class InitStethoTask extends Task {
    @Override
    public void run() {
        Handler handler=  new Handler(Looper.getMainLooper());
        Stetho.initializeWithDefaults(mContext);
    }
}
