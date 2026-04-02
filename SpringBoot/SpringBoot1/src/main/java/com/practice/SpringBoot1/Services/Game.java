package com.practice.SpringBoot1.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {
    private Computer com;

    @Autowired
    public Game(Computer com){
        this.com=com;
    }

    public void output(){
        System.out.println("laptop using for playing game and brand is ");
        com.game();
    }



}
