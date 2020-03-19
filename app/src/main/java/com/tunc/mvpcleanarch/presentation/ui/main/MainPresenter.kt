package com.tunc.mvpcleanarch.presentation.ui.main

import android.util.Log
import com.tunc.mvpcleanarch.base.BasePresenter
import com.tunc.mvpcleanarch.base.BaseResponseCallback
import com.tunc.mvpcleanarch.data.model.response.TodoResponse
import com.tunc.mvpcleanarch.domain.usecase.Post.PostUseCase
import javax.inject.Inject

class MainPresenter<V : MainContract.View> @Inject constructor(private val postUseCase: PostUseCase) :
    MainContract.Presenter,
    BasePresenter<V>() {

    fun getPosts() {
        postUseCase.getTodos(object : BaseResponseCallback<List<TodoResponse>>(mvpView) {
            override fun onSuccess(response: List<TodoResponse>?) {
                super.onSuccess(response)
                Log.d("responseeee",response.toString())
            }
        })
    }
}