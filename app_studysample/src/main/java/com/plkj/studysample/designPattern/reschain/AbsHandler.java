package com.plkj.studysample.designPattern.reschain;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public abstract class AbsHandler {
    private AbsHandler nextHandler;
    public int maxDay;
    protected AbsHandler(int maxDay){
        this.maxDay = maxDay;
    }
    //设置责任链中下一个处理请求的对象
    public void setMyHandler(AbsHandler absHandler){
        this.nextHandler = absHandler;
    }

    public void handlerRequest(int day){
        if (day<maxDay){
            reply(day);
        }else {
            if (nextHandler!=null){
                nextHandler.handlerRequest(day);//交由下一个处理
            }else {
                //无法处理
            }
        }
    }

    protected abstract void reply(int day);
}
