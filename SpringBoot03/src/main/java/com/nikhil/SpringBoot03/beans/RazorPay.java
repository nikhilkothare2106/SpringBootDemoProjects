package com.nikhil.SpringBoot03.beans;

import org.springframework.stereotype.Component;

@Component
public class RazorPay implements Partner{
    @Override
    public void payment(int amount) {
        System.out.println("RazorPay payment done for "+ amount);
    }
}
