package com.example.dagger2learn.viewmodels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dagger2learn.net.Repository

class MainViewModel(val repository:Repository): ViewModel() {
     private val data=MutableLiveData<Int>()
     fun getData(){}
}