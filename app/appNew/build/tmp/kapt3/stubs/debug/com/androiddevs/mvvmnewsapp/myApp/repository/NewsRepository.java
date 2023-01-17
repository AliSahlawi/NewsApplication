package com.androiddevs.mvvmnewsapp.myApp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/androiddevs/mvvmnewsapp/myApp/repository/NewsRepository;", "", "db", "Lcom/androiddevs/mvvmnewsapp/myApp/db/ArticleDataBase;", "(Lcom/androiddevs/mvvmnewsapp/myApp/db/ArticleDataBase;)V", "getDb", "()Lcom/androiddevs/mvvmnewsapp/myApp/db/ArticleDataBase;", "getBreakingNews", "Lretrofit2/Response;", "Lcom/androiddevs/mvvmnewsapp/myApp/models/NewsResponse;", "countryCode", "", "pageNumber", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchNews", "searchQuery", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.mvvmnewsapp.myApp.db.ArticleDataBase db = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.androiddevs.mvvmnewsapp.myApp.models.NewsResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.mvvmnewsapp.myApp.db.ArticleDataBase getDb() {
        return null;
    }
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.myApp.db.ArticleDataBase db) {
        super();
    }
}