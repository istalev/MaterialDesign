package com.example.ivan.materialdesign;

import android.view.LayoutInflater;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private final NavDrawerActivity activity;

    public MainModule(NavDrawerActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public LayoutInflater provideLayoutInflater() {
        return LayoutInflater.from(activity);
    }

    @Provides
    @Named("NUM_TABS")
    public int provideNumberOfTabs() {
        return NavDrawerActivity.NUM_TABS;
    }
}
