package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class StripPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Strip Service amount is" + amount);
    }
}
