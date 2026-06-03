package com.demo.spring;

public class OrderService {
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    private PaymentService paymentService;
//    public OrderService(PaymentService paymentService){
//       this.paymentService =paymentService;
//    }
    public void callPaymentService(){
        paymentService.processPayment(10);
    }

}
