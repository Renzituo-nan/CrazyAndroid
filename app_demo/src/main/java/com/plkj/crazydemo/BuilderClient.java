package com.plkj.crazydemo;

/**
 * Created by Renzituo
 * on 2020-05-09
 */
public class BuilderClient {
    public static void main(String[] args){
        Builder builder = new ConCreateBuilder();//可以通过配置文件实现
        Director director = new Director(builder);
        director.construct();
    }
}
