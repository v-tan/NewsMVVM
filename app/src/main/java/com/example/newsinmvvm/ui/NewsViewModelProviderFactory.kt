package com.example.newsinmvvm.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsinmvvm.repository.NewsRepository

class NewsViewModelProviderFactory(
    private val newsRepository: NewsRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        NewsViewModel(newsRepository) as T

}