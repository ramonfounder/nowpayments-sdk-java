package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequestByInvoice {

    // required
    @JsonProperty("iid")
    private long iid;
    // required
    @JsonProperty("pay_currency")
    private String payCurrency;
    @JsonProperty("purchase_id")
    private long purchaseId;
    @JsonProperty("order_description")
    private String orderDescription;
    @JsonProperty("customer_email")
    private String customerEmail;
    @JsonProperty("payout_address")
    private String payoutAddress;
    @JsonProperty("payout_extra_id")
    private String payoutExtraId;
    @JsonProperty("payout_currency")
    private String payoutCurrency;

    public long getIid() {
        return iid;
    }

    public PaymentRequestByInvoice setIid(long iid) {
        this.iid = iid;
        return this;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public PaymentRequestByInvoice setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
        return this;

    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public PaymentRequestByInvoice setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
        return this;

    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public PaymentRequestByInvoice setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
        return this;

    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public PaymentRequestByInvoice setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;

    }

    public String getPayoutAddress() {
        return payoutAddress;
    }

    public PaymentRequestByInvoice setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
        return this;

    }

    public String getPayoutExtraId() {
        return payoutExtraId;
    }

    public PaymentRequestByInvoice setPayoutExtraId(String payoutExtraId) {
        this.payoutExtraId = payoutExtraId;
        return this;

    }

    public String getPayoutCurrency() {
        return payoutCurrency;
    }

    public PaymentRequestByInvoice setPayoutCurrency(String payoutCurrency) {
        this.payoutCurrency = payoutCurrency;
        return this;

    }
}
