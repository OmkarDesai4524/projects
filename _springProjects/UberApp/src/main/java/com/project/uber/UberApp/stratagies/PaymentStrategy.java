package com.project.uber.UberApp.stratagies;


import com.project.uber.UberApp.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
