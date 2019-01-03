package com.novadev.mvpkotlinexample.presenter

import com.novadev.mvpkotlinexample.model.User
import com.novadev.mvpkotlinexample.view.ILoginView

class LoginPresenter(iLoginView: ILoginView) : ILoginPresenter {

    private val loginView: ILoginView = iLoginView
    override fun onLogin(email: String, pass: String) {
        val user = User(email, pass)
        val loginCode: Int = user.isValidData()

        when (loginCode) {
            0 -> loginView.onLoginError("Debes rellenar el email")
            1 -> loginView.onLoginError("Debes escribir un email valido")
            2 -> loginView.onLoginError("La contraseña debe tener al menos 6 caracteres")
            -1 -> loginView.onLoginSuccess("Login iniciado con exito")
        }
    }
}