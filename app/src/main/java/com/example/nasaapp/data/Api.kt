package com.example.nasaapp.data

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface Api {
    @GET("photos?sol=0&page=1&api_key=TBb12gbPHXfVOSyQbM03At8zPok008AoftZhctEB")
    fun get():Flowable<Model>
}