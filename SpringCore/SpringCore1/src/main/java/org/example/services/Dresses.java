package org.example.services;

public class Dresses implements Online {

    @Override
    public boolean addedTheProductToKart(double amount) {
        System.out.println("dresses purchased by the customer and bill paid is "+ amount);
        return true;
    }




}
