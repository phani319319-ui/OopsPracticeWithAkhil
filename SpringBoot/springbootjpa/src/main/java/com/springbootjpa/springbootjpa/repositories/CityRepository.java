package com.springbootjpa.springbootjpa.repositories;

import com.springbootjpa.springbootjpa.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City,Integer> {


}
