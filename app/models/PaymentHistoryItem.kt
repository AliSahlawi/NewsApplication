package com.androiddevs.mvvmnewsapp.ui.models

import java.io.Serializable

data class PaymentHistoryItem(
    val accountName: String,
    val beneficiaryBIC: String,
    val beneficiaryIBAN: String,
    val beneficiaryName: String,
    val billerCode: String,
    val billerServiceCode: String,
    val billerSubServiceCode: String,
    val billerSubscriberIDNumber: String,
    val billerSubscriberType: String,
    val debitAccount: String,
    val filler: String,
    val initiatingChannel: String,
    val referenceNumber: String,
    val rejectionDescription: String,
    val relatedReferenceNumber: String,
    val status: String,
    val transactionAmount: String,
    val transactionInitiationDate: String,
    val transactionType: String
) : Serializable