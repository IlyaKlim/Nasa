package com.example.nasaapp.data

import com.example.nasaapp.data.utils.NetRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers.io

class Repository(private val api: Api) : NetRepository {
    override fun getData(): Flowable<Model> {
        return api.get()
            .subscribeOn(io())
            .observeOn(AndroidSchedulers.mainThread())
    }

}