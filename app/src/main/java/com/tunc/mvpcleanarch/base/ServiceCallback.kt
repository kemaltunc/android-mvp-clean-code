package com.tunc.mvpcleanarch.base


interface ServiceCallback<T> {

    fun onSuccess(response: T?)
    fun onError(errorCode: Int, errorMessage: String)
}