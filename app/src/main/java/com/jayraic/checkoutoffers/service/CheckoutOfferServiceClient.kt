package com.jayraic.checkoutoffers.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://jsonkeeper.com/"

/**
 * Service client for checkout offers.
 */

class CheckoutOfferServiceClient {

    private var retrofit: Retrofit? = null

    /**
     * function to return [Retrofit] client.
     * @return Retrofit client.
     */
    fun getClient(): Retrofit? {
        return if (retrofit != null) {
            retrofit
        } else {
            getClientSynchronize()
        }
    }

    @Synchronized
    private fun getClientSynchronize(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(setHeader())
                .build()
        }
        return retrofit
    }

    private fun setHeader(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .addNetworkInterceptor { chain ->
                val original = chain.request()
                val requestBuilder = original.newBuilder()
                requestBuilder.header("Content-Type", "application/json")
                val request = requestBuilder.build()
                chain.proceed(request)
            }
            .build()
    }


}