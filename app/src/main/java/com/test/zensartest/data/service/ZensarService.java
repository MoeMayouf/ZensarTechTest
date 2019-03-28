package com.test.zensartest.data.service;

import com.test.zensartest.data.model.ZensarProduct;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ZensarService {


    @GET("/products")
    Observable<ZensarProduct> getProducts();
}
