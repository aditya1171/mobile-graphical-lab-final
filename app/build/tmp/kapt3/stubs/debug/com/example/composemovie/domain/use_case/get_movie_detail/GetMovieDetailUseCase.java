package com.example.composemovie.domain.use_case.get_movie_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/composemovie/domain/use_case/get_movie_detail/GetMovieDetailUseCase;", "", "repository", "Lcom/example/composemovie/domain/repository/IMovieRepository;", "(Lcom/example/composemovie/domain/repository/IMovieRepository;)V", "executeGetMovieDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/composemovie/util/Resource;", "Lcom/example/composemovie/domain/model/MovieDetail;", "imdbId", "", "app_debug"})
public final class GetMovieDetailUseCase {
    private final com.example.composemovie.domain.repository.IMovieRepository repository = null;
    
    @javax.inject.Inject
    public GetMovieDetailUseCase(@org.jetbrains.annotations.NotNull
    com.example.composemovie.domain.repository.IMovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.composemovie.util.Resource<com.example.composemovie.domain.model.MovieDetail>> executeGetMovieDetails(@org.jetbrains.annotations.NotNull
    java.lang.String imdbId) {
        return null;
    }
}