package com.test.zensartest.presentation.home;


import com.test.zensartest.data.model.ZensarProducts;
import com.test.zensartest.presentation.base.MvpView;

public interface HomeView extends MvpView {
    void displayProducts(ZensarProducts albums);

    void displayError(String errorMessage);

    void displayProgressbar();
}
