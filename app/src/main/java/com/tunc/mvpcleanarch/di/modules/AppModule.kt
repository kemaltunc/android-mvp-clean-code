package com.tunc.mvpcleanarch.di.modules

import android.app.Application
import android.content.Context
import com.tunc.mvpcleanarch.MainApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: MainApplication): Application = app

    @Provides
    @Singleton
    fun provideApplicationContext(app: MainApplication): Context = app.applicationContext

}