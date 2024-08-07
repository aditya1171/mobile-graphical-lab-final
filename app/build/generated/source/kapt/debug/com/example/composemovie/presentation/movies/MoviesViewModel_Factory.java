package com.example.composemovie.presentation.movies;

import com.example.composemovie.domain.use_case.get_movies.GetMovieUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoviesViewModel_Factory implements Factory<MoviesViewModel> {
  private final Provider<GetMovieUseCase> getMovieUseCaseProvider;

  public MoviesViewModel_Factory(Provider<GetMovieUseCase> getMovieUseCaseProvider) {
    this.getMovieUseCaseProvider = getMovieUseCaseProvider;
  }

  @Override
  public MoviesViewModel get() {
    return newInstance(getMovieUseCaseProvider.get());
  }

  public static MoviesViewModel_Factory create(Provider<GetMovieUseCase> getMovieUseCaseProvider) {
    return new MoviesViewModel_Factory(getMovieUseCaseProvider);
  }

  public static MoviesViewModel newInstance(GetMovieUseCase getMovieUseCase) {
    return new MoviesViewModel(getMovieUseCase);
  }
}
