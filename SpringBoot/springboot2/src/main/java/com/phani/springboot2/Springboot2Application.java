package com.phani.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot2Application {

	public static void main(String[] args) {

	ApplicationContext container=	SpringApplication.run(Springboot2Application.class, args);
    var obj=container.getBean(Springboot2Application.class);
		System.out.println(container.getBeanDefinitionCount());
        Driving obj2 =container.getBean(Driving.class);
		obj2.target();

	}

}
