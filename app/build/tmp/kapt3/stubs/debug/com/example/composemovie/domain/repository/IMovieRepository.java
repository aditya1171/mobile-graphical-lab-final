package com.example.composemovie.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/composemovie/domain/repository/IMovieRepository;", "", "getMovieDetail", "Lcom/example/composemovie/data/remote/dto/MovieDetailDto;", "imdbId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lcom/example/composemovie/data/remote/dto/MoviesDto;", "search", "app_debug"})
public abstract interface IMovieRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull
    java.lang.String search, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.composemovie.data.remote.dto.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieDetail(@org.jetbrains.annotations.NotNull
    java.lang.String imdbId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.composemovie.data.remote.dto.MovieDetailDto> continuation);
}