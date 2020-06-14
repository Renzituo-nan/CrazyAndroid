package com.plkj.common.base;


import androidx.annotation.Keep;

/**
 * <p>View接口的基类</p>
 */
@Keep
public interface BaseView<T> {

    void setPresenter(T presenter);

}
