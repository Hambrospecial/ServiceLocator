package com.hamidworks.SpringPractices.services.implementations;

import com.hamidworks.SpringPractices.models.PaymentRequest;
import com.hamidworks.SpringPractices.services.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("atm")
@Primary
public class PayATM implements PaymentService {
    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount() + " paid through " + request.getPaymentMethod() + " channel.";
    }
}
