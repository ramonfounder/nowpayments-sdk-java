package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagePayments {
    @JsonProperty("page")
    private int page;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("total")
    private int total;
    @JsonProperty("pagesCount")
    private int pagesCount;
    @JsonProperty("data")
    private PaymentStatusResponse[] data;

    public int getPage() {
        return page;
    }

    public PagePayments setPage(int page) {
        this.page = page;
        return this;

    }

    public int getLimit() {
        return limit;
    }

    public PagePayments setLimit(int limit) {
        this.limit = limit;
        return this;

    }

    public int getTotal() {
        return total;
    }

    public PagePayments setTotal(int total) {
        this.total = total;
        return this;

    }

    public int getPagesCount() {
        return pagesCount;
    }

    public PagePayments setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
        return this;

    }

    public PaymentStatusResponse[] getData() {
        return data;
    }

    public PagePayments setData(PaymentStatusResponse[] data) {
        this.data = data;
        return this;

    }
}
