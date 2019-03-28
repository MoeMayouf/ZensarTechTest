package com.test.zensartest.data.service;

import com.test.zensartest.data.model.ZensarProduct;

import io.reactivex.Observable;

public interface DataSource {

    Observable<ZensarProduct> getAlbums();

}
