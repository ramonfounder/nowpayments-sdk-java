package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PaymentStatusResponse {

    @JsonProperty("payment_id")
    private long paymentId;
    @JsonProperty("payment_status")
    private Status paymentStatus;
    @JsonProperty("pay_address")
    private String payAddress;
    @JsonProperty("price_amount")
    private double priceAmount;
    @JsonProperty("price_currency")
    private String priceCurrency;
    @JsonProperty("pay_amount")
    private double payAmount;
    @JsonProperty("actually_paid")
    private double actuallyPaid;
    @JsonProperty("pay_currency")
    private String payCurrency;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("purchase_id")
    private long purchaseId;
    @JsonProperty("outcome_currency")
    private String outcomeCurrency;
    @JsonProperty("outcome_amount")
    private double outcomeAmount;

    public long getPaymentId() {
        return paymentId;
    }

    public PaymentStatusResponse setPaymentId(long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public Status getPaymentStatus() {
        return paymentStatus;
    }

    public PaymentStatusResponse setPaymentStatus(Status paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;

    }

    public String getPayAddress() {
        return payAddress;
    }

    public PaymentStatusResponse setPayAddress(String payAddress) {
        this.payAddress = payAddress;
        return this;

    }

    public double getPriceAmount() {
        return priceAmount;
    }

    public PaymentStatusResponse setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
        return this;

    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public PaymentStatusResponse setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;

    }

    public double getPayAmount() {
        return payAmount;
    }

    public PaymentStatusResponse setPayAmount(double payAmount) {
        this.payAmount = payAmount;
        return this;

    }

    public double getActuallyPaid() {
        return actuallyPaid;
    }

    public PaymentStatusResponse setActuallyPaid(double actuallyPaid) {
        this.actuallyPaid = actuallyPaid;
        return this;

    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public PaymentStatusResponse setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
        return this;

    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public PaymentStatusResponse setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;

    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public PaymentStatusResponse setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;

    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public PaymentStatusResponse setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
        return this;

    }

    public String getOutcomeCurrency() {
        return outcomeCurrency;
    }

    public PaymentStatusResponse setOutcomeCurrency(String outcomeCurrency) {
        this.outcomeCurrency = outcomeCurrency;
        return this;

    }

    public double getOutcomeAmount() {
        return outcomeAmount;
    }

    public PaymentStatusResponse setOutcomeAmount(double outcomeAmount) {
        this.outcomeAmount = outcomeAmount;
        return this;

    }
}
