package com.nikhil.SpringBoot01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("diesel")
    Engine engine;

    public void start(){
        engine.start();
    }
}
