 package com.example.nasaapp.views

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.nasaapp.databinding.ActivityMainBinding
import com.example.nasaapp.views.viewmodels.MainViewModel
import org.koin.android.ext.android.inject

 class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel.data.observe(this,{
            binding.userId.text=it.photos[0].imageSrc
            Glide.with(this).load(Uri.parse(it.photos[0].imageSrc)).into(binding.imageView)

        })

        setContentView(binding.root)
        viewModel.getData()
    }
}