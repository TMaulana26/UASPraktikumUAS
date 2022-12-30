package com.example.praktikum.uas.data.model.viewparam

data class MovieViewParam(
    val id: Int,
    val title: String,
    val posterPath: String,
    val backdropPath: String,
    val releaseDate: String,
    val overview: String,
    val voteAverage: Double,
    val isFavorite: Boolean
)