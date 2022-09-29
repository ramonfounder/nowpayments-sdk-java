package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequest {
    // required
    @JsonProperty("price_amount")
    private double priceAmount;
    // required
    @JsonProperty("price_currency")
    private String priceCurrency;
    // optional
    @JsonProperty("pay_amount")
    private double payAmount;
    // required
    @JsonProperty("pay_currency")
    private String payCurrency;
    // required
    @JsonProperty("ipn_callback_url")
    private String ipnCallbackUrl;
    // optional
    @JsonProperty("order_id")
    private String orderId;
    // optional
    @JsonProperty("order_description")
    private String orderDescription;


    public double getPriceAmount() {
        return priceAmount;
    }

    public PaymentRequest setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
        return this;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public PaymentRequest setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;

    }

    public double getPayAmount() {
        return payAmount;
    }

    public PaymentRequest setPayAmount(double payAmount) {
        this.payAmount = payAmount;
        return this;

    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public PaymentRequest setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
        return this;

    }

    public String getIpnCallbackUrl() {
        return ipnCallbackUrl;
    }

    public PaymentRequest setIpnCallbackUrl(String ipnCallbackUrl) {
        this.ipnCallbackUrl = ipnCallbackUrl;
        return this;

    }

    public String getOrderId() {
        return orderId;
    }

    public PaymentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;

    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public PaymentRequest setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
        return this;

    }
}
