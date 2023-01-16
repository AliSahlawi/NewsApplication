package com.androiddevs.mvvmnewsapp.myApp.repository

import com.androiddevs.mvvmnewsapp.myApp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.myApp.db.ArticleDataBase

class NewsRepository(
    val db : ArticleDataBase
) {

    suspend fun getBreakingNews(countryCode: String,pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun getPaymentHistory() =
        RetrofitInstance.api.getPaymentHistory()

}