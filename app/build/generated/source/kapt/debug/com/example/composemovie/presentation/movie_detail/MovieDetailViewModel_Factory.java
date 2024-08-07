package com.example.composemovie.presentation.movie_detail;

import androidx.lifecycle.SavedStateHandle;
import com.example.composemovie.domain.use_case.get_movie_detail.GetMovieDetailUseCase;
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
public final class MovieDetailViewModel_Factory implements Factory<MovieDetailViewModel> {
  private final Provider<GetMovieDetailUseCase> getMovieDetailsUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public MovieDetailViewModel_Factory(
      Provider<GetMovieDetailUseCase> getMovieDetailsUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getMovieDetailsUseCaseProvider = getMovieDetailsUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public MovieDetailViewModel get() {
    return newInstance(getMovieDetailsUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static MovieDetailViewModel_Factory create(
      Provider<GetMovieDetailUseCase> getMovieDetailsUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new MovieDetailViewModel_Factory(getMovieDetailsUseCaseProvider, savedStateHandleProvider);
  }

  public static MovieDetailViewModel newInstance(GetMovieDetailUseCase getMovieDetailsUseCase,
      SavedStateHandle savedStateHandle) {
    return new MovieDetailViewModel(getMovieDetailsUseCase, savedStateHandle);
  }
}
