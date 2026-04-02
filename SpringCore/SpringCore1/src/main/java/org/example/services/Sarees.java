package org.example.services;

public class Sarees implements Online {


    @Override
    public boolean addedTheProductToKart(double amount) {

        System.out.println("saree purchased by the customer and bill paid is "+ amount);

        return true;

    }

}
