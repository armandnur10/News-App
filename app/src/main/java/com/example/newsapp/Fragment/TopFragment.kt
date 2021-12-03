package com.example.newsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.DataNews
import com.example.newsapp.NewsAdapter
import com.example.newsapp.R
import com.example.newsapp.bindingNewsHeadline
import com.example.newsapp.databinding.FragmentPopularBinding
import com.example.newsapp.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    private lateinit var binding : FragmentTopBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)
        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }

        bindingNewsHeadline(binding.newsHeadline,position = 2)
        return binding.root
    }
}