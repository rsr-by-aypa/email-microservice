package com.rsr.email_microservice.port.user.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class PaymentDTO {

    private UUID paymentId;

    private UUID orderId;

    private UUID userId;

    private String emailAddress;

    private double amountInEuro;

    @JsonCreator
    public PaymentDTO(@JsonProperty("paymentId") UUID paymentId, @JsonProperty("orderId") UUID orderId,
                      @JsonProperty("userId") UUID userId,
                      @JsonProperty("emailAddress") String emailAddress,
                      @JsonProperty("amountInEuro") double amountInEuro) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.userId = userId;
        this.emailAddress = emailAddress;
        this.amountInEuro = amountInEuro;
    }
}
