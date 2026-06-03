package com.demo.spring;

public class OrderService {

    public void callPaymentService(){
        var stripPaymentService = new StripPaymentService();
        stripPaymentService.processPayment(10);
    }

}
