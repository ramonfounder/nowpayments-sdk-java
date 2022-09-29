package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class InvoiceResponse {

    @JsonProperty("id")
    private long id;
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("order_description")
    private String orderDescription;
    @JsonProperty("price_amount")
    private double priceAmount;
    @JsonProperty("price_currency")
    private String priceCurrency;
    @JsonProperty("pay_currency")
    private String payCurrency;
    @JsonProperty("ipn_callback_url")
    private String ipnCallbackUrl;
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    @JsonProperty("success_url")
    private String successUrl;
    @JsonProperty("cancel_url")
    private String cancelUrl;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;


}
