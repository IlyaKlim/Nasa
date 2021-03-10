package com.example.dagger2learn.viewmodels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
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
=======
import com.example.dagger2learn.net.Repository

class MainViewModel(val repository:Repository): ViewModel() {
     private val data=MutableLiveData<Int>()
     fun getData(){}
>>>>>>> b9b26898b41e7d10a969f4df9d446e65c3d932e1
}