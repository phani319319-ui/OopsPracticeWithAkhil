package com.springbootjpa.springbootjpa;

import com.springbootjpa.springbootjpa.entity.City;
import com.springbootjpa.springbootjpa.services.CityServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {

		ApplicationContext container =SpringApplication.run(SpringbootjpaApplication.class, args);
          var cityServices =container.getBean(CityServices.class);
//		cityServices.getAllCities().forEach(System.out::println);
//		cityServices.saveCity(new City("Bangalore", "ind","Bangalore",25000));
          cityServices.findCity(10);

	}

}
