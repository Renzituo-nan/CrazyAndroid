package com.plkj.crazydemo.mvc;

import android.os.Bundle;


import com.plkj.crazydemo.R;

import androidx.appcompat.app.AppCompatActivity;


/**
 * MVC
 * 优点：一定程度上实现了Model与View的分离，降低了代码的耦合性
 * 缺点：Controller层与View层难以完全解耦，并且随着项目复杂度的提升，Controller将越来越臃肿
 */
public class MVCActivity extends AppCompatActivity {
    MVCModel mvcModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        mvcModel = new MVCModel();
    }
    public void onGetSucceed(String data){//获取数据成功时
    }
    public void onGetFail(String message){//获取数据失败时
    }

    /**
     * View持有Model的引用
     * View通过Model获取数据
     * Model获取数据后将结果通知给View层
     * 此时的Activity再根据返回结果显示对应UI
     * 从这里也看出了此时的Activity既是View层也是Controller层
     * 既负责UI显示也负责业务逻辑判断
     */
    public void getDataFromNet(){
        mvcModel.getDataFromNet(new CallBack() {
            @Override
            public void onSucceed(String data) {
                onGetSucceed(data);
            }
            @Override
            public void onFail(String message) {
                onGetFail(message);
            }
        });
    }

}
