package com.mahmoud.dagger.user;


import com.mahmoud.dagger.Singleton
import javax.inject.Inject

@Singleton
public class UserManeger @Inject constructor(private val storage: Int) {

}
