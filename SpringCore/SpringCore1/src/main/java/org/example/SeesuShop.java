package org.example;

import org.example.services.Online;

public class SeesuShop {

    private Online web;
    public SeesuShop(){
        System.out.println("seesushop object created");
    }
    public SeesuShop(Online web){
        this.web=web;
    }
    public void setWeb(Online web) {
        this.web = web;
    }

    public boolean buyTheProduct(double amount) {
        return web.addedTheProductToKart(amount);
    }

}
