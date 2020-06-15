package com.plkj.crazydemo.performanceOptimization.tasks;

import com.plkj.crazydemo.performanceOptimization.launchstarter.task.Task;

/**
 * Created by Renzituo
 * on 2020-06-15
 * 需要在子线程执行的task
 */
public class InitThirdPartTask extends Task {
    @Override
    public void run() {
        //具体的初始化业务
    }
}
