package me.thejramon.nowpayments.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.thejramon.nowpayments.model.*;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@Component
public class Nowpayments {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private final static String BASE_URL = "https://api.nowpayments.io/v1";
    private final OkHttpClient httpClient;
    private final ObjectMapper objectMapper;

    @Autowired
    public Nowpayments(OkHttpClient httpClient, ObjectMapper objectMapper) {
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public AuthResponse auth(String email, String password) throws IOException {
        String url = BASE_URL + "/auth";
        Auth auth = new Auth(email, password);
        String json = this.objectMapper.writeValueAsString(auth);
        String response = this.post(url, json);
        return this.objectMapper.readValue(response, AuthResponse.class);
    }


    public Currencies getCurrencies() throws IOException {
        String url = BASE_URL + "/currencies";
        String response = this.get(url, Map.of());
        return this.objectMapper.readValue(response, Currencies.class);
    }

    public FullCurrencies getFullCurrencies() throws IOException {
        String url = BASE_URL + "/full-currencies";
        String response = this.get(url, Map.of());
        return this.objectMapper.readValue(response, FullCurrencies.class);
    }

    public Currencies getAvailableCheckedCurrencies() throws IOException {
        String url = BASE_URL + "/merchant/coins";
        String response = this.get(url, Map.of());
        return this.objectMapper.readValue(response, Currencies.class);
    }


    public Estimate getEstimatedPrice(double amount, String currencyFrom, String currencyTo) throws IOException {
        String url = BASE_URL + "/estimate";
        Map<String, String> params = Map.ofEntries(
                Map.entry("amount", amount + ""),
                Map.entry("currency_from", currencyFrom),
                Map.entry("currency_to", currencyTo)
        );
        String response = this.get(url, params);
        return this.objectMapper.readValue(response, Estimate.class);
    }

    public PaymentStatusResponse createPayment(PaymentRequest paymentRequest) throws IOException {
        String url = BASE_URL + "/payment";
        String json = this.objectMapper.writeValueAsString(paymentRequest);
        String response = this.post(url, json);
        return this.objectMapper.readValue(response, PaymentStatusResponse.class);
    }

    public PaymentStatusResponse createPaymentByInvoice(PaymentResponseByInvoice paymentResponseByInvoice) throws IOException {
        String url = BASE_URL + "/invoice-payment";
        String json = this.objectMapper.writeValueAsString(paymentResponseByInvoice);
        String response = this.post(url, json);
        return this.objectMapper.readValue(response, PaymentStatusResponse.class);
    }

    public PaymentStatusResponse getPaymentStatusResponse(long paymentId) throws IOException {
        String url = BASE_URL + "/payment/" + paymentId;
        String response = this.get(url, Map.of());
        return this.objectMapper.readValue(response, PaymentStatusResponse.class);
    }

    public MinimumPaymentAmount getMinimumPaymentAmount(String currencyFrom, String currencyTo) throws IOException {
        String url = BASE_URL + "/min-amount";
        Map<String, String> params = Map.ofEntries(
                Map.entry("currency_from", currencyFrom),
                Map.entry("currency_to", currencyTo)
        );
        String response = this.get(url, params);
        return this.objectMapper.readValue(response, MinimumPaymentAmount.class);
    }

    public PagePayments getPagePayments() throws IOException {
        throw new RuntimeException("This method is not completed");
    }


    public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest) throws IOException {
        String url = BASE_URL + "/invoice";
        String json = this.objectMapper.writeValueAsString(invoiceRequest);
        String response = this.post(url, json);
        return this.objectMapper.readValue(response, InvoiceResponse.class);
    }


    private String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder().url(url).post(body).build();
        try (Response response = httpClient.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    private String get(String url, Map<String, String> params) throws IOException {
        HttpUrl.Builder urlBuilder
                = Objects.requireNonNull(HttpUrl.parse(url)).newBuilder();
        params.forEach(urlBuilder::addQueryParameter);
        String finalUrl = urlBuilder.build().toString();
        Request request = new Request.Builder().url(finalUrl).build();
        try (Response response = httpClient.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }
}
