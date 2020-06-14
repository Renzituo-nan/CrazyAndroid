package com.plkj.crazydemo.performanceOptimization.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.plkj.crazydemo.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * 模拟内存泄露的Activity
 */
public class MemoryLeakActivity extends AppCompatActivity implements CallBack{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoryleak);
        ImageView imageView = findViewById(R.id.iv_memoryleak);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.splash);
        imageView.setImageBitmap(bitmap);

        CallBackManager.addCallBack(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        CallBackManager.removeCallBack(this);
    }

    @Override
    public void dpOperate() {
        // do sth
    }
}
