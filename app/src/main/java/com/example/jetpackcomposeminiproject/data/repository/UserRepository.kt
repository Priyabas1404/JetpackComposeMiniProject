package com.example.jetpackcomposeminiproject.data.repository

import com.example.jetpackcomposeminiproject.data.api.ApiService
import javax.inject.Inject

class UserRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}