package com.test.zensartest.data.service;

import com.test.zensartest.data.model.Product;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ZensarService {


    @GET("/products")
    Observable<Product> getProducts();
}
