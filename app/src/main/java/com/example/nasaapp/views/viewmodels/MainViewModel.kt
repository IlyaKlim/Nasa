package com.example.nasaapp.views.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.nasaapp.data.Model
import com.example.nasaapp.logic.utils.Domain

class MainViewModel(private val domain: Domain) : ViewModel() {
    var data = MutableLiveData<Model>()
    fun getData() {
        domain.getData().doOnNext {
            data.postValue(it)
        }.subscribe()
    }

}