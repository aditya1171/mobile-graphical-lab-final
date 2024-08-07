package com.example.composemovie.data.di;

import com.example.composemovie.data.remote.MovieAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideMovieAppFactory implements Factory<MovieAPI> {
  @Override
  public MovieAPI get() {
    return provideMovieApp();
  }

  public static AppModule_ProvideMovieAppFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MovieAPI provideMovieApp() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMovieApp());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideMovieAppFactory INSTANCE = new AppModule_ProvideMovieAppFactory();
  }
}
