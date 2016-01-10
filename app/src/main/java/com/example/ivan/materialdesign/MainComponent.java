package com.example.ivan.materialdesign;

import dagger.Component;

@ActivityScope
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(NavDrawerActivity activity);
}
