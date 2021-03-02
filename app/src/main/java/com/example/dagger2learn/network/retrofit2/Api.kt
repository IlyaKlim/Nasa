package com.example.dagger2learn.network.retrofit2

import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("user")
    suspend fun getData():Response<TestDao>
}