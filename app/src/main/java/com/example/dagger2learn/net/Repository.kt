package com.example.dagger2learn.net

class Repository(private val api:Api) {
    fun getData(){
        api.get().subscribe{

        }
    }
}