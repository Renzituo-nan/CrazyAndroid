package com.plkj.studysample.designPattern.singleton;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 单例模式—枚举
 * 枚举类本身就是安全的
 * 若在该类中添加方法
 * 需要保证线程的安全
 */
public enum EnumSingleton {
    INSTANCE;//定义一个枚举的元素，它就是一个Single的实例
    public void doSomeThing(){

    }
}
