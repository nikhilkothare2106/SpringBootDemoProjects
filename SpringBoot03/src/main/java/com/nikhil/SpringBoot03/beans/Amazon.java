package com.nikhil.SpringBoot03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Amazon {
    @Autowired
    @Qualifier("phonePay")
    Partner partner;

    public void paymentGateway(int amount){
        partner.payment(amount);
    }
}
