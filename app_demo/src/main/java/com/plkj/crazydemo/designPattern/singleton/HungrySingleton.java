package com.plkj.crazydemo.designPattern.singleton;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 单例模式—饿汉写法
 */
public class HungrySingleton {
    /**
     * static final 修饰
     * 若是其它类关联到该类，其它类加载时该单例类也会被加载并实例化出mHungrySingleton，无法延时加载
     * 这就是饿汉模式的缺陷
     */
    private static final HungrySingleton mHungrySingleton = new HungrySingleton();

    /**
     * 构造方法私有化
     */
    private HungrySingleton(){

    }

    /**
     * static 修饰
     * 提供获取实例的方法
     * @return
     */
    public static HungrySingleton getInstance(){
        return mHungrySingleton;
    }
}
