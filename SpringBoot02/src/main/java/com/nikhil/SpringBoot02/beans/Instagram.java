package com.nikhil.SpringBoot02.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class Instagram {
    @Autowired
    Reel reel;

    @Autowired
    LocalDateTime localDateTime;
    public void play(){
        System.out.println("Login at "+localDateTime);
        reel.playReel();
    }
}
