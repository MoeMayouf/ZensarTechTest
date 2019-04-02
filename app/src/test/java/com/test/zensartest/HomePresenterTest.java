package com.test.zensartest;


import com.test.zensartest.data.model.Product;
import com.test.zensartest.data.model.ZensarProducts;
import com.test.zensartest.domain.repository.ZensarRepository;
import com.test.zensartest.presentation.home.HomePresenter;
import com.test.zensartest.presentation.home.HomeView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HomePresenterTest {
    @Mock
    HomeView view;

    @Mock
    ZensarRepository dataSource;

    private HomePresenter presenter;

    private ZensarProducts resultsResponse;
    private List<Product> products = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new HomePresenter(dataSource);
        presenter.attach(view);

        resultsResponse = new ZensarProducts();
        Product product = new Product();
        products.add(product);
    }

    @Test
    public void successFetch() {
        //When
        when(dataSource.getProducts()).thenReturn(Observable.just(resultsResponse));
        //Call
        presenter.getProducts();
        //Verify
        verify(view).displayProgressbar();
        verify(view).displayProducts(resultsResponse);
    }

    @Test
    public void errorFetch() {
        //When
        String errorMessage = "My Exception";
        when(dataSource.getProducts()).thenReturn(Observable.error(new Throwable(errorMessage)));
        //Call
        presenter.getProducts();
        //Verify
        verify(view).displayProgressbar();
        verify(view).displayError(errorMessage);
    }

    @After
    public void tearDown() {
        presenter.detach();
    }

}
