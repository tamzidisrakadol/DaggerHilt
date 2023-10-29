package com.example.dagerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named


@InstallIn(SingletonComponent::class)
@Module
class UserModule {

    @Provides
    @Named("Firebase")
    fun provideFirebaseRepo():SaveUserInfo{
        return SaveInfoToFirebase()
    }

    @Provides
    @SqlAnnotation
    fun provideSqlRepo():SaveUserInfo{
        return SaveInfoToSql()
    }


}


//we are creating modules for handling interface
//we have attach these module with component by @InstallIn
//there are 3 types of pre-defined components in Hilt -> ( A bag of object is called component)
//1.Singleton component -> which is application level component
//2.Activity component -> which is activity level component
//3.Fragment component -> which is fragment level component

//as we are saving into module that SaveUserInfo will return
// SaveInfoToFirebase() and that why it will return only the value of  one function not 2

// Incase if we are using provides and bind with same interface there will be runtime compile time error Duplicate binding
// For this error we have to use @Qualifier ->  @Name -> we will create our own annotation for avoiding typos