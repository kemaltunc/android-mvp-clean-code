package com.tunc.mvpcleanarch.data.model.response

import com.google.gson.annotations.SerializedName

data class TodoResponse(
    @SerializedName("userId")
    var userId: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("title")
    var title: String?
)