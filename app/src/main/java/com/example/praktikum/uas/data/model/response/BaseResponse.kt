package com.example.praktikum.uas.data.model.response

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(

    @SerializedName("results")
    val results: List<T>
)
