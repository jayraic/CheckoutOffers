package com.jayraic.checkoutoffers;

import java.lang.System;

/**
 * Layer for service implementation.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/jayraic/checkoutoffers/CheckoutOfferRepository;", "", "()V", "offerService", "Lcom/jayraic/checkoutoffers/service/CheckoutOfferServiceClient;", "getOfferService", "()Lcom/jayraic/checkoutoffers/service/CheckoutOfferServiceClient;", "setOfferService", "(Lcom/jayraic/checkoutoffers/service/CheckoutOfferServiceClient;)V", "getOffers", "Landroidx/lifecycle/LiveData;", "Lcom/jayraic/checkoutoffers/model/OffersResponse;", "app_debug"})
public final class CheckoutOfferRepository {
    @org.jetbrains.annotations.NotNull()
    private com.jayraic.checkoutoffers.service.CheckoutOfferServiceClient offerService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jayraic.checkoutoffers.service.CheckoutOfferServiceClient getOfferService() {
        return null;
    }
    
    public final void setOfferService(@org.jetbrains.annotations.NotNull()
    com.jayraic.checkoutoffers.service.CheckoutOfferServiceClient p0) {
    }
    
    /**
     * function to retrieve offers.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jayraic.checkoutoffers.model.OffersResponse> getOffers() {
        return null;
    }
    
    public CheckoutOfferRepository() {
        super();
    }
}