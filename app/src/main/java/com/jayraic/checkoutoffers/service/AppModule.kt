package com.jayraic.checkoutoffers.service

import com.jayraic.checkoutoffers.CheckoutOfferRepository
import com.jayraic.checkoutoffers.viewmodel.CheckoutOfferViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {
    single { CheckoutOfferRepository() }
    viewModel{ CheckoutOfferViewModel(get())}
}