package com.example.newsinmvvm.models

import com.example.newsinmvvm.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)