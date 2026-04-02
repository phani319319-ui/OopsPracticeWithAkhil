package org.example.services;

public class Westernwear implements Online{

    @Override
    public boolean addedTheProductToKart(double amount) {

        System.out.println("western wear purchased by the customer and bill paid is "+ amount);


        return true;
    }


}
