package com.codetoart.android.upcomingmovieapp.injection.component;

import android.app.Application;
import android.content.Context;

import com.codetoart.android.upcomingmovieapp.UpcomingMovieApplication;
import com.codetoart.android.upcomingmovieapp.data.DataManager;
import com.codetoart.android.upcomingmovieapp.data.local.PreferencesHelper;
import com.codetoart.android.upcomingmovieapp.data.remote.TMDbApi;
import com.codetoart.android.upcomingmovieapp.injection.ApplicationContext;
import com.codetoart.android.upcomingmovieapp.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mahavir on 9/1/16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(UpcomingMovieApplication application);

    @ApplicationContext
    Context context();
    Application application();
    TMDbApi tmdbApi();
    PreferencesHelper preferencesHelper();
    DataManager dataManager();
}