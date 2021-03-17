package com.example.nasaapp.logic.utils

import com.example.nasaapp.data.Model
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable

interface Domain {
    fun getData(): Flowable<Model>
}