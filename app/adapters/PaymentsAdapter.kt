package com.androiddevs.mvvmnewsapp.myApp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.ui.models.PaymentHistoryItem
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_payment_preview.view.*

class PaymentsAdapter: RecyclerView.Adapter<PaymentsAdapter.PaymentsViewHolder>() {

    inner class PaymentsViewHolder(itemVIew:View):RecyclerView.ViewHolder(itemVIew)

    private val differCallback = object : DiffUtil.ItemCallback<PaymentHistoryItem>(){
        override fun areItemsTheSame(
            oldItem: PaymentHistoryItem,
            newItem: PaymentHistoryItem
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: PaymentHistoryItem,
            newItem: PaymentHistoryItem
        ): Boolean {
           return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this,differCallback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentsViewHolder {
       return PaymentsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_payment_preview,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PaymentsViewHolder, position: Int) {
        val payment = differ.currentList[position]
        holder.itemView.apply {
            tvFromAccount.text = payment.accountName
            tvToAccount.text =  payment.beneficiaryIBAN
            tvTransactionStatus.text = payment.status
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var  onItemClickListener : ((PaymentHistoryItem)-> Unit)?=null

    fun setOnItemClickListener(listener:(PaymentHistoryItem)-> Unit){
        onItemClickListener = listener
    }
}