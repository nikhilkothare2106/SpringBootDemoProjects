package com.nikhil.SpringBoot01.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements  Engine{
    Petrol(){
        System.out.println("Petrol class constructor....");
    }
    @Override
    public void start() {
        System.out.println("Petrol car start....");
    }
}
