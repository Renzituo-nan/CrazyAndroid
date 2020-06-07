package com.plkj.studysample.designPattern.singleton;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 单例模式—DCL
 */
public class DclSingleton {
    /**
     * JVM的即时编译器中存在指令重排序的优化,也就是说一个对象的创建过程不一定是按顺序的，这也就可能
     * 在并发下该单例写法会失效
     * 这是DCL的缺陷
     */
    private static DclSingleton mDclSingleton;
    /**
     * 解决办法：使用volatile修饰可以禁止JVM的这个指令优化
     */
    private static volatile DclSingleton mDclSingleton2;

    private DclSingleton(){

    }

    /**
     * 使用同步块加锁的方式
     * 两次判断防止产生不同实例
     * @return
     */
    public static DclSingleton getInstance(){
        if (mDclSingleton==null){//避免不必要的同步
            synchronized (DclSingleton.class){//同步
                if (mDclSingleton==null){
                    mDclSingleton = new DclSingleton();
                }
            }
        }
        return mDclSingleton;
    }
}
