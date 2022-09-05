package com.hamidworks.SpringPractices.services;

public interface PaymentRegistry {
    PaymentService getServiceBean(String serviceName);
}
