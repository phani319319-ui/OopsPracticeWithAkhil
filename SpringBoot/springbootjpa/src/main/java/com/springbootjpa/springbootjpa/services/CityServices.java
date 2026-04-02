package com.springbootjpa.springbootjpa.services;

import com.springbootjpa.springbootjpa.entity.City;
import com.springbootjpa.springbootjpa.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServices  {

    @Autowired
    private CityRepository cityRepository;

    public Iterable<City> getAllCities(){
        return cityRepository.findAll();
    }
    public void saveCity(City city){
        var newCity=cityRepository.save(city);

        System.out.println("new city created"+newCity);
    }

    public void findCity(int id){
        City city=cityRepository.findById(id).orElse(null);
        System.out.println(city);
        city.setName("India");
        System.out.println(cityRepository.save(city));
    }
}
