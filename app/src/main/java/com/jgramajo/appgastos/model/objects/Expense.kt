package com.jgramajo.appgastos.model.objects

import com.fasterxml.jackson.annotation.JsonProperty

data class Expense(
    @JsonProperty("id")
    val expenseId : String,

    @JsonProperty("comment")
    val comment : String,

    @JsonProperty("amount")
    val amount : Float,

    @JsonProperty("account")
    val account : String,

    @JsonProperty("date")
    val date : String,

    @JsonProperty("created_date")
    val createDate : String,

    @JsonProperty("updated_date")
    val updatetDate : String,
)
