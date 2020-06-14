package com.plkj.crazydemo.designPattern.template;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 模板基类
 */
public abstract class AbstractWork {

    protected void getUp(){//子类相同的操作

    }

    /**
     * 子类实现各自独特的行为
     */
    protected abstract void work();
    protected abstract void goToWork();
    protected abstract void getOffWork();

    /**
     * 模板方法，大家都拥有共同的步骤
     * 至于这些步骤中的具体操作则有子类实现
     *
     * final：子类无法改变或者继承
     * 这是模板方法所必须的
     */
    public final void newDay(){
       getUp();
        goToWork();
        work();
        getOffWork();
    }
}
