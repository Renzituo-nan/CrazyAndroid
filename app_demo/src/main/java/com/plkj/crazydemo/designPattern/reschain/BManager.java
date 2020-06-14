package com.plkj.crazydemo.designPattern.reschain;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public class BManager extends AbsHandler {
    public BManager(int maxDay) {
        super(maxDay);
    }

    @Override
    protected void reply(int day) {
        //每一个链点的具体处理方式
    }
}
