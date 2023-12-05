package com.example.lab3_android.domain.products.model

import com.google.gson.annotations.SerializedName

data class Bible(

    @SerializedName("number")
    var number: Int,

    @SerializedName("text")
    var text: String,

)
