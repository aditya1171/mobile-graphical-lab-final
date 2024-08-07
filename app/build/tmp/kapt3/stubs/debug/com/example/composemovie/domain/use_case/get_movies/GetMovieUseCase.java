package com.example.composemovie.domain.use_case.get_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/composemovie/domain/use_case/get_movies/GetMovieUseCase;", "", "repository", "Lcom/example/composemovie/domain/repository/IMovieRepository;", "(Lcom/example/composemovie/domain/repository/IMovieRepository;)V", "executeGetMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/composemovie/util/Resource;", "", "Lcom/example/composemovie/domain/model/Movie;", "search", "", "app_debug"})
public final class GetMovieUseCase {
    private final com.example.composemovie.domain.repository.IMovieRepository repository = null;
    
    @javax.inject.Inject
    public GetMovieUseCase(@org.jetbrains.annotations.NotNull
    com.example.composemovie.domain.repository.IMovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.composemovie.util.Resource<java.util.List<com.example.composemovie.domain.model.Movie>>> executeGetMovies(@org.jetbrains.annotations.NotNull
    java.lang.String search) {
        return null;
    }
}