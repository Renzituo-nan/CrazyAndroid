package com.plkj.common.base;


import androidx.annotation.Keep;

/**
 * <p>类说明</p>
 *
 */
@Keep
public interface IApplicationDelegate {

    void onCreate();

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);

}
