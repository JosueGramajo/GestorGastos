package com.jgramajo.appgastos.networking.api


import com.jgramajo.appgastos.model.request.CreateAccountRequest
import com.jgramajo.appgastos.model.request.UpdateAccountRequest
import com.jgramajo.appgastos.model.response.BaseResponse
import retrofit2.Call
import retrofit2.http.*

interface AccountApi {
    @POST("account")
    fun createAccount(@Body body : CreateAccountRequest) : Call<BaseResponse>

    @PUT("account/{id}")
    fun updateAccount(@Path("id") id : String, @Body body : UpdateAccountRequest) : Call<BaseResponse>

    @DELETE("account/{id}")
    fun deleteAccount(@Path("id") id : String) : Call<BaseResponse>

    @GET("account/{id}")
    fun getAccountById(@Path("id") id : String) : Call<BaseResponse>

    @GET("account/user/{userId}")
    fun getAccountByUser(@Path("userId") userId : String) : Call<BaseResponse>
}