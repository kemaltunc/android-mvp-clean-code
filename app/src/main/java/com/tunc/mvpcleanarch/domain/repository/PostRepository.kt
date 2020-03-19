package com.tunc.mvpcleanarch.domain.repository

import com.tunc.mvpcleanarch.data.model.response.TodoResponse
import io.reactivex.Single

interface PostRepository {
    fun getTodos(): Single<List<TodoResponse>>
    fun getSingleTodo(todoId: String): Single<TodoResponse>
}