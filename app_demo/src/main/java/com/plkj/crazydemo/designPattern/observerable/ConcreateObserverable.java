package com.plkj.crazydemo.designPattern.observerable;

/**
 * Created by Renzituo
 * on 2020-05-10
 *
 * 具体的被观察者对象
 */
public class ConcreateObserverable extends Observerable {
    public String getState() {
        return state;
    }

    private String state;

    public void change(String state){
        this.state = state;
        notifyObserver(state);//通知发生了改变，通知观察者
    }
}
