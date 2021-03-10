package com.example.dagger2learn.network.retrofit2

import android.net.Uri
data class ResponseModule(
    val id:Int,
    val sol:Int,
    val camera:Camera,
    val img_src:Uri,
    val earth_date:String,
    val rover:Rover
)
data class Photos(
    val id:Int,
    val sol:Int,
    val camera:Camera,
    val img_src:Uri,
    val earth_date:String,
    val rover:Rover
)
data class Camera (
    val id:Int,
    val name:String,
    val rover_id:Int,
    val full_name:String
)
data class Rover(
    val id:Int,
    val name:String,
    val landing_date:String,
    val launch_date:String,
    val status:String
)