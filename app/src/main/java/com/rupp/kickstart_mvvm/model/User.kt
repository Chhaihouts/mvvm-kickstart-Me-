package com.rupp.kickstart_mvvm.model

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("userId")var userId: Int, @SerializedName("id")var id: Int, @SerializedName("title")var title: String, @SerializedName("body")var body: String)