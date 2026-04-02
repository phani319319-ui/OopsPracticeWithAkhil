package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      List1<Integer> l=new List1<>();
      try {
        l.add(20);
        l.add(30);
        l.get(5);
        l.add(40);
        System.out.println(l.get(2));

      }
      catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }
}