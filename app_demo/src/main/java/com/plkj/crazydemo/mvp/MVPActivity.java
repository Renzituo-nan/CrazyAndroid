package com.plkj.crazydemo.mvp;

import android.os.Bundle;


import com.plkj.crazydemo.R;

import androidx.appcompat.app.AppCompatActivity;


/**
 * MVP
 * Model与View不再直接进行通信，而是通过中间层Presenter层来实现
 * Activity的功能被简化，不再充当控制器，主要负责View层面的工作
 * 优点：解决了MVC中Controller与View过度耦合的缺点，职责划分明确，更加易于维护
 * 缺点：接口数量多，项目复杂度升高。随着项目复杂度的提升，Presenter层将越来越臃肿
 *
 * 建议：
 * 1.接口规范化（封装父类接口以减少接口的使用量）
 * 2.使用第三方插件自动生成MVP代码（如MVPHelper）
 * 3.对于一些简单的界面，可以不选择使用MVP框架
 */
public class MVPActivity extends AppCompatActivity implements IMVPView {
    MVPPresenter mvpPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        mvpPresenter = new MVPPresenter(this);
    }
    public void getDataFromNet(){
        mvpPresenter.getDataFromNet();
    }
    @Override
    public void onGetSucceed(String data) {//获取数据成功时
    }
    @Override
    public void onGetFail(String message) {//获取数据失败时
    }
}
