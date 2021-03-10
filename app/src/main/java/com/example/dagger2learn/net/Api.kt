package com.example.dagger2learn.net

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface Api {
    @GET("/data")
    fun get():Observable<Model>
}