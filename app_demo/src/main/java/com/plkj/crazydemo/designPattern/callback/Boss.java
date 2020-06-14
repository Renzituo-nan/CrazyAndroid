package com.plkj.crazydemo.designPattern.callback;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public class Boss {
    private Employee employee;
    public void setCallBack(){
        employee.setMyCallBack(new Employee.MyCallBack() {
            @Override
            public void work() {
                //todo
            }
        });
    }
}
