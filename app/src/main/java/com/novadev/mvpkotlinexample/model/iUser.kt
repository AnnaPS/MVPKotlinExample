package com.novadev.mvpkotlinexample.model

interface iUser {
    fun getEmail() : String
    fun getPass(): String
    fun isValidData() : Int
}