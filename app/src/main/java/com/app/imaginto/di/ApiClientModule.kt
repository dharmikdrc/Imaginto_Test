package com.app.imaginto.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class ApiClientModule() {

    var BASE_URL: String = "http://private-222d3-homework5.apiary-mock.com/api/"

    @Provides
    @Singleton
    fun getClient(): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}