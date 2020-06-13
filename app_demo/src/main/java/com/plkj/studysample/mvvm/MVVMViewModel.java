package com.plkj.studysample.mvvm;

import android.app.Application;
import android.view.View;


import com.plkj.studysample.BR;
import com.plkj.studysample.databinding.ActivityMvvmBinding;
import com.plkj.studysample.mvc.CallBack;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Created by Renzituo
 * on 2020-05-20
 * ViewModel中进行逻辑处理与业务更新
 * 继承BaseObservable配合注解的使用可以让ViewModel的数据发生变化时自动刷新UI
 */
public class MVVMViewModel extends BaseObservable {

    private Application application;
    private ActivityMvvmBinding binding;
    private String name;
    private MVVMModel mvvmModel;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.mvvmModel);
    }


    /**
     * @param application  一般需要传入Application对象，方便在ViewModel中使用Application，比如SP
     * @param binding 获取页面的一些数据后进行数据的操作，比如输入的登录信息然后请求登录
     */
    public MVVMViewModel(Application application,ActivityMvvmBinding binding){
        this.application = application;
        this.binding = binding;
        mvvmModel = new MVVMModel();
    }
    public void getDataFromNet(View view){
        mvvmModel.getDataFromNet(new CallBack() {
            @Override
            public void onSucceed(String data) {
                setName(data);
            }

            @Override
            public void onFail(String message) {
                setName(message);
            }
        });
    }

}
