package com.phani.springboot2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class Driving {
    private Car c;
    static {
        System.out.println("Static block executed");
    }
    @Autowired
    public Driving(@Qualifier("md") Car c){
        this.c=c;
    }
    @PostConstruct
    public void clean(){
        System.out.println("wash the car before drive");
    }

    public void target(){
        System.out.println("he can able to drive "+this.c.drive());
    }
    @PreDestroy
    public void dist(){
        System.out.println("Parking car in garage");
    }

}
