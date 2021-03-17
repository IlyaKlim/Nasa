package com.example.nasaapp.data.utils

import com.example.nasaapp.data.Model
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable

interface NetRepository {
    fun getData(): Flowable<Model>
}