package com.example.dagerhilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //    @Inject
//    lateinit var userRepository: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //    userRepository.saveUser("tam@gmail.com","tamz121")
    }
}


//we have to use @AndroidEntryPoint in Activity
//in case if we are using fragemnts we have set @AndroidEntryPoint in every fragment and that activity too.