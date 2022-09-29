package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Currencies {

    @JsonProperty("currencies")
    private List<String> currencies = new ArrayList<>();

    public List<String> getCurrencies() {
        return currencies;
    }

    public Currencies setCurrencies(List<String> currencies) {
        this.currencies = currencies;
        return this;
    }
}
