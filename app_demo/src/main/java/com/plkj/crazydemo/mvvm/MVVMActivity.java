package com.plkj.crazydemo.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.ViewGroup;


import com.plkj.crazydemo.R;
import com.plkj.crazydemo.contract.HelperContract;
import com.plkj.crazydemo.databinding.ActivityMvvmBinding;


/**
 * 减少了接口数量
 * 告别繁琐的findViewById操作
 *
 * View层的视图控制移交到了layout文件中，数据绑定使得layout拥有强大的视图功能
 *
 * 优点：实现了数据和视图的双向绑定，极大的简化代码
 * 缺点：bug难以调试，并且dataBinding目前还存在一些编译问题
 *
 * 目录使用大写将导致编译时自动生成的binding文件无法查找导致编译失败
 */
public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);
        ActivityMvvmBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        MVVMViewModel mvvmViewModel = new MVVMViewModel(getApplication(), binding);
        binding.setMvvmModel(mvvmViewModel);

    }
}
