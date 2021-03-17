package com.example.nasaapp.logic

import com.example.nasaapp.data.Model
import com.example.nasaapp.data.utils.NetRepository
import com.example.nasaapp.logic.utils.Domain
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable

class NasaDomain(private val repository: NetRepository):Domain {
   override fun getData():Flowable<Model>{
        return repository.getData()
            .map {
                doSomeWork(it)
            }
    }

    private fun doSomeWork(model: Model):Model{
        return model
    }

}