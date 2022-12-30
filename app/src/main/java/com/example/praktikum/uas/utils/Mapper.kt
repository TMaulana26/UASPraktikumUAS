package com.example.praktikum.uas.utils

import com.example.praktikum.uas.data.model.entity.MovieEntity
import com.example.praktikum.uas.data.model.response.MovieResponse
import com.example.praktikum.uas.data.model.viewparam.MovieViewParam

fun MovieViewParam.toMovieEntity(): MovieEntity {
    return MovieEntity(
        id = id,
        title = title,
        posterPath = posterPath,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        overview = overview,
        voteAverage = voteAverage,
    )
}

fun MovieResponse.toMovieViewParam(): MovieViewParam {
    return MovieViewParam(
        id = id,
        title = title.orEmpty(),
        posterPath = posterPath.orEmpty(),
        backdropPath = backdropPath.orEmpty(),
        releaseDate = releaseDate.orEmpty(),
        overview = overview.orEmpty(),
        voteAverage = voteAverage,
        isFavorite = false
    )
}

fun MovieResponse.toMovieEntity(): MovieEntity {
    return MovieEntity(
        id = id,
        title = title.orEmpty(),
        posterPath = posterPath.orEmpty(),
        backdropPath = backdropPath.orEmpty(),
        releaseDate = releaseDate.orEmpty(),
        overview = overview.orEmpty(),
        voteAverage = voteAverage
    )
}

fun MovieEntity.toMovieViewParam(): MovieViewParam {
    return MovieViewParam(
        id = id,
        title = title,
        posterPath = posterPath,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        overview = overview,
        voteAverage = voteAverage,
        isFavorite = isFavorite
    )
}