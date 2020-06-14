package com.plkj.crazydemo.performanceOptimization.aop;

import com.blankj.utilcode.util.LogUtils;

/**
 * Created by Renzituo
 * on 2020-06-15
 */
/*@Aspect
public class PerformanceAop {

    @Around("call(* debug.DemoApplication.**(..))")
    public void getTime(ProceedingJoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.toShortString();
        long time = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
//        LogUtils.i(name + " cost " + (System.currentTimeMillis() - time));
    }

    @Around("execution(* android.app.Activity.setContentView(..))")
    public void getSetContentViewTime(ProceedingJoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.toShortString();
        long time = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        LogUtils.i(name + " cost " + (System.currentTimeMillis() - time));
    }
}*/
