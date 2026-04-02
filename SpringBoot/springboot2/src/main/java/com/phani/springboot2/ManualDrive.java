package com.phani.springboot2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("md")
public class ManualDrive implements Car{
    @Override
    public boolean drive(){
        System.out.println("can drive manual transmission car");
        return true;
    }
}
