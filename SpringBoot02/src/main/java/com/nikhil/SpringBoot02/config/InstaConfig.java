package com.nikhil.SpringBoot02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class InstaConfig {

    @Bean
    public  LocalDateTime getBean(){
        return  LocalDateTime.now();
    }
}
