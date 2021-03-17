package com.example.nasaapp.di

import com.example.nasaapp.data.Api
import com.example.nasaapp.data.Repository
import com.example.nasaapp.data.utils.NetRepository
import com.example.nasaapp.logic.NasaDomain
import com.example.nasaapp.logic.utils.Domain
import com.example.nasaapp.views.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    fun provideApi(): Api {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build().create(Api::class.java)
    }
    factory <Domain> { NasaDomain(get()) }
    single { provideApi() }
    factory <NetRepository> { Repository(get()) }
    viewModel { MainViewModel(get()) }
}