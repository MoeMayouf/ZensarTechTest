package com.test.zensartest.data.service;

import com.test.zensartest.data.model.Product;

import io.reactivex.Observable;

public class DataSourceImpl implements DataSource {

    private final ZensarService zensarService;

    public DataSourceImpl(ZensarService zensarService) {
        this.zensarService = zensarService;
    }

    @Override
    public Observable<Product> getAlbums() {
        return zensarService.getProducts();
    }
}
