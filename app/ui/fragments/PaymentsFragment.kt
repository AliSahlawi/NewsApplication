package com.androiddevs.mvvmnewsapp.myApp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.myApp.adapters.PaymentsAdapter
import com.androiddevs.mvvmnewsapp.myApp.ui.NewsActivity
import com.androiddevs.mvvmnewsapp.myApp.ui.NewsViewModel
import com.androiddevs.mvvmnewsapp.myApp.util.Resource
import kotlinx.android.synthetic.main.fragment_payments.*

class PaymentsFragment: Fragment(R.layout.fragment_payments) {

    lateinit var viewModel : NewsViewModel
    lateinit var paymentsAdapter : PaymentsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).viewModel
        setUpRecyclerView()

        viewModel.payments.observe(viewLifecycleOwner, Observer { response ->
            when(response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let {
                        paymentResponse -> paymentsAdapter.differ.submitList(paymentResponse)
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let {
                            message -> Log.e("PaymentsFragment","An error occurred: $message")
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })

    }


    private fun setUpRecyclerView(){

        paymentsAdapter = PaymentsAdapter()
        rvPayments.apply {
            adapter = paymentsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
    private fun hideProgressBar(){
        paymentPaginationProgressBar.visibility = View.INVISIBLE
    }
    private fun showProgressBar(){
        paymentPaginationProgressBar.visibility = View.VISIBLE
    }
}