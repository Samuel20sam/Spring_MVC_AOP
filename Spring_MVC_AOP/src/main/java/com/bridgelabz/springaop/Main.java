package com.bridgelabz.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkOut();
        cart.checkOutWithParameter("Processed");
    }
}
