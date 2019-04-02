package com.test.zensartest.domain.di.products;


import com.test.zensartest.presentation.home.HomeActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HomeActivityModule {
    @HomeScope
    @Binds
    abstract HomeActivity provideHomeActivity(HomeActivity homeActivity);
}
