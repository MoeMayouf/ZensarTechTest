package com.test.zensartest.presentation.base;

public class BasePresenter<T extends MvpView> {
    private T mView;
    public void attach(T view){
        this.mView = view;
    }
    public void detach(){
        this.mView = null;
    }
    protected boolean isViewAttached(){
        return this.mView!=null;
    }

    protected T getView() {
        return mView;
    }

}
