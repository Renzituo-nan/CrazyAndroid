package com.plkj.crazydemo.mvp;


import com.plkj.crazydemo.mvc.CallBack;

/**
 * Created by Renzituo
 * on 2020-05-20
 * Presenter层
 * 作为中间层持有View层与Model层引用
 */
public class MVPPresenter {
    private IMVPView IMVPView;
    private MVPModel mvpModel;
    public MVPPresenter(IMVPView IMVPView){
        this.IMVPView = IMVPView;
        mvpModel = new MVPModel();
    }

    public void getDataFromNet(){
        mvpModel.getDataFromNet(new CallBack() {
            @Override
            public void onSucceed(String data) {
                IMVPView.onGetSucceed(data);
            }

            @Override
            public void onFail(String message) {
                IMVPView.onGetFail(message);
            }
        });
    }
}
