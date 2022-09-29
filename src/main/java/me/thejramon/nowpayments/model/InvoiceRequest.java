package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceRequest {

    /**
     * price_amount (required) - the amount that users have to pay for the order stated in fiat currency. In case you do not indicate the price in crypto, our system will automatically convert this fiat amount into its crypto equivalent. NOTE: Some of the assets (KISHU, NWC, FTT, CHR, XYM, SRK, KLV, SUPER, OM, XCUR, NOW, SHIB, SAND, MATIC, CTSI, MANA, FRONT, FTM, DAO, LGCY), have a maximum price limit of ~$2000.
     * price_currency (required) - the fiat currency in which the price_amount is specified (usd, eur, etc).
     * pay_currency (optional) - the specified crypto currency (btc, eth, etc). If not specified, can be chosen on the invoice_url
     * ipn_callback_url (optional) - url to receive callbacks, should contain "http" or "https", eg. "https://nowpayments.io"
     * order_id (optional) - internal store order ID, e.g. "RGDBP-21314"
     * order_description (optional) - internal store order description, e.g. "Apple Macbook Pro 2019 x 1"
     * success_url(optional) - url where the customer will be redirected after successful payment.
     * cancel_url(optional) - url where the customer will be redirected after failed payment.
     */

    // required
    @JsonProperty(value = "price_amount", required = true)
    private double priceAmount;
    // required
    @JsonProperty(value = "price_currency", required = true)
    private String priceCurrency;
    @JsonProperty("order_id")
    private long orderId;
    @JsonProperty("order_description")
    private String orderDescription;
    @JsonProperty("ipn_callback_url")
    private String ipnCallbackUrl;
    @JsonProperty("success_url")
    private String successUrl;
    @JsonProperty("cancel_url")
    private String cancelUrl;

    public double getPriceAmount() {
        return priceAmount;
    }

    public InvoiceRequest setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
        return this;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public InvoiceRequest setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;

    }

    public long getOrderId() {
        return orderId;
    }

    public InvoiceRequest setOrderId(long orderId) {
        this.orderId = orderId;
        return this;

    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public InvoiceRequest setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
        return this;

    }

    public String getIpnCallbackUrl() {
        return ipnCallbackUrl;
    }

    public InvoiceRequest setIpnCallbackUrl(String ipnCallbackUrl) {
        this.ipnCallbackUrl = ipnCallbackUrl;
        return this;

    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public InvoiceRequest setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
        return this;

    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public InvoiceRequest setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;

    }
}
