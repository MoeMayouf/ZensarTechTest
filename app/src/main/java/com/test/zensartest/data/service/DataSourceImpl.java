package com.test.zensartest.data.service;

import com.test.zensartest.data.model.ZensarProducts;

import io.reactivex.Observable;

public class DataSourceImpl implements DataSource {

    private final ZensarService zensarService;

    public DataSourceImpl(ZensarService zensarService) {
        this.zensarService = zensarService;
    }

    @Override
    public Observable<ZensarProducts> getProducts() {
        return zensarService.getProducts();
    }
}
