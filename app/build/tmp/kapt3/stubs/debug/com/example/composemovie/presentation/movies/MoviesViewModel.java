package com.example.composemovie.presentation.movies;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/example/composemovie/presentation/movies/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "getMovieUseCase", "Lcom/example/composemovie/domain/use_case/get_movies/GetMovieUseCase;", "(Lcom/example/composemovie/domain/use_case/get_movies/GetMovieUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/composemovie/presentation/movies/MoviesState;", "job", "Lkotlinx/coroutines/Job;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getMovies", "", "search", "", "onEvent", "event", "Lcom/example/composemovie/presentation/movies/MoviesEvent;", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.composemovie.domain.use_case.get_movies.GetMovieUseCase getMovieUseCase = null;
    private final androidx.compose.runtime.MutableState<com.example.composemovie.presentation.movies.MoviesState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.composemovie.presentation.movies.MoviesState> state = null;
    private kotlinx.coroutines.Job job;
    
    @javax.inject.Inject
    public MoviesViewModel(@org.jetbrains.annotations.NotNull
    com.example.composemovie.domain.use_case.get_movies.GetMovieUseCase getMovieUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.composemovie.presentation.movies.MoviesState> getState() {
        return null;
    }
    
    private final void getMovies(java.lang.String search) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.composemovie.presentation.movies.MoviesEvent event) {
    }
}