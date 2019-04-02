package com.test.zensartest.data.service;

import com.test.zensartest.data.model.ZensarProducts;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ZensarService {


    @GET("v1/categories/600001506/products")
    Observable<ZensarProducts> getProducts();
}
