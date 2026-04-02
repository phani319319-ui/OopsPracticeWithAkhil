package com.practice.SpringBoot1;

import com.practice.SpringBoot1.Services.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {

		ApplicationContext container=SpringApplication.run(SpringBoot1Application.class, args);
	    System.out.println(container.getBeanDefinitionCount());

		Game obj=container.getBean(Game.class);
		obj.output();

	}

}
