package com.plkj.common.base;


import androidx.annotation.Keep;

/**
 * <p>View接口的基类</p>
 *
 * @author 张华洋
 * @name BaseView
 */
@Keep
public interface BaseView<T> {

    void setPresenter(T presenter);

}
