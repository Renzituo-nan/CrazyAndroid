package com.plkj.studysample.designPattern.observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 抽象被观察者
 */
public abstract class Observerable {

    //维护了一个集合，用于保存注册了的观察者对象
    private List<Observer> observerList = new ArrayList<>();

    //注册观察者
    public void attach(Observer observer){
        observerList.add(observer);
    }

    //注销观察者
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObserver(String newState){
        for (Observer observer:observerList) {
            observer.update(newState);
        }
    }
}
