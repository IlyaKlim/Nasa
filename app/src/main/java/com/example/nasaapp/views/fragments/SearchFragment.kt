package com.example.nasaapp.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nasaapp.databinding.FragmentSearchBinding
import com.example.nasaapp.views.adaptors.PhotosListAdapter
import com.example.nasaapp.views.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class SearchFragment : Fragment() {
    private lateinit var mBinding:FragmentSearchBinding
    private val viewModel:MainViewModel by sharedViewModel()
    private val adapter:PhotosListAdapter= PhotosListAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel.getData()
        initFields()
        viewModel.data.observe(viewLifecycleOwner,{
           adapter.setData(it.photos)
        })
        return mBinding.root
    }
    private fun initFields(){
        mBinding=FragmentSearchBinding.inflate(layoutInflater)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        mBinding.photosList.adapter=adapter
        mBinding.photosList.layoutManager=LinearLayoutManager(mBinding.root.context)
        mBinding.photosList.setItemViewCacheSize(20)
    }

}