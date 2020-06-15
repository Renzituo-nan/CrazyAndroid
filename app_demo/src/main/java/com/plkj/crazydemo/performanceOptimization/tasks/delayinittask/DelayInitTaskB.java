package com.plkj.crazydemo.performanceOptimization.tasks.delayinittask;


import com.plkj.crazydemo.performanceOptimization.launchstarter.task.MainTask;
import com.plkj.crazydemo.performanceOptimization.utils.LogUtils;

public class DelayInitTaskB extends MainTask {

    @Override
    public void run() {
        // 模拟一些操作

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LogUtils.i("DelayInitTaskB finished");
    }
}
