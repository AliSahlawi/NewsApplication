package com.androiddevs.mvvmnewsapp.myApp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androiddevs.mvvmnewsapp.myApp.repository.NewsRepository

class NewsViewModelProvideFactory (
    val newsRepository: NewsRepository
    ): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}