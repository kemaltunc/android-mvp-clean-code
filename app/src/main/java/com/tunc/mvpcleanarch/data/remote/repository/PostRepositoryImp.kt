package com.tunc.mvpcleanarch.data.remote.repository

import com.tunc.mvpcleanarch.data.model.response.TodoResponse
import com.tunc.mvpcleanarch.data.remote.services.PostServices
import com.tunc.mvpcleanarch.domain.repository.PostRepository
import io.reactivex.Single


class PostRepositoryImp(private val postServices: PostServices) : PostRepository {
    override fun getTodos(): Single<List<TodoResponse>> = postServices.getTodos()
    override fun getSingleTodo(todoId: String) = postServices.getSingleTodo(todoId)
}
