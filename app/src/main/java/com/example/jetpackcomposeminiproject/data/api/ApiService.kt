package com.example.jetpackcomposeminiproject.data.api

import com.example.jetpackcomposeminiproject.data.vo.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}