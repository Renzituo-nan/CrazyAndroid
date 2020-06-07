package com.plkj.studysample.designPattern.composite;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 抽象类
 * 对应Component
 */
public abstract class File {

    public File(String name){
        this.name = name;
    }
    public String getName() {//操作方法
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public abstract void watch();

    //组合方法
    public void add(File file){
    }
    //组合方法
    public File getChild(int position){//组合方法
        return null;
    }
}
