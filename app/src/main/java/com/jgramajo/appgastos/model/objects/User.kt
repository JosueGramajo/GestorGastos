package com.jgramajo.appgastos.model.objects

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class User(
    @JsonProperty("id")
    val userId : String,

    @JsonProperty("name")
    val name : String,

    @JsonProperty("lastname")
    val lastName : String,

    @JsonProperty("email")
    val email : String,

    @JsonProperty("created_date")
    val createdDate : String,

    @JsonProperty("updated_date")
    val updatedDate : String,

    @JsonProperty("Error")
    val error : String
)
