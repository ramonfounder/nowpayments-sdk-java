package me.thejramon.nowpayments.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Auth {

    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;

    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public Auth setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Auth setPassword(String password) {
        this.password = password;
        return this;
    }
}
