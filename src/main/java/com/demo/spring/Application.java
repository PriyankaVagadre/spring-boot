package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
     ApplicationContext context =  SpringApplication.run(Application.class, args); // creating a context;

     var orderService = context.getBean(OrderService.class); // creating a bean with the help of spring
         orderService.callPaymentService(); // now we have called directly

//        var orderService = new OrderService();
//        orderService.setPaymentService(new StripPaymentService()); // use setter for optional dependency
//        orderService.callPaymentService();

    }


}
