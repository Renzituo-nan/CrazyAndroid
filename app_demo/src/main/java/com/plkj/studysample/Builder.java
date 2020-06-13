package com.plkj.studysample;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 抽象构建者
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    //返回产品对象
    public Product getResult(){
        return product;
    }
}
