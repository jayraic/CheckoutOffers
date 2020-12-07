package com.jayraic.checkoutoffers

import android.app.Application
import com.jayraic.checkoutoffers.service.appModule
import org.koin.android.ext.android.startKoin

/**
 * Checkout offer App class.
 */
class CheckoutOfferApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}