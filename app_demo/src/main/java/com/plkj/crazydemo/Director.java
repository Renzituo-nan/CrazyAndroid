package com.plkj.crazydemo;

/**
 * Created by Renzituo
 * on 2020-05-09
 * 负责产品的组装
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     * @return
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
