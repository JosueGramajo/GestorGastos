package com.jgramajo.appgastos.networking

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.jackson.JacksonConverterFactory

object RetrofitService {
    val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://app-gastos-318906.appspot.com")
            .addConverterFactory(GsonConverterFactory.create())
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(run {
                        val httpLoggingInterceptor = HttpLoggingInterceptor()
                        httpLoggingInterceptor.apply {
                            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
                        }
                    })
                    .build())
            .build()
    }
}