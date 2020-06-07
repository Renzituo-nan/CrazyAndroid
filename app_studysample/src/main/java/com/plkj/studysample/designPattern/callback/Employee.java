package com.plkj.studysample.designPattern.callback;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
class Employee {

    private MyCallBack myCallBack;

    public interface MyCallBack{
        void work();
    }

    public void setMyCallBack(MyCallBack myCallBack){
        this.myCallBack = myCallBack;
    }

    public void doWork(){
        myCallBack.work();//具体实现交由回调处
    }
}
