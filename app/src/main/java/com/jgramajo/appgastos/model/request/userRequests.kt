package com.jgramajo.appgastos.model.request

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

data class LoginRequest(
    @JsonProperty("email")
    var email : String,

    @JsonProperty("pass")
    var password : String
) : BaseRequest()

data class CreateUserRequest(
    @JsonProperty("email")
    val email : String,

    @JsonProperty("name")
    val name : String,

    @JsonProperty("lastname")
    val lastname : String,

    @JsonProperty("pass")
    val password : String
)

data class ChangePasswordRequest(
    @JsonProperty("pass")
    val password: String
)

data class UpdateUserRequest(
    @JsonProperty("email")
    val email : String,

    @JsonProperty("name")
    val name : String,

    @JsonProperty("lastname")
    val lastname : String,
)