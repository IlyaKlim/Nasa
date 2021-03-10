 package com.example.dagger2learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
=======
>>>>>>> b9b26898b41e7d10a969f4df9d446e65c3d932e1
import com.example.dagger2learn.databinding.ActivityMainBinding
import com.example.dagger2learn.net.Api
import com.example.dagger2learn.net.Repository
import com.example.dagger2learn.viewmodels.MainViewModel
<<<<<<< HEAD
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
=======
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import retrofit2.Retrofit
>>>>>>> b9b26898b41e7d10a969f4df9d446e65c3d932e1

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
<<<<<<< HEAD
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
=======

>>>>>>> b9b26898b41e7d10a969f4df9d446e65c3d932e1
        setContentView(binding.root)
        viewModel.getData()
    }
}