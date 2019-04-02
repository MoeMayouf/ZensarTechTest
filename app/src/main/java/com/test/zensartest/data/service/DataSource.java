package com.test.zensartest.data.service;

import com.test.zensartest.data.model.ZensarProducts;

import io.reactivex.Observable;

public interface DataSource {

    Observable<ZensarProducts> getProducts();

}
