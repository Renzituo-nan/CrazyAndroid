package com.plkj.crazydemo.designPattern.decorater;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public class Test {
    public static void main(String[] args){
        Component concreateComponet = new ConcreateComponet();//构建者具体子类
        /**
         * 传入构建者子类对象
         */
        concreateComponet = new ConcreateDecorator(concreateComponet);
        /**
         * 此时调用的将是修饰类中的operation()，包含了原有业务方法与新增业务方法
         * 相当于这个方法中其实是先通过传入的构建者子类对象调用原有的业务方法
         * 接着调用在修饰类中所定义的扩展方法
         * 这样就达到了对构建者具体类的修饰，功能的扩展
         */
        concreateComponet.operation();
    }
}
