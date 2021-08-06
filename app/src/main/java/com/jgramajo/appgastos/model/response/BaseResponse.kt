package com.jgramajo.appgastos.model.response

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class BaseResponse(
    @JsonProperty("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val message : String?
)