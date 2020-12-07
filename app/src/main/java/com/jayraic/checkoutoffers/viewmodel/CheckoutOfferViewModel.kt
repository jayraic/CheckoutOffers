package com.jayraic.checkoutoffers.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.jayraic.checkoutoffers.CheckoutOfferRepository
import com.jayraic.checkoutoffers.model.OffersResponse

/**
 * [CheckoutOfferViewModel] responsible for preparing and managing the data for offers.
 */
class CheckoutOfferViewModel(
    private val checkoutOfferRepository: CheckoutOfferRepository
) : ViewModel() {
    private var offers: LiveData<OffersResponse>? = null

    /**
     * function to return all the offers.
     * @return Offers as [LiveData]
     */
    fun getAllOffers(refresh: Boolean): LiveData<OffersResponse> {
        if (refresh) {
            offers = null
        }
        if (this.offers == null) {
            offers = checkoutOfferRepository.getOffers()
            return offers as LiveData<OffersResponse>
        }
        return offers as LiveData<OffersResponse>
    }
}