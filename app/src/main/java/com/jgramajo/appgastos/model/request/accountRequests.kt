package com.jgramajo.appgastos.model.request

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAccountRequest(
    @JsonProperty("name")
    val name : String,

    @JsonProperty("user")
    val user : String
) : BaseRequest()

data class UpdateAccountRequest(
    @JsonProperty("user")
    val user : String
)
