package com.example.dagerhilt

import android.util.Log
import javax.inject.Inject

interface SaveUserInfo {
   fun saveInfo(roll:Int=0,nid:Int=0,name:String="")
}

class SaveInfoToSql @Inject constructor():SaveUserInfo{
    override fun saveInfo(roll: Int, nid: Int, name: String) {
       Log.d("tag","Info save to Sql $nid")
    }

}


class SaveInfoToFirebase():SaveUserInfo{
    override fun saveInfo(roll: Int, nid: Int, name: String) {
        Log.d("tag","Info save to Firebase $nid")
    }

}



//As interface cannot create object so we have to module