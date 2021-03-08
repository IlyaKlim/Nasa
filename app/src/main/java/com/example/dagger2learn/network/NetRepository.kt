package com.example.dagger2learn.network

import com.example.dagger2learn.network.retrofit2.Api
import com.example.dagger2learn.network.retrofit2.ResponseModule
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NetRepository(private val api: Api) {
    fun getData():Flow<ResponseModule> = flow {
        emit(api.getData())
    }
}