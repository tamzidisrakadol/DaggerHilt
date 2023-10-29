package com.example.dagerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class UserApplication : Application() {

    @Inject
    lateinit var userRepository: UserRepository // this is called field injection it will create the object when it needs

    @Inject
    @SqlAnnotation
    lateinit var saveUserInfo: SaveUserInfo

    override fun onCreate() {
        super.onCreate()
        userRepository.saveUser("israkAdol@gmail.com", "adol@")

        saveUserInfo.saveInfo(12,1125121,"Adol")

    }

}


//for using hilt we have to make first class which will extend Application class
//only in this class @HiltAndroidApp will user