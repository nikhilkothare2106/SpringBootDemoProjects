package com.nikhil.SpringBoot03.beans;

import org.springframework.stereotype.Component;

@Component
public class PhonePay implements Partner{
    @Override
    public void payment(int amount) {
        System.out.println("PhonePay payment done for "+ amount);
    }
}
