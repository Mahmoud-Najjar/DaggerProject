package com.mahmoud.dagger.registraion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.mahmoud.dagger.MyApplication
import javax.inject.Inject

class RegistrationActivity:AppCompatActivity() {

    @Inject
    lateinit var registrationViewModel:RegistrationViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)


    }
}