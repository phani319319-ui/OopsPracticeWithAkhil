package com.phani.springboot2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("at")
@Primary
public class Automaticcar implements Car{
    @Override
    public boolean drive(){
        System.out.println("Not able to drive");
        return false;
    }
}
