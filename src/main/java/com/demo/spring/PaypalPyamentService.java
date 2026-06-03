package com.demo.spring;

public class PaypalPyamentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("paypal Service amount is" + amount);
    }
}
