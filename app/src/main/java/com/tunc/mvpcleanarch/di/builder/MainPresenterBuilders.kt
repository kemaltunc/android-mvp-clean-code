package com.tunc.mvpcleanarch.di.builder

import com.tunc.mvpcleanarch.domain.usecase.Post.PostUseCase
import com.tunc.mvpcleanarch.presentation.ui.main.MainActivity
import com.tunc.mvpcleanarch.presentation.ui.main.MainContract
import com.tunc.mvpcleanarch.presentation.ui.main.MainPresenter
import com.tunc.mvpcleanarch.domain.repository.PostRepository
import dagger.Module
import dagger.Provides

@Module
class MainPresenterBuilders {

    @Provides
    fun providesMainPresenter(postUseCase: PostUseCase): MainContract.Presenter {
        return MainPresenter<MainContract.View>(postUseCase)
    }

    @Provides
    fun providesMainView(mainActivity: MainActivity): MainContract.View {
        return mainActivity
    }

    @Provides
    fun provideGetPostsUseCase(
        postsRepository: PostRepository
    ): PostUseCase {
        return PostUseCase(postsRepository)
    }
}