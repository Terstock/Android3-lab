package com.example.lab3_android.data.remote.model

import com.example.lab3_android.data.local.model.BibliaApiModel
import retrofit2.Response
import retrofit2.http.GET

interface BibliasApiInterface {
    // ApiInterface for Bible

    @GET("/api/verses/nvi/sl/23")
    suspend fun getAll(): Response<BibliaApiModel>

}