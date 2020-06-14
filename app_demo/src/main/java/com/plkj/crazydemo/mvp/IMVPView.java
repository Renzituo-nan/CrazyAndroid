package com.plkj.crazydemo.mvp;

/**
 * Created by Renzituo
 * on 2020-05-20
 * View层
 * 以接口的形式让Activity负责视图功能
 */
interface IMVPView {
    void onGetSucceed(String data);
    void onGetFail(String message);
}
