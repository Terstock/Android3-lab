package com.example.lab3_android.domain.products.model

import com.google.gson.annotations.SerializedName

data class Reqres(

    @SerializedName("id")
    var id: Int,

    @SerializedName("name")
    var name: String,

    @SerializedName("year")
    var year: Int,

    @SerializedName("color")
    var color: String,

    @SerializedName("pantone_value")
    var pantone_value: String,

)
