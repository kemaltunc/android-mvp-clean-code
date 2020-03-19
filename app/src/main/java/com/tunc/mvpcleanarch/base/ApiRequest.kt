package com.tunc.mvpcleanarch.base

import android.annotation.SuppressLint
import com.tunc.mvpcleanarch.data.remote.ApiErrorHandle
import com.tunc.mvpcleanarch.domain.usecase.base.UseCase
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ApiRequest : UseCase() {
    @SuppressLint("CheckResult")

    fun <T> execute(
        observable: Single<T>,
        callback: BaseResponseCallback<T>
    ) {
        disposeLast()
        observable
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(onNext(callback)) {
                ApiErrorHandle.traceErrorException(it)
                    .let { trace -> callback.onError(trace.code!!, trace.message!!) }
            }


        lastDisposable?.let {
            compositeDisposable.add(it)
        }
    }

    fun <T> onNext(callback: BaseResponseCallback<T>): (T) -> Unit = { result ->
        callback.onSuccess(result)
    }
}
