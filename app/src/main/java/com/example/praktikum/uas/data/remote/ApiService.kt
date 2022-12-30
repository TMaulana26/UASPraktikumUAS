package com.example.praktikum.uas.data.remote

import com.example.praktikum.uas.data.model.response.BaseResponse
import com.example.praktikum.uas.data.model.response.MovieResponse
import com.example.praktikum.uas.utils.Constants
import retrofit2.http.*

interface ApiService {

    @GET("movie/top_rated?api_key=${Constants.API_KEY}")
    suspend fun getMovies(): BaseResponse<MovieResponse>
}