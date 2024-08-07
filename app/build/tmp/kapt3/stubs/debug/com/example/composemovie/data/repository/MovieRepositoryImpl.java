package com.example.composemovie.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/composemovie/data/repository/MovieRepositoryImpl;", "Lcom/example/composemovie/domain/repository/IMovieRepository;", "api", "Lcom/example/composemovie/data/remote/MovieAPI;", "(Lcom/example/composemovie/data/remote/MovieAPI;)V", "getMovieDetail", "Lcom/example/composemovie/data/remote/dto/MovieDetailDto;", "imdbId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lcom/example/composemovie/data/remote/dto/MoviesDto;", "search", "app_debug"})
public final class MovieRepositoryImpl implements com.example.composemovie.domain.repository.IMovieRepository {
    private final com.example.composemovie.data.remote.MovieAPI api = null;
    
    @javax.inject.Inject
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.composemovie.data.remote.MovieAPI api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovies(@org.jetbrains.annotations.NotNull
    java.lang.String search, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.composemovie.data.remote.dto.MoviesDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovieDetail(@org.jetbrains.annotations.NotNull
    java.lang.String imdbId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.composemovie.data.remote.dto.MovieDetailDto> continuation) {
        return null;
    }
}