package com.app.imaginto.model

import com.google.gson.annotations.SerializedName


data class LoginResponse(
    @SerializedName("errorCode")
    val errorCode: String?,
    @SerializedName("errorMessage")
    val errorMessage: String?,
    @SerializedName("user")
    val user: User?
)

data class User(
    @SerializedName("userId")
    val userId: Int?,
    @SerializedName("userName")
    val userName: String?
)