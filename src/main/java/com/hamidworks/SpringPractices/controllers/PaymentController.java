package com.hamidworks.SpringPractices.controllers;

import com.hamidworks.SpringPractices.models.PaymentRequest;
import com.hamidworks.SpringPractices.services.PaymentRegistry;
import com.hamidworks.SpringPractices.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
@AllArgsConstructor
public class PaymentController {

    private final PaymentRegistry paymentRegistry;

    @PostMapping("/pay")
    public String processPayment(@RequestBody PaymentRequest request){
        return paymentRegistry.getServiceBean(request.getPaymentMethod().toLowerCase()).pay(request);
    }
}
