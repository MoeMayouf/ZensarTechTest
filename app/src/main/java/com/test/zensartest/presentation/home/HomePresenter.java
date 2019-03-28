package com.test.zensartest.presentation.home;

import android.util.Log;

import com.test.zensartest.data.model.Product;
import com.test.zensartest.data.service.DataSource;
import com.test.zensartest.presentation.base.BasePresenter;

import io.reactivex.disposables.CompositeDisposable;

public class HomePresenter extends BasePresenter<HomeView> {

    private final CompositeDisposable compositeDisposable;

    private final DataSource dataSource;

    private boolean isLoading;

    public HomePresenter(DataSource dataSource) {
        this.compositeDisposable = new CompositeDisposable();
        this.dataSource = dataSource;
    }

    public void getProducts(){
        getView().displayProgressbar();
        compositeDisposable.add(dataSource.getAlbums()
                .subscribe(this::handleSucess, this::handleError));
    }

    private void handleError(Throwable throwable) {
        getView().displayError(throwable.getLocalizedMessage());
    }

    private void handleSucess(Product product) {
        Log.d("success example", product.getPrice().getNow());
        getView().displayProducts(product);
    }

    boolean isLoading() {
        return isLoading;
    }
}
