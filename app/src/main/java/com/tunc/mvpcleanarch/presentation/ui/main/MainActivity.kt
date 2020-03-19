package com.tunc.mvpcleanarch.presentation.ui.main

import android.os.Bundle
import com.tunc.mvpcleanarch.R
import com.tunc.mvpcleanarch.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {


    @Inject
    lateinit var presenter: MainPresenter<MainContract.View>

    override fun layoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.onAttach(this)

        presenter.getPosts()
    }
}
