package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
       this.paymentService =paymentService;
    }
    public void callPaymentService(){
        paymentService.processPayment(10);
    }

}
