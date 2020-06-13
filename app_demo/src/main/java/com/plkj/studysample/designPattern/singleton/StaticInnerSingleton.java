package com.plkj.studysample.designPattern.singleton;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 单例模式—静态内部类
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton(){

    }
    public static StaticInnerSingleton getInstance(){
        return SingleHolder.mStaticInnerSingleton;
    }
    /**
     * 静态内部类
     */
    private static class SingleHolder{
        private static final StaticInnerSingleton mStaticInnerSingleton = new StaticInnerSingleton();
    }
}
