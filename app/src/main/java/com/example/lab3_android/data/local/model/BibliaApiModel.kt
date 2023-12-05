package com.example.lab3_android.data.local.model


import com.google.gson.annotations.SerializedName
import com.example.lab3_android.domain.products.model.Bible

data class BibliaApiModel(

    @SerializedName("verses")
    var verses : List<Bible>,

    )
