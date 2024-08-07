package com.example.composemovie.data.di;

import com.example.composemovie.data.remote.MovieAPI;
import com.example.composemovie.domain.repository.IMovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideMovieRepositoryFactory implements Factory<IMovieRepository> {
  private final Provider<MovieAPI> apiProvider;

  public AppModule_ProvideMovieRepositoryFactory(Provider<MovieAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public IMovieRepository get() {
    return provideMovieRepository(apiProvider.get());
  }

  public static AppModule_ProvideMovieRepositoryFactory create(Provider<MovieAPI> apiProvider) {
    return new AppModule_ProvideMovieRepositoryFactory(apiProvider);
  }

  public static IMovieRepository provideMovieRepository(MovieAPI api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMovieRepository(api));
  }
}
