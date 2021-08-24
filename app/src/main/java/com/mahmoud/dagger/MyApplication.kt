package com.mahmoud.dagger

import AppComponent
import android.app.Application
import android.os.UserManager
import com.mahmoud.dagger.Storage.SharedPreferencesStorage



open class MyApplication : Application() {


    open fun intializeComponent(): AppComponent {
        DaggerAppComponent.factory().create(applicationContext)
    }


}