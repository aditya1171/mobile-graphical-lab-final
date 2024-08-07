package com.example.composemovie.data.repository;

import com.example.composemovie.data.remote.MovieAPI;
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
public final class MovieRepositoryImpl_Factory implements Factory<MovieRepositoryImpl> {
  private final Provider<MovieAPI> apiProvider;

  public MovieRepositoryImpl_Factory(Provider<MovieAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public MovieRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static MovieRepositoryImpl_Factory create(Provider<MovieAPI> apiProvider) {
    return new MovieRepositoryImpl_Factory(apiProvider);
  }

  public static MovieRepositoryImpl newInstance(MovieAPI api) {
    return new MovieRepositoryImpl(api);
  }
}
