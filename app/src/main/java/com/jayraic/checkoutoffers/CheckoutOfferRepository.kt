package com.jayraic.checkoutoffers

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jayraic.checkoutoffers.model.OffersResponse
import com.jayraic.checkoutoffers.service.CheckoutOfferService
import com.jayraic.checkoutoffers.service.CheckoutOfferServiceClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Layer for service implementation.
 */
class CheckoutOfferRepository {
    var offerService: CheckoutOfferServiceClient = CheckoutOfferServiceClient()

    /**
     * function to retrieve offers.
     */
    fun getOffers(): LiveData<OffersResponse> {
        val offersResponse = MutableLiveData<OffersResponse>()
        val offerServiceClient = offerService.getClient()?.create(CheckoutOfferService::class.java)
        val call: Call<OffersResponse>? = offerServiceClient?.getOffers()

        call?.enqueue(object : Callback<OffersResponse> {
            override fun onResponse(
                call: Call<OffersResponse>,
                response: Response<OffersResponse>
            ) {
                if (response.isSuccessful) {
                    val offerResponseItem: OffersResponse? = response.body()
                    offersResponse.postValue(offerResponseItem)
                }
            }

            override fun onFailure(call: Call<OffersResponse>, t: Throwable) {
               Log.e("Error Occurred", t.message, t)
            }
        })
        return  offersResponse
    }
}