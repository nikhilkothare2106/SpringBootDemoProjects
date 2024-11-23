package com.nikhil.SpringBoot01.beans;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Engine{
    Diesel(){
        System.out.println("Diesel class constructor....");
    }
    @Override
    public void start() {
        System.out.println("Diesel car start....");
    }
}
