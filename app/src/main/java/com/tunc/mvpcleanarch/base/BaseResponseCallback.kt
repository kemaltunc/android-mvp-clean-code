package com.tunc.mvpcleanarch.base

import android.util.Log


abstract class BaseResponseCallback<R> constructor(
    private val mvpView: MvpView
) : ServiceCallback<R> {

    override fun onSuccess(response: R?) {
        Log.d("successs","sucesss")
    }

    override fun onError(errorCode: Int, errorMessage: String) {
        Log.d("errorrrr", errorMessage)
    }
}
