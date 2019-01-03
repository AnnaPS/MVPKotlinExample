package com.novadev.mvpkotlinexample

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.novadev.mvpkotlinexample.presenter.LoginPresenter
import com.novadev.mvpkotlinexample.view.ILoginView
import com.shashank.sony.fancytoastlib.FancyToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity(), ILoginView {


    private val loginPresenter = LoginPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonEnviar.setOnClickListener { onClickSendButton() }

    }

    private fun onClickSendButton() {

        loginPresenter.onLogin(editTextEmail.text.toString(), editTextPass.text.toString())

    }


    override fun onLoginError(message: String) {
        FancyToast.makeText(this, message, FancyToast.LENGTH_LONG, FancyToast.ERROR, true).show()
    }

    override fun onLoginSuccess(message: String) {
        FancyToast.makeText(this, message, FancyToast.LENGTH_LONG, FancyToast.SUCCESS, true).show()
    }

}
