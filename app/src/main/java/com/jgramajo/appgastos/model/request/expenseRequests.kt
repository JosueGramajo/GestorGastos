package com.jgramajo.appgastos.model.request

import com.fasterxml.jackson.annotation.JsonProperty

data class GetExpenseByAccountAndDateRequest(
    @JsonProperty("start_date")
    val startDate : String,

    @JsonProperty("end_date")
    val endDate : String
) : BaseRequest()

data class CreateExpenseRequest(
    @JsonProperty("comment")
    val comment : String,

    @JsonProperty("amount")
    val amount : Float,

    @JsonProperty("account")
    val account : String,

    @JsonProperty("date")
    val date : String
) : BaseRequest()