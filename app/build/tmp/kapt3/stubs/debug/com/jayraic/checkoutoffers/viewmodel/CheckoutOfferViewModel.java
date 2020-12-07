package com.jayraic.checkoutoffers.viewmodel;

import java.lang.System;

/**
 * [CheckoutOfferViewModel] responsible for preparing and managing the data for offers.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jayraic/checkoutoffers/viewmodel/CheckoutOfferViewModel;", "Landroidx/lifecycle/ViewModel;", "checkoutOfferRepository", "Lcom/jayraic/checkoutoffers/CheckoutOfferRepository;", "(Lcom/jayraic/checkoutoffers/CheckoutOfferRepository;)V", "offers", "Landroidx/lifecycle/LiveData;", "Lcom/jayraic/checkoutoffers/model/OffersResponse;", "getAllOffers", "refresh", "", "app_debug"})
public final class CheckoutOfferViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<com.jayraic.checkoutoffers.model.OffersResponse> offers;
    private final com.jayraic.checkoutoffers.CheckoutOfferRepository checkoutOfferRepository = null;
    
    /**
     * function to return all the offers.
     * @return Offers as [LiveData]
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jayraic.checkoutoffers.model.OffersResponse> getAllOffers(boolean refresh) {
        return null;
    }
    
    public CheckoutOfferViewModel(@org.jetbrains.annotations.NotNull()
    com.jayraic.checkoutoffers.CheckoutOfferRepository checkoutOfferRepository) {
        super();
    }
}