package com.example.jetpackcomapimvvm.data.api

import com.example.jetpackcomapimvvm.Utils.ApiConstants
import com.example.jetpackcomapimvvm.data.api.model.Character
import retrofit2.http.GET

interface CharacterApi {
    @GET(ApiConstants.END_POINTS)
    suspend fun getCharacter():List<Character>

}