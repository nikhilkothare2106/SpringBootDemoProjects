package com.nikhil.SpringBoot02;

import com.nikhil.SpringBoot02.beans.Instagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot02Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringBoot02Application.class, args);
		Instagram reel = run.getBean(Instagram.class);
		reel.play();
	}

}
