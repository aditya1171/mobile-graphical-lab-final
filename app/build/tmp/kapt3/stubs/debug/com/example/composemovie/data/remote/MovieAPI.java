package com.example.composemovie.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/composemovie/data/remote/MovieAPI;", "", "getMovieDetail", "Lcom/example/composemovie/data/remote/dto/MovieDetailDto;", "imdbId", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lcom/example/composemovie/data/remote/dto/MoviesDto;", "searchString", "app_debug"})
public abstract interface MovieAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = ".")
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "s")
    java.lang.String searchString, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.composemovie.data.remote.dto.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = ".")
    public abstract java.lang.Object getMovieDetail(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "i")
    java.lang.String imdbId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.composemovie.data.remote.dto.MovieDetailDto> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}