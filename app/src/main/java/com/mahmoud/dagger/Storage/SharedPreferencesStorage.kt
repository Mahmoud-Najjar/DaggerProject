package com.mahmoud.dagger.Storage;

import android.content.Context;

import com.mahmoud.dagger.Inject;

public class SharedPreferencesStorage @Inject constructor(context:Context) : Storage {
    override fun setString(key: String, value: String) {
        TODO("Not yet implemented")
    }

    override fun getString(key: String): String {
        TODO("Not yet implemented")
    }


}