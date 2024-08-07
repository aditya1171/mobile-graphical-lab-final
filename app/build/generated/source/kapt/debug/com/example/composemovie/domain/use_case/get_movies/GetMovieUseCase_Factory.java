package com.example.composemovie.domain.use_case.get_movies;

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
public final class GetMovieUseCase_Factory implements Factory<GetMovieUseCase> {
  private final Provider<IMovieRepository> repositoryProvider;

  public GetMovieUseCase_Factory(Provider<IMovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMovieUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetMovieUseCase_Factory create(Provider<IMovieRepository> repositoryProvider) {
    return new GetMovieUseCase_Factory(repositoryProvider);
  }

  public static GetMovieUseCase newInstance(IMovieRepository repository) {
    return new GetMovieUseCase(repository);
  }
}
