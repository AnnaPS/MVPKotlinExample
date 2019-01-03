package com.novadev.mvpkotlinexample.view

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}