package com.test.zensartest.domain.di;

import com.test.zensartest.data.service.DataSource;
import com.test.zensartest.domain.repository.ZensarRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Repository
    @Singleton
    DataSource provideZensarRespository(DataSource dataSource) {
        return new ZensarRepository(dataSource);
    }
}
