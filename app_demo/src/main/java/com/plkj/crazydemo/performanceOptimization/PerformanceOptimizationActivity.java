package com.plkj.crazydemo.performanceOptimization;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

import com.plkj.common.base.BaseActivity;
import com.plkj.crazydemo.R;
import com.plkj.crazydemo.performanceOptimization.adapter.NewsAdapter;
import com.plkj.crazydemo.performanceOptimization.adapter.OnFeedShowCallBack;
import com.plkj.crazydemo.performanceOptimization.bean.NewsItem;
import com.plkj.crazydemo.performanceOptimization.launchstarter.DelayInitDispatcher;
import com.plkj.crazydemo.performanceOptimization.launchstarter.task.DispatchRunnable;
import com.plkj.crazydemo.performanceOptimization.launchstarter.task.delayinittask.DelayInitTaskA;
import com.plkj.crazydemo.performanceOptimization.launchstarter.task.delayinittask.DelayInitTaskB;
import com.plkj.crazydemo.performanceOptimization.launchstarter.utils.DispatcherExecutor;

import java.util.ArrayList;
import java.util.List;

/**
 * 启动优化演示页面
 */
public class PerformanceOptimizationActivity extends BaseActivity implements OnFeedShowCallBack {

    @BindView(R.id.llRoot)
    View llRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_performance_optimization;
    }

    @Override
    public void init(Bundle savedInstanceState) {
        List<NewsItem> newsItems = new ArrayList<>();
        new NewsAdapter(newsItems).setOnFeedShowCallBack(this);
        llRoot.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                llRoot.getViewTreeObserver().removeOnPreDrawListener(this);
                LaunchTimer.endRecord();//启动时间结束点
                return true;
            }
        });

    }

    @Override
    public void onFeedShow() {

//        ...
//        一系列操作 耗时十秒
//        new DispatchRunnable(new DelayInitTaskA()).run();
//        new DispatchRunnable(new DelayInitTaskB()).run();

//        DelayInitDispatcher delayInitDispatcher = new DelayInitDispatcher();
//        delayInitDispatcher.addTask(new DelayInitTaskA()).addTask(new DelayInitTaskB()).start();
    }
}
