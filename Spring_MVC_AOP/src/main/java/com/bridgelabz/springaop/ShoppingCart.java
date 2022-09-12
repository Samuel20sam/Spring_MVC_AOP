package com.bridgelabz.springaop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    //Before running checkOut a joint point is created in Logging Aspect class to run the point cut
    public void checkOut() {
        System.out.println("CheckOut Method from ShoppingCart is called");
        /*
        Cross-cutting concerns we want to address are the 'aspect'
        1. Logging
        2. Authentication and Authorisation
        3. Sanitize the data
        and for each cross-cutting concern we can create an aspect

        Note: Clearly define what we want to call and where we want to call
        */
    }

    public void checkOutWithParameter(String status) {
        System.out.println("CheckOut Method from ShoppingCart is called");
        //Method with parameter
    }

    public int quantity(){
        return 2;
    }
}
