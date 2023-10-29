package com.example.dagerhilt

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(val loggerService: LoggerService){

    fun saveUser(email:String,pass:String){
        Log.d("tag","User saved with db $email")
        loggerService.log("EXAMPLE")
    }
}


//when we are passing a class in a constructor then its called constructor injection
//the constructor injection will create the object of that class


