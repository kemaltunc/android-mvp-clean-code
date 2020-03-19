package com.tunc.mvpcleanarch.di.components

import com.tunc.mvpcleanarch.MainApplication
import com.tunc.mvpcleanarch.di.modules.ActivityInjectorModules
import com.tunc.mvpcleanarch.di.modules.AppModule
import com.tunc.mvpcleanarch.di.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityInjectorModules::class,
        NetworkModule::class

    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: MainApplication): Builder

        fun build(): AppComponent

    }

    fun inject(app: MainApplication)
}