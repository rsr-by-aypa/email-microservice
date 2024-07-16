package com.rsr.email_microservice.port.user.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class OrderDTO {

    private UUID orderId;

    private String firstName;

    private String lastName;

    private LocalDateTime orderCreationTime;

    private String emailAddress;

    private List<ProductDTO> products;

    @JsonCreator
    public OrderDTO(@JsonProperty("orderId") UUID orderId, @JsonProperty("firstName") String firstName,
                    @JsonProperty("lastName") String lastName,
                    @JsonProperty("orderCreationTime") LocalDateTime orderCreationTime,
                    @JsonProperty("emailAddress") String emailAddress,
                    @JsonProperty("products") List<ProductDTO> products) {
        this.orderId = orderId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderCreationTime = orderCreationTime;
        this.emailAddress = emailAddress;
        this.products = products;
    }

}
