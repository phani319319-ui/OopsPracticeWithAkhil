package com.practice.SpringBoot1.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Hp implements Computer {

    @Override
    public void game(){
        System.out.println("Playing game in HP laptop");
    }
}
