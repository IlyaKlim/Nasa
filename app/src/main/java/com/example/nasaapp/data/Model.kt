package com.example.nasaapp.data


import com.google.gson.annotations.SerializedName

data class Model(
    var photos: MutableList<Photos>
)

data class Photos(
    var id: Int,
    var sol: Int,
    var camera: Camera,
    @SerializedName("img_src")
    var imageSrc: String,
    @SerializedName("earth_date")
    var earthDate: String,
    var rover: Rover
)

data class Camera(
    var id: Int,
    var name: String,
    @SerializedName("rover_id")
    var roverId: Int,
    @SerializedName("full_name")
    var fullName: String
)

data class Rover(
    var id: Int,
    var name: String,
    @SerializedName("landing_date")
    var landingDate: String,
    @SerializedName("launch_date")
    var launchDate: String,
    var status: String
)