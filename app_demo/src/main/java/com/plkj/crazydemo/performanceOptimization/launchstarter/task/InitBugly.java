package com.plkj.crazydemo.performanceOptimization.launchstarter.task;

import com.plkj.crazydemo.performanceOptimization.launchstarter.task.MainTask;

import debug.DemoApplication;

/**
 * Created by Renzituo
 * on 2020-06-15
 * 需要在主线程执行的task
 */
public class InitBugly extends MainTask {
    @Override
    public void run() {
        //具体的初始化
        DemoApplication demoApplication = (DemoApplication) mContext;
    }
}
