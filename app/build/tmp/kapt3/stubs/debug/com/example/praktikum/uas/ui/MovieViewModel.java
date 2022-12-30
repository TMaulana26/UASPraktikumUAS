package com.example.praktikum.uas.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/praktikum/uas/ui/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_favoriteMovies", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/praktikum/uas/utils/Resource;", "", "Lcom/example/praktikum/uas/data/model/viewparam/MovieViewParam;", "_movies", "_updateFavorite", "", "favoriteMovies", "Landroidx/lifecycle/LiveData;", "getFavoriteMovies", "()Landroidx/lifecycle/LiveData;", "movieDao", "Lcom/example/praktikum/uas/data/local/MovieDao;", "movies", "getMovies", "updateFavorite", "getUpdateFavorite", "getAllMovies", "isFavorite", "", "movieId", "", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    private com.example.praktikum.uas.data.local.MovieDao movieDao;
    private final androidx.lifecycle.MutableLiveData<com.example.praktikum.uas.utils.Resource<java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam>>> _movies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.praktikum.uas.utils.Resource<java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam>>> movies = null;
    private final androidx.lifecycle.MutableLiveData<com.example.praktikum.uas.utils.Resource<java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam>>> _favoriteMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.praktikum.uas.utils.Resource<java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam>>> favoriteMovies = null;
    private final androidx.lifecycle.MutableLiveData<com.example.praktikum.uas.utils.Resource<kotlin.Unit>> _updateFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.praktikum.uas.utils.Resource<kotlin.Unit>> updateFavorite = null;
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.praktikum.uas.utils.Resource<java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam>>> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.praktikum.uas.utils.Resource<java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam>>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.praktikum.uas.utils.Resource<kotlin.Unit>> getUpdateFavorite() {
        return null;
    }
    
    private final void getAllMovies() {
    }
    
    public final void getFavoriteMovies() {
    }
    
    public final void updateFavorite(boolean isFavorite, int movieId) {
    }
}