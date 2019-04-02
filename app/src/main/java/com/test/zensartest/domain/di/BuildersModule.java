package com.test.zensartest.domain.di;

import com.test.zensartest.domain.di.products.HomeActivityModule;
import com.test.zensartest.domain.di.products.HomeScope;
import com.test.zensartest.presentation.home.HomeActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    @HomeScope
    abstract HomeActivity homeActivity();

}
