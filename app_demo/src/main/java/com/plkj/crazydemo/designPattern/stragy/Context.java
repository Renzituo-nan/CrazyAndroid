package com.plkj.crazydemo.designPattern.stragy;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public class Context {

    private AbstractStrategy strategy;//持有策略对象的引用，用于调用不同策略的方法

    public Context (AbstractStrategy strategy){
        this.strategy = strategy;
    }
    public AbstractStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void run(){
        strategy.run();
    }

}
