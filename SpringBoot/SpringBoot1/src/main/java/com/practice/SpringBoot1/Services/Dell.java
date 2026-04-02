package com.practice.SpringBoot1.Services;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Dell implements Computer  {
    @Override
    public void game(){
        System.out.println("playing game in Dell laptop");
    }
}
