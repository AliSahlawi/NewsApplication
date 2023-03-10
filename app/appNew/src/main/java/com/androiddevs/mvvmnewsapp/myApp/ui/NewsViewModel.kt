package com.androiddevs.mvvmnewsapp.myApp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse
import com.androiddevs.mvvmnewsapp.myApp.repository.NewsRepository
import com.androiddevs.mvvmnewsapp.myApp.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

    val breakingNews : MutableLiveData<Resource<NewsResponse>> =  MutableLiveData()
    var breakingNewsPage = 1
    val searchNews : MutableLiveData<Resource<NewsResponse>> =  MutableLiveData()
    var searchNewsPage = 1
    init {
        getBreakingNews("us")
    }

    fun getBreakingNews(countryCode: String) = viewModelScope.launch {
        breakingNews.postValue(Resource.Loading())
        val response = newsRepository.getBreakingNews(countryCode,breakingNewsPage)
        breakingNews.postValue(handleBreakingNewsResponse(response))
    }

    fun searchNews(searQuery: String) = viewModelScope.launch {
        searchNews.postValue(Resource.Loading())
        val response =  newsRepository.searchNews(searQuery, searchNewsPage)
        searchNews.postValue(handleSearchNewsResponse(response))
    }
    private fun handleBreakingNewsResponse(response: Response<NewsResponse>) : Resource<NewsResponse>{
        if (response.isSuccessful){
            response.body()?.let {
                resultResponse -> return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    private fun handleSearchNewsResponse(response: Response<NewsResponse>) : Resource<NewsResponse>{
        if (response.isSuccessful){
            response.body()?.let {
                    resultResponse -> return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }
}