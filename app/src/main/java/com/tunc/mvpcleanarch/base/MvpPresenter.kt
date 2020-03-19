package com.tunc.mvpcleanarch.base

interface MvpPresenter<V : MvpView> {
    fun onAttach(mvpView: V)
}
