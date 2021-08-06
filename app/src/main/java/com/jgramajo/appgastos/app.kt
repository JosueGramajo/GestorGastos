package com.jgramajo.appgastos

import com.jgramajo.appgastos.model.objects.User
import com.jgramajo.appgastos.model.request.LoginRequest
import com.jgramajo.appgastos.networking.RetrofitService
import com.jgramajo.appgastos.networking.api.UserApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(){
    val userApi = RetrofitService.retrofit.create(UserApi::class.java)
    val request = LoginRequest("abconde1998@gmail.com", "123456")
    userApi.login(request).enqueue(object : Callback<User> {
        override fun onFailure(call: Call<User>, t: Throwable) {

        }
        override fun onResponse(call: Call<User>, response: Response<User>) {
            val data = response.body()

            print("")
        }
    })


}