package com.jayraic.checkoutoffers

import com.jayraic.checkoutoffers.viewmodel.CheckoutOfferViewModel
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.junit.Assert.*

@RunWith(MockitoJUnitRunner.Silent::class)
class CheckoutOfferViewModelTest {
    private var mockServer = MockWebServer()
    private lateinit var baseUrl: String
    private lateinit var checkoutOfferViewModelTest: CheckoutOfferViewModel

    @Before
    fun setUpModel() {
        checkoutOfferViewModelTest = CheckoutOfferViewModel(CheckoutOfferRepository())
        mockServer.start()
        baseUrl = mockServer.url("/").toString()
    }

    @After
    fun tearDownSetup() {
        mockServer.shutdown()
    }

    @Test
    fun testGetAllOffers() {
        val mockOffersResponse = MockResponse()
            .setResponseCode(200)
            .setBody(ClassLoader.getSystemResource("offerResponse.json").readText())
        mockServer.enqueue(mockOffersResponse)
        val response = checkoutOfferViewModelTest.getAllOffers(false)
        assertNotNull(response)
    }
}