package com.plkj.crazydemo.performanceOptimization.tasks.delayinittask;


import com.plkj.crazydemo.performanceOptimization.launchstarter.task.MainTask;
import com.plkj.crazydemo.performanceOptimization.utils.LogUtils;

public class DelayInitTaskA extends MainTask {

    @Override
    public void run() {
        // 模拟一些操作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LogUtils.i("DelayInitTaskA finished");
    }
}
