package com.example.composemovie.presentation.movie_detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/composemovie/presentation/movie_detail/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getMovieDetailsUseCase", "Lcom/example/composemovie/domain/use_case/get_movie_detail/GetMovieDetailUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/composemovie/domain/use_case/get_movie_detail/GetMovieDetailUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/composemovie/presentation/movie_detail/MovieDetailState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getMovieDetail", "", "imdbId", "", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.composemovie.domain.use_case.get_movie_detail.GetMovieDetailUseCase getMovieDetailsUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final androidx.compose.runtime.MutableState<com.example.composemovie.presentation.movie_detail.MovieDetailState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.composemovie.presentation.movie_detail.MovieDetailState> state = null;
    
    @javax.inject.Inject
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.composemovie.domain.use_case.get_movie_detail.GetMovieDetailUseCase getMovieDetailsUseCase, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.composemovie.presentation.movie_detail.MovieDetailState> getState() {
        return null;
    }
    
    private final void getMovieDetail(java.lang.String imdbId) {
    }
}