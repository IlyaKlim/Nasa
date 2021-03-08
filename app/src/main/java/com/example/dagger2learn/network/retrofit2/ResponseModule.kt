package com.example.dagger2learn.network.retrofit2

import com.google.gson.annotations.SerializedName

data class TestDao(
    @SerializedName("userId")
    var userId: String,
    @SerializedName("userName")
    var userName: String)