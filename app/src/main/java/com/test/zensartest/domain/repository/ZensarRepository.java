package com.test.zensartest.domain.repository;

import com.test.zensartest.data.model.ZensarProduct;
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
    public Observable<ZensarProduct> getAlbums() {
        return dataSource.getAlbums()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
