package com.androiddevs.mvvmnewsapp.myApp.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)