package com.plkj.common.base;


import android.view.View;

import androidx.annotation.Keep;

/**
 * <p>类说明</p>
 *
 */
@Keep
public interface IViewDelegate {

    BaseFragment getFragment(String name);

    View getView(String name);

}
