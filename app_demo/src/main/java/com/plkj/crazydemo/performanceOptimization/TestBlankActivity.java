package com.plkj.crazydemo.performanceOptimization;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.plkj.crazydemo.R;


public class TestBlankActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testblank);
//        final TextView textView = findViewById(R.id.tv_testblank);
//        textView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                boolean isBlank = BlankDetect.isBlank(textView);
//                LogUtils.i("isBlank "+ isBlank);
//            }
//        },2000);

    }
}
