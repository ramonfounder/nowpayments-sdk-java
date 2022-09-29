package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinimumPaymentAmount {
    @JsonProperty("currency_from")
    private String currencyFrom;
    @JsonProperty("currency_to")
    private String currencyTo;
    @JsonProperty("min_amount")
    private double minAmount;
    @JsonProperty("fiat_equivalent")
    private double fiatEquivalent;

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public MinimumPaymentAmount setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
        return this;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public MinimumPaymentAmount setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
        return this;

    }

    public double getMinAmount() {
        return minAmount;
    }

    public MinimumPaymentAmount setMinAmount(double minAmount) {
        this.minAmount = minAmount;
        return this;

    }

    public double getFiatEquivalent() {
        return fiatEquivalent;
    }

    public MinimumPaymentAmount setFiatEquivalent(double fiatEquivalent) {
        this.fiatEquivalent = fiatEquivalent;
        return this;

    }
}
