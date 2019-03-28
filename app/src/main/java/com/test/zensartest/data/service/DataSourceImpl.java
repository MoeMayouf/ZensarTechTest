package com.test.zensartest.data.service;

import com.test.zensartest.data.model.ZensarProduct;

import io.reactivex.Observable;

public class DataSourceImpl implements DataSource {

    private final ZensarService zensarService;

    public DataSourceImpl(ZensarService zensarService) {
        this.zensarService = zensarService;
    }

    @Override
    public Observable<ZensarProduct> getAlbums() {
        return zensarService.getProducts();
    }
}
