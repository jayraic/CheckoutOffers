package com.jayraic.checkoutoffers.service

import com.jayraic.checkoutoffers.model.OffersResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Product offers service class.
 */
interface CheckoutOfferService {
    /**
     * Call to retrieve all the present offers.
     */
    @GET("b/TY94")
    fun getOffers(): Call<OffersResponse>
}