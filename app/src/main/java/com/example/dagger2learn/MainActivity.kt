 package com.example.dagger2learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2learn.databinding.ActivityMainBinding
import com.example.dagger2learn.net.Api
import com.example.dagger2learn.net.Repository
import com.example.dagger2learn.viewmodels.MainViewModel
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        viewModel.getData()
    }
}