package com.test.zensartest.data.service;

import com.test.zensartest.data.model.Product;

import io.reactivex.Observable;

public interface DataSource {

    Observable<Product> getAlbums();

}
