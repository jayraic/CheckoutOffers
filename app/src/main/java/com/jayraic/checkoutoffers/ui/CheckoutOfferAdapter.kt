package com.jayraic.checkoutoffers.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jayraic.checkoutoffers.R
import com.jayraic.checkoutoffers.model.Offer
import kotlinx.android.synthetic.main.offer_item.view.*

/**
 * CheckoutOfferAdapter - adapter for providing binding of data to views.
 * @param context app context.
 * @param offers list of [Offer].
 */
class CheckoutOfferAdapter(
    private val context: Context,
    private val offers: List<Offer>
) : RecyclerView.Adapter<CheckoutOfferAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.offer_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val offer = offers[position]

        holder.txtTitle.text = offer.productName
        holder.productCashBack.text = context.resources.getString(R.string.cash_back_text, offer.cashBack)

        if (offer.imageUrl != null) {
            holder.imgBody.visibility = View.VISIBLE
            Glide.with(holder.itemView.context)
                .load(offer.imageUrl)
                .dontAnimate()
                .into(holder.imgBody)
        }
    }

    override fun getItemCount(): Int {
        return offers.size
    }

    /**
     * ViewHolder [Offer] Item.
     * @param view view to be binded.
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtTitle: TextView = view.offer_name
        val imgBody: ImageView = view.offer_image
        val productCashBack: TextView = view.offer_cashback
    }
}