package com.test.zensartest.common;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class PaginationListener extends RecyclerView.OnScrollListener {
    private final LinearLayoutManager linearLayoutManager;
    private final PaginationStateListener listener;

    public PaginationListener(@NonNull LinearLayoutManager linearLayoutManager,
                              @NonNull PaginationStateListener paginationStateListener) {
        this.linearLayoutManager = linearLayoutManager;
        this.listener = paginationStateListener;
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        int visibleItemCount = linearLayoutManager.getChildCount();
        int totalCount = linearLayoutManager.getItemCount();
        int firstVisiblePosition = linearLayoutManager.findFirstVisibleItemPosition();

    }

    public interface PaginationStateListener {

        boolean isLoading();
    }
}
