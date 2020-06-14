package com.plkj.crazydemo.designPattern.facde;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 外观类
 * 使用单例模式
 * 使得系统中只有一个外观对象
 */
public class Facade {
    /**
     * 持有多个子模块的对象的引用，泳衣调用各个子模块的方法
     */
    private ModuleA moduleA;
    private ModuleB moduleB;
    private ModuleC moduleC;
    private static Facade mFacade;

    private Facade(){
        moduleA = new ModuleA();
        moduleB = new ModuleB();
        moduleC = new ModuleC();
    }

    public static Facade getInstance(){
        if (mFacade==null)
            mFacade = new Facade();
        return mFacade;
    }

    /**
     * 提供方法与外部进行交互
     * 通过外观类间接调用各个模块的方法
     * 而外部并不知道具体是怎么调用的
     * 都是由外部类具体调用
     */
    public void testOperation(){
        moduleA.funA();
        moduleB.funB();
        moduleC.funC();
    }
}
