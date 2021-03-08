package com.example.dagger2learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.dagger2learn.databinding.ActivityMainBinding
import com.example.dagger2learn.viewmodels.MainViewModel
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel.data.observe(this, Observer {
//            Picasso.with(this)
//                .load(it.photos[0].img_src)
//                .error(R.drawable.ic_launcher_background)
//                .into(binding.imageView)
//            binding.idInput.text=it.photos[0].id.toString()
//            Toast.makeText(this,"${it.photos[0].id}",Toast.LENGTH_SHORT).show()
        })
        binding.getDataButton.setOnClickListener {
            viewModel.getData()
        }
        setContentView(binding.root)
    }
}