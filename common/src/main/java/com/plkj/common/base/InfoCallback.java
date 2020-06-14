package com.plkj.common.base;


import androidx.annotation.Keep;

/**
 * <p>数据回调接口</p>
 *
 */
@Keep
public interface InfoCallback<T> {

    void onSuccess(T info);

    void onError(int code, String message);

}
