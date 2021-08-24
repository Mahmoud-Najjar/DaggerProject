package com.mahmoud.dagger.registraion

import android.os.UserManager
import androidx.lifecycle.ViewModel
import com.mahmoud.dagger.Inject

class RegistrationViewModel @Inject constructor(val userManager: UserManager) {
}