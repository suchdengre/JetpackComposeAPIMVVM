package com.example.jetpackcomapimvvm.repository

import com.example.jetpackcomapimvvm.data.api.model.Character
import com.example.jetpackcomapimvvm.data.api.CharacterApi
import javax.inject.Inject

class CharacterRepo  @Inject constructor( private val characterApi: CharacterApi){

    suspend fun getCharacters():List<Character>
    {
        return characterApi.getCharacter()
    }
}