package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PaymentResponse {

    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("purchase_id")
    private long purchaseId;
    @JsonProperty("payment_id")
    private long paymentId;
    @JsonProperty("payment_status")
    private Status status;
    @JsonProperty("pay_address")
    private String payAddress;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public PaymentResponse setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public PaymentResponse setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;

    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public PaymentResponse setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
        return this;

    }

    public long getPaymentId() {
        return paymentId;
    }

    public PaymentResponse setPaymentId(long paymentId) {
        this.paymentId = paymentId;
        return this;

    }

    public Status getStatus() {
        return status;
    }

    public PaymentResponse setStatus(Status status) {
        this.status = status;
        return this;

    }

    public String getPayAddress() {
        return payAddress;
    }

    public PaymentResponse setPayAddress(String payAddress) {
        this.payAddress = payAddress;
        return this;

    }

    public double getPriceAmount() {
        return priceAmount;
    }

    public PaymentResponse setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
        return this;

    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public PaymentResponse setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;

    }

    public double getPayAmount() {
        return payAmount;
    }

    public PaymentResponse setPayAmount(double payAmount) {
        this.payAmount = payAmount;
        return this;

    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public PaymentResponse setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
        return this;

    }

    public String getIpnCallbackUrl() {
        return ipnCallbackUrl;
    }

    public PaymentResponse setIpnCallbackUrl(String ipnCallbackUrl) {
        this.ipnCallbackUrl = ipnCallbackUrl;
        return this;

    }

    public String getOrderId() {
        return orderId;
    }

    public PaymentResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;

    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public PaymentResponse setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
        return this;

    }
}
