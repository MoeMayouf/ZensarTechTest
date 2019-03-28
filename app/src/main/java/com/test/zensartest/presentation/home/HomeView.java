package com.test.zensartest.presentation.home;


import com.test.zensartest.data.model.Product;
import com.test.zensartest.presentation.base.MvpView;

public interface HomeView extends MvpView {
    void displayProducts(Product albums);

    void displayError(String errorMessage);

    void displayProgressbar();
}
