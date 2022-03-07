package com.example.newsinmvvm.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.newsinmvvm.R
import com.example.newsinmvvm.ui.NewsActivity
import com.example.newsinmvvm.ui.NewsViewModel

class ArticlesFragment : Fragment(R.layout.fragment_articles) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}