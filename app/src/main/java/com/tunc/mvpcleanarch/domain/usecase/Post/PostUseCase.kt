package com.tunc.mvpcleanarch.domain.usecase.Post

import com.tunc.mvpcleanarch.base.ApiRequest
import com.tunc.mvpcleanarch.base.BaseResponseCallback
import com.tunc.mvpcleanarch.data.model.response.TodoResponse
import com.tunc.mvpcleanarch.domain.repository.PostRepository
import javax.inject.Inject

class PostUseCase @Inject constructor(private val postDataSource: PostRepository) {

    fun getTodos(callback: BaseResponseCallback<List<TodoResponse>>) {
        ApiRequest().execute(postDataSource.getTodos(), callback)
    }
}

