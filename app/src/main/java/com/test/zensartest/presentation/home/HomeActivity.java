package com.test.zensartest.presentation.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.test.zensartest.R;
import com.test.zensartest.common.PaginationListener;
import com.test.zensartest.data.model.ZensarProducts;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class HomeActivity extends AppCompatActivity implements PaginationListener.PaginationStateListener, HomeView {

    @Inject
    HomePresenter homePresenter;
    ProductsAdapter productsAdapter;

    @BindView(R.id.tv_message)
    TextView tvMessage;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @BindView(R.id.ll_message_container)
    LinearLayout llMessageContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        productsAdapter = new ProductsAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(productsAdapter);
        recyclerView.addOnScrollListener(new PaginationListener(linearLayoutManager, this));
        homePresenter.attach(this);
        homePresenter.getProducts();
    }

    @Override
    public void displayProducts(ZensarProducts albums) {
        llMessageContainer.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);
        productsAdapter.addAll(albums.getProducts());
    }

    @Override
    public void displayError(String errorMessage) {
        llMessageContainer.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);
        tvMessage.setText(errorMessage);
    }

    @Override
    public void displayProgressbar() {
        recyclerView.setVisibility(View.GONE);
        llMessageContainer.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean isLoading() {
        return homePresenter.isLoading();
    }
}
