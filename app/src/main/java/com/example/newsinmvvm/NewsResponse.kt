package com.example.newsinmvvm

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)