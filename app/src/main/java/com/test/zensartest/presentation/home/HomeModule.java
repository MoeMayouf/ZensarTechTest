package com.test.zensartest.presentation.home;


import com.test.zensartest.data.service.DataSource;
import com.test.zensartest.domain.di.Repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

    @Singleton
    @Provides
    public HomePresenter provideHomePresenter(@Repository DataSource repository) {
        return new HomePresenter(repository);
    }
}

