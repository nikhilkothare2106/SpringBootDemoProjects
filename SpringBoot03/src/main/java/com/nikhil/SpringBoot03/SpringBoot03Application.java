package com.nikhil.SpringBoot03;

import com.nikhil.SpringBoot03.beans.Amazon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot03Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot03Application.class, args);
		Amazon amazon = context.getBean(Amazon.class);
		amazon.paymentGateway(1000);
	}

}
