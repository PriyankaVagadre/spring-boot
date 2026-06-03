package com.demo.spring;

public class StripPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Strip Service amount is" + amount);
    }
}
