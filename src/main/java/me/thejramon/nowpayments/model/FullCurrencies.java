package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class FullCurrencies {

    @JsonProperty("currencies")
    private List<Currency> currencies = new ArrayList<>();

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }
}
