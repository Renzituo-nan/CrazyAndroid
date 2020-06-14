package com.plkj.crazydemo.designPattern.decorater;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 装饰者父类
 * 与构建者具体类共同继承抽象构建类或者实现抽象构建接口
 */
public class Decorator implements Component {

    private Component component;//维持一个对抽象构建对象的引用，就可以调用原有的业务方法

    public Decorator(Component component){//注入一个抽象构建类型的对象
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();//调用业务原有的方法
    }
}
