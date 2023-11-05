package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body


interface ApiService {
    @GET("cocktails")
    suspend fun getUsers(): List<Cocktail>

    @POST("cocktails")
    suspend fun createUser(@Body user: Cocktail): Cocktail
}

val retrofit = Retrofit.Builder()
    .baseUrl("www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita")
    .addConverterFactory(GsonConverterFactory.create())
    .build()


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

}