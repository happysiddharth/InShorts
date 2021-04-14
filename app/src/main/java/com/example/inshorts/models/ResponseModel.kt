package com.example.inshorts.models

import com.google.gson.annotations.SerializedName

data class ResponseModel(

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("data")
	val data: List<DataModel?>? = null,

	@field:SerializedName("success")
	val success: Boolean? = null
)