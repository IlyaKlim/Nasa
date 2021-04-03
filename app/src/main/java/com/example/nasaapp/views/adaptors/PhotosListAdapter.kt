package com.example.nasaapp.views.adaptors

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nasaapp.data.Photos
import com.example.nasaapp.databinding.MarsPhotosViewHolderBinding
import com.squareup.picasso.Picasso

class PhotosListAdapter() :
    RecyclerView.Adapter<PhotosListAdapter.PhotosViewHolder>() {
    private var photos: List<Photos> = emptyList<Photos>()

    class PhotosViewHolder(private val binding: MarsPhotosViewHolderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun setContent(photos: Photos) {
            binding.description.text="""
                | camera : ${photos.camera.name}
                | rover : ${photos.rover.name}
                | date : ${photos.earthDate}
            """.trimMargin()
            Picasso.get()
                .load(photos.imageSrc)
                .resize(600, 400)
                .into(binding.image)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        val binding =
            MarsPhotosViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotosViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        holder.setContent(photos = photos[position])

    }

    override fun getItemCount(): Int {
        return photos.size
    }

    fun setData(photos: List<Photos>) {
        this.photos = photos
        notifyDataSetChanged()
    }
}