package com.example.nearby.ui.screen

sealed class MarketDetailsUiEvent {
    data class onFetchRules(val marketId: String) : MarketDetailsUiEvent()
    data class onFetchCoupon(val qrCodeContent: String) : MarketDetailsUiEvent()
    data object onResetCoupon : MarketDetailsUiEvent()
}