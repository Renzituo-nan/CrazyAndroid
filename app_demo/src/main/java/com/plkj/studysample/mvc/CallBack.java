package com.plkj.studysample.mvc;

/**
 * Created by Renzituo
 * on 2020-05-20
 */
public interface CallBack {
    void onSucceed(String data);

    void onFail(String message);
}
