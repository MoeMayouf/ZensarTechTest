package com.test.zensartest.domain.di;

import android.app.Application;

import com.test.zensartest.common.ZensarApplication;
import com.test.zensartest.presentation.home.HomeModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, HomeModule.class, BuildersModule.class,
        NetworkModule.class, RepositoryModule.class})
@Singleton
public interface AppComponent {
    void inject(ZensarApplication zensarApplication);

    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
