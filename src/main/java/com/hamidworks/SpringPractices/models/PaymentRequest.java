package com.hamidworks.SpringPractices.models;

import lombok.Data;

@Data
public class PaymentRequest {
    private long amount;
    private String paymentMethod;
}
