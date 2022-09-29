package me.thejramon.nowpayments.model;

public enum Case {
    /**
     * success(default) - finished payment example.
     * common - common payment
     * failed - failed payment example.
     * partially_paid - partially_paid payment example.
     */

    SUCCESS("success"),
    FAILED("failed"),
    PARTIALLY_PAID("partially_paid"),
    COMMON("common");
    private final String value;

    Case(String value) {
        this.value = value;
    }
}

