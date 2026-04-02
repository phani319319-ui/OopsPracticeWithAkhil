package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Audit at=new Audit();
//
//        TaxCalculator calculateTax=at::taxCalculator2018;
//
//        calculateTax.calculateTax(25000.50f);

       TaxCalculator tax=(income)->{
            int tax1 = 30;

           float totalTax;

           totalTax = income * 0.3f;

           System.out.println("total tax should be paid   " + totalTax);

       };
       tax.calculateTax(25000.50f);
      }
    }















