package com.jayraic.checkoutoffers.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jayraic.checkoutoffers.R
import com.jayraic.checkoutoffers.model.OffersResponse
import com.jayraic.checkoutoffers.viewmodel.CheckoutOfferViewModel
import kotlinx.android.synthetic.main.activity_offers_list_view.*
import org.koin.android.viewmodel.ext.android.viewModel

private val TAG = CheckoutOfferActivity::class.java.simpleName

/**
 * Activity class for offers display.
 */
class CheckoutOfferActivity : AppCompatActivity() {

    private val checkoutOfferViewModel: CheckoutOfferViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offers_list_view)
        loadOffers(false)
    }

    private fun loadOffers(refresh: Boolean) {
        checkoutOfferViewModel.getAllOffers(refresh).observe(this, Observer {
            if (it != null)  {
                setNewsFeedResponse(it)
            } else {
                Log.i(TAG, "Error Occurred")
            }
        })
    }

    private fun setNewsFeedResponse(offers: OffersResponse) {
        val offerRecyclerView: RecyclerView = offers_list as RecyclerView
        val adapter = CheckoutOfferAdapter(this, offers.offerList)
        offerRecyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(offerRecyclerView.context)
        offerRecyclerView.layoutManager = layoutManager
        offerRecyclerView.adapter = adapter
    }
}