package com.mahmoud.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserManager
import com.mahmoud.dagger.Main.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var registrationViewModel: MainViewModel
    @Inject
    lateinit var userManager: UserManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).appComponent.inject(this)
    }
}

