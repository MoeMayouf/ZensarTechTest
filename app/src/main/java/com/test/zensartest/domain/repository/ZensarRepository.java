package com.test.zensartest.domain.repository;

import com.test.zensartest.data.model.ZensarProducts;
import com.test.zensartest.data.service.DataSource;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ZensarRepository implements DataSource {

    private final DataSource dataSource;

    public ZensarRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Observable<ZensarProducts> getProducts() {
        return dataSource.getProducts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
