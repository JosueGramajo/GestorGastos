package com.jgramajo.appgastos.networking.api

import com.jgramajo.appgastos.model.objects.Expense
import com.jgramajo.appgastos.model.request.CreateExpenseRequest
import com.jgramajo.appgastos.model.request.GetExpenseByAccountAndDateRequest
import com.jgramajo.appgastos.model.response.BaseResponse
import retrofit2.Call
import retrofit2.http.*

interface ExpenseApi {
    @GET("expense/account/{account_id}")
    fun getExpenseByAccount(@Path("account_id") accountId : String) : Call<BaseResponse>

    @PATCH("expense/account/{account_id}")
    fun getExpenseByAccountAndDateRange(
        @Path("account_id") accountId: String,
        @Body body : GetExpenseByAccountAndDateRequest
    ) : Call<BaseResponse>

    @POST("expense")
    fun createExpense(@Body body : CreateExpenseRequest) : Call<BaseResponse>

    @PUT("expense/{id}")
    fun updateExpense(
        @Path("id") id : String,
        @Body body : CreateExpenseRequest
    ) : Call<BaseResponse>

    @DELETE("expense/{id}")
    fun deleteExpense(@Path("id") id : String) : Call<BaseResponse>

    @GET("expense/{id}")
    fun getExpenseById(@Path("id") id: String) : Call<Expense>
}
