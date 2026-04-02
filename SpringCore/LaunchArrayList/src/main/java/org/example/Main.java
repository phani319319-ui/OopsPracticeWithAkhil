package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(List.of(10,20,30,40,50,60));
        ArrayList<Integer> arr1=new ArrayList<>(List.of(1,2,3));
        arr.add(10);
        arr.add(2,90);
        arr.addAll(2,arr1);
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.size());


    }

}
