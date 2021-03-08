package com.example.dagger2learn.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger2learn.network.NetRepository
import com.example.dagger2learn.network.retrofit2.ResponseModule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: NetRepository) : ViewModel() {
    var data = MutableLiveData<ResponseModule>()
    fun getData() {
        viewModelScope.launch {
            while (true) {
                delay(1000L)
                repository.getData().collect {
                    data.value = it
                }
            }
        }
    }
}