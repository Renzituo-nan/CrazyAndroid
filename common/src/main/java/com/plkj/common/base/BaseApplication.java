package com.plkj.common.base;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;


import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.plkj.common.utils.Utils;

import java.util.List;

/**
 * 要想使用BaseApplication，必须在组件中实现自己的Application，并且继承BaseApplication；
 * 组件中实现的Application必须在debug包中的AndroidManifest.xml中注册，否则无法使用；
 * 组件的Application需置于java/debug文件夹中，不得放于主代码；
 * 组件中获取Context的方法必须为:Utils.getContext()，不允许其他写法；
 *
 *
 *
 * Application类的应用场景：
 * 初始化应用程序级别的资源，如全局对象、环境配置变量等
 * 数据共享、数据缓存，如设置全局共享变量、方法等
 * 获取应用程序当前的内存使用情况，如及时释放资源。从而避免被系统杀死
 * 监听应用程序配置信息的改变，如屏幕旋转等
 * 监听应用程序内所有Activity的生命周期
 *
 */
public class BaseApplication extends Application {

    public static final String ROOT_PACKAGE = "com.crazy.module";

    private static BaseApplication sInstance;

    private List<IApplicationDelegate> mAppDelegateList;


    public static BaseApplication getIns() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        Logger.init("pattern").logLevel(LogLevel.FULL);
        Utils.init(this);
        mAppDelegateList = ClassUtils.getObjectsWithInterface(this, IApplicationDelegate.class, ROOT_PACKAGE);
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onCreate();
        }

    }

    /**
     * 调用时刻：应用程序结束时调用
     * 但该方法只用于Android仿真机测试，在Android产品机是不会调用的
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onTerminate();
        }
    }


    /**
     *4.0之后使用onTrimMemory
     *
     * 作用：监听Android系统整体内存较低时刻
     * 调用时刻：Android系统整体内存较低时刻
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onLowMemory();
        }
    }

    /**
     * 替代4.0之前的onLowMemory
     *
     * 作用：通知应用程序当前内存使用情况（以内存级别进行识别）
     *
     * 应用场景：根据当前内存使用情况进行自身的内存资源的不同程度释放，以避免系统直接杀掉&优化应用程序的性能体验
     * @param level
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onTrimMemory(level);
        }
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {

    }


    /**
     * 作用：监听应用程序配置信息的改变，如屏幕旋转等
     * 调用时刻：应用程序配置信息改变是调用
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    /**
     * 作用：注册对应用程序内所有Activity的生命周期监听
     * 调用时刻：当应用程序内Activity生命周期发生变化时
     * @param callback
     */
    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
    }
}
