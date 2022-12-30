package com.example.praktikum.uas.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.praktikum.uas.data.local.MovieDao
import com.example.praktikum.uas.data.local.MovieDatabase
import com.example.praktikum.uas.data.model.viewparam.MovieViewParam
import com.example.praktikum.uas.data.remote.ApiConfig
import com.example.praktikum.uas.utils.Resource
import com.example.praktikum.uas.utils.toMovieEntity
import com.example.praktikum.uas.utils.toMovieViewParam
import kotlinx.coroutines.launch

class MovieViewModel(application: Application) : ViewModel() {

    private var movieDao: MovieDao? = null

    private val _movies = MutableLiveData<Resource<List<MovieViewParam>>>()
    val movies: LiveData<Resource<List<MovieViewParam>>> = _movies

    private val _favoriteMovies = MutableLiveData<Resource<List<MovieViewParam>>>()
    val favoriteMovies: LiveData<Resource<List<MovieViewParam>>> = _favoriteMovies

    private val _updateFavorite = MutableLiveData<Resource<Unit>>()
    val updateFavorite: LiveData<Resource<Unit>> = _updateFavorite

    init {
        val db = MovieDatabase.getInstance(application)
        movieDao = db.movieDao()

        getAllMovies()

        getFavoriteMovies()
    }

    private fun getAllMovies() {
        viewModelScope.launch {
            _movies.value = Resource.Loading()
            try {
                val movieResponses = ApiConfig.getApiService()
                    .getMovies().results
                val movieEntities =
                    movieResponses.map { it.toMovieEntity() }
                movieDao?.insertMovies(movieEntities)

                val result =
                    movieDao?.getMovies()
                val data =
                    result?.map { it.toMovieViewParam() }
                data?.let {
                    _movies.value =
                        Resource.Success(data)
                }
            } catch (e: Exception) {
                _movies.value =
                    Resource.Error(e.message.toString())
            }
        }
    }

    fun getFavoriteMovies() {
        viewModelScope.launch {
            _favoriteMovies.value = Resource.Loading()
            try {
                val result =
                    movieDao?.getFavoriteMovies()
                val data =
                    result?.map { it.toMovieViewParam() }
                data?.let {
                    _favoriteMovies.value =
                        Resource.Success(data)
                }
            } catch (e: Exception) {
                _favoriteMovies.value =
                    Resource.Error(e.message.toString())
            }
        }
    }

    fun updateFavorite(isFavorite: Boolean, movieId: Int) {
        viewModelScope.launch {
            try {
                val result = movieDao?.updateFavorite(
                    isFavorite,
                    movieId
                )
                result?.let {
                    _updateFavorite.value =
                        Resource.Success(result)
                }
            } catch (e: Exception) {
                _updateFavorite.value =
                    Resource.Error(e.message.toString())
            }
        }
    }
}