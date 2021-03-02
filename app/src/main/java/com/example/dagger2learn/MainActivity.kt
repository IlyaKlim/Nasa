package com.example.dagger2learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.dagger2learn.databinding.ActivityMainBinding
import com.example.dagger2learn.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel.data.observe(this, Observer {
            binding.userId.text = it.userId
            binding.userName.text = it.userName
        })
        binding.getDataButton.setOnClickListener {
            viewModel.getData()
        }
        setContentView(binding.root)
    }
}