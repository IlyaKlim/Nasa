package com.example.dagger2learn.network

import com.example.dagger2learn.network.retrofit2.Api
import com.example.dagger2learn.network.retrofit2.TestDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class NetRepository(private val api: Api) {
    fun getData():Flow<Response<TestDao>> = flow {
        emit(api.getData())
    }
}