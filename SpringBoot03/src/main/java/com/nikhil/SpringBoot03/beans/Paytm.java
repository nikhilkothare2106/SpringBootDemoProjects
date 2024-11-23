package com.nikhil.SpringBoot03.beans;

import org.springframework.stereotype.Component;

@Component
public class Paytm implements Partner{
    @Override
    public void payment(int amount) {
        System.out.println("Paytm payment done for "+ amount);
    }
}
