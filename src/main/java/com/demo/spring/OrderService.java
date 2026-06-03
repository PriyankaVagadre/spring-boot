package com.demo.spring;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
       this.paymentService =paymentService;
    }
    public void callPaymentService(){
        paymentService.processPayment(10);
    }

}
