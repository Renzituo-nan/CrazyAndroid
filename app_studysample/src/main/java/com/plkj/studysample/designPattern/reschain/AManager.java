package com.plkj.studysample.designPattern.reschain;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public class AManager extends AbsHandler {
    public AManager(int maxDay) {
        super(maxDay);
    }

    @Override
    protected void reply(int day) {
        //每一个链点的具体处理方式
    }
}
