package com.nikhil.SpringBoot03.beans;

import org.springframework.stereotype.Component;

@Component
public class GPay implements Partner{
    @Override
    public void payment(int amount) {
        System.out.println("Gpay payment done for "+ amount);
    }
}
