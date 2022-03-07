package com.example.newsinmvvm.ui

import androidx.lifecycle.ViewModel
import com.example.newsinmvvm.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}