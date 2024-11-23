package com.nikhil.SpringBoot01;

import com.nikhil.SpringBoot01.beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot01Application.class, args);
		Car car = context.getBean(Car.class);
		car.start();
	}

}
