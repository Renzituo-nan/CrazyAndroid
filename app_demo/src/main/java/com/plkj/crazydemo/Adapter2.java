package com.plkj.crazydemo;

/**
 * Created by Renzituo
 * on 2020-05-09
 */
public class Adapter2 implements Target {

    private Adaptee mAdaptee;

    public Adapter2(Adaptee mAdaptee){
        this.mAdaptee = mAdaptee;
    }

    @Override
    public void funA() {
        mAdaptee.funA();//通过委派的方式复用Adaptee的方法
    }

    @Override
    public void funB() {
        //do Something
    }
}
