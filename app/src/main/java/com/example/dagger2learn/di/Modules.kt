package com.example.dagger2learn.di

import com.example.dagger2learn.net.Api
import com.example.dagger2learn.net.Repository
import com.example.dagger2learn.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    fun provideApi(): Api {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://10.0.0.2:3000")
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build().create(Api::class.java)
    }
    factory { provideApi() }
    single { Repository(get()) }
    viewModel { MainViewModel(get()) }
}