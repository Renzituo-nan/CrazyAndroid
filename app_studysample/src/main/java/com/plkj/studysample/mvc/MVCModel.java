package com.plkj.studysample.mvc;

import java.util.Random;

/**
 * Created by Renzituo
 * on 2020-05-20
 * Model层，操作数据
 */
public class MVCModel {
    public void getDataFromNet(CallBack callBack){
        int random = new Random(10).nextInt();
        if (random>5)
        callBack.onSucceed(null);
        else callBack.onFail("请求错误");
    }
}
