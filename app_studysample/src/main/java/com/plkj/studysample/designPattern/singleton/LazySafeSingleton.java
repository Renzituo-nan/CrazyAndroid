package com.plkj.studysample.designPattern.singleton;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 单例模式—懒汉线程安全
 */
public class LazySafeSingleton {
    private static LazySafeSingleton mLazySingleton = null;
    private LazySafeSingleton(){

    }

    /**
     *使用Synchronized关键字修饰该方法
     * @return
     */
    public static synchronized LazySafeSingleton getInstance(){
        if (mLazySingleton==null){
            mLazySingleton = new LazySafeSingleton();
        }
        return mLazySingleton;
    }

    /**
     *使用Synchronized关键字锁住代码块
     * @return
     */
    public static  LazySafeSingleton getInstance2(){
        synchronized (LazySingleton.class){
            if (mLazySingleton==null){
                mLazySingleton = new LazySafeSingleton();
            }
            return mLazySingleton;
        }
    }
}
