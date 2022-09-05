package com.hamidworks.SpringPractices.services.implementations;

import com.hamidworks.SpringPractices.models.PaymentRequest;
import com.hamidworks.SpringPractices.services.PaymentService;
import org.springframework.stereotype.Service;

@Service("web")
public class WebPay implements PaymentService {
    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount() + " paid through " + request.getPaymentMethod() + " channel.";
    }
}
