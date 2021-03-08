package com.example.dagger2learn.network.retrofit2

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("photos?sol=0&page=1&api_key=TBb12gbPHXfVOSyQbM03At8zPok008AoftZhctEB")
    suspend fun getData():ResponseModule
}