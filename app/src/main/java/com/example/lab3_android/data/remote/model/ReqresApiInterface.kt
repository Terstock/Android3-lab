package com.example.lab3_android.data.remote.model

import com.example.lab3_android.data.local.model.ReqresApiModel
import retrofit2.Response
import retrofit2.http.GET

interface ReqresApiInterface {
//ApiInerface for Reqres

    @GET("/api/unknown")
    suspend fun getAll(): Response<ReqresApiModel>

}