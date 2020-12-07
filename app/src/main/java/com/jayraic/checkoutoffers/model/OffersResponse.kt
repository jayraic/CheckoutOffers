package com.jayraic.checkoutoffers.model

import com.google.gson.annotations.SerializedName

/**
 * Offers response data class.
 * @param batchId batch id of the offers.
 * @param offerList List of all offers under this batch.
 */
data class OffersResponse(
    @SerializedName("batch_id") val batchId: String?,
    @SerializedName("offers") val offerList: List<Offer>
)

/**
 * Offer class, representing individual offer.
 * @param offerId unique id for the offer.
 * @param productName name of the product offered.
 * @param imageUrl url for product image.
 * @param cashBack cash back being offered on product.
 */
data class Offer(
    @SerializedName("offer_id") val offerId: String?,
    @SerializedName("name") val productName: String?,
    @SerializedName("image_url") val imageUrl: String?,
    @SerializedName("cash_back") val cashBack: Double?
)