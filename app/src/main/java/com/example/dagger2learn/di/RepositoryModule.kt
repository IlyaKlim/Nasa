package com.example.dagger2learn.di

import com.example.dagger2learn.network.NetRepository
import com.example.dagger2learn.network.retrofit2.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {
    @Provides
    fun providesNetRepository(api: Api)=NetRepository(api)
    @Provides
    fun provideService(gsonConverterFactory: GsonConverterFactory): Api = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/")
        .addConverterFactory(gsonConverterFactory)
        //.addCallAdapterFactory()
        .build()
        .create(Api::class.java)

    @Provides
    fun provideGsonConverterFactory():GsonConverterFactory= GsonConverterFactory.create()
}