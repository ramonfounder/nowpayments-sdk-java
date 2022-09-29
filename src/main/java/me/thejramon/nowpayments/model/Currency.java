package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {

    @JsonProperty("id")
    private long id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("enable")
    private boolean enable;
    @JsonProperty("wallet_regex")
    private String walletRegex;
    @JsonProperty("priority")
    private int priority;
    @JsonProperty("extra_id_exists")
    private boolean extraIdExists;
    @JsonProperty("extra_id_regex")
    private String extraIdRegex;
    @JsonProperty("logo_url")
    private String logoUrl;
    @JsonProperty("track")
    private boolean track;
    @JsonProperty("cg_id")
    private String cgId;
    @JsonProperty("is_maxlimit")
    private boolean isMaxLimit;
    @JsonProperty("network")
    private String network;
    @JsonProperty("smart_contract")
    private String smartContract;
    @JsonProperty("network_precision")
    private String networkPrecision;


    public long getId() {
        return id;
    }

    public Currency setId(long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Currency setCode(String code) {
        this.code = code;
        return this;

    }

    public String getName() {
        return name;
    }

    public Currency setName(String name) {
        this.name = name;
        return this;

    }

    public boolean isEnable() {
        return enable;
    }

    public Currency setEnable(boolean enable) {
        this.enable = enable;
        return this;

    }

    public String getWalletRegex() {
        return walletRegex;
    }

    public Currency setWalletRegex(String walletRegex) {
        this.walletRegex = walletRegex;
        return this;

    }

    public int getPriority() {
        return priority;
    }

    public Currency setPriority(int priority) {
        this.priority = priority;
        return this;

    }

    public boolean isExtraIdExists() {
        return extraIdExists;
    }

    public Currency setExtraIdExists(boolean extraIdExists) {
        this.extraIdExists = extraIdExists;
        return this;

    }

    public String getExtraIdRegex() {
        return extraIdRegex;
    }

    public Currency setExtraIdRegex(String extraIdRegex) {
        this.extraIdRegex = extraIdRegex;
        return this;

    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public Currency setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;

    }

    public boolean isTrack() {
        return track;
    }

    public Currency setTrack(boolean track) {
        this.track = track;
        return this;

    }

    public String getCgId() {
        return cgId;
    }

    public Currency setCgId(String cgId) {
        this.cgId = cgId;
        return this;

    }

    public boolean isMaxLimit() {
        return isMaxLimit;
    }

    public Currency setMaxLimit(boolean maxLimit) {
        isMaxLimit = maxLimit;
        return this;

    }

    public String getNetwork() {
        return network;
    }

    public Currency setNetwork(String network) {
        this.network = network;
        return this;

    }

    public String getSmartContract() {
        return smartContract;
    }

    public Currency setSmartContract(String smartContract) {
        this.smartContract = smartContract;
        return this;

    }

    public String getNetworkPrecision() {
        return networkPrecision;
    }

    public Currency setNetworkPrecision(String networkPrecision) {
        this.networkPrecision = networkPrecision;
        return this;
    }
}
