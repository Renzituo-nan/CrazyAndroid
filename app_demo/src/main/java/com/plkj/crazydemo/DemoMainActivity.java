package com.plkj.crazydemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.plkj.common.base.BaseActivity;
import com.plkj.common.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = "/CrazyDemo/MainActivity")
public class DemoMainActivity extends BaseActivity {

    @BindView(R.id.btnDemo)
    Button btnSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_main_demo;
    }

    @Override
    public void init(Bundle savedInstanceState) {

    }

    @OnClick(R.id.btnDemo)
    public void onViewClicked(View view) {
        ToastUtils.showShortToast("跳转Demo");
    }
}
