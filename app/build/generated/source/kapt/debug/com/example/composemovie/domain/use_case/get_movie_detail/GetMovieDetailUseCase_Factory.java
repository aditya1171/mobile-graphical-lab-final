package com.example.composemovie.domain.use_case.get_movie_detail;

import com.example.composemovie.domain.repository.IMovieRepository;
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
public final class GetMovieDetailUseCase_Factory implements Factory<GetMovieDetailUseCase> {
  private final Provider<IMovieRepository> repositoryProvider;

  public GetMovieDetailUseCase_Factory(Provider<IMovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMovieDetailUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetMovieDetailUseCase_Factory create(
      Provider<IMovieRepository> repositoryProvider) {
    return new GetMovieDetailUseCase_Factory(repositoryProvider);
  }

  public static GetMovieDetailUseCase newInstance(IMovieRepository repository) {
    return new GetMovieDetailUseCase(repository);
  }
}
