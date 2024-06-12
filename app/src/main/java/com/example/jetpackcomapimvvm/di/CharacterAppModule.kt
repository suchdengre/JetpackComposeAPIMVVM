package com.example.jetpackcomapimvvm.di

import com.example.jetpackcomapimvvm.Utils.ApiConstants
import com.example.jetpackcomapimvvm.data.api.CharacterApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object CharacterAppModule {

    @Provides
    @Singleton
    fun provideApi(builder: Retrofit.Builder): CharacterApi {
        return builder
            .build()
            .create(CharacterApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }
}