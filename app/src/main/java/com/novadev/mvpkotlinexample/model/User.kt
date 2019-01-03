package com.novadev.mvpkotlinexample.model

import android.text.TextUtils
import android.util.Patterns

class User (email: String, pass: String) : iUser {

    private var email : String = email
    private var pass : String = pass
    override fun getEmail(): String {
        return email
    }

    override fun getPass(): String {
        return pass
    }

    override fun isValidData(): Int {
        // check email is empty
        // check email is matches pattern
        // check pass lenght > 6


        if(TextUtils.isEmpty(getEmail()))
            return 0
        else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return 1
        else if(getPass().length < 6)
            return 2
        else
            return -1

    }


}