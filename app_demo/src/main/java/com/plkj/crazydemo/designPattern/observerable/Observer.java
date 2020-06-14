package com.plkj.crazydemo.designPattern.observerable;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 观察者抽象类
 */
public abstract class Observer {

    //观察者收到被观察者通知后的操作，具体操作由不同观察者进行不同的实现
    abstract void update(String state);
}
