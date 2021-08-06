package com.jgramajo.appgastos.networking.api

import com.jgramajo.appgastos.model.objects.User
import com.jgramajo.appgastos.model.request.ChangePasswordRequest
import com.jgramajo.appgastos.model.request.CreateUserRequest
import com.jgramajo.appgastos.model.request.LoginRequest
import com.jgramajo.appgastos.model.request.UpdateUserRequest
import com.jgramajo.appgastos.model.response.BaseResponse
import retrofit2.Call
import retrofit2.http.*

interface UserApi {
    @GET("users/all")
    fun getAllUsers() : Call<List<User>>

    @GET("user/{id}")
    fun getUserById(@Path("id") id : String) : Call<User>

    @PATCH("user/login")
    fun login(@Body body : LoginRequest) : Call<User>

    @POST("user")
    fun createUser(@Body body : CreateUserRequest) : Call<BaseResponse>

    @PUT("user/pass/{id}")
    fun changePassword(@Path("id") id: String, @Body body : ChangePasswordRequest) : Call<BaseResponse>

    @PUT("user/{id}")
    fun updateUser(@Path("id") id : String, @Body body : UpdateUserRequest) : Call<BaseResponse>
}
