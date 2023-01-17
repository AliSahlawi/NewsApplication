package com.androiddevs.mvvmnewsapp.myApp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002J\u000e\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001aR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/androiddevs/mvvmnewsapp/myApp/ui/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/androiddevs/mvvmnewsapp/myApp/repository/NewsRepository;", "(Lcom/androiddevs/mvvmnewsapp/myApp/repository/NewsRepository;)V", "breakingNews", "Landroidx/lifecycle/MutableLiveData;", "Lcom/androiddevs/mvvmnewsapp/myApp/util/Resource;", "Lcom/androiddevs/mvvmnewsapp/myApp/models/NewsResponse;", "getBreakingNews", "()Landroidx/lifecycle/MutableLiveData;", "breakingNewsPage", "", "getBreakingNewsPage", "()I", "setBreakingNewsPage", "(I)V", "getNewsRepository", "()Lcom/androiddevs/mvvmnewsapp/myApp/repository/NewsRepository;", "searchNews", "getSearchNews", "searchNewsPage", "getSearchNewsPage", "setSearchNewsPage", "Lkotlinx/coroutines/Job;", "countryCode", "", "handleBreakingNewsResponse", "response", "Lretrofit2/Response;", "handleSearchNewsResponse", "searQuery", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.myApp.util.Resource<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse>> breakingNews = null;
    private int breakingNewsPage = 1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.myApp.util.Resource<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse>> searchNews = null;
    private int searchNewsPage = 1;
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.mvvmnewsapp.myApp.repository.NewsRepository newsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.myApp.util.Resource<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse>> getBreakingNews() {
        return null;
    }
    
    public final int getBreakingNewsPage() {
        return 0;
    }
    
    public final void setBreakingNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.myApp.util.Resource<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse>> getSearchNews() {
        return null;
    }
    
    public final int getSearchNewsPage() {
        return 0;
    }
    
    public final void setSearchNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searQuery) {
        return null;
    }
    
    private final com.androiddevs.mvvmnewsapp.myApp.util.Resource<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse> handleBreakingNewsResponse(retrofit2.Response<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse> response) {
        return null;
    }
    
    private final com.androiddevs.mvvmnewsapp.myApp.util.Resource<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse> handleSearchNewsResponse(retrofit2.Response<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.mvvmnewsapp.myApp.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.myApp.repository.NewsRepository newsRepository) {
        super();
    }
}