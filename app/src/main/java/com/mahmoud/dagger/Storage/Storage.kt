package com.mahmoud.dagger.Storage

interface Storage {
    fun setString(key: String, value: String)
    fun getString(key: String): String
}