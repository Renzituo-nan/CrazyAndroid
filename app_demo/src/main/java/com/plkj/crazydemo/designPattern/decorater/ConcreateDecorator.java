package com.plkj.crazydemo.designPattern.decorater;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 装饰者具体类
 */
public class ConcreateDecorator extends Decorator {
    public ConcreateDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();//调用原有业务方法
        addBehavior();//调用新增业务方法
    }
    //新增业务方法，达到对具体构建类的修饰，扩展具体构建类的功能
    private void addBehavior() {

    }
}
