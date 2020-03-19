package com.tunc.mvpcleanarch.base


open class BasePresenter<V : MvpView> : MvpPresenter<V> {

    lateinit var mvpView: V

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }
}

