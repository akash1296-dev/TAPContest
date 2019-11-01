package com.example.tapcontest.factory

import android.util.Log.d
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    companion object {

        private const val TAG = "RetrofitFactory"

        fun retrofit():Retrofit {
             val retrofit = Retrofit.Builder().baseUrl("")
                .addConverterFactory(GsonConverterFactory.create()).build()
            d(TAG,"$retrofit")
            return retrofit
        }

    }
}