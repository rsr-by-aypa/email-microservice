package com.rsr.email_microservice.port.user.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class ProductDTO {

    private UUID productId;

    private String name;

    private int amount;

    private double priceInEuro;

    @JsonCreator
    public ProductDTO(@JsonProperty("productId") UUID productId, @JsonProperty("name") String name,
                      @JsonProperty("amount") int amount, @JsonProperty("priceInEuro") double priceInEuro) {
        this.productId = productId;
        this.name = name;
        this.amount = amount;
        this.priceInEuro = priceInEuro;
    }
}
