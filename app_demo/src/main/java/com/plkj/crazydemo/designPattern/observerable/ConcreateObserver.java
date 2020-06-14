package com.plkj.crazydemo.designPattern.observerable;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 具体的观察者类
 */
public class ConcreateObserver extends Observer {

    private String observerState;
    @Override
    void update(String observerState) {
        this.observerState = observerState;//更新观察者状态，与被观察者状态一致
    }
}
