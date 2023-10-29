package com.example.dagerhilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


//@InstallIn(SingletonComponent::class)
//@Module
//abstract class AdminModule {
//
//    @Binds
//    abstract fun saveInfoToSqlRepo(saveInfoToSql: SaveInfoToSql): SaveUserInfo
//
//}


// we are using already userModule that why we have to comment out this other wise duplicate bindings error shows