package com.example.praktikum.uas.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J+\u0010\u001a\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005J\u0016\u0010\u001b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001cR+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/praktikum/uas/ui/ListMovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/praktikum/uas/ui/ListMovieAdapter$ViewHolder;", "()V", "addToFavorite", "Lkotlin/Function1;", "Lcom/example/praktikum/uas/data/model/viewparam/MovieViewParam;", "Lkotlin/ParameterName;", "name", "movie", "", "callback", "deleteFromFavorite", "isFavorite", "", "movies", "Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickFavoriteListener", "submitList", "", "ViewHolder", "app_debug"})
public final class ListMovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.praktikum.uas.ui.ListMovieAdapter.ViewHolder> {
    private final java.util.ArrayList<com.example.praktikum.uas.data.model.viewparam.MovieViewParam> movies = null;
    private kotlin.jvm.functions.Function1<? super com.example.praktikum.uas.data.model.viewparam.MovieViewParam, kotlin.Unit> callback;
    private kotlin.jvm.functions.Function1<? super com.example.praktikum.uas.data.model.viewparam.MovieViewParam, kotlin.Unit> addToFavorite;
    private kotlin.jvm.functions.Function1<? super com.example.praktikum.uas.data.model.viewparam.MovieViewParam, kotlin.Unit> deleteFromFavorite;
    private boolean isFavorite = false;
    
    public ListMovieAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.praktikum.uas.ui.ListMovieAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.praktikum.uas.ui.ListMovieAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.praktikum.uas.data.model.viewparam.MovieViewParam> movies) {
    }
    
    public final void setOnClickFavoriteListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.praktikum.uas.data.model.viewparam.MovieViewParam, kotlin.Unit> callback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/praktikum/uas/ui/ListMovieAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/praktikum/databinding/ItemMoviesBinding;", "(Lcom/example/praktikum/databinding/ItemMoviesBinding;)V", "getBinding", "()Lcom/example/praktikum/databinding/ItemMoviesBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.praktikum.databinding.ItemMoviesBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.praktikum.databinding.ItemMoviesBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.praktikum.databinding.ItemMoviesBinding getBinding() {
            return null;
        }
    }
}