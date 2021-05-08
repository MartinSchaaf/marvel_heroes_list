package com.schaaf.marvelheroeslist.data.api

import android.content.Context
import com.koushikdutta.async.kotlin.await
import com.koushikdutta.ion.Ion
import com.schaaf.marvelheroeslist.data.heroes_list.model.HeroesListResponse
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class API @Inject constructor(
    @ApplicationContext private val context: Context
){
    companion object{
        private const val BASE_URL = "https://gateway.marvel.com:443/v1/public"
        private const val API_KEY = "3ff22b181c68910fd60a3bc3894bd6f3"
    }

    suspend fun loadHeroesList(limit:Int, offset: Int): HeroesListResponse =
        Ion.with(context)
            .load("${BASE_URL}/characters?limit=$limit&offset=$offset&apikey=$API_KEY")
            .`as`(HeroesListResponse::class.java)
            .await()

    suspend fun loadCurrentList(limit:Int, offset: Int): HeroesListResponse =
        Ion.with(context)
            .load("${BASE_URL}/characters?limit=$limit&offset=$offset&apikey=$API_KEY")
            .`as`(HeroesListResponse::class.java)
            .await()

}