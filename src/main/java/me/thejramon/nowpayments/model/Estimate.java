package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estimate {

    @JsonProperty("currency_from")
    private String currencyFrom;
    @JsonProperty("amount_from")
    private double amountFrom;
    @JsonProperty("currency_to")
    private String currencyTo;
    @JsonProperty("estimated_amount")
    private double estimatedAmount;


    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public Estimate setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
        return this;
    }

    public double getAmountFrom() {
        return amountFrom;
    }

    public Estimate setAmountFrom(double amountFrom) {
        this.amountFrom = amountFrom;
        return this;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public Estimate setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
        return this;
    }

    public double getEstimatedAmount() {
        return estimatedAmount;
    }

    public Estimate setEstimatedAmount(double estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
        return this;
    }
}
