package com.plkj.studysample.designPattern.singleton;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 单例模式—懒汉
 */
public class LazySingleton {
    private static LazySingleton mLazySingleton = null;
    private LazySingleton(){

    }

    /**
     * 提供获取实例的方法
     * 只有第一次初始化时才会实例化
     * 该方法并不是同步的，这意味着在多线程并发情况下，单例模式将会失效，即获取的实例将不是同一个对象
     * @return
     */
    public static LazySingleton getInstance(){
        if (mLazySingleton==null){
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }
}
