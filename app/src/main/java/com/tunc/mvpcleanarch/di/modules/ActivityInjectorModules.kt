package com.tunc.mvpcleanarch.di.modules

import com.tunc.mvpcleanarch.di.builder.MainPresenterBuilders
import com.tunc.mvpcleanarch.presentation.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityInjectorModules {


    @ContributesAndroidInjector(
        modules = [
            MainPresenterBuilders::class
        ]
    )
    fun mainActivityInjecter(): MainActivity
}
